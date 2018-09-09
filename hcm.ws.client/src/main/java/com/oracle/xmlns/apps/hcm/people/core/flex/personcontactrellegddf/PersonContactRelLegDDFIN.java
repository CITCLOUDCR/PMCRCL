
package com.oracle.xmlns.apps.hcm.people.core.flex.personcontactrellegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonContactRelLegDDFIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonContactRelLegDDFIN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/}PersonContactRelLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_GUARDIAN_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_GUARDIAN_BIRTH_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_GUARDIAN_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_GUARDIAN_TELEPHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonContactRelLegDDFIN", propOrder = {
    "guardianname",
    "guardianbirthdate",
    "guardianaddress",
    "guardiantelephone"
})
public class PersonContactRelLegDDFIN
    extends PersonContactRelLegDDF
{

    @XmlElementRef(name = "_GUARDIAN_NAME", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> guardianname;
    @XmlElementRef(name = "_GUARDIAN_BIRTH_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> guardianbirthdate;
    @XmlElementRef(name = "_GUARDIAN_ADDRESS", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> guardianaddress;
    @XmlElementRef(name = "_GUARDIAN_TELEPHONE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> guardiantelephone;

    /**
     * Gets the value of the guardianname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGUARDIANNAME() {
        return guardianname;
    }

    /**
     * Sets the value of the guardianname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGUARDIANNAME(JAXBElement<String> value) {
        this.guardianname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the guardianbirthdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGUARDIANBIRTHDATE() {
        return guardianbirthdate;
    }

    /**
     * Sets the value of the guardianbirthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGUARDIANBIRTHDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.guardianbirthdate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the guardianaddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGUARDIANADDRESS() {
        return guardianaddress;
    }

    /**
     * Sets the value of the guardianaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGUARDIANADDRESS(JAXBElement<String> value) {
        this.guardianaddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the guardiantelephone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGUARDIANTELEPHONE() {
        return guardiantelephone;
    }

    /**
     * Sets the value of the guardiantelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGUARDIANTELEPHONE(JAXBElement<String> value) {
        this.guardiantelephone = ((JAXBElement<String> ) value);
    }

}
