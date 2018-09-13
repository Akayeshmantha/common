//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 11:50:23 AM MSK 
//


package eu.nimble.service.model.ubl.ppapresponse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.nimble.service.model.ubl.commonaggregatecomponents.CustomerPartyType;
import eu.nimble.service.model.ubl.commonaggregatecomponents.DocumentReferenceType;
import eu.nimble.service.model.ubl.commonaggregatecomponents.SupplierPartyType;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for PpapResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PpapResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AcceptedIndicator"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyerCustomerParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PpapDocumentReference"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDocument" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PpapResponseType", propOrder = {
    "id",
    "note",
    "acceptedIndicator",
    "sellerSupplierParty",
    "buyerCustomerParty",
    "ppapDocumentReference",
    "requestedDocument"
})
@Entity(name = "PpapResponseType")
@Table(name = "PPAP_RESPONSE_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class PpapResponseType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected String id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<String> note;
    @XmlElement(name = "AcceptedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected boolean acceptedIndicator;
    @XmlElement(name = "SellerSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "BuyerCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected CustomerPartyType buyerCustomerParty;
    @XmlElement(name = "PpapDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected DocumentReferenceType ppapDocumentReference;
    @XmlElement(name = "RequestedDocument", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected List<DocumentReferenceType> requestedDocument;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<PpapResponseTypeNoteItem> noteItems;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ID", length = 255)
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Transient
    public List<String> getNote() {
        if (note == null) {
            note = new ArrayList<String>();
        }
        return this.note;
    }

    /**
     * 
     * 
     */
    public void setNote(List<String> note) {
        this.note = note;
    }

    /**
     * Gets the value of the acceptedIndicator property.
     * 
     */
    @Basic
    @Column(name = "ACCEPTED_INDICATOR")
    public boolean isAcceptedIndicator() {
        return acceptedIndicator;
    }

    /**
     * Sets the value of the acceptedIndicator property.
     * 
     */
    public void setAcceptedIndicator(boolean value) {
        this.acceptedIndicator = value;
    }

    /**
     * Gets the value of the sellerSupplierParty property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    @ManyToOne(targetEntity = SupplierPartyType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SELLER_SUPPLIER_PARTY_PPAP_R_1")
    public SupplierPartyType getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    /**
     * Sets the value of the sellerSupplierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSellerSupplierParty(SupplierPartyType value) {
        this.sellerSupplierParty = value;
    }

    /**
     * Gets the value of the buyerCustomerParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    @ManyToOne(targetEntity = CustomerPartyType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BUYER_CUSTOMER_PARTY_PPAP_RE_1")
    public CustomerPartyType getBuyerCustomerParty() {
        return buyerCustomerParty;
    }

    /**
     * Sets the value of the buyerCustomerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setBuyerCustomerParty(CustomerPartyType value) {
        this.buyerCustomerParty = value;
    }

    /**
     * Gets the value of the ppapDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    @ManyToOne(targetEntity = DocumentReferenceType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PPAP_DOCUMENT_REFERENCE_PPAP_0")
    public DocumentReferenceType getPpapDocumentReference() {
        return ppapDocumentReference;
    }

    /**
     * Sets the value of the ppapDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setPpapDocumentReference(DocumentReferenceType value) {
        this.ppapDocumentReference = value;
    }

    /**
     * Gets the value of the requestedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    @OneToMany(targetEntity = DocumentReferenceType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REQUESTED_DOCUMENT_PPAP_RESP_0")
    public List<DocumentReferenceType> getRequestedDocument() {
        if (requestedDocument == null) {
            requestedDocument = new ArrayList<DocumentReferenceType>();
        }
        return this.requestedDocument;
    }

    /**
     * 
     * 
     */
    public void setRequestedDocument(List<DocumentReferenceType> requestedDocument) {
        this.requestedDocument = requestedDocument;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PpapResponseType that = ((PpapResponseType) object);
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            List<String> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<String> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote)) {
                return false;
            }
        }
        {
            boolean lhsAcceptedIndicator;
            lhsAcceptedIndicator = this.isAcceptedIndicator();
            boolean rhsAcceptedIndicator;
            rhsAcceptedIndicator = that.isAcceptedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptedIndicator", lhsAcceptedIndicator), LocatorUtils.property(thatLocator, "acceptedIndicator", rhsAcceptedIndicator), lhsAcceptedIndicator, rhsAcceptedIndicator)) {
                return false;
            }
        }
        {
            SupplierPartyType lhsSellerSupplierParty;
            lhsSellerSupplierParty = this.getSellerSupplierParty();
            SupplierPartyType rhsSellerSupplierParty;
            rhsSellerSupplierParty = that.getSellerSupplierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sellerSupplierParty", lhsSellerSupplierParty), LocatorUtils.property(thatLocator, "sellerSupplierParty", rhsSellerSupplierParty), lhsSellerSupplierParty, rhsSellerSupplierParty)) {
                return false;
            }
        }
        {
            CustomerPartyType lhsBuyerCustomerParty;
            lhsBuyerCustomerParty = this.getBuyerCustomerParty();
            CustomerPartyType rhsBuyerCustomerParty;
            rhsBuyerCustomerParty = that.getBuyerCustomerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyerCustomerParty", lhsBuyerCustomerParty), LocatorUtils.property(thatLocator, "buyerCustomerParty", rhsBuyerCustomerParty), lhsBuyerCustomerParty, rhsBuyerCustomerParty)) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsPpapDocumentReference;
            lhsPpapDocumentReference = this.getPpapDocumentReference();
            DocumentReferenceType rhsPpapDocumentReference;
            rhsPpapDocumentReference = that.getPpapDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ppapDocumentReference", lhsPpapDocumentReference), LocatorUtils.property(thatLocator, "ppapDocumentReference", rhsPpapDocumentReference), lhsPpapDocumentReference, rhsPpapDocumentReference)) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsRequestedDocument;
            lhsRequestedDocument = (((this.requestedDocument!= null)&&(!this.requestedDocument.isEmpty()))?this.getRequestedDocument():null);
            List<DocumentReferenceType> rhsRequestedDocument;
            rhsRequestedDocument = (((that.requestedDocument!= null)&&(!that.requestedDocument.isEmpty()))?that.getRequestedDocument():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDocument", lhsRequestedDocument), LocatorUtils.property(thatLocator, "requestedDocument", rhsRequestedDocument), lhsRequestedDocument, rhsRequestedDocument)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @OneToMany(targetEntity = PpapResponseTypeNoteItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NOTE_ITEMS_PPAP_RESPONSE_TYP_0")
    public List<PpapResponseTypeNoteItem> getNoteItems() {
        if (this.noteItems == null) {
            this.noteItems = new ArrayList<PpapResponseTypeNoteItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.note)) {
            this.note = ItemUtils.wrap(this.note, this.noteItems, PpapResponseTypeNoteItem.class);
        }
        return this.noteItems;
    }

    public void setNoteItems(List<PpapResponseTypeNoteItem> value) {
        this.note = null;
        this.noteItems = null;
        this.noteItems = value;
        if (this.noteItems == null) {
            this.noteItems = new ArrayList<PpapResponseTypeNoteItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.note)) {
            this.note = ItemUtils.wrap(this.note, this.noteItems, PpapResponseTypeNoteItem.class);
        }
    }

}
