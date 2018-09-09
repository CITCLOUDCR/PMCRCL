
package com.oracle.xmlns.apps.hcm.people.core.flex.personvisalegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonVisaLegDDFSG complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonVisaLegDDFSG">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/}PersonVisaLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CATEGORY_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonVisaLegDDFSG", propOrder = {
    "category",
    "categoryDisplay"
})
public class PersonVisaLegDDFSG
    extends PersonVisaLegDDF
{

    @XmlElementRef(name = "_CATEGORY", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> category;
    @XmlElementRef(name = "_CATEGORY_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> categoryDisplay;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCATEGORY(JAXBElement<String> value) {
        this.category = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the categoryDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCATEGORYDisplay() {
        return categoryDisplay;
    }

    /**
     * Sets the value of the categoryDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCATEGORYDisplay(JAXBElement<String> value) {
        this.categoryDisplay = ((JAXBElement<String> ) value);
    }

}
