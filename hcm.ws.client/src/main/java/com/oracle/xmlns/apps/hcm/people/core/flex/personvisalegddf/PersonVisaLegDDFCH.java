
package com.oracle.xmlns.apps.hcm.people.core.flex.personvisalegddf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonVisaLegDDFCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonVisaLegDDFCH">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/}PersonVisaLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_CROSS_BORDER_FREQUENCY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CROSS_BORDER_FREQUENCY_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CROSS_BORDER_FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonVisaLegDDFCH", propOrder = {
    "crossborderfrequencytype",
    "crossborderfrequencytypeDisplay",
    "crossborderfrequency"
})
public class PersonVisaLegDDFCH
    extends PersonVisaLegDDF
{

    @XmlElementRef(name = "_CROSS_BORDER_FREQUENCY_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> crossborderfrequencytype;
    @XmlElementRef(name = "_CROSS_BORDER_FREQUENCY_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> crossborderfrequencytypeDisplay;
    @XmlElementRef(name = "_CROSS_BORDER_FREQUENCY", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> crossborderfrequency;

    /**
     * Gets the value of the crossborderfrequencytype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCROSSBORDERFREQUENCYTYPE() {
        return crossborderfrequencytype;
    }

    /**
     * Sets the value of the crossborderfrequencytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCROSSBORDERFREQUENCYTYPE(JAXBElement<String> value) {
        this.crossborderfrequencytype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crossborderfrequencytypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCROSSBORDERFREQUENCYTYPEDisplay() {
        return crossborderfrequencytypeDisplay;
    }

    /**
     * Sets the value of the crossborderfrequencytypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCROSSBORDERFREQUENCYTYPEDisplay(JAXBElement<String> value) {
        this.crossborderfrequencytypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crossborderfrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCROSSBORDERFREQUENCY() {
        return crossborderfrequency;
    }

    /**
     * Sets the value of the crossborderfrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCROSSBORDERFREQUENCY(JAXBElement<BigDecimal> value) {
        this.crossborderfrequency = ((JAXBElement<BigDecimal> ) value);
    }

}
