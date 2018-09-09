
package com.oracle.xmlns.apps.hcm.people.core.flex.personvisalegddf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonVisaLegDDFKW complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonVisaLegDDFKW">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/}PersonVisaLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_ACCOMPANY_PERSON" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_RELATIONSHIP_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SPONSOR_NATIONALITY_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonVisaLegDDFKW", propOrder = {
    "accompanyperson",
    "sponsortype",
    "sponsortypeDisplay",
    "sponsorname",
    "sponsornumber",
    "sponsorrelationship",
    "sponsorrelationshipDisplay",
    "sponsornationality",
    "sponsornationalityDisplay"
})
public class PersonVisaLegDDFKW
    extends PersonVisaLegDDF
{

    @XmlElementRef(name = "_ACCOMPANY_PERSON", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> accompanyperson;
    @XmlElementRef(name = "_SPONSOR_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsortype;
    @XmlElementRef(name = "_SPONSOR_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsortypeDisplay;
    @XmlElementRef(name = "_SPONSOR_NAME", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsorname;
    @XmlElementRef(name = "_SPONSOR_NUMBER", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> sponsornumber;
    @XmlElementRef(name = "_SPONSOR_RELATIONSHIP", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsorrelationship;
    @XmlElementRef(name = "_SPONSOR_RELATIONSHIP_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsorrelationshipDisplay;
    @XmlElementRef(name = "_SPONSOR_NATIONALITY", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsornationality;
    @XmlElementRef(name = "_SPONSOR_NATIONALITY_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personVisaLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> sponsornationalityDisplay;

    /**
     * Gets the value of the accompanyperson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getACCOMPANYPERSON() {
        return accompanyperson;
    }

    /**
     * Sets the value of the accompanyperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setACCOMPANYPERSON(JAXBElement<BigDecimal> value) {
        this.accompanyperson = ((JAXBElement<BigDecimal> ) value);
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
     * Gets the value of the sponsornumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSPONSORNUMBER() {
        return sponsornumber;
    }

    /**
     * Sets the value of the sponsornumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSPONSORNUMBER(JAXBElement<BigDecimal> value) {
        this.sponsornumber = ((JAXBElement<BigDecimal> ) value);
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

}
