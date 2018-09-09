
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonLegislativeSA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeSA">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative">
 *       &lt;sequence>
 *         &lt;element name="_HIJRAH_BIRTH_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeSA", propOrder = {
    "hijrahbirthdate"
})
public class PersonLegislativeSA
    extends PersonLegislative
{

    @XmlElementRef(name = "_HIJRAH_BIRTH_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> hijrahbirthdate;

    /**
     * Gets the value of the hijrahbirthdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHIJRAHBIRTHDATE() {
        return hijrahbirthdate;
    }

    /**
     * Sets the value of the hijrahbirthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHIJRAHBIRTHDATE(JAXBElement<String> value) {
        this.hijrahbirthdate = ((JAXBElement<String> ) value);
    }

}
