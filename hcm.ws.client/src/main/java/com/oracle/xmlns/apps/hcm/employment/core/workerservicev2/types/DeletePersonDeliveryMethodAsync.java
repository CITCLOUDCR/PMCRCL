
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
 *         &lt;element name="deliveryMethodId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commDlvryMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preferredOrder" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "deliveryMethodId",
    "personId",
    "personNumber",
    "commDlvryMethod",
    "preferredOrder"
})
@XmlRootElement(name = "deletePersonDeliveryMethodAsync")
public class DeletePersonDeliveryMethodAsync {

    protected long deliveryMethodId;
    protected long personId;
    @XmlElement(required = true)
    protected String personNumber;
    @XmlElement(required = true)
    protected String commDlvryMethod;
    protected long preferredOrder;

    /**
     * Gets the value of the deliveryMethodId property.
     * 
     */
    public long getDeliveryMethodId() {
        return deliveryMethodId;
    }

    /**
     * Sets the value of the deliveryMethodId property.
     * 
     */
    public void setDeliveryMethodId(long value) {
        this.deliveryMethodId = value;
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
     * Gets the value of the commDlvryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommDlvryMethod() {
        return commDlvryMethod;
    }

    /**
     * Sets the value of the commDlvryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommDlvryMethod(String value) {
        this.commDlvryMethod = value;
    }

    /**
     * Gets the value of the preferredOrder property.
     * 
     */
    public long getPreferredOrder() {
        return preferredOrder;
    }

    /**
     * Sets the value of the preferredOrder property.
     * 
     */
    public void setPreferredOrder(long value) {
        this.preferredOrder = value;
    }

}
