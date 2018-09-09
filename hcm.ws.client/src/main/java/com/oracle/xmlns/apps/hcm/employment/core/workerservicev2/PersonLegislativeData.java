
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo.PersonLegislative;
import com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfodff.PersonLegislativeInfoDFF;


/**
 * <p>Java class for PersonLegislativeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonLegislativeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegislationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HighestEducationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatusDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceSystemOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonLegislativeInfoDFF" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfoDFF/}PersonLegislativeInfoDFF" minOccurs="0"/>
 *         &lt;element name="PersonLegislativeDDF" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeData", propOrder = {
    "personLegislativeId",
    "effectiveStartDate",
    "effectiveEndDate",
    "rangeStartDate",
    "rangeEndDate",
    "rangeMode",
    "personId",
    "personNumber",
    "legislationCode",
    "highestEducationLevel",
    "maritalStatus",
    "maritalStatusDate",
    "sex",
    "objectVersionNumber",
    "sourceSystemOwner",
    "sourceSystemId",
    "guid",
    "personLegislativeInfoDFF",
    "personLegislativeDDF"
})
public class PersonLegislativeData {

    @XmlElement(name = "PersonLegislativeId")
    protected Long personLegislativeId;
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
    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElementRef(name = "PersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> personNumber;
    @XmlElement(name = "LegislationCode")
    protected String legislationCode;
    @XmlElementRef(name = "HighestEducationLevel", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> highestEducationLevel;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> maritalStatus;
    @XmlElementRef(name = "MaritalStatusDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> maritalStatusDate;
    @XmlElementRef(name = "Sex", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sex;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "SourceSystemOwner", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemOwner;
    @XmlElementRef(name = "SourceSystemId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemId;
    @XmlElementRef(name = "GUID", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> guid;
    @XmlElement(name = "PersonLegislativeInfoDFF")
    protected PersonLegislativeInfoDFF personLegislativeInfoDFF;
    @XmlElement(name = "PersonLegislativeDDF")
    protected PersonLegislative personLegislativeDDF;

    /**
     * Gets the value of the personLegislativeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonLegislativeId() {
        return personLegislativeId;
    }

    /**
     * Sets the value of the personLegislativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonLegislativeId(Long value) {
        this.personLegislativeId = value;
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
     * Gets the value of the highestEducationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHighestEducationLevel() {
        return highestEducationLevel;
    }

    /**
     * Sets the value of the highestEducationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHighestEducationLevel(JAXBElement<String> value) {
        this.highestEducationLevel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<String> value) {
        this.maritalStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maritalStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMaritalStatusDate() {
        return maritalStatusDate;
    }

    /**
     * Sets the value of the maritalStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMaritalStatusDate(JAXBElement<XMLGregorianCalendar> value) {
        this.maritalStatusDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSex(JAXBElement<String> value) {
        this.sex = ((JAXBElement<String> ) value);
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
     * Gets the value of the personLegislativeInfoDFF property.
     * 
     * @return
     *     possible object is
     *     {@link PersonLegislativeInfoDFF }
     *     
     */
    public PersonLegislativeInfoDFF getPersonLegislativeInfoDFF() {
        return personLegislativeInfoDFF;
    }

    /**
     * Sets the value of the personLegislativeInfoDFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonLegislativeInfoDFF }
     *     
     */
    public void setPersonLegislativeInfoDFF(PersonLegislativeInfoDFF value) {
        this.personLegislativeInfoDFF = value;
    }

    /**
     * Gets the value of the personLegislativeDDF property.
     * 
     * @return
     *     possible object is
     *     {@link PersonLegislative }
     *     
     */
    public PersonLegislative getPersonLegislativeDDF() {
        return personLegislativeDDF;
    }

    /**
     * Sets the value of the personLegislativeDDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonLegislative }
     *     
     */
    public void setPersonLegislativeDDF(PersonLegislative value) {
        this.personLegislativeDDF = value;
    }

}
