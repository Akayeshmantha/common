//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 01:58:58 PM MSK 
//


package eu.nimble.service.model.ubl.commonaggregatecomponents;

import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XMLGregorianCalendarAsDate;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FirstName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FamilyName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BirthDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BirthplaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrganizationDepartment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Role" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "id",
    "firstName",
    "familyName",
    "birthDate",
    "birthplaceName",
    "organizationDepartment",
    "role",
    "contact"
})
@Entity(name = "PersonType")
@Table(name = "PERSON_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String id;
    @XmlElement(name = "FirstName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String firstName;
    @XmlElement(name = "FamilyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String familyName;
    @XmlElement(name = "BirthDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "BirthplaceName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String birthplaceName;
    @XmlElement(name = "OrganizationDepartment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String organizationDepartment;
    @XmlElement(name = "Role", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<String> role;
    @XmlElement(name = "Contact")
    protected ContactType contact;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<PersonTypeRoleItem> roleItems;

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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_NAME", length = 255)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FAMILY_NAME", length = 255)
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthplaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BIRTHPLACE_NAME", length = 255)
    public String getBirthplaceName() {
        return birthplaceName;
    }

    /**
     * Sets the value of the birthplaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthplaceName(String value) {
        this.birthplaceName = value;
    }

    /**
     * Gets the value of the organizationDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ORGANIZATION_DEPARTMENT", length = 255)
    public String getOrganizationDepartment() {
        return organizationDepartment;
    }

    /**
     * Sets the value of the organizationDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationDepartment(String value) {
        this.organizationDepartment = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
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
    public List<String> getRole() {
        if (role == null) {
            role = new ArrayList<String>();
        }
        return this.role;
    }

    /**
     * 
     * 
     */
    public void setRole(List<String> role) {
        this.role = role;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    @ManyToOne(targetEntity = ContactType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONTACT_PERSON_TYPE_HJID")
    public ContactType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PersonType that = ((PersonType) object);
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
            String lhsFirstName;
            lhsFirstName = this.getFirstName();
            String rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName)) {
                return false;
            }
        }
        {
            String lhsFamilyName;
            lhsFamilyName = this.getFamilyName();
            String rhsFamilyName;
            rhsFamilyName = that.getFamilyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "familyName", lhsFamilyName), LocatorUtils.property(thatLocator, "familyName", rhsFamilyName), lhsFamilyName, rhsFamilyName)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsBirthDate;
            lhsBirthDate = this.getBirthDate();
            XMLGregorianCalendar rhsBirthDate;
            rhsBirthDate = that.getBirthDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "birthDate", lhsBirthDate), LocatorUtils.property(thatLocator, "birthDate", rhsBirthDate), lhsBirthDate, rhsBirthDate)) {
                return false;
            }
        }
        {
            String lhsBirthplaceName;
            lhsBirthplaceName = this.getBirthplaceName();
            String rhsBirthplaceName;
            rhsBirthplaceName = that.getBirthplaceName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "birthplaceName", lhsBirthplaceName), LocatorUtils.property(thatLocator, "birthplaceName", rhsBirthplaceName), lhsBirthplaceName, rhsBirthplaceName)) {
                return false;
            }
        }
        {
            String lhsOrganizationDepartment;
            lhsOrganizationDepartment = this.getOrganizationDepartment();
            String rhsOrganizationDepartment;
            rhsOrganizationDepartment = that.getOrganizationDepartment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizationDepartment", lhsOrganizationDepartment), LocatorUtils.property(thatLocator, "organizationDepartment", rhsOrganizationDepartment), lhsOrganizationDepartment, rhsOrganizationDepartment)) {
                return false;
            }
        }
        {
            List<String> lhsRole;
            lhsRole = (((this.role!= null)&&(!this.role.isEmpty()))?this.getRole():null);
            List<String> rhsRole;
            rhsRole = (((that.role!= null)&&(!that.role.isEmpty()))?that.getRole():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            ContactType lhsContact;
            lhsContact = this.getContact();
            ContactType rhsContact;
            rhsContact = that.getContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact)) {
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

    @Basic
    @Column(name = "BIRTH_DATE_ITEM")
    @Temporal(TemporalType.DATE)
    public Date getBirthDateItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDate.class, this.getBirthDate());
    }

    public void setBirthDateItem(Date target) {
        setBirthDate(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDate.class, target));
    }

    @OneToMany(targetEntity = PersonTypeRoleItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ROLE_ITEMS_PERSON_TYPE_HJID")
    public List<PersonTypeRoleItem> getRoleItems() {
        if (this.roleItems == null) {
            this.roleItems = new ArrayList<PersonTypeRoleItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.role)) {
            this.role = ItemUtils.wrap(this.role, this.roleItems, PersonTypeRoleItem.class);
        }
        return this.roleItems;
    }

    public void setRoleItems(List<PersonTypeRoleItem> value) {
        this.role = null;
        this.roleItems = null;
        this.roleItems = value;
        if (this.roleItems == null) {
            this.roleItems = new ArrayList<PersonTypeRoleItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.role)) {
            this.role = ItemUtils.wrap(this.role, this.roleItems, PersonTypeRoleItem.class);
        }
    }

}
