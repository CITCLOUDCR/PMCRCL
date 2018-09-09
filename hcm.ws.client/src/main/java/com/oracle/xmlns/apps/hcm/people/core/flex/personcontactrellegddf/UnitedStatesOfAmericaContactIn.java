
package com.oracle.xmlns.apps.hcm.people.core.flex.personcontactrellegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitedStatesOfAmericaContactIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitedStatesOfAmericaContactIn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/}PersonContactRelLegDDF">
 *       &lt;sequence>
 *         &lt;element name="tinType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tinType_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitsOffered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitsOffered_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitedStatesOfAmericaContactIn", propOrder = {
    "tinType",
    "tinTypeDisplay",
    "tinNumber",
    "benefitsOffered",
    "benefitsOfferedDisplay"
})
public class UnitedStatesOfAmericaContactIn
    extends PersonContactRelLegDDF
{

    @XmlElementRef(name = "tinType", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> tinType;
    @XmlElementRef(name = "tinType_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> tinTypeDisplay;
    @XmlElementRef(name = "tinNumber", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> tinNumber;
    @XmlElementRef(name = "benefitsOffered", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> benefitsOffered;
    @XmlElementRef(name = "benefitsOffered_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> benefitsOfferedDisplay;

    /**
     * Gets the value of the tinType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTinType() {
        return tinType;
    }

    /**
     * Sets the value of the tinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTinType(JAXBElement<String> value) {
        this.tinType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tinTypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTinTypeDisplay() {
        return tinTypeDisplay;
    }

    /**
     * Sets the value of the tinTypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTinTypeDisplay(JAXBElement<String> value) {
        this.tinTypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTinNumber() {
        return tinNumber;
    }

    /**
     * Sets the value of the tinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTinNumber(JAXBElement<String> value) {
        this.tinNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the benefitsOffered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBenefitsOffered() {
        return benefitsOffered;
    }

    /**
     * Sets the value of the benefitsOffered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBenefitsOffered(JAXBElement<String> value) {
        this.benefitsOffered = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the benefitsOfferedDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBenefitsOfferedDisplay() {
        return benefitsOfferedDisplay;
    }

    /**
     * Sets the value of the benefitsOfferedDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBenefitsOfferedDisplay(JAXBElement<String> value) {
        this.benefitsOfferedDisplay = ((JAXBElement<String> ) value);
    }

}
