
package com.oracle.xmlns.apps.hcm.people.core.flex.personcontactrellegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonContactRelLegDDFAU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonContactRelLegDDFAU">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/}PersonContactRelLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_TFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonContactRelLegDDFAU", propOrder = {
    "tfn"
})
public class PersonContactRelLegDDFAU
    extends PersonContactRelLegDDF
{

    @XmlElementRef(name = "_TFN", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> tfn;

    /**
     * Gets the value of the tfn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTFN() {
        return tfn;
    }

    /**
     * Sets the value of the tfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTFN(JAXBElement<String> value) {
        this.tfn = ((JAXBElement<String> ) value);
    }

}
