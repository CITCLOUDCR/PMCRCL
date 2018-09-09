
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.hcm.people.core.flex.persondff.PersonDFF;
import com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.base.JPersonExtraInformation;


/**
 * <p>Java class for PersonContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BloodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrespondenceLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DateOfDeath" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CountryOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TownOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicantNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WaiveDataProtectFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactAddress" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactDeliveryMethod" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonDeliveryMethod" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactDriversLicence" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonDriversLicence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonEmail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactEthnicity" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonEthnicity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactImage" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonImage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactLegislativeData" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonLegislativeData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactNationalIdentifier" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonNationalIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPassport" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonPassport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPhone" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonPhone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactReligion" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonReligion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactVisa" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonVisa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPersonDFF" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/}PersonDFF" minOccurs="0"/>
 *         &lt;element name="ContactRelationship" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}ContactRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="j_ContactPersonExtraInformation" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/}j_PersonExtraInformation" minOccurs="0"/>
 *         &lt;element name="ContactCitizenship" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonCitizenship" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonContact", propOrder = {
    "personId",
    "effectiveStartDate",
    "effectiveEndDate",
    "rangeStartDate",
    "rangeEndDate",
    "rangeMode",
    "personNumber",
    "bloodType",
    "correspondenceLanguage",
    "startDate",
    "dateOfBirth",
    "dateOfDeath",
    "countryOfBirth",
    "regionOfBirth",
    "townOfBirth",
    "applicantNumber",
    "waiveDataProtectFlag",
    "objectVersionNumber",
    "categoryCode",
    "sourceSystemOwner",
    "sourceSystemId",
    "guid",
    "contactAddress",
    "contactDeliveryMethod",
    "contactDriversLicence",
    "contactEmail",
    "contactEthnicity",
    "contactImage",
    "contactLegislativeData",
    "contactName",
    "contactNationalIdentifier",
    "contactPassport",
    "contactPhone",
    "contactReligion",
    "contactVisa",
    "contactPersonDFF",
    "contactRelationship",
    "jContactPersonExtraInformation",
    "contactCitizenship"
})
public class PersonContact {

    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "EffectiveStartDate")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElementRef(name = "RangeStartDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rangeStartDate;
    @XmlElementRef(name = "RangeEndDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rangeEndDate;
    @XmlElementRef(name = "RangeMode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> rangeMode;
    @XmlElementRef(name = "PersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> personNumber;
    @XmlElementRef(name = "BloodType", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> bloodType;
    @XmlElementRef(name = "CorrespondenceLanguage", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> correspondenceLanguage;
    @XmlElement(name = "StartDate")
    protected XMLGregorianCalendar startDate;
    @XmlElementRef(name = "DateOfBirth", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateOfBirth;
    @XmlElementRef(name = "DateOfDeath", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateOfDeath;
    @XmlElementRef(name = "CountryOfBirth", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> countryOfBirth;
    @XmlElementRef(name = "RegionOfBirth", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> regionOfBirth;
    @XmlElementRef(name = "TownOfBirth", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> townOfBirth;
    @XmlElementRef(name = "ApplicantNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> applicantNumber;
    @XmlElement(name = "WaiveDataProtectFlag")
    protected Boolean waiveDataProtectFlag;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElement(name = "CategoryCode")
    protected String categoryCode;
    @XmlElementRef(name = "SourceSystemOwner", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemOwner;
    @XmlElementRef(name = "SourceSystemId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemId;
    @XmlElementRef(name = "GUID", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> guid;
    @XmlElement(name = "ContactAddress")
    protected List<PersonAddress> contactAddress;
    @XmlElement(name = "ContactDeliveryMethod")
    protected List<PersonDeliveryMethod> contactDeliveryMethod;
    @XmlElement(name = "ContactDriversLicence")
    protected List<PersonDriversLicence> contactDriversLicence;
    @XmlElement(name = "ContactEmail")
    protected List<PersonEmail> contactEmail;
    @XmlElement(name = "ContactEthnicity")
    protected List<PersonEthnicity> contactEthnicity;
    @XmlElement(name = "ContactImage")
    protected List<PersonImage> contactImage;
    @XmlElement(name = "ContactLegislativeData")
    protected List<PersonLegislativeData> contactLegislativeData;
    @XmlElement(name = "ContactName")
    protected List<PersonName> contactName;
    @XmlElement(name = "ContactNationalIdentifier")
    protected List<PersonNationalIdentifier> contactNationalIdentifier;
    @XmlElement(name = "ContactPassport")
    protected List<PersonPassport> contactPassport;
    @XmlElement(name = "ContactPhone")
    protected List<PersonPhone> contactPhone;
    @XmlElement(name = "ContactReligion")
    protected List<PersonReligion> contactReligion;
    @XmlElement(name = "ContactVisa")
    protected List<PersonVisa> contactVisa;
    @XmlElement(name = "ContactPersonDFF")
    protected PersonDFF contactPersonDFF;
    @XmlElement(name = "ContactRelationship")
    protected List<ContactRelationship> contactRelationship;
    @XmlElement(name = "j_ContactPersonExtraInformation")
    protected JPersonExtraInformation jContactPersonExtraInformation;
    @XmlElement(name = "ContactCitizenship")
    protected List<PersonCitizenship> contactCitizenship;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the rangeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRangeStartDate() {
        return rangeStartDate;
    }

    /**
     * Sets the value of the rangeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRangeStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.rangeStartDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the rangeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRangeEndDate() {
        return rangeEndDate;
    }

    /**
     * Sets the value of the rangeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRangeEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.rangeEndDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the rangeMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRangeMode() {
        return rangeMode;
    }

    /**
     * Sets the value of the rangeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRangeMode(JAXBElement<String> value) {
        this.rangeMode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonNumber(JAXBElement<String> value) {
        this.personNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bloodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBloodType() {
        return bloodType;
    }

    /**
     * Sets the value of the bloodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBloodType(JAXBElement<String> value) {
        this.bloodType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the correspondenceLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrespondenceLanguage() {
        return correspondenceLanguage;
    }

    /**
     * Sets the value of the correspondenceLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrespondenceLanguage(JAXBElement<String> value) {
        this.correspondenceLanguage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfBirth(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfBirth = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfDeath(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfDeath = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryOfBirth(JAXBElement<String> value) {
        this.countryOfBirth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regionOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionOfBirth() {
        return regionOfBirth;
    }

    /**
     * Sets the value of the regionOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionOfBirth(JAXBElement<String> value) {
        this.regionOfBirth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the townOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTownOfBirth() {
        return townOfBirth;
    }

    /**
     * Sets the value of the townOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTownOfBirth(JAXBElement<String> value) {
        this.townOfBirth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the applicantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicantNumber() {
        return applicantNumber;
    }

    /**
     * Sets the value of the applicantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicantNumber(JAXBElement<String> value) {
        this.applicantNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the waiveDataProtectFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaiveDataProtectFlag() {
        return waiveDataProtectFlag;
    }

    /**
     * Sets the value of the waiveDataProtectFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaiveDataProtectFlag(Boolean value) {
        this.waiveDataProtectFlag = value;
    }

    /**
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber(Integer value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the sourceSystemOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemOwner() {
        return sourceSystemOwner;
    }

    /**
     * Sets the value of the sourceSystemOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemOwner(JAXBElement<String> value) {
        this.sourceSystemOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sourceSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Sets the value of the sourceSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemId(JAXBElement<String> value) {
        this.sourceSystemId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGUID(JAXBElement<String> value) {
        this.guid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonAddress }
     * 
     * 
     */
    public List<PersonAddress> getContactAddress() {
        if (contactAddress == null) {
            contactAddress = new ArrayList<PersonAddress>();
        }
        return this.contactAddress;
    }

    /**
     * Gets the value of the contactDeliveryMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDeliveryMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDeliveryMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDeliveryMethod }
     * 
     * 
     */
    public List<PersonDeliveryMethod> getContactDeliveryMethod() {
        if (contactDeliveryMethod == null) {
            contactDeliveryMethod = new ArrayList<PersonDeliveryMethod>();
        }
        return this.contactDeliveryMethod;
    }

    /**
     * Gets the value of the contactDriversLicence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDriversLicence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDriversLicence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDriversLicence }
     * 
     * 
     */
    public List<PersonDriversLicence> getContactDriversLicence() {
        if (contactDriversLicence == null) {
            contactDriversLicence = new ArrayList<PersonDriversLicence>();
        }
        return this.contactDriversLicence;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonEmail }
     * 
     * 
     */
    public List<PersonEmail> getContactEmail() {
        if (contactEmail == null) {
            contactEmail = new ArrayList<PersonEmail>();
        }
        return this.contactEmail;
    }

    /**
     * Gets the value of the contactEthnicity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactEthnicity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactEthnicity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonEthnicity }
     * 
     * 
     */
    public List<PersonEthnicity> getContactEthnicity() {
        if (contactEthnicity == null) {
            contactEthnicity = new ArrayList<PersonEthnicity>();
        }
        return this.contactEthnicity;
    }

    /**
     * Gets the value of the contactImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonImage }
     * 
     * 
     */
    public List<PersonImage> getContactImage() {
        if (contactImage == null) {
            contactImage = new ArrayList<PersonImage>();
        }
        return this.contactImage;
    }

    /**
     * Gets the value of the contactLegislativeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactLegislativeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactLegislativeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonLegislativeData }
     * 
     * 
     */
    public List<PersonLegislativeData> getContactLegislativeData() {
        if (contactLegislativeData == null) {
            contactLegislativeData = new ArrayList<PersonLegislativeData>();
        }
        return this.contactLegislativeData;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonName }
     * 
     * 
     */
    public List<PersonName> getContactName() {
        if (contactName == null) {
            contactName = new ArrayList<PersonName>();
        }
        return this.contactName;
    }

    /**
     * Gets the value of the contactNationalIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactNationalIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactNationalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNationalIdentifier }
     * 
     * 
     */
    public List<PersonNationalIdentifier> getContactNationalIdentifier() {
        if (contactNationalIdentifier == null) {
            contactNationalIdentifier = new ArrayList<PersonNationalIdentifier>();
        }
        return this.contactNationalIdentifier;
    }

    /**
     * Gets the value of the contactPassport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPassport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPassport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPassport }
     * 
     * 
     */
    public List<PersonPassport> getContactPassport() {
        if (contactPassport == null) {
            contactPassport = new ArrayList<PersonPassport>();
        }
        return this.contactPassport;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPhone }
     * 
     * 
     */
    public List<PersonPhone> getContactPhone() {
        if (contactPhone == null) {
            contactPhone = new ArrayList<PersonPhone>();
        }
        return this.contactPhone;
    }

    /**
     * Gets the value of the contactReligion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactReligion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactReligion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonReligion }
     * 
     * 
     */
    public List<PersonReligion> getContactReligion() {
        if (contactReligion == null) {
            contactReligion = new ArrayList<PersonReligion>();
        }
        return this.contactReligion;
    }

    /**
     * Gets the value of the contactVisa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactVisa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactVisa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonVisa }
     * 
     * 
     */
    public List<PersonVisa> getContactVisa() {
        if (contactVisa == null) {
            contactVisa = new ArrayList<PersonVisa>();
        }
        return this.contactVisa;
    }

    /**
     * Gets the value of the contactPersonDFF property.
     * 
     * @return
     *     possible object is
     *     {@link PersonDFF }
     *     
     */
    public PersonDFF getContactPersonDFF() {
        return contactPersonDFF;
    }

    /**
     * Sets the value of the contactPersonDFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDFF }
     *     
     */
    public void setContactPersonDFF(PersonDFF value) {
        this.contactPersonDFF = value;
    }

    /**
     * Gets the value of the contactRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactRelationship }
     * 
     * 
     */
    public List<ContactRelationship> getContactRelationship() {
        if (contactRelationship == null) {
            contactRelationship = new ArrayList<ContactRelationship>();
        }
        return this.contactRelationship;
    }

    /**
     * Gets the value of the jContactPersonExtraInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JPersonExtraInformation }
     *     
     */
    public JPersonExtraInformation getJContactPersonExtraInformation() {
        return jContactPersonExtraInformation;
    }

    /**
     * Sets the value of the jContactPersonExtraInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPersonExtraInformation }
     *     
     */
    public void setJContactPersonExtraInformation(JPersonExtraInformation value) {
        this.jContactPersonExtraInformation = value;
    }

    /**
     * Gets the value of the contactCitizenship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactCitizenship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactCitizenship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonCitizenship }
     * 
     * 
     */
    public List<PersonCitizenship> getContactCitizenship() {
        if (contactCitizenship == null) {
            contactCitizenship = new ArrayList<PersonCitizenship>();
        }
        return this.contactCitizenship;
    }

}
