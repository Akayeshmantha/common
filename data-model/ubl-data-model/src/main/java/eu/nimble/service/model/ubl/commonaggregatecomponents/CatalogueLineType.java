//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 01:58:58 PM MSK 
//


package eu.nimble.service.model.ubl.commonaggregatecomponents;

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
import eu.nimble.service.model.ubl.commonbasiccomponents.QuantityType;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for CatalogueLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreeOfChargeIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WarrantyInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredItemLocationQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PriceOption" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueLineType", propOrder = {
    "id",
    "minimumOrderQuantity",
    "freeOfChargeIndicator",
    "warrantyInformation",
    "warrantyValidityPeriod",
    "requiredItemLocationQuantity",
    "priceOption",
    "goodsItem"
})
@Entity(name = "CatalogueLineType")
@Table(name = "CATALOGUE_LINE_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class CatalogueLineType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected String id;
    @XmlElement(name = "MinimumOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType minimumOrderQuantity;
    @XmlElement(name = "FreeOfChargeIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected Boolean freeOfChargeIndicator;
    @XmlElement(name = "WarrantyInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<String> warrantyInformation;
    @XmlElement(name = "WarrantyValidityPeriod")
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "RequiredItemLocationQuantity")
    protected ItemLocationQuantityType requiredItemLocationQuantity;
    @XmlElement(name = "PriceOption", required = true)
    protected List<PriceOptionType> priceOption;
    @XmlElement(name = "GoodsItem", required = true)
    protected GoodsItemType goodsItem;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<CatalogueLineTypeWarrantyInformationItem> warrantyInformationItems;

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
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    @ManyToOne(targetEntity = QuantityType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MINIMUM_ORDER_QUANTITY_CATAL_0")
    public QuantityType getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMinimumOrderQuantity(QuantityType value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the freeOfChargeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "FREE_OF_CHARGE_INDICATOR")
    public Boolean isFreeOfChargeIndicator() {
        return freeOfChargeIndicator;
    }

    /**
     * Sets the value of the freeOfChargeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeOfChargeIndicator(Boolean value) {
        this.freeOfChargeIndicator = value;
    }

    /**
     * Gets the value of the warrantyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyInformation().add(newItem);
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
    public List<String> getWarrantyInformation() {
        if (warrantyInformation == null) {
            warrantyInformation = new ArrayList<String>();
        }
        return this.warrantyInformation;
    }

    /**
     * 
     * 
     */
    public void setWarrantyInformation(List<String> warrantyInformation) {
        this.warrantyInformation = warrantyInformation;
    }

    /**
     * Gets the value of the warrantyValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    @ManyToOne(targetEntity = PeriodType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WARRANTY_VALIDITY_PERIOD_CAT_0")
    public PeriodType getWarrantyValidityPeriod() {
        return warrantyValidityPeriod;
    }

    /**
     * Sets the value of the warrantyValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setWarrantyValidityPeriod(PeriodType value) {
        this.warrantyValidityPeriod = value;
    }

    /**
     * Gets the value of the requiredItemLocationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    @ManyToOne(targetEntity = ItemLocationQuantityType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REQUIRED_ITEM_LOCATION_QUANT_1")
    public ItemLocationQuantityType getRequiredItemLocationQuantity() {
        return requiredItemLocationQuantity;
    }

    /**
     * Sets the value of the requiredItemLocationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public void setRequiredItemLocationQuantity(ItemLocationQuantityType value) {
        this.requiredItemLocationQuantity = value;
    }

    /**
     * Gets the value of the priceOption property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceOption property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceOption().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceOptionType }
     *
     *
     */
    @OneToMany(targetEntity = PriceOptionType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRICE_OPTION_CATALOGUE_LINE__0")
    public List<PriceOptionType> getPriceOption() {
        if (priceOption == null) {
            priceOption = new ArrayList<PriceOptionType>();
        }
        return this.priceOption;
    }

    /**
     *
     *
     */
    public void setPriceOption(List<PriceOptionType> priceOption) {
        this.priceOption = priceOption;
    }

    /**
     * Gets the value of the goodsItem property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsItemType }
     *     
     */
    @ManyToOne(targetEntity = GoodsItemType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "GOODS_ITEM_CATALOGUE_LINE_TY_0")
    public GoodsItemType getGoodsItem() {
        return goodsItem;
    }

    /**
     * Sets the value of the goodsItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsItemType }
     *     
     */
    public void setGoodsItem(GoodsItemType value) {
        this.goodsItem = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CatalogueLineType that = ((CatalogueLineType) object);
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
            QuantityType lhsMinimumOrderQuantity;
            lhsMinimumOrderQuantity = this.getMinimumOrderQuantity();
            QuantityType rhsMinimumOrderQuantity;
            rhsMinimumOrderQuantity = that.getMinimumOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumOrderQuantity", lhsMinimumOrderQuantity), LocatorUtils.property(thatLocator, "minimumOrderQuantity", rhsMinimumOrderQuantity), lhsMinimumOrderQuantity, rhsMinimumOrderQuantity)) {
                return false;
            }
        }
        {
            Boolean lhsFreeOfChargeIndicator;
            lhsFreeOfChargeIndicator = this.isFreeOfChargeIndicator();
            Boolean rhsFreeOfChargeIndicator;
            rhsFreeOfChargeIndicator = that.isFreeOfChargeIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeOfChargeIndicator", lhsFreeOfChargeIndicator), LocatorUtils.property(thatLocator, "freeOfChargeIndicator", rhsFreeOfChargeIndicator), lhsFreeOfChargeIndicator, rhsFreeOfChargeIndicator)) {
                return false;
            }
        }
        {
            List<String> lhsWarrantyInformation;
            lhsWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            List<String> rhsWarrantyInformation;
            rhsWarrantyInformation = (((that.warrantyInformation!= null)&&(!that.warrantyInformation.isEmpty()))?that.getWarrantyInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyInformation", lhsWarrantyInformation), LocatorUtils.property(thatLocator, "warrantyInformation", rhsWarrantyInformation), lhsWarrantyInformation, rhsWarrantyInformation)) {
                return false;
            }
        }
        {
            PeriodType lhsWarrantyValidityPeriod;
            lhsWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            PeriodType rhsWarrantyValidityPeriod;
            rhsWarrantyValidityPeriod = that.getWarrantyValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyValidityPeriod", lhsWarrantyValidityPeriod), LocatorUtils.property(thatLocator, "warrantyValidityPeriod", rhsWarrantyValidityPeriod), lhsWarrantyValidityPeriod, rhsWarrantyValidityPeriod)) {
                return false;
            }
        }
        {
            ItemLocationQuantityType lhsRequiredItemLocationQuantity;
            lhsRequiredItemLocationQuantity = this.getRequiredItemLocationQuantity();
            ItemLocationQuantityType rhsRequiredItemLocationQuantity;
            rhsRequiredItemLocationQuantity = that.getRequiredItemLocationQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredItemLocationQuantity", lhsRequiredItemLocationQuantity), LocatorUtils.property(thatLocator, "requiredItemLocationQuantity", rhsRequiredItemLocationQuantity), lhsRequiredItemLocationQuantity, rhsRequiredItemLocationQuantity)) {
                return false;
            }
        }
        {
            List<PriceOptionType> lhsPriceOption;
            lhsPriceOption = (((this.priceOption!= null)&&(!this.priceOption.isEmpty()))?this.getPriceOption():null);
            List<PriceOptionType> rhsPriceOption;
            rhsPriceOption = (((that.priceOption!= null)&&(!that.priceOption.isEmpty()))?that.getPriceOption():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceOption", lhsPriceOption), LocatorUtils.property(thatLocator, "priceOption", rhsPriceOption), lhsPriceOption, rhsPriceOption)) {
                return false;
            }
        }
        {
            GoodsItemType lhsGoodsItem;
            lhsGoodsItem = this.getGoodsItem();
            GoodsItemType rhsGoodsItem;
            rhsGoodsItem = that.getGoodsItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodsItem", lhsGoodsItem), LocatorUtils.property(thatLocator, "goodsItem", rhsGoodsItem), lhsGoodsItem, rhsGoodsItem)) {
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

    @OneToMany(targetEntity = CatalogueLineTypeWarrantyInformationItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WARRANTY_INFORMATION_ITEMS_C_0")
    public List<CatalogueLineTypeWarrantyInformationItem> getWarrantyInformationItems() {
        if (this.warrantyInformationItems == null) {
            this.warrantyInformationItems = new ArrayList<CatalogueLineTypeWarrantyInformationItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.warrantyInformation)) {
            this.warrantyInformation = ItemUtils.wrap(this.warrantyInformation, this.warrantyInformationItems, CatalogueLineTypeWarrantyInformationItem.class);
        }
        return this.warrantyInformationItems;
    }

    public void setWarrantyInformationItems(List<CatalogueLineTypeWarrantyInformationItem> value) {
        this.warrantyInformation = null;
        this.warrantyInformationItems = null;
        this.warrantyInformationItems = value;
        if (this.warrantyInformationItems == null) {
            this.warrantyInformationItems = new ArrayList<CatalogueLineTypeWarrantyInformationItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.warrantyInformation)) {
            this.warrantyInformation = ItemUtils.wrap(this.warrantyInformation, this.warrantyInformationItems, CatalogueLineTypeWarrantyInformationItem.class);
        }
    }

}
