package eu.nimble.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.nimble.utility.config.PersistenceConfig;
import org.hibernate.Hibernate;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HibernateUtility {

	public static org.slf4j.Logger log = LoggerFactory.getLogger(HibernateUtility.class);
	private EntityManagerFactory entityManagerFactory;

	private static HashMap<String, HibernateUtility> engineInstances = new HashMap<>();
	private static org.h2.tools.Server server = null;
	
	public static void startH2DB() {
		try {
			server = org.h2.tools.Server.createTcpServer(
				new String[]{"-tcpAllowOthers"}).start();
		} catch (Exception ex1) {
			ex1.printStackTrace();
		}
	}

	public static void stopH2DB() {
		try {
			server.stop();
		} catch (Exception ex1) {
			ex1.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private HibernateUtility(String persistenceUnitName) {
		this(persistenceUnitName, null);
	}

	private HibernateUtility(String persistenceUnitName, Map persistenceProperties) {
		if(persistenceProperties == null) {
			persistenceProperties = PersistenceConfig.getInstance().getPersistenceParameters(persistenceUnitName);
		}

		entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName, persistenceProperties);
		log.info(" $$$ HibernateUtility is initialized");
	}

	public static HibernateUtility getInstance() {
		return getInstance(Configuration.UBL_PERSISTENCE_UNIT_NAME);
	}

	public static HibernateUtility getInstance(String persistenceUnitName) {
		if (engineInstances.get(persistenceUnitName) == null) {
			HibernateUtility engineInstance = new HibernateUtility(persistenceUnitName);
			engineInstances.put(persistenceUnitName, engineInstance);
		}

		return engineInstances.get(persistenceUnitName);
	}

	public static HibernateUtility getInstance(String persistenceUnitName, Map<String, String> persistenceProperties) {
		if (engineInstances.get(persistenceUnitName) == null) {
			HibernateUtility engineInstance = new HibernateUtility(persistenceUnitName, persistenceProperties);
			engineInstances.put(persistenceUnitName, engineInstance);
		}

		return engineInstances.get(persistenceUnitName);
	}

	public void persist(Object object) {
		synchronized (HibernateUtility.class) {
			EntityManager saveManager = entityManagerFactory
				.createEntityManager();
			saveManager.getTransaction().begin();
			saveManager.persist(object);
			saveManager.getTransaction().commit();
			saveManager.close();
		}
	}

	public void update(Object object) {
		synchronized (HibernateUtility.class) {
			EntityManager saveManager = entityManagerFactory
				.createEntityManager();
			saveManager.getTransaction().begin();
			saveManager.merge(object);
			saveManager.getTransaction().commit();
			saveManager.close();
		}
	}

	public boolean delete(Class<?> c, Long hjid) {
		synchronized (HibernateUtility.class) {
			boolean deleted = false;
			EntityManager saveManager = entityManagerFactory
				.createEntityManager();
			saveManager.getTransaction().begin();

			List<?> result = new ArrayList<Object>();
			String query = "select c from " + c.getSimpleName()
				+ " as c where c.hjid=" + hjid.longValue() + "";
			
			log.debug(" $$$ Delete query = {}", query);
			result = saveManager.createQuery(query).getResultList();

			if (result != null && !result.isEmpty()) {
				Object object = result.get(0);
				saveManager.remove(object);
				deleted = true;
			}

			saveManager.getTransaction().commit();
			saveManager.close();
			return deleted;
		}
	}

	// Queries according to hibernate id...
	public Object load(Class<?> classToLoad, Long hid) {
		synchronized (HibernateUtility.class) {
			EntityManager loadManager = entityManagerFactory
				.createEntityManager();

			Object result = loadManager.find(classToLoad, hid);

			loadManager.close();

			return result;
		}
	}

	public List<?> loadAll(Class<?> classToLoad) {
		synchronized (HibernateUtility.class) {
			List<?> result = new ArrayList<Object>();
			String query = "select c from " + classToLoad.getName() + " as c";
			EntityManager loadManager = entityManagerFactory
				.createEntityManager();

			loadManager.getTransaction().begin();

			result = loadManager.createQuery(query).getResultList();
			loadManager.getTransaction().commit();

			return result;
		}
	}

	public List<?> loadAll(String query) {
		synchronized (HibernateUtility.class) {

			List<?> result = new ArrayList<Object>();
			// int attempt = 0;
			try {
				EntityManager loadManager = entityManagerFactory
					.createEntityManager();
				loadManager.getTransaction().begin();

				result = loadManager.createQuery(query).getResultList();
				Hibernate.initialize(result);
				loadManager.getTransaction().commit();
			} catch (Exception e) {
				log.error(" $$$ HibernateUtility loadAll function has thrown error");
				log.error("", e);
				/*
				 * attempt++; if (attempt < 10) { result = loadAll(query); if
				 * (result != null) { log.info(
				 * " $$$ HibernateUtility loadAll functions throws error... attempt count is : "
				 * + attempt); } }
				 */
				return new ArrayList<Object>();
			}
			return result;
		}
	}

	public Object loadIndividualItem(String query) {
		List<?> result = new ArrayList<Object>();
		EntityManager loadManager = entityManagerFactory.createEntityManager();
		loadManager.getTransaction().begin();

		result = loadManager.createQuery(query).getResultList();

		loadManager.getTransaction().commit();

		if (result == null || result.size() == 0) {
			return null;
		}
		return result.get(0);
	}

	public static Object copySerializableObject(Object object, Class clazz) {
		ObjectMapper om = new ObjectMapper();
		String serializedObject;
		try {
			serializedObject = om.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Failed to serialize the object for class: " + clazz.getName(), e);
		}

		Object copy;
		try {
			copy = om.readValue(serializedObject, clazz);
		} catch (IOException e) {
			throw new RuntimeException("Failed to deserizalize the object for class: " + clazz.getName() + "\nSerialization: " + serializedObject, e);
		}

		return  copy;
	}

	public static void main(String argv[]) {
		try {
			 org.h2.tools.Server server = org.h2.tools.Server.createTcpServer(
				new String[]{"-tcpAllowOthers"}).start();
		} catch (Exception ex1) {
			ex1.printStackTrace();
		}	
	}

	private String specifyPersistencePropertiesFileName(String persistenceUnitName) {
		if(persistenceUnitName.equals(Configuration.UBL_PERSISTENCE_UNIT_NAME))
			return Configuration.UBL_PERSISTENCE_PROPERTIES_FILE_NAME;
		else if(persistenceUnitName.equals(Configuration.MODAML_PERSISTENCE_UNIT_NAME))
			return Configuration.MODAML_PERSISTENCE_PROPERTIES_FILE_NAME;
		else return "persistence.properties";
	}
}
