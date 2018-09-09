
package com.oracle.xmlns.apps.hcm.people.core.flex.personvisalegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonVisaLegDDFAE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonVisaLegDDFAE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/}PersonVisaLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_PREVIOUS_OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PREVIOUS_OCCUPATION_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_RELATIONSHIP_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_NATIONALITY_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_EMIRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonVisaLegDDFAE", propOrder = {
    "previousoccupation",
    "previousoccupationDisplay",
    "sponsortype",
    "sponsortypeDisplay",
    "sponsorname",
    "sponsorrelationship",
    "sponsorrelationshipDisplay",
    "sponsornumber",
    "sponsornationality",
    "sponsornationalityDisplay",
    "emirate"
})
public class PersonVisaLegDDFAE
    extends PersonVisaLegDDF
{

    @XmlElementRef(name = "_PREVIOUS_OCCUPATION", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> previousoccupation;
    @XmlElementRef(name = "_PREVIOUS_OCCUPATION_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> previousoccupationDisplay;
    @XmlElementRef(name = "_SPONSOR_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsortype;
    @XmlElementRef(name = "_SPONSOR_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsortypeDisplay;
    @XmlElementRef(name = "_SPONSOR_NAME", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsorname;
    @XmlElementRef(name = "_SPONSOR_RELATIONSHIP", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsorrelationship;
    @XmlElementRef(name = "_SPONSOR_RELATIONSHIP_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsorrelationshipDisplay;
    @XmlElementRef(name = "_SPONSOR_NUMBER", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsornumber;
    @XmlElementRef(name = "_SPONSOR_NATIONALITY", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsornationality;
    @XmlElementRef(name = "_SPONSOR_NATIONALITY_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsornationalityDisplay;
    @XmlElementRef(name = "_EMIRATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> emirate;

    /**
     * Gets the value of the previousoccupation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPREVIOUSOCCUPATION() {
        return previousoccupation;
    }

    /**
     * Sets the value of the previousoccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPREVIOUSOCCUPATION(JAXBElement<String> value) {
        this.previousoccupation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the previousoccupationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPREVIOUSOCCUPATIONDisplay() {
        return previousoccupationDisplay;
    }

    /**
     * Sets the value of the previousoccupationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPREVIOUSOCCUPATIONDisplay(JAXBElement<String> value) {
        this.previousoccupationDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sponsortype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPONSORTYPE() {
        return sponsortype;
    }

    /**
     * Sets the value of the sponsortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPONSORTYPE(JAXBElement<String> value) {
        this.sponsortype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sponsortypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPONSORTYPEDisplay() {
        return sponsortypeDisplay;
    }

    /**
     * Sets the value of the sponsortypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPONSORTYPEDisplay(JAXBElement<String> value) {
        this.sponsortypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sponsorname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPONSORNAME() {
        return sponsorname;
    }

    /**
     * Sets the value of the sponsorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPONSORNAME(JAXBElement<String> value) {
        this.sponsorname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sponsorrelationship property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPONSORRELATIONSHIP() {
        return sponsorrelationship;
    }

    /**
     * Sets the value of the sponsorrelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPONSORRELATIONSHIP(JAXBElement<String> value) {
        this.sponsorrelationship = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sponsorrelationshipDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPONSORRELATIONSHIPDisplay() {
        return sponsorrelationshipDisplay;
    }

    /**
     * Sets the value of the sponsorrelationshipDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPONSORRELATIONSHIPDisplay(JAXBElement<String> value) {
        this.sponsorrelationshipDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sponsornumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPONSORNUMBER() {
        return sponsornumber;
    }

    /**
     * Sets the value of the sponsornumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPONSORNUMBER(JAXBElement<String> value) {
        this.sponsornumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sponsornationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPONSORNATIONALITY() {
        return sponsornationality;
    }

    /**
     * Sets the value of the sponsornationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPONSORNATIONALITY(JAXBElement<String> value) {
        this.sponsornationality = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sponsornationalityDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPONSORNATIONALITYDisplay() {
        return sponsornationalityDisplay;
    }

    /**
     * Sets the value of the sponsornationalityDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPONSORNATIONALITYDisplay(JAXBElement<String> value) {
        this.sponsornationalityDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emirate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMIRATE() {
        return emirate;
    }

    /**
     * Sets the value of the emirate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMIRATE(JAXBElement<String> value) {
        this.emirate = ((JAXBElement<String> ) value);
    }

}
