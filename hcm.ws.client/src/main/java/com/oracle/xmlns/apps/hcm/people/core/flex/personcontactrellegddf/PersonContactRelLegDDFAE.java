
package com.oracle.xmlns.apps.hcm.people.core.flex.personcontactrellegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonContactRelLegDDFAE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonContactRelLegDDFAE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/}PersonContactRelLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_SPOUSE_EMPLOYER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPOUSE_LATEST_QUALIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SUBJECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_STATUTORY_DEPENDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonContactRelLegDDFAE", propOrder = {
    "spouseemployer",
    "spouselatestqualification",
    "subject",
    "statutorydependent"
})
public class PersonContactRelLegDDFAE
    extends PersonContactRelLegDDF
{

    @XmlElementRef(name = "_SPOUSE_EMPLOYER", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> spouseemployer;
    @XmlElementRef(name = "_SPOUSE_LATEST_QUALIFICATION", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> spouselatestqualification;
    @XmlElementRef(name = "_SUBJECT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> subject;
    @XmlElementRef(name = "_STATUTORY_DEPENDENT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> statutorydependent;

    /**
     * Gets the value of the spouseemployer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPOUSEEMPLOYER() {
        return spouseemployer;
    }

    /**
     * Sets the value of the spouseemployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPOUSEEMPLOYER(JAXBElement<String> value) {
        this.spouseemployer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the spouselatestqualification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPOUSELATESTQUALIFICATION() {
        return spouselatestqualification;
    }

    /**
     * Sets the value of the spouselatestqualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPOUSELATESTQUALIFICATION(JAXBElement<String> value) {
        this.spouselatestqualification = ((JAXBElement<String> ) value);
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

    /**
     * Gets the value of the statutorydependent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUTORYDEPENDENT() {
        return statutorydependent;
    }

    /**
     * Sets the value of the statutorydependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUTORYDEPENDENT(JAXBElement<String> value) {
        this.statutorydependent = ((JAXBElement<String> ) value);
    }

}
