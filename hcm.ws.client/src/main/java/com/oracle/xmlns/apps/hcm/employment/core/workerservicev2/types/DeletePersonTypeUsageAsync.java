
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
 *         &lt;element name="personTypeUsageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPersonType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemPersonType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legalEmployerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "personTypeUsageId",
    "personId",
    "personNumber",
    "userPersonType",
    "systemPersonType",
    "legalEmployerName",
    "effectiveDate",
    "rangeMode"
})
@XmlRootElement(name = "deletePersonTypeUsageAsync")
public class DeletePersonTypeUsageAsync {

    protected long personTypeUsageId;
    protected long personId;
    @XmlElement(required = true)
    protected String personNumber;
    @XmlElement(required = true)
    protected String userPersonType;
    @XmlElement(required = true)
    protected String systemPersonType;
    @XmlElement(required = true)
    protected String legalEmployerName;
    @XmlElement(required = true)
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(required = true)
    protected String rangeMode;

    /**
     * Gets the value of the personTypeUsageId property.
     * 
     */
    public long getPersonTypeUsageId() {
        return personTypeUsageId;
    }

    /**
     * Sets the value of the personTypeUsageId property.
     * 
     */
    public void setPersonTypeUsageId(long value) {
        this.personTypeUsageId = value;
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
     * Gets the value of the legalEmployerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEmployerName() {
        return legalEmployerName;
    }

    /**
     * Sets the value of the legalEmployerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEmployerName(String value) {
        this.legalEmployerName = value;
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
