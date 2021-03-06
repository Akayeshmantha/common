//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 11:50:23 AM MSK
//


package eu.nimble.service.model.ubl.commonaggregatecomponents;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.nimble.service.model.BigDecimalXmlAdapter;
import eu.nimble.service.model.ubl.commonbasiccomponents.CodeType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for TransportEquipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportEquipmentTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumidityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RefrigeratedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Characteristics" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportEquipmentType", propOrder = {
    "transportEquipmentTypeCode",
    "humidityPercent",
    "refrigeratedIndicator",
    "characteristics"
})
@Entity(name = "TransportEquipmentType")
@Table(name = "TRANSPORT_EQUIPMENT_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class TransportEquipmentType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TransportEquipmentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CodeType transportEquipmentTypeCode;
    @XmlElement(name = "HumidityPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", type = String.class)
    @XmlJavaTypeAdapter(BigDecimalXmlAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal humidityPercent;
    @XmlElement(name = "RefrigeratedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Boolean refrigeratedIndicator;
    @XmlElement(name = "Characteristics", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String characteristics;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the transportEquipmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    @ManyToOne(targetEntity = CodeType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TRANSPORT_EQUIPMENT_TYPE_COD_0")
    public CodeType getTransportEquipmentTypeCode() {
        return transportEquipmentTypeCode;
    }

    /**
     * Sets the value of the transportEquipmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransportEquipmentTypeCode(CodeType value) {
        this.transportEquipmentTypeCode = value;
    }

    /**
     * Gets the value of the humidityPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "HUMIDITY_PERCENT", precision = 20, scale = 10)
    public BigDecimal getHumidityPercent() {
        return humidityPercent;
    }

    /**
     * Sets the value of the humidityPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumidityPercent(BigDecimal value) {
        this.humidityPercent = value;
    }

    /**
     * Gets the value of the refrigeratedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "REFRIGERATED_INDICATOR")
    public Boolean isRefrigeratedIndicator() {
        return refrigeratedIndicator;
    }

    /**
     * Sets the value of the refrigeratedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefrigeratedIndicator(Boolean value) {
        this.refrigeratedIndicator = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CHARACTERISTICS_", length = 255)
    public String getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristics(String value) {
        this.characteristics = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransportEquipmentType that = ((TransportEquipmentType) object);
        {
            CodeType lhsTransportEquipmentTypeCode;
            lhsTransportEquipmentTypeCode = this.getTransportEquipmentTypeCode();
            CodeType rhsTransportEquipmentTypeCode;
            rhsTransportEquipmentTypeCode = that.getTransportEquipmentTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEquipmentTypeCode", lhsTransportEquipmentTypeCode), LocatorUtils.property(thatLocator, "transportEquipmentTypeCode", rhsTransportEquipmentTypeCode), lhsTransportEquipmentTypeCode, rhsTransportEquipmentTypeCode)) {
                return false;
            }
        }
        {
            BigDecimal lhsHumidityPercent;
            lhsHumidityPercent = this.getHumidityPercent();
            BigDecimal rhsHumidityPercent;
            rhsHumidityPercent = that.getHumidityPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "humidityPercent", lhsHumidityPercent), LocatorUtils.property(thatLocator, "humidityPercent", rhsHumidityPercent), lhsHumidityPercent, rhsHumidityPercent)) {
                return false;
            }
        }
        {
            Boolean lhsRefrigeratedIndicator;
            lhsRefrigeratedIndicator = this.isRefrigeratedIndicator();
            Boolean rhsRefrigeratedIndicator;
            rhsRefrigeratedIndicator = that.isRefrigeratedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refrigeratedIndicator", lhsRefrigeratedIndicator), LocatorUtils.property(thatLocator, "refrigeratedIndicator", rhsRefrigeratedIndicator), lhsRefrigeratedIndicator, rhsRefrigeratedIndicator)) {
                return false;
            }
        }
        {
            String lhsCharacteristics;
            lhsCharacteristics = this.getCharacteristics();
            String rhsCharacteristics;
            rhsCharacteristics = that.getCharacteristics();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "characteristics", lhsCharacteristics), LocatorUtils.property(thatLocator, "characteristics", rhsCharacteristics), lhsCharacteristics, rhsCharacteristics)) {
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
