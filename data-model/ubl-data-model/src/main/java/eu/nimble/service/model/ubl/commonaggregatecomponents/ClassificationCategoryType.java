//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.02 at 03:35:43 PM MSK 
//


package eu.nimble.service.model.ubl.commonaggregatecomponents;

import eu.nimble.service.model.ubl.commonbasiccomponents.TextType;
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
 * <p>Java class for ClassificationCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CodeValue" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CategorizesClassificationCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationCategoryType", propOrder = {
    "name",
    "codeValue",
    "description",
    "categorizesClassificationCategory"
})
@Entity(name = "ClassificationCategoryType")
@Table(name = "CLASSIFICATION_CATEGORY_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class ClassificationCategoryType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TextType name;
    @XmlElement(name = "CodeValue", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String codeValue;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TextType> description;
    @XmlElement(name = "CategorizesClassificationCategory")
    protected List<ClassificationCategoryType> categorizesClassificationCategory;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    @ManyToOne(targetEntity = TextType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__CLASSIFICATION_CATEGOR_0")
    public TextType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setName(TextType value) {
        this.name = value;
    }

    /**
     * Gets the value of the codeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CODE_VALUE", length = 255)
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Sets the value of the codeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValue(String value) {
        this.codeValue = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    @OneToMany(targetEntity = TextType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESCRIPTION_CLASSIFICATION_C_0")
    public List<TextType> getDescription() {
        if (description == null) {
            description = new ArrayList<TextType>();
        }
        return this.description;
    }

    /**
     * 
     * 
     */
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    /**
     * Gets the value of the categorizesClassificationCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorizesClassificationCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorizesClassificationCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationCategoryType }
     * 
     * 
     */
    @OneToMany(orphanRemoval = true,targetEntity = ClassificationCategoryType.class, cascade = {
        javax.persistence.CascadeType.ALL
    })
    @JoinColumn(name = "CATEGORIZES_CLASSIFICATION_C_1")
    public List<ClassificationCategoryType> getCategorizesClassificationCategory() {
        if (categorizesClassificationCategory == null) {
            categorizesClassificationCategory = new ArrayList<ClassificationCategoryType>();
        }
        return this.categorizesClassificationCategory;
    }

    /**
     * 
     * 
     */
    public void setCategorizesClassificationCategory(List<ClassificationCategoryType> categorizesClassificationCategory) {
        this.categorizesClassificationCategory = categorizesClassificationCategory;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClassificationCategoryType that = ((ClassificationCategoryType) object);
        {
            TextType lhsName;
            lhsName = this.getName();
            TextType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsCodeValue;
            lhsCodeValue = this.getCodeValue();
            String rhsCodeValue;
            rhsCodeValue = that.getCodeValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codeValue", lhsCodeValue), LocatorUtils.property(thatLocator, "codeValue", rhsCodeValue), lhsCodeValue, rhsCodeValue)) {
                return false;
            }
        }
        {
            List<TextType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<TextType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            List<ClassificationCategoryType> lhsCategorizesClassificationCategory;
            lhsCategorizesClassificationCategory = (((this.categorizesClassificationCategory!= null)&&(!this.categorizesClassificationCategory.isEmpty()))?this.getCategorizesClassificationCategory():null);
            List<ClassificationCategoryType> rhsCategorizesClassificationCategory;
            rhsCategorizesClassificationCategory = (((that.categorizesClassificationCategory!= null)&&(!that.categorizesClassificationCategory.isEmpty()))?that.getCategorizesClassificationCategory():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categorizesClassificationCategory", lhsCategorizesClassificationCategory), LocatorUtils.property(thatLocator, "categorizesClassificationCategory", rhsCategorizesClassificationCategory), lhsCategorizesClassificationCategory, rhsCategorizesClassificationCategory)) {
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
