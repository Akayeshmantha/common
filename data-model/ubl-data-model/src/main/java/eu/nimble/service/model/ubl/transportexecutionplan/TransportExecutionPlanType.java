//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 01:58:58 PM MSK 
//


package eu.nimble.service.model.ubl.transportexecutionplan;

import eu.nimble.service.model.ubl.commonaggregatecomponents.ConsignmentType;
import eu.nimble.service.model.ubl.commonaggregatecomponents.DocumentReferenceType;
import eu.nimble.service.model.ubl.commonaggregatecomponents.PartyType;
import eu.nimble.service.model.ubl.commonbasiccomponents.CodeType;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A document used in the negotiation of a transport service between a transport user and a transport service provider.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TransportExecutionPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportExecutionPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentStatusReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportUserParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportServiceProviderParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportExecutionPlanRequestDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Consignment" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportExecutionPlanType", propOrder = {
    "id",
    "documentStatusCode",
    "documentStatusReasonCode",
    "note",
    "transportUserParty",
    "transportServiceProviderParty",
    "transportExecutionPlanRequestDocumentReference",
    "consignment"
})
@Entity(name = "TransportExecutionPlanType")
@Table(name = "TRANSPORT_EXECUTION_PLAN_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class TransportExecutionPlanType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected String id;
    @XmlElement(name = "DocumentStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CodeType documentStatusCode;
    @XmlElement(name = "DocumentStatusReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CodeType documentStatusReasonCode;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<String> note;
    @XmlElement(name = "TransportUserParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected PartyType transportUserParty;
    @XmlElement(name = "TransportServiceProviderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected PartyType transportServiceProviderParty;
    @XmlElement(name = "TransportExecutionPlanRequestDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected DocumentReferenceType transportExecutionPlanRequestDocumentReference;
    @XmlElement(name = "Consignment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected List<ConsignmentType> consignment;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<TransportExecutionPlanTypeNoteItem> noteItems;

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An identifier for this document, assigned by the sender.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
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
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Document Status Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A code signifying the status of the Transport Execution Plan (updated, cancelled, confirmed, etc.)&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Document Status Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataTypeQualifier&gt;Document Status&lt;/ccts:DataTypeQualifier&gt;&lt;ccts:DataType&gt;Document Status_ Code. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    @ManyToOne(targetEntity = CodeType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENT_STATUS_CODE_TRANSPO_0")
    public CodeType getDocumentStatusCode() {
        return documentStatusCode;
    }

    /**
     * Sets the value of the documentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDocumentStatusCode(CodeType value) {
        this.documentStatusCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Document Status Reason Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A code signifying a reason associated with the status of a Transport Execution Plan.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Document Status Reason Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    @ManyToOne(targetEntity = CodeType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENT_STATUS_REASON_CODE__1")
    public CodeType getDocumentStatusReasonCode() {
        return documentStatusReasonCode;
    }

    /**
     * Sets the value of the documentStatusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDocumentStatusReasonCode(CodeType value) {
        this.documentStatusReasonCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Note. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Free-form text pertinent to this document, conveying information that is not contained explicitly in other structures.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Note&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
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
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Note. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Free-form text pertinent to this document, conveying information that is not contained explicitly in other structures.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Note&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     */
    public void setNote(List<String> note) {
        this.note = note;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Transport User_ Party. Party&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The party requesting the transport service from a transport service provider.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Transport User&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Party&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Party&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Party&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    @ManyToOne(targetEntity = PartyType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TRANSPORT_USER_PARTY_TRANSPO_0")
    public PartyType getTransportUserParty() {
        return transportUserParty;
    }

    /**
     * Sets the value of the transportUserParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTransportUserParty(PartyType value) {
        this.transportUserParty = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Transport Service Provider_ Party. Party&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The party offering the transport service based upon a request from a transport user.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Transport Service Provider&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Party&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Party&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Party&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    @ManyToOne(targetEntity = PartyType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TRANSPORT_SERVICE_PROVIDER_P_1")
    public PartyType getTransportServiceProviderParty() {
        return transportServiceProviderParty;
    }

    /**
     * Sets the value of the transportServiceProviderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTransportServiceProviderParty(PartyType value) {
        this.transportServiceProviderParty = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Transport Execution Plan Request_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A reference to a Transport Execution Plan Request.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Transport Execution Plan Request&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Document Reference&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    @ManyToOne(targetEntity = DocumentReferenceType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TRANSPORT_EXECUTION_PLAN_REQ_1")
    public DocumentReferenceType getTransportExecutionPlanRequestDocumentReference() {
        return transportExecutionPlanRequestDocumentReference;
    }

    /**
     * Sets the value of the transportExecutionPlanRequestDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setTransportExecutionPlanRequestDocumentReference(DocumentReferenceType value) {
        this.transportExecutionPlanRequestDocumentReference = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Consignment&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A description of an identifiable collection of goods items to be transported between the consignor and the consignee. This information may be defined within a transport contract. A consignment may comprise more than one shipment (e.g., when consolidated by a freight forwarder).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Consignment&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Consignment&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Consignment&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the consignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignmentType }
     * 
     * 
     */
    @OneToMany(targetEntity = ConsignmentType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONSIGNMENT_TRANSPORT_EXECUT_0")
    public List<ConsignmentType> getConsignment() {
        if (consignment == null) {
            consignment = new ArrayList<ConsignmentType>();
        }
        return this.consignment;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:TransportExecutionPlan-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Transport Execution Plan. Consignment&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A description of an identifiable collection of goods items to be transported between the consignor and the consignee. This information may be defined within a transport contract. A consignment may comprise more than one shipment (e.g., when consolidated by a freight forwarder).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Transport Execution Plan&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Consignment&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Consignment&lt;/ccts:AssociatedObjectClass&gt;&lt;ccts:RepresentationTerm&gt;Consignment&lt;/ccts:RepresentationTerm&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     */
    public void setConsignment(List<ConsignmentType> consignment) {
        this.consignment = consignment;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransportExecutionPlanType that = ((TransportExecutionPlanType) object);
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
            CodeType lhsDocumentStatusCode;
            lhsDocumentStatusCode = this.getDocumentStatusCode();
            CodeType rhsDocumentStatusCode;
            rhsDocumentStatusCode = that.getDocumentStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentStatusCode", lhsDocumentStatusCode), LocatorUtils.property(thatLocator, "documentStatusCode", rhsDocumentStatusCode), lhsDocumentStatusCode, rhsDocumentStatusCode)) {
                return false;
            }
        }
        {
            CodeType lhsDocumentStatusReasonCode;
            lhsDocumentStatusReasonCode = this.getDocumentStatusReasonCode();
            CodeType rhsDocumentStatusReasonCode;
            rhsDocumentStatusReasonCode = that.getDocumentStatusReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentStatusReasonCode", lhsDocumentStatusReasonCode), LocatorUtils.property(thatLocator, "documentStatusReasonCode", rhsDocumentStatusReasonCode), lhsDocumentStatusReasonCode, rhsDocumentStatusReasonCode)) {
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
            PartyType lhsTransportUserParty;
            lhsTransportUserParty = this.getTransportUserParty();
            PartyType rhsTransportUserParty;
            rhsTransportUserParty = that.getTransportUserParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportUserParty", lhsTransportUserParty), LocatorUtils.property(thatLocator, "transportUserParty", rhsTransportUserParty), lhsTransportUserParty, rhsTransportUserParty)) {
                return false;
            }
        }
        {
            PartyType lhsTransportServiceProviderParty;
            lhsTransportServiceProviderParty = this.getTransportServiceProviderParty();
            PartyType rhsTransportServiceProviderParty;
            rhsTransportServiceProviderParty = that.getTransportServiceProviderParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportServiceProviderParty", lhsTransportServiceProviderParty), LocatorUtils.property(thatLocator, "transportServiceProviderParty", rhsTransportServiceProviderParty), lhsTransportServiceProviderParty, rhsTransportServiceProviderParty)) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsTransportExecutionPlanRequestDocumentReference;
            lhsTransportExecutionPlanRequestDocumentReference = this.getTransportExecutionPlanRequestDocumentReference();
            DocumentReferenceType rhsTransportExecutionPlanRequestDocumentReference;
            rhsTransportExecutionPlanRequestDocumentReference = that.getTransportExecutionPlanRequestDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportExecutionPlanRequestDocumentReference", lhsTransportExecutionPlanRequestDocumentReference), LocatorUtils.property(thatLocator, "transportExecutionPlanRequestDocumentReference", rhsTransportExecutionPlanRequestDocumentReference), lhsTransportExecutionPlanRequestDocumentReference, rhsTransportExecutionPlanRequestDocumentReference)) {
                return false;
            }
        }
        {
            List<ConsignmentType> lhsConsignment;
            lhsConsignment = (((this.consignment!= null)&&(!this.consignment.isEmpty()))?this.getConsignment():null);
            List<ConsignmentType> rhsConsignment;
            rhsConsignment = (((that.consignment!= null)&&(!that.consignment.isEmpty()))?that.getConsignment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consignment", lhsConsignment), LocatorUtils.property(thatLocator, "consignment", rhsConsignment), lhsConsignment, rhsConsignment)) {
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

    @OneToMany(targetEntity = TransportExecutionPlanTypeNoteItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NOTE_ITEMS_TRANSPORT_EXECUTI_0")
    public List<TransportExecutionPlanTypeNoteItem> getNoteItems() {
        if (this.noteItems == null) {
            this.noteItems = new ArrayList<TransportExecutionPlanTypeNoteItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.note)) {
            this.note = ItemUtils.wrap(this.note, this.noteItems, TransportExecutionPlanTypeNoteItem.class);
        }
        return this.noteItems;
    }

    public void setNoteItems(List<TransportExecutionPlanTypeNoteItem> value) {
        this.note = null;
        this.noteItems = null;
        this.noteItems = value;
        if (this.noteItems == null) {
            this.noteItems = new ArrayList<TransportExecutionPlanTypeNoteItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.note)) {
            this.note = ItemUtils.wrap(this.note, this.noteItems, TransportExecutionPlanTypeNoteItem.class);
        }
    }

}
