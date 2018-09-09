
package com.oracle.xmlns.apps.hcm.people.core.flex.personpassportlegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonPassportLegDDFIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPassportLegDDFIN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/}PersonPassportLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_ECNR_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPassportLegDDFIN", propOrder = {
    "name",
    "ecnrrequired"
})
public class PersonPassportLegDDFIN
    extends PersonPassportLegDDF
{

    @XmlElementRef(name = "_NAME", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "_ECNR_REQUIRED", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ecnrrequired;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAME(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ecnrrequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECNRREQUIRED() {
        return ecnrrequired;
    }

    /**
     * Sets the value of the ecnrrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECNRREQUIRED(JAXBElement<String> value) {
        this.ecnrrequired = ((JAXBElement<String> ) value);
    }

}
