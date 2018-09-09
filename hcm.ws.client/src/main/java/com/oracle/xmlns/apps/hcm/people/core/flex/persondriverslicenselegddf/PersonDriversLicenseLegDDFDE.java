
package com.oracle.xmlns.apps.hcm.people.core.flex.persondriverslicenselegddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonDriversLicenseLegDDFDE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonDriversLicenseLegDDFDE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/}PersonDriversLicenseLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_HRX_DE_LIC_LAST_VALID_DT" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_A1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_A" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_C1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_D1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_D" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_BE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_C1E" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_CE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_D1E" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_DE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_M" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_L" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_TS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonDriversLicenseLegDDFDE", propOrder = {
    "hrxdeliclastvaliddt",
    "hrxdea1",
    "hrxdea",
    "hrxdeb",
    "hrxdec1",
    "hrxdec",
    "hrxded1",
    "hrxded",
    "hrxdebe",
    "hrxdec1E",
    "hrxdece",
    "hrxded1E",
    "hrxdede",
    "hrxdem",
    "hrxdel",
    "hrxdets"
})
public class PersonDriversLicenseLegDDFDE
    extends PersonDriversLicenseLegDDF
{

    @XmlElementRef(name = "_HRX_DE_LIC_LAST_VALID_DT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> hrxdeliclastvaliddt;
    @XmlElementRef(name = "_HRX_DE_A1", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdea1;
    @XmlElementRef(name = "_HRX_DE_A", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdea;
    @XmlElementRef(name = "_HRX_DE_B", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdeb;
    @XmlElementRef(name = "_HRX_DE_C1", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdec1;
    @XmlElementRef(name = "_HRX_DE_C", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdec;
    @XmlElementRef(name = "_HRX_DE_D1", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxded1;
    @XmlElementRef(name = "_HRX_DE_D", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxded;
    @XmlElementRef(name = "_HRX_DE_BE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdebe;
    @XmlElementRef(name = "_HRX_DE_C1E", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdec1E;
    @XmlElementRef(name = "_HRX_DE_CE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdece;
    @XmlElementRef(name = "_HRX_DE_D1E", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxded1E;
    @XmlElementRef(name = "_HRX_DE_DE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdede;
    @XmlElementRef(name = "_HRX_DE_M", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdem;
    @XmlElementRef(name = "_HRX_DE_L", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdel;
    @XmlElementRef(name = "_HRX_DE_TS", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDriversLicenseLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdets;

    /**
     * Gets the value of the hrxdeliclastvaliddt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getHRXDELICLASTVALIDDT() {
        return hrxdeliclastvaliddt;
    }

    /**
     * Sets the value of the hrxdeliclastvaliddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setHRXDELICLASTVALIDDT(JAXBElement<XMLGregorianCalendar> value) {
        this.hrxdeliclastvaliddt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the hrxdea1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEA1() {
        return hrxdea1;
    }

    /**
     * Sets the value of the hrxdea1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEA1(JAXBElement<String> value) {
        this.hrxdea1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEA() {
        return hrxdea;
    }

    /**
     * Sets the value of the hrxdea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEA(JAXBElement<String> value) {
        this.hrxdea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdeb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEB() {
        return hrxdeb;
    }

    /**
     * Sets the value of the hrxdeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEB(JAXBElement<String> value) {
        this.hrxdeb = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdec1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEC1() {
        return hrxdec1;
    }

    /**
     * Sets the value of the hrxdec1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEC1(JAXBElement<String> value) {
        this.hrxdec1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEC() {
        return hrxdec;
    }

    /**
     * Sets the value of the hrxdec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEC(JAXBElement<String> value) {
        this.hrxdec = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxded1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDED1() {
        return hrxded1;
    }

    /**
     * Sets the value of the hrxded1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDED1(JAXBElement<String> value) {
        this.hrxded1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDED() {
        return hrxded;
    }

    /**
     * Sets the value of the hrxded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDED(JAXBElement<String> value) {
        this.hrxded = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdebe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEBE() {
        return hrxdebe;
    }

    /**
     * Sets the value of the hrxdebe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEBE(JAXBElement<String> value) {
        this.hrxdebe = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdec1E property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEC1E() {
        return hrxdec1E;
    }

    /**
     * Sets the value of the hrxdec1E property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEC1E(JAXBElement<String> value) {
        this.hrxdec1E = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdece property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDECE() {
        return hrxdece;
    }

    /**
     * Sets the value of the hrxdece property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDECE(JAXBElement<String> value) {
        this.hrxdece = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxded1E property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDED1E() {
        return hrxded1E;
    }

    /**
     * Sets the value of the hrxded1E property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDED1E(JAXBElement<String> value) {
        this.hrxded1E = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdede property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEDE() {
        return hrxdede;
    }

    /**
     * Sets the value of the hrxdede property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEDE(JAXBElement<String> value) {
        this.hrxdede = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEM() {
        return hrxdem;
    }

    /**
     * Sets the value of the hrxdem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEM(JAXBElement<String> value) {
        this.hrxdem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEL() {
        return hrxdel;
    }

    /**
     * Sets the value of the hrxdel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEL(JAXBElement<String> value) {
        this.hrxdel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDETS() {
        return hrxdets;
    }

    /**
     * Sets the value of the hrxdets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDETS(JAXBElement<String> value) {
        this.hrxdets = ((JAXBElement<String> ) value);
    }

}
