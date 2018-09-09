
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="nationalIdentifierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legislationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nationalIdentifierType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "nationalIdentifierId",
    "personId",
    "personNumber",
    "legislationCode",
    "nationalIdentifierType"
})
@XmlRootElement(name = "deletePersonNationalIdentifier")
public class DeletePersonNationalIdentifier {

    protected long nationalIdentifierId;
    protected long personId;
    @XmlElement(required = true)
    protected String personNumber;
    @XmlElement(required = true)
    protected String legislationCode;
    @XmlElement(required = true)
    protected String nationalIdentifierType;

    /**
     * Gets the value of the nationalIdentifierId property.
     * 
     */
    public long getNationalIdentifierId() {
        return nationalIdentifierId;
    }

    /**
     * Sets the value of the nationalIdentifierId property.
     * 
     */
    public void setNationalIdentifierId(long value) {
        this.nationalIdentifierId = value;
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
     * Gets the value of the nationalIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdentifierType() {
        return nationalIdentifierType;
    }

    /**
     * Sets the value of the nationalIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdentifierType(String value) {
        this.nationalIdentifierType = value;
    }

}
