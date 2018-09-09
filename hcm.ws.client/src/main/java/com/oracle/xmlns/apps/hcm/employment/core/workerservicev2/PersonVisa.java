
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.hcm.people.core.flex.personvisalegddf.PersonVisaLegDDF;
import com.oracle.xmlns.apps.hcm.people.core.flex.visapermitdff.VisaPermitDFF;


/**
 * <p>Java class for PersonVisa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonVisa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisaPermitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaPermitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegislationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CurrentVisaPermit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="IssuingAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaPermitCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaPermitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaPermitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaPermitStatusDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceSystemOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonVisaLegDDF" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/}PersonVisaLegDDF" minOccurs="0"/>
 *         &lt;element name="VisaPermitDFF" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/visaPermitDFF/}VisaPermitDFF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonVisa", propOrder = {
    "visaPermitId",
    "effectiveStartDate",
    "effectiveEndDate",
    "rangeStartDate",
    "rangeEndDate",
    "rangeMode",
    "visaPermitType",
    "personId",
    "personNumber",
    "legislationCode",
    "entryDate",
    "expirationDate",
    "currentVisaPermit",
    "issueDate",
    "issuingAuthority",
    "issuingCountry",
    "issuingLocation",
    "profession",
    "visaPermitCategory",
    "visaPermitNumber",
    "visaPermitStatus",
    "visaPermitStatusDate",
    "objectVersionNumber",
    "sourceSystemOwner",
    "sourceSystemId",
    "guid",
    "personVisaLegDDF",
    "visaPermitDFF"
})
public class PersonVisa {

    @XmlElement(name = "VisaPermitId")
    protected Long visaPermitId;
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
    @XmlElementRef(name = "VisaPermitType", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> visaPermitType;
    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElementRef(name = "PersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> personNumber;
    @XmlElement(name = "LegislationCode")
    protected String legislationCode;
    @XmlElementRef(name = "EntryDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> entryDate;
    @XmlElementRef(name = "ExpirationDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> expirationDate;
    @XmlElement(name = "CurrentVisaPermit")
    protected String currentVisaPermit;
    @XmlElementRef(name = "IssueDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> issueDate;
    @XmlElementRef(name = "IssuingAuthority", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> issuingAuthority;
    @XmlElementRef(name = "IssuingCountry", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> issuingCountry;
    @XmlElementRef(name = "IssuingLocation", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> issuingLocation;
    @XmlElementRef(name = "Profession", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> profession;
    @XmlElementRef(name = "VisaPermitCategory", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> visaPermitCategory;
    @XmlElementRef(name = "VisaPermitNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> visaPermitNumber;
    @XmlElementRef(name = "VisaPermitStatus", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> visaPermitStatus;
    @XmlElementRef(name = "VisaPermitStatusDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> visaPermitStatusDate;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "SourceSystemOwner", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemOwner;
    @XmlElementRef(name = "SourceSystemId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemId;
    @XmlElementRef(name = "GUID", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> guid;
    @XmlElement(name = "PersonVisaLegDDF")
    protected PersonVisaLegDDF personVisaLegDDF;
    @XmlElement(name = "VisaPermitDFF")
    protected VisaPermitDFF visaPermitDFF;

    /**
     * Gets the value of the visaPermitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaPermitId() {
        return visaPermitId;
    }

    /**
     * Sets the value of the visaPermitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaPermitId(Long value) {
        this.visaPermitId = value;
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
     * Gets the value of the visaPermitType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisaPermitType() {
        return visaPermitType;
    }

    /**
     * Sets the value of the visaPermitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisaPermitType(JAXBElement<String> value) {
        this.visaPermitType = ((JAXBElement<String> ) value);
    }

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
     * Gets the value of the legislationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegislationCode() {
        return legislationCode;
    }

    /**
     * Sets the value of the legislationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegislationCode(String value) {
        this.legislationCode = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEntryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.entryDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the currentVisaPermit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentVisaPermit() {
        return currentVisaPermit;
    }

    /**
     * Sets the value of the currentVisaPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentVisaPermit(String value) {
        this.currentVisaPermit = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIssueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.issueDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the issuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Sets the value of the issuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssuingAuthority(JAXBElement<String> value) {
        this.issuingAuthority = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the issuingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssuingCountry() {
        return issuingCountry;
    }

    /**
     * Sets the value of the issuingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssuingCountry(JAXBElement<String> value) {
        this.issuingCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the issuingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssuingLocation() {
        return issuingLocation;
    }

    /**
     * Sets the value of the issuingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssuingLocation(JAXBElement<String> value) {
        this.issuingLocation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfession(JAXBElement<String> value) {
        this.profession = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the visaPermitCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisaPermitCategory() {
        return visaPermitCategory;
    }

    /**
     * Sets the value of the visaPermitCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisaPermitCategory(JAXBElement<String> value) {
        this.visaPermitCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the visaPermitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisaPermitNumber() {
        return visaPermitNumber;
    }

    /**
     * Sets the value of the visaPermitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisaPermitNumber(JAXBElement<String> value) {
        this.visaPermitNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the visaPermitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisaPermitStatus() {
        return visaPermitStatus;
    }

    /**
     * Sets the value of the visaPermitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisaPermitStatus(JAXBElement<String> value) {
        this.visaPermitStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the visaPermitStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVisaPermitStatusDate() {
        return visaPermitStatusDate;
    }

    /**
     * Sets the value of the visaPermitStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVisaPermitStatusDate(JAXBElement<XMLGregorianCalendar> value) {
        this.visaPermitStatusDate = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the personVisaLegDDF property.
     * 
     * @return
     *     possible object is
     *     {@link PersonVisaLegDDF }
     *     
     */
    public PersonVisaLegDDF getPersonVisaLegDDF() {
        return personVisaLegDDF;
    }

    /**
     * Sets the value of the personVisaLegDDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonVisaLegDDF }
     *     
     */
    public void setPersonVisaLegDDF(PersonVisaLegDDF value) {
        this.personVisaLegDDF = value;
    }

    /**
     * Gets the value of the visaPermitDFF property.
     * 
     * @return
     *     possible object is
     *     {@link VisaPermitDFF }
     *     
     */
    public VisaPermitDFF getVisaPermitDFF() {
        return visaPermitDFF;
    }

    /**
     * Sets the value of the visaPermitDFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaPermitDFF }
     *     
     */
    public void setVisaPermitDFF(VisaPermitDFF value) {
        this.visaPermitDFF = value;
    }

}
