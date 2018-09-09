
package com.oracle.xmlns.apps.hcm.people.core.flex.personvisalegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonVisaLegDDFSA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonVisaLegDDFSA">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/}PersonVisaLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_HIJRAH_ISSUE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HIJRAH_EXP_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonVisaLegDDFSA", propOrder = {
    "hijrahissuedate",
    "hijrahexpdate"
})
public class PersonVisaLegDDFSA
    extends PersonVisaLegDDF
{

    @XmlElementRef(name = "_HIJRAH_ISSUE_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hijrahissuedate;
    @XmlElementRef(name = "_HIJRAH_EXP_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hijrahexpdate;

    /**
     * Gets the value of the hijrahissuedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHIJRAHISSUEDATE() {
        return hijrahissuedate;
    }

    /**
     * Sets the value of the hijrahissuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHIJRAHISSUEDATE(JAXBElement<String> value) {
        this.hijrahissuedate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hijrahexpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHIJRAHEXPDATE() {
        return hijrahexpdate;
    }

    /**
     * Sets the value of the hijrahexpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHIJRAHEXPDATE(JAXBElement<String> value) {
        this.hijrahexpdate = ((JAXBElement<String> ) value);
    }

}
