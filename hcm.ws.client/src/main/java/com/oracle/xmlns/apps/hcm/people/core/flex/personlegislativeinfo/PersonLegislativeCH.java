
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonLegislativeCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeCH">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative">
 *       &lt;sequence>
 *         &lt;element name="_PLACE_OF_ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_LAST_MARITALSTATUS_CHANGE_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeCH", propOrder = {
    "placeoforigin",
    "lastmaritalstatuschangedate"
})
public class PersonLegislativeCH
    extends PersonLegislative
{

    @XmlElementRef(name = "_PLACE_OF_ORIGIN", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> placeoforigin;
    @XmlElementRef(name = "_LAST_MARITALSTATUS_CHANGE_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastmaritalstatuschangedate;

    /**
     * Gets the value of the placeoforigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPLACEOFORIGIN() {
        return placeoforigin;
    }

    /**
     * Sets the value of the placeoforigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPLACEOFORIGIN(JAXBElement<String> value) {
        this.placeoforigin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastmaritalstatuschangedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLASTMARITALSTATUSCHANGEDATE() {
        return lastmaritalstatuschangedate;
    }

    /**
     * Sets the value of the lastmaritalstatuschangedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLASTMARITALSTATUSCHANGEDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.lastmaritalstatuschangedate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
