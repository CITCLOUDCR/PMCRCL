
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonLegislativeIE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeIE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative">
 *       &lt;sequence>
 *         &lt;element name="_MOTHERS_MAIDEN_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeIE", propOrder = {
    "mothersmaidenname"
})
public class PersonLegislativeIE
    extends PersonLegislative
{

    @XmlElementRef(name = "_MOTHERS_MAIDEN_NAME", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> mothersmaidenname;

    /**
     * Gets the value of the mothersmaidenname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOTHERSMAIDENNAME() {
        return mothersmaidenname;
    }

    /**
     * Sets the value of the mothersmaidenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOTHERSMAIDENNAME(JAXBElement<String> value) {
        this.mothersmaidenname = ((JAXBElement<String> ) value);
    }

}
