
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
 * <p>Java class for Worker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker">
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
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkRelationship" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}WorkRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerAddress" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerCitizenship" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonCitizenship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerDeliveryMethod" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonDeliveryMethod" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerDriversLicence" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonDriversLicence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerEmail" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonEmail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerEthnicity" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonEthnicity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerImage" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonImage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerLegislativeData" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonLegislativeData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerName" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerNationalIdentifier" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonNationalIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerPassport" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonPassport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerPhone" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonPhone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerReligion" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonReligion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerVisa" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonVisa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerUserInformation" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonUserInformation" minOccurs="0"/>
 *         &lt;element name="WorkerDFF" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/}PersonDFF" minOccurs="0"/>
 *         &lt;element name="j_WorkerExtraInformation" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/}j_PersonExtraInformation" minOccurs="0"/>
 *         &lt;element name="ExternalIdentifier" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}ExternalIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker", propOrder = {
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
    "actionCode",
    "reasonCode",
    "workRelationship",
    "workerAddress",
    "workerCitizenship",
    "workerDeliveryMethod",
    "workerDriversLicence",
    "workerEmail",
    "workerEthnicity",
    "workerImage",
    "workerLegislativeData",
    "workerName",
    "workerNationalIdentifier",
    "workerPassport",
    "workerPhone",
    "workerReligion",
    "workerVisa",
    "workerUserInformation",
    "workerDFF",
    "jWorkerExtraInformation",
    "externalIdentifier"
})
public class Worker {

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
    @XmlElementRef(name = "ActionCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> actionCode;
    @XmlElementRef(name = "ReasonCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> reasonCode;
    @XmlElement(name = "WorkRelationship")
    protected List<WorkRelationship> workRelationship;
    @XmlElement(name = "WorkerAddress")
    protected List<PersonAddress> workerAddress;
    @XmlElement(name = "WorkerCitizenship")
    protected List<PersonCitizenship> workerCitizenship;
    @XmlElement(name = "WorkerDeliveryMethod")
    protected List<PersonDeliveryMethod> workerDeliveryMethod;
    @XmlElement(name = "WorkerDriversLicence")
    protected List<PersonDriversLicence> workerDriversLicence;
    @XmlElement(name = "WorkerEmail")
    protected List<PersonEmail> workerEmail;
    @XmlElement(name = "WorkerEthnicity")
    protected List<PersonEthnicity> workerEthnicity;
    @XmlElement(name = "WorkerImage")
    protected List<PersonImage> workerImage;
    @XmlElement(name = "WorkerLegislativeData")
    protected List<PersonLegislativeData> workerLegislativeData;
    @XmlElement(name = "WorkerName")
    protected List<PersonName> workerName;
    @XmlElement(name = "WorkerNationalIdentifier")
    protected List<PersonNationalIdentifier> workerNationalIdentifier;
    @XmlElement(name = "WorkerPassport")
    protected List<PersonPassport> workerPassport;
    @XmlElement(name = "WorkerPhone")
    protected List<PersonPhone> workerPhone;
    @XmlElement(name = "WorkerReligion")
    protected List<PersonReligion> workerReligion;
    @XmlElement(name = "WorkerVisa")
    protected List<PersonVisa> workerVisa;
    @XmlElement(name = "WorkerUserInformation")
    protected PersonUserInformation workerUserInformation;
    @XmlElement(name = "WorkerDFF")
    protected PersonDFF workerDFF;
    @XmlElement(name = "j_WorkerExtraInformation")
    protected JPersonExtraInformation jWorkerExtraInformation;
    @XmlElement(name = "ExternalIdentifier")
    protected List<ExternalIdentifier> externalIdentifier;

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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActionCode(JAXBElement<String> value) {
        this.actionCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<String> value) {
        this.reasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkRelationship }
     * 
     * 
     */
    public List<WorkRelationship> getWorkRelationship() {
        if (workRelationship == null) {
            workRelationship = new ArrayList<WorkRelationship>();
        }
        return this.workRelationship;
    }

    /**
     * Gets the value of the workerAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonAddress }
     * 
     * 
     */
    public List<PersonAddress> getWorkerAddress() {
        if (workerAddress == null) {
            workerAddress = new ArrayList<PersonAddress>();
        }
        return this.workerAddress;
    }

    /**
     * Gets the value of the workerCitizenship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerCitizenship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerCitizenship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonCitizenship }
     * 
     * 
     */
    public List<PersonCitizenship> getWorkerCitizenship() {
        if (workerCitizenship == null) {
            workerCitizenship = new ArrayList<PersonCitizenship>();
        }
        return this.workerCitizenship;
    }

    /**
     * Gets the value of the workerDeliveryMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerDeliveryMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerDeliveryMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDeliveryMethod }
     * 
     * 
     */
    public List<PersonDeliveryMethod> getWorkerDeliveryMethod() {
        if (workerDeliveryMethod == null) {
            workerDeliveryMethod = new ArrayList<PersonDeliveryMethod>();
        }
        return this.workerDeliveryMethod;
    }

    /**
     * Gets the value of the workerDriversLicence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerDriversLicence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerDriversLicence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDriversLicence }
     * 
     * 
     */
    public List<PersonDriversLicence> getWorkerDriversLicence() {
        if (workerDriversLicence == null) {
            workerDriversLicence = new ArrayList<PersonDriversLicence>();
        }
        return this.workerDriversLicence;
    }

    /**
     * Gets the value of the workerEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonEmail }
     * 
     * 
     */
    public List<PersonEmail> getWorkerEmail() {
        if (workerEmail == null) {
            workerEmail = new ArrayList<PersonEmail>();
        }
        return this.workerEmail;
    }

    /**
     * Gets the value of the workerEthnicity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerEthnicity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerEthnicity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonEthnicity }
     * 
     * 
     */
    public List<PersonEthnicity> getWorkerEthnicity() {
        if (workerEthnicity == null) {
            workerEthnicity = new ArrayList<PersonEthnicity>();
        }
        return this.workerEthnicity;
    }

    /**
     * Gets the value of the workerImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonImage }
     * 
     * 
     */
    public List<PersonImage> getWorkerImage() {
        if (workerImage == null) {
            workerImage = new ArrayList<PersonImage>();
        }
        return this.workerImage;
    }

    /**
     * Gets the value of the workerLegislativeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerLegislativeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerLegislativeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonLegislativeData }
     * 
     * 
     */
    public List<PersonLegislativeData> getWorkerLegislativeData() {
        if (workerLegislativeData == null) {
            workerLegislativeData = new ArrayList<PersonLegislativeData>();
        }
        return this.workerLegislativeData;
    }

    /**
     * Gets the value of the workerName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonName }
     * 
     * 
     */
    public List<PersonName> getWorkerName() {
        if (workerName == null) {
            workerName = new ArrayList<PersonName>();
        }
        return this.workerName;
    }

    /**
     * Gets the value of the workerNationalIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerNationalIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerNationalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNationalIdentifier }
     * 
     * 
     */
    public List<PersonNationalIdentifier> getWorkerNationalIdentifier() {
        if (workerNationalIdentifier == null) {
            workerNationalIdentifier = new ArrayList<PersonNationalIdentifier>();
        }
        return this.workerNationalIdentifier;
    }

    /**
     * Gets the value of the workerPassport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerPassport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerPassport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPassport }
     * 
     * 
     */
    public List<PersonPassport> getWorkerPassport() {
        if (workerPassport == null) {
            workerPassport = new ArrayList<PersonPassport>();
        }
        return this.workerPassport;
    }

    /**
     * Gets the value of the workerPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPhone }
     * 
     * 
     */
    public List<PersonPhone> getWorkerPhone() {
        if (workerPhone == null) {
            workerPhone = new ArrayList<PersonPhone>();
        }
        return this.workerPhone;
    }

    /**
     * Gets the value of the workerReligion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerReligion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerReligion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonReligion }
     * 
     * 
     */
    public List<PersonReligion> getWorkerReligion() {
        if (workerReligion == null) {
            workerReligion = new ArrayList<PersonReligion>();
        }
        return this.workerReligion;
    }

    /**
     * Gets the value of the workerVisa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerVisa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerVisa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonVisa }
     * 
     * 
     */
    public List<PersonVisa> getWorkerVisa() {
        if (workerVisa == null) {
            workerVisa = new ArrayList<PersonVisa>();
        }
        return this.workerVisa;
    }

    /**
     * Gets the value of the workerUserInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PersonUserInformation }
     *     
     */
    public PersonUserInformation getWorkerUserInformation() {
        return workerUserInformation;
    }

    /**
     * Sets the value of the workerUserInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonUserInformation }
     *     
     */
    public void setWorkerUserInformation(PersonUserInformation value) {
        this.workerUserInformation = value;
    }

    /**
     * Gets the value of the workerDFF property.
     * 
     * @return
     *     possible object is
     *     {@link PersonDFF }
     *     
     */
    public PersonDFF getWorkerDFF() {
        return workerDFF;
    }

    /**
     * Sets the value of the workerDFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDFF }
     *     
     */
    public void setWorkerDFF(PersonDFF value) {
        this.workerDFF = value;
    }

    /**
     * Gets the value of the jWorkerExtraInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JPersonExtraInformation }
     *     
     */
    public JPersonExtraInformation getJWorkerExtraInformation() {
        return jWorkerExtraInformation;
    }

    /**
     * Sets the value of the jWorkerExtraInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPersonExtraInformation }
     *     
     */
    public void setJWorkerExtraInformation(JPersonExtraInformation value) {
        this.jWorkerExtraInformation = value;
    }

    /**
     * Gets the value of the externalIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalIdentifier }
     * 
     * 
     */
    public List<ExternalIdentifier> getExternalIdentifier() {
        if (externalIdentifier == null) {
            externalIdentifier = new ArrayList<ExternalIdentifier>();
        }
        return this.externalIdentifier;
    }

}
