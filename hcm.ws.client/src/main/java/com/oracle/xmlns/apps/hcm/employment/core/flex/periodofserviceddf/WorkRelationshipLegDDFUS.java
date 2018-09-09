
package com.oracle.xmlns.apps.hcm.employment.core.flex.periodofserviceddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WorkRelationshipLegDDFUS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkRelationshipLegDDFUS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/}WorkRelationshipLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_I9_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_I9_STATUS_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_I9_EXPIRATION" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_NEW_HIRE_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NEW_HIRE_STATUS_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NEW_HIRE_EXCEPTION_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NEW_HIRE_EXCEPTION_REASON_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicalInsuranceAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicalInsuranceAvailable_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicalInsuranceAvailabilityDa" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkRelationshipLegDDFUS", propOrder = {
    "i9STATUS",
    "i9STATUSDisplay",
    "i9EXPIRATION",
    "newhirestatus",
    "newhirestatusDisplay",
    "newhireexceptionreason",
    "newhireexceptionreasonDisplay",
    "medicalInsuranceAvailable",
    "medicalInsuranceAvailableDisplay",
    "medicalInsuranceAvailabilityDa"
})
public class WorkRelationshipLegDDFUS
    extends WorkRelationshipLegDDF
{

    @XmlElementRef(name = "_I9_STATUS", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> i9STATUS;
    @XmlElementRef(name = "_I9_STATUS_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> i9STATUSDisplay;
    @XmlElementRef(name = "_I9_EXPIRATION", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> i9EXPIRATION;
    @XmlElementRef(name = "_NEW_HIRE_STATUS", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> newhirestatus;
    @XmlElementRef(name = "_NEW_HIRE_STATUS_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> newhirestatusDisplay;
    @XmlElementRef(name = "_NEW_HIRE_EXCEPTION_REASON", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> newhireexceptionreason;
    @XmlElementRef(name = "_NEW_HIRE_EXCEPTION_REASON_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> newhireexceptionreasonDisplay;
    @XmlElementRef(name = "medicalInsuranceAvailable", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> medicalInsuranceAvailable;
    @XmlElementRef(name = "medicalInsuranceAvailable_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> medicalInsuranceAvailableDisplay;
    @XmlElementRef(name = "medicalInsuranceAvailabilityDa", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> medicalInsuranceAvailabilityDa;

    /**
     * Gets the value of the i9STATUS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getI9STATUS() {
        return i9STATUS;
    }

    /**
     * Sets the value of the i9STATUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setI9STATUS(JAXBElement<String> value) {
        this.i9STATUS = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the i9STATUSDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getI9STATUSDisplay() {
        return i9STATUSDisplay;
    }

    /**
     * Sets the value of the i9STATUSDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setI9STATUSDisplay(JAXBElement<String> value) {
        this.i9STATUSDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the i9EXPIRATION property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getI9EXPIRATION() {
        return i9EXPIRATION;
    }

    /**
     * Sets the value of the i9EXPIRATION property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setI9EXPIRATION(JAXBElement<XMLGregorianCalendar> value) {
        this.i9EXPIRATION = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the newhirestatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNEWHIRESTATUS() {
        return newhirestatus;
    }

    /**
     * Sets the value of the newhirestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNEWHIRESTATUS(JAXBElement<String> value) {
        this.newhirestatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the newhirestatusDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNEWHIRESTATUSDisplay() {
        return newhirestatusDisplay;
    }

    /**
     * Sets the value of the newhirestatusDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNEWHIRESTATUSDisplay(JAXBElement<String> value) {
        this.newhirestatusDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the newhireexceptionreason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNEWHIREEXCEPTIONREASON() {
        return newhireexceptionreason;
    }

    /**
     * Sets the value of the newhireexceptionreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNEWHIREEXCEPTIONREASON(JAXBElement<String> value) {
        this.newhireexceptionreason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the newhireexceptionreasonDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNEWHIREEXCEPTIONREASONDisplay() {
        return newhireexceptionreasonDisplay;
    }

    /**
     * Sets the value of the newhireexceptionreasonDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNEWHIREEXCEPTIONREASONDisplay(JAXBElement<String> value) {
        this.newhireexceptionreasonDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the medicalInsuranceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMedicalInsuranceAvailable() {
        return medicalInsuranceAvailable;
    }

    /**
     * Sets the value of the medicalInsuranceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMedicalInsuranceAvailable(JAXBElement<String> value) {
        this.medicalInsuranceAvailable = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the medicalInsuranceAvailableDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMedicalInsuranceAvailableDisplay() {
        return medicalInsuranceAvailableDisplay;
    }

    /**
     * Sets the value of the medicalInsuranceAvailableDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMedicalInsuranceAvailableDisplay(JAXBElement<String> value) {
        this.medicalInsuranceAvailableDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the medicalInsuranceAvailabilityDa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMedicalInsuranceAvailabilityDa() {
        return medicalInsuranceAvailabilityDa;
    }

    /**
     * Sets the value of the medicalInsuranceAvailabilityDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMedicalInsuranceAvailabilityDa(JAXBElement<XMLGregorianCalendar> value) {
        this.medicalInsuranceAvailabilityDa = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
