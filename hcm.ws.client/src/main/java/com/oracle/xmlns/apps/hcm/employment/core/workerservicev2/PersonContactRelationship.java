
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.hcm.people.core.flex.contactrelshipdff.ContactRelshipDFF;
import com.oracle.xmlns.apps.hcm.people.core.flex.personcontactrellegddf.PersonContactRelLegDDF;


/**
 * <p>Java class for PersonContactRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonContactRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactPersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RelatedPersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeneficiaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BondholderFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DependentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmergencyContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EndLifeReasonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StartLifeReasonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExistingPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ThirdPartyPayFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceSystemOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegislationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactRelshipDFF" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/contactRelshipDFF/}ContactRelshipDFF" minOccurs="0"/>
 *         &lt;element name="PersonContactRelLegDDF" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/}PersonContactRelLegDDF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonContactRelationship", propOrder = {
    "contactRelationshipId",
    "effectiveStartDate",
    "effectiveEndDate",
    "rangeStartDate",
    "rangeEndDate",
    "rangeMode",
    "contactPersonId",
    "contactPersonNumber",
    "relatedPersonId",
    "relatedPersonNumber",
    "contactType",
    "beneficiaryFlag",
    "bondholderFlag",
    "dependentFlag",
    "emergencyContactFlag",
    "endLifeReasonId",
    "startLifeReasonId",
    "existingPerson",
    "personalFlag",
    "primaryContactFlag",
    "sequenceNumber",
    "thirdPartyPayFlag",
    "objectVersionNumber",
    "sourceSystemOwner",
    "sourceSystemId",
    "guid",
    "legislationCode",
    "contactRelshipDFF",
    "personContactRelLegDDF"
})
public class PersonContactRelationship {

    @XmlElement(name = "ContactRelationshipId")
    protected Long contactRelationshipId;
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
    @XmlElement(name = "ContactPersonId")
    protected Long contactPersonId;
    @XmlElementRef(name = "ContactPersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> contactPersonNumber;
    @XmlElement(name = "RelatedPersonId")
    protected Long relatedPersonId;
    @XmlElementRef(name = "RelatedPersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> relatedPersonNumber;
    @XmlElement(name = "ContactType")
    protected String contactType;
    @XmlElement(name = "BeneficiaryFlag")
    protected Boolean beneficiaryFlag;
    @XmlElement(name = "BondholderFlag")
    protected Boolean bondholderFlag;
    @XmlElement(name = "DependentFlag")
    protected Boolean dependentFlag;
    @XmlElement(name = "EmergencyContactFlag")
    protected Boolean emergencyContactFlag;
    @XmlElementRef(name = "EndLifeReasonId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> endLifeReasonId;
    @XmlElementRef(name = "StartLifeReasonId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> startLifeReasonId;
    @XmlElement(name = "ExistingPerson")
    protected String existingPerson;
    @XmlElement(name = "PersonalFlag")
    protected Boolean personalFlag;
    @XmlElement(name = "PrimaryContactFlag")
    protected Boolean primaryContactFlag;
    @XmlElement(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlElement(name = "ThirdPartyPayFlag")
    protected Boolean thirdPartyPayFlag;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "SourceSystemOwner", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemOwner;
    @XmlElementRef(name = "SourceSystemId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemId;
    @XmlElementRef(name = "GUID", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> guid;
    @XmlElementRef(name = "LegislationCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> legislationCode;
    @XmlElement(name = "ContactRelshipDFF")
    protected ContactRelshipDFF contactRelshipDFF;
    @XmlElement(name = "PersonContactRelLegDDF")
    protected PersonContactRelLegDDF personContactRelLegDDF;

    /**
     * Gets the value of the contactRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactRelationshipId() {
        return contactRelationshipId;
    }

    /**
     * Sets the value of the contactRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactRelationshipId(Long value) {
        this.contactRelationshipId = value;
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
     * Gets the value of the contactPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPersonId() {
        return contactPersonId;
    }

    /**
     * Sets the value of the contactPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPersonId(Long value) {
        this.contactPersonId = value;
    }

    /**
     * Gets the value of the contactPersonNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactPersonNumber() {
        return contactPersonNumber;
    }

    /**
     * Sets the value of the contactPersonNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactPersonNumber(JAXBElement<String> value) {
        this.contactPersonNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the relatedPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelatedPersonId() {
        return relatedPersonId;
    }

    /**
     * Sets the value of the relatedPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelatedPersonId(Long value) {
        this.relatedPersonId = value;
    }

    /**
     * Gets the value of the relatedPersonNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelatedPersonNumber() {
        return relatedPersonNumber;
    }

    /**
     * Sets the value of the relatedPersonNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelatedPersonNumber(JAXBElement<String> value) {
        this.relatedPersonNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the beneficiaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeneficiaryFlag() {
        return beneficiaryFlag;
    }

    /**
     * Sets the value of the beneficiaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeneficiaryFlag(Boolean value) {
        this.beneficiaryFlag = value;
    }

    /**
     * Gets the value of the bondholderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBondholderFlag() {
        return bondholderFlag;
    }

    /**
     * Sets the value of the bondholderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBondholderFlag(Boolean value) {
        this.bondholderFlag = value;
    }

    /**
     * Gets the value of the dependentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDependentFlag() {
        return dependentFlag;
    }

    /**
     * Sets the value of the dependentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDependentFlag(Boolean value) {
        this.dependentFlag = value;
    }

    /**
     * Gets the value of the emergencyContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmergencyContactFlag() {
        return emergencyContactFlag;
    }

    /**
     * Sets the value of the emergencyContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmergencyContactFlag(Boolean value) {
        this.emergencyContactFlag = value;
    }

    /**
     * Gets the value of the endLifeReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEndLifeReasonId() {
        return endLifeReasonId;
    }

    /**
     * Sets the value of the endLifeReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEndLifeReasonId(JAXBElement<Long> value) {
        this.endLifeReasonId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the startLifeReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStartLifeReasonId() {
        return startLifeReasonId;
    }

    /**
     * Sets the value of the startLifeReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStartLifeReasonId(JAXBElement<Long> value) {
        this.startLifeReasonId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the existingPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingPerson() {
        return existingPerson;
    }

    /**
     * Sets the value of the existingPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingPerson(String value) {
        this.existingPerson = value;
    }

    /**
     * Gets the value of the personalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalFlag() {
        return personalFlag;
    }

    /**
     * Sets the value of the personalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalFlag(Boolean value) {
        this.personalFlag = value;
    }

    /**
     * Gets the value of the primaryContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryContactFlag() {
        return primaryContactFlag;
    }

    /**
     * Sets the value of the primaryContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryContactFlag(Boolean value) {
        this.primaryContactFlag = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the thirdPartyPayFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThirdPartyPayFlag() {
        return thirdPartyPayFlag;
    }

    /**
     * Sets the value of the thirdPartyPayFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThirdPartyPayFlag(Boolean value) {
        this.thirdPartyPayFlag = value;
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
     * Gets the value of the legislationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegislationCode() {
        return legislationCode;
    }

    /**
     * Sets the value of the legislationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegislationCode(JAXBElement<String> value) {
        this.legislationCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactRelshipDFF property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRelshipDFF }
     *     
     */
    public ContactRelshipDFF getContactRelshipDFF() {
        return contactRelshipDFF;
    }

    /**
     * Sets the value of the contactRelshipDFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRelshipDFF }
     *     
     */
    public void setContactRelshipDFF(ContactRelshipDFF value) {
        this.contactRelshipDFF = value;
    }

    /**
     * Gets the value of the personContactRelLegDDF property.
     * 
     * @return
     *     possible object is
     *     {@link PersonContactRelLegDDF }
     *     
     */
    public PersonContactRelLegDDF getPersonContactRelLegDDF() {
        return personContactRelLegDDF;
    }

    /**
     * Sets the value of the personContactRelLegDDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonContactRelLegDDF }
     *     
     */
    public void setPersonContactRelLegDDF(PersonContactRelLegDDF value) {
        this.personContactRelLegDDF = value;
    }

}
