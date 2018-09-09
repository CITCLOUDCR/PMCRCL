
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonLegislativeFR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeFR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative">
 *       &lt;sequence>
 *         &lt;element name="_PERSON_CPAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PERSON_CPAM_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_DATE_FIRST_ENTRY_FRANCE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeFR", propOrder = {
    "personcpam",
    "personcpamDisplay",
    "datefirstentryfrance"
})
public class PersonLegislativeFR
    extends PersonLegislative
{

    @XmlElementRef(name = "_PERSON_CPAM", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> personcpam;
    @XmlElementRef(name = "_PERSON_CPAM_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> personcpamDisplay;
    @XmlElementRef(name = "_DATE_FIRST_ENTRY_FRANCE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> datefirstentryfrance;

    /**
     * Gets the value of the personcpam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPERSONCPAM() {
        return personcpam;
    }

    /**
     * Sets the value of the personcpam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPERSONCPAM(JAXBElement<String> value) {
        this.personcpam = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personcpamDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPERSONCPAMDisplay() {
        return personcpamDisplay;
    }

    /**
     * Sets the value of the personcpamDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPERSONCPAMDisplay(JAXBElement<String> value) {
        this.personcpamDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the datefirstentryfrance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDATEFIRSTENTRYFRANCE() {
        return datefirstentryfrance;
    }

    /**
     * Sets the value of the datefirstentryfrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDATEFIRSTENTRYFRANCE(JAXBElement<XMLGregorianCalendar> value) {
        this.datefirstentryfrance = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
