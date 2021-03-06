package eu.nimble.utility.persistence.binary;

import eu.nimble.service.model.ubl.commonbasiccomponents.BinaryObjectType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Service to manage data in the binary content database.
 *
 * Created by suat on 03-Dec-18.
 */
@Component
public class BinaryContentService {
    private static final String TABLE_NAME = "binary_content";
    private static final String COLUMN_NAME_ID = "id";
    private static final String COLUMN_NAME_MIME_CODE = "mime_code";
    private static final String COLUMN_NAME_FILE_NAME = "file_name";
    private static final String COLUMN_NAME_VALUE = "value_";
    private static final String QUERY_INSERT_CONTENT = "INSERT INTO  " + TABLE_NAME + "( " + COLUMN_NAME_ID + "," + COLUMN_NAME_MIME_CODE + "," + COLUMN_NAME_FILE_NAME + "," + COLUMN_NAME_VALUE + ") VALUES (?,?,?,?)";
    private static final String QUERY_SELECT_CONTENT_BY_URI = "SELECT * FROM " + TABLE_NAME + " WHERE " + COLUMN_NAME_ID + " = ?";
    private static final String QUERY_SELECT_CONTENT_BY_URIS = "SELECT * FROM " + TABLE_NAME + " WHERE " + COLUMN_NAME_ID + " IN (%s)"; // query to complete in the relevant methods
    private static final String QUERY_DELETE_CONTENT_BY_URIS = "DELETE FROM " + TABLE_NAME + " WHERE " + COLUMN_NAME_ID + " IN (%s)"; // query to complete in the relevant method

    private static Logger logger = LoggerFactory.getLogger(BinaryContentService.class);

    @Autowired
    @Qualifier("binarycontentdbDataSource")
    private DataSource dataSource;

    @Value("${nimble.binary-content.url}")
    private String binaryContentUrl;

    public BinaryObjectType createContent(BinaryObjectType binaryObjectType) {
        Connection c = null;
        PreparedStatement ps = null;

        if(binaryObjectType.getUri() == null || !binaryObjectType.getUri().startsWith(binaryContentUrl)) {
            binaryObjectType.setUri(binaryContentUrl + UUID.randomUUID().toString());
        }

        try {
            c = dataSource.getConnection();
            ps = c.prepareStatement(QUERY_INSERT_CONTENT);
            ps.setString(1, binaryObjectType.getUri());
            ps.setString(2, binaryObjectType.getMimeCode());
            ps.setString(3, binaryObjectType.getFileName());
            ps.setBytes(4, binaryObjectType.getValue());
            int queryResult = ps.executeUpdate();
            ps.close();

            if (queryResult > 0) {
                logger.info("Binary content created with uri: {}", binaryObjectType.getUri());
            } else {
                logger.warn("Failed to created binary content for uri: {}, file name: {}, mime type: {}", binaryObjectType.getUri(), binaryObjectType.getFileName(), binaryObjectType.getMimeCode());
            }

            return binaryObjectType;

        } catch (SQLException e) {
            String msg = String.format("Failed to retrieve binary content for uri: %s", binaryObjectType.getUri());
            logger.error(msg, e);
            throw new RuntimeException(msg, e);

        } finally {
            closeResources(c, ps, null, String.format("While getting binary content for uri: %s", binaryObjectType.getUri()));
        }
    }

    public BinaryObjectType retrieveContent(String uri) {
        List<BinaryObjectType> results = retrieveContents(Arrays.asList(uri));
        if(results.size() > 0) {
            return results.get(0);
        } else {
            return null;
        }
    }

    public List<BinaryObjectType> retrieveContents(List<String> uris) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        // construct the condition
        String condition = "";
        for(int i=0; i<uris.size(); i++) {
            if(i == uris.size()-1){
                condition += "'"+uris.get(i)+"'";
            }else {
                condition += "'"+uris.get(i)+"'"+",";
            }
        }

        try {
            c = dataSource.getConnection();
            ps = c.prepareStatement(String.format(QUERY_SELECT_CONTENT_BY_URIS, condition));
            rs = ps.executeQuery();
            List<BinaryObjectType> binaryObjects = new ArrayList<>();
            while (rs.next()) {
                BinaryObjectType result = new BinaryObjectType();
                result.setMimeCode(rs.getString(COLUMN_NAME_MIME_CODE));
                result.setValue(rs.getBytes(COLUMN_NAME_VALUE));
                result.setUri(rs.getString(COLUMN_NAME_ID));
                result.setFileName(rs.getString(COLUMN_NAME_FILE_NAME));
                binaryObjects.add(result);
            }
            rs.close();
            ps.close();

            return binaryObjects;

        } catch (SQLException e) {
            String msg = String.format("Failed to retrieve binary contents for uris: %s", uris.toString());
            logger.error(msg, e);
            throw new RuntimeException(msg, e);

        } finally {
            closeResources(c, ps, rs, String.format("While getting binary contents for uris: %s", uris.toString()));
        }
    }

    public void deleteContent(String uri) {
        deleteContents(Arrays.asList(uri));
    }

    public void deleteContents(List<String> uris) {
        Connection c = null;
        PreparedStatement ps = null;

        // construct the condition
        String condition = "";
        for(int i=0; i<uris.size(); i++) {
            if(i == uris.size()-1){
                condition += "'"+uris.get(i)+"'";
            }else {
                condition += "'"+uris.get(i)+"'"+",";
            }
        }

        try {
            c = dataSource.getConnection();
            ps = c.prepareStatement(String.format(QUERY_DELETE_CONTENT_BY_URIS, condition));
//            ps.setString(1, condition.substring(0, condition.length() - 1));
            int queryResult = ps.executeUpdate();

            if (queryResult > 0) {
                logger.info("Binary content deleted for uris: {}", uris);
            } else {
                logger.warn("Failed to delete binary content for uris: {}", uris);
            }

            ps.close();

        } catch (SQLException e) {
            String msg = String.format("Failed to delete binary content for uris: %s", uris);
            logger.error(msg, e);
            throw new RuntimeException(msg, e);

        } finally {
            closeResources(c, ps, null, String.format("While deleting binary content for uris: %s", uris));
        }
    }

    private void closeResources(Connection c, Statement ps, ResultSet rs, String msg) {
        if (c != null) {
            try {
                if (!c.isClosed()) {
                    c.close();
                }
            } catch (SQLException e) {
                logger.warn("Failed to close connection: {}", msg, e);
            }
        }
        if (ps != null) {
            try {
                if (!ps.isClosed()) {
                    ps.close();
                }
            } catch (SQLException e) {
                logger.warn("Failed to close prepared statement: {}", msg, e);
            }
        }
        if (rs != null) {
            try {
                if (!rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                logger.warn("Failed to close result set: {}", msg, e);
            }
        }
    }
}
