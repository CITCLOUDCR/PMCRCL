
package com.oracle.xmlns.apps.hcm.people.core.flex.personcontactrellegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonContactRelLegDDFORA_5FHRX_5FBE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonContactRelLegDDFORA_5FHRX_5FBE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/}PersonContactRelLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_STATUTORY_DEPENDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_STATUTORY_DEPENDENT_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonContactRelLegDDFORA_5FHRX_5FBE", propOrder = {
    "statutorydependent",
    "statutorydependentDisplay"
})
public class PersonContactRelLegDDFORA5FHRX5FBE
    extends PersonContactRelLegDDF
{

    @XmlElementRef(name = "_STATUTORY_DEPENDENT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> statutorydependent;
    @XmlElementRef(name = "_STATUTORY_DEPENDENT_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> statutorydependentDisplay;

    /**
     * Gets the value of the statutorydependent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUTORYDEPENDENT() {
        return statutorydependent;
    }

    /**
     * Sets the value of the statutorydependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUTORYDEPENDENT(JAXBElement<String> value) {
        this.statutorydependent = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statutorydependentDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUTORYDEPENDENTDisplay() {
        return statutorydependentDisplay;
    }

    /**
     * Sets the value of the statutorydependentDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUTORYDEPENDENTDisplay(JAXBElement<String> value) {
        this.statutorydependentDisplay = ((JAXBElement<String> ) value);
    }

}
