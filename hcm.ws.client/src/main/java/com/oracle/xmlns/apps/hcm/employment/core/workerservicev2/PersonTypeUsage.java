
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonTypeUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonTypeUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonTypeUsageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EffectiveLatestChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RangeStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RangeStartSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RangeEndSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LegalEmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceSystemOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonTypeUsage", propOrder = {
    "personTypeUsageId",
    "effectiveStartDate",
    "effectiveEndDate",
    "effectiveSequence",
    "effectiveLatestChange",
    "rangeStartDate",
    "rangeEndDate",
    "rangeMode",
    "rangeStartSequence",
    "rangeEndSequence",
    "personId",
    "personNumber",
    "personTypeId",
    "userPersonType",
    "systemPersonType",
    "legalEntityId",
    "legalEmployerName",
    "objectVersionNumber",
    "sourceSystemOwner",
    "sourceSystemId",
    "guid"
})
public class PersonTypeUsage {

    @XmlElement(name = "PersonTypeUsageId")
    protected Long personTypeUsageId;
    @XmlElement(name = "EffectiveStartDate")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElement(name = "EffectiveSequence")
    protected Integer effectiveSequence;
    @XmlElement(name = "EffectiveLatestChange")
    protected String effectiveLatestChange;
    @XmlElementRef(name = "RangeStartDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rangeStartDate;
    @XmlElementRef(name = "RangeEndDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rangeEndDate;
    @XmlElementRef(name = "RangeMode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> rangeMode;
    @XmlElementRef(name = "RangeStartSequence", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Integer> rangeStartSequence;
    @XmlElementRef(name = "RangeEndSequence", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Integer> rangeEndSequence;
    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElementRef(name = "PersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> personNumber;
    @XmlElement(name = "PersonTypeId")
    protected Long personTypeId;
    @XmlElement(name = "UserPersonType")
    protected String userPersonType;
    @XmlElement(name = "SystemPersonType")
    protected String systemPersonType;
    @XmlElementRef(name = "LegalEntityId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> legalEntityId;
    @XmlElementRef(name = "LegalEmployerName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> legalEmployerName;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "SourceSystemOwner", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemOwner;
    @XmlElementRef(name = "SourceSystemId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemId;
    @XmlElementRef(name = "GUID", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> guid;

    /**
     * Gets the value of the personTypeUsageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonTypeUsageId() {
        return personTypeUsageId;
    }

    /**
     * Sets the value of the personTypeUsageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonTypeUsageId(Long value) {
        this.personTypeUsageId = value;
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
     * Gets the value of the effectiveSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEffectiveSequence() {
        return effectiveSequence;
    }

    /**
     * Sets the value of the effectiveSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEffectiveSequence(Integer value) {
        this.effectiveSequence = value;
    }

    /**
     * Gets the value of the effectiveLatestChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveLatestChange() {
        return effectiveLatestChange;
    }

    /**
     * Sets the value of the effectiveLatestChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveLatestChange(String value) {
        this.effectiveLatestChange = value;
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
     * Gets the value of the rangeStartSequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRangeStartSequence() {
        return rangeStartSequence;
    }

    /**
     * Sets the value of the rangeStartSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRangeStartSequence(JAXBElement<Integer> value) {
        this.rangeStartSequence = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rangeEndSequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRangeEndSequence() {
        return rangeEndSequence;
    }

    /**
     * Sets the value of the rangeEndSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRangeEndSequence(JAXBElement<Integer> value) {
        this.rangeEndSequence = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the personTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonTypeId() {
        return personTypeId;
    }

    /**
     * Sets the value of the personTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonTypeId(Long value) {
        this.personTypeId = value;
    }

    /**
     * Gets the value of the userPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPersonType() {
        return userPersonType;
    }

    /**
     * Sets the value of the userPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPersonType(String value) {
        this.userPersonType = value;
    }

    /**
     * Gets the value of the systemPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemPersonType() {
        return systemPersonType;
    }

    /**
     * Sets the value of the systemPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemPersonType(String value) {
        this.systemPersonType = value;
    }

    /**
     * Gets the value of the legalEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLegalEntityId() {
        return legalEntityId;
    }

    /**
     * Sets the value of the legalEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLegalEntityId(JAXBElement<Long> value) {
        this.legalEntityId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the legalEmployerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalEmployerName() {
        return legalEmployerName;
    }

    /**
     * Sets the value of the legalEmployerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalEmployerName(JAXBElement<String> value) {
        this.legalEmployerName = ((JAXBElement<String> ) value);
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

}
