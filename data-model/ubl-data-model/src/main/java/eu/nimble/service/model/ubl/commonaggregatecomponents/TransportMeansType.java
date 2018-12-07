//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.07.30 at 11:50:23 AM MSK
//


package eu.nimble.service.model.ubl.commonaggregatecomponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.nimble.service.model.ubl.commonbasiccomponents.CodeType;
import org.hibernate.annotations.Cascade;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for TransportMeansType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportMeansType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportMeansTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeansType", propOrder = {
    "transportMeansTypeCode",
    "transportEquipment"
})
@Entity(name = "TransportMeansType")
@Table(name = "TRANSPORT_MEANS_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class TransportMeansType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TransportMeansTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CodeType transportMeansTypeCode;
    @XmlElement(name = "TransportEquipment")
    protected List<TransportEquipmentType> transportEquipment;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the transportMeansTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    @ManyToOne(targetEntity = CodeType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "TRANSPORT_MEANS_TYPE_CODE_TR_0")
    public CodeType getTransportMeansTypeCode() {
        return transportMeansTypeCode;
    }

    /**
     * Sets the value of the transportMeansTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransportMeansTypeCode(CodeType value) {
        this.transportMeansTypeCode = value;
    }

    /**
     * Gets the value of the transportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    @OneToMany(orphanRemoval = true,targetEntity = TransportEquipmentType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "TRANSPORT_EQUIPMENT_TRANSPOR_0")
    public List<TransportEquipmentType> getTransportEquipment() {
        if (transportEquipment == null) {
            transportEquipment = new ArrayList<TransportEquipmentType>();
        }
        return this.transportEquipment;
    }

    /**
     * 
     * 
     */
    public void setTransportEquipment(List<TransportEquipmentType> transportEquipment) {
        this.transportEquipment = transportEquipment;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransportMeansType that = ((TransportMeansType) object);
        {
            CodeType lhsTransportMeansTypeCode;
            lhsTransportMeansTypeCode = this.getTransportMeansTypeCode();
            CodeType rhsTransportMeansTypeCode;
            rhsTransportMeansTypeCode = that.getTransportMeansTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportMeansTypeCode", lhsTransportMeansTypeCode), LocatorUtils.property(thatLocator, "transportMeansTypeCode", rhsTransportMeansTypeCode), lhsTransportMeansTypeCode, rhsTransportMeansTypeCode)) {
                return false;
            }
        }
        {
            List<TransportEquipmentType> lhsTransportEquipment;
            lhsTransportEquipment = (((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty()))?this.getTransportEquipment():null);
            List<TransportEquipmentType> rhsTransportEquipment;
            rhsTransportEquipment = (((that.transportEquipment!= null)&&(!that.transportEquipment.isEmpty()))?that.getTransportEquipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEquipment", lhsTransportEquipment), LocatorUtils.property(thatLocator, "transportEquipment", rhsTransportEquipment), lhsTransportEquipment, rhsTransportEquipment)) {
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

}
