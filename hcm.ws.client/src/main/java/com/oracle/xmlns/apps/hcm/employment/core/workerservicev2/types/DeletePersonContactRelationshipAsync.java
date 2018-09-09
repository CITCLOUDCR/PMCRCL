
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactPersonId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contactPersonNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date"/>
 *         &lt;element name="rangeMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contactRelationshipId",
    "personId",
    "personNumber",
    "contactPersonId",
    "contactPersonNumber",
    "contactType",
    "effectiveDate",
    "rangeMode"
})
@XmlRootElement(name = "deletePersonContactRelationshipAsync")
public class DeletePersonContactRelationshipAsync {

    protected long contactRelationshipId;
    protected long personId;
    @XmlElement(required = true)
    protected String personNumber;
    protected long contactPersonId;
    @XmlElement(required = true)
    protected String contactPersonNumber;
    @XmlElement(required = true)
    protected String contactType;
    @XmlElement(required = true)
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(required = true)
    protected String rangeMode;

    /**
     * Gets the value of the contactRelationshipId property.
     * 
     */
    public long getContactRelationshipId() {
        return contactRelationshipId;
    }

    /**
     * Sets the value of the contactRelationshipId property.
     * 
     */
    public void setContactRelationshipId(long value) {
        this.contactRelationshipId = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     */
    public long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     */
    public void setPersonId(long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNumber(String value) {
        this.personNumber = value;
    }

    /**
     * Gets the value of the contactPersonId property.
     * 
     */
    public long getContactPersonId() {
        return contactPersonId;
    }

    /**
     * Sets the value of the contactPersonId property.
     * 
     */
    public void setContactPersonId(long value) {
        this.contactPersonId = value;
    }

    /**
     * Gets the value of the contactPersonNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonNumber() {
        return contactPersonNumber;
    }

    /**
     * Sets the value of the contactPersonNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonNumber(String value) {
        this.contactPersonNumber = value;
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the rangeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeMode() {
        return rangeMode;
    }

    /**
     * Sets the value of the rangeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeMode(String value) {
        this.rangeMode = value;
    }

}
