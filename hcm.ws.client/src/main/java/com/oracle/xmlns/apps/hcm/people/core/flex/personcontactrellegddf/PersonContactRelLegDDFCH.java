
package com.oracle.xmlns.apps.hcm.people.core.flex.personcontactrellegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonContactRelLegDDFCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonContactRelLegDDFCH">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/}PersonContactRelLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_LEGAL_EMPLOYER_CA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CONTACT_WORKING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CONTACT_WORKING_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_WORK_CANTON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_WORK_CANTON_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SIDE_JOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SIDE_JOB_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PENSIONER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PENSIONER_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonContactRelLegDDFCH", propOrder = {
    "legalemployerca",
    "contactworking",
    "contactworkingDisplay",
    "workcanton",
    "workcantonDisplay",
    "sidejob",
    "sidejobDisplay",
    "pensioner",
    "pensionerDisplay"
})
public class PersonContactRelLegDDFCH
    extends PersonContactRelLegDDF
{

    @XmlElementRef(name = "_LEGAL_EMPLOYER_CA", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> legalemployerca;
    @XmlElementRef(name = "_CONTACT_WORKING", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> contactworking;
    @XmlElementRef(name = "_CONTACT_WORKING_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> contactworkingDisplay;
    @XmlElementRef(name = "_WORK_CANTON", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> workcanton;
    @XmlElementRef(name = "_WORK_CANTON_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> workcantonDisplay;
    @XmlElementRef(name = "_SIDE_JOB", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sidejob;
    @XmlElementRef(name = "_SIDE_JOB_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sidejobDisplay;
    @XmlElementRef(name = "_PENSIONER", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> pensioner;
    @XmlElementRef(name = "_PENSIONER_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personContactRelLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> pensionerDisplay;

    /**
     * Gets the value of the legalemployerca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLEGALEMPLOYERCA() {
        return legalemployerca;
    }

    /**
     * Sets the value of the legalemployerca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLEGALEMPLOYERCA(JAXBElement<String> value) {
        this.legalemployerca = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactworking property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONTACTWORKING() {
        return contactworking;
    }

    /**
     * Sets the value of the contactworking property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONTACTWORKING(JAXBElement<String> value) {
        this.contactworking = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactworkingDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONTACTWORKINGDisplay() {
        return contactworkingDisplay;
    }

    /**
     * Sets the value of the contactworkingDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONTACTWORKINGDisplay(JAXBElement<String> value) {
        this.contactworkingDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workcanton property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWORKCANTON() {
        return workcanton;
    }

    /**
     * Sets the value of the workcanton property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWORKCANTON(JAXBElement<String> value) {
        this.workcanton = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workcantonDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWORKCANTONDisplay() {
        return workcantonDisplay;
    }

    /**
     * Sets the value of the workcantonDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWORKCANTONDisplay(JAXBElement<String> value) {
        this.workcantonDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sidejob property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSIDEJOB() {
        return sidejob;
    }

    /**
     * Sets the value of the sidejob property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSIDEJOB(JAXBElement<String> value) {
        this.sidejob = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sidejobDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSIDEJOBDisplay() {
        return sidejobDisplay;
    }

    /**
     * Sets the value of the sidejobDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSIDEJOBDisplay(JAXBElement<String> value) {
        this.sidejobDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pensioner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPENSIONER() {
        return pensioner;
    }

    /**
     * Sets the value of the pensioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPENSIONER(JAXBElement<String> value) {
        this.pensioner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pensionerDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPENSIONERDisplay() {
        return pensionerDisplay;
    }

    /**
     * Sets the value of the pensionerDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPENSIONERDisplay(JAXBElement<String> value) {
        this.pensionerDisplay = ((JAXBElement<String> ) value);
    }

}
