
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
 *         &lt;element name="externalIdentifierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalIdentifierSequence" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "externalIdentifierId",
    "personId",
    "personNumber",
    "externalIdentifierSequence"
})
@XmlRootElement(name = "deletePersonIdentifierAsync")
public class DeletePersonIdentifierAsync {

    protected long externalIdentifierId;
    protected long personId;
    @XmlElement(required = true)
    protected String personNumber;
    protected long externalIdentifierSequence;

    /**
     * Gets the value of the externalIdentifierId property.
     * 
     */
    public long getExternalIdentifierId() {
        return externalIdentifierId;
    }

    /**
     * Sets the value of the externalIdentifierId property.
     * 
     */
    public void setExternalIdentifierId(long value) {
        this.externalIdentifierId = value;
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
     * Gets the value of the externalIdentifierSequence property.
     * 
     */
    public long getExternalIdentifierSequence() {
        return externalIdentifierSequence;
    }

    /**
     * Sets the value of the externalIdentifierSequence property.
     * 
     */
    public void setExternalIdentifierSequence(long value) {
        this.externalIdentifierSequence = value;
    }

}
