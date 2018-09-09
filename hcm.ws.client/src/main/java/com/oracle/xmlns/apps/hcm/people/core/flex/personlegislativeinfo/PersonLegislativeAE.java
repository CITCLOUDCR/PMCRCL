
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonLegislativeAE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeAE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative">
 *       &lt;sequence>
 *         &lt;element name="_ALTERNATE_BIRTH_PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_ORG_GRANTING_HIGHEST_EDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SUBJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeAE", propOrder = {
    "alternatebirthplace",
    "orggrantinghighestedu",
    "subject"
})
public class PersonLegislativeAE
    extends PersonLegislative
{

    @XmlElementRef(name = "_ALTERNATE_BIRTH_PLACE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> alternatebirthplace;
    @XmlElementRef(name = "_ORG_GRANTING_HIGHEST_EDU", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> orggrantinghighestedu;
    @XmlElementRef(name = "_SUBJECT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> subject;

    /**
     * Gets the value of the alternatebirthplace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALTERNATEBIRTHPLACE() {
        return alternatebirthplace;
    }

    /**
     * Sets the value of the alternatebirthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALTERNATEBIRTHPLACE(JAXBElement<String> value) {
        this.alternatebirthplace = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orggrantinghighestedu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORGGRANTINGHIGHESTEDU() {
        return orggrantinghighestedu;
    }

    /**
     * Sets the value of the orggrantinghighestedu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORGGRANTINGHIGHESTEDU(JAXBElement<String> value) {
        this.orggrantinghighestedu = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUBJECT() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUBJECT(JAXBElement<String> value) {
        this.subject = ((JAXBElement<String> ) value);
    }

}
