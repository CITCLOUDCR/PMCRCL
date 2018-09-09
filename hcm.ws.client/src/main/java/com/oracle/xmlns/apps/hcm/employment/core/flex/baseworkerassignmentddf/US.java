
package com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentddf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for US complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="US">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/}BaseWorkerAsgLegDDF">
 *       &lt;sequence>
 *         &lt;element name="acaEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acaEligibility_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACAFullTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACAFullTime_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitedNonassessmentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitedNonassessmentPeriod_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurementPeriodBeginDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="measurementPeriodEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="administrationPeriodBeginDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="administrationPeriodEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="stabilityPeriodBeginDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="stabilityPeriodEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="safeHarborOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="safeHarborOverride_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialFlag_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processingPriority" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "US", propOrder = {
    "acaEligibility",
    "acaEligibilityDisplay",
    "acaFullTime",
    "acaFullTimeDisplay",
    "limitedNonassessmentPeriod",
    "limitedNonassessmentPeriodDisplay",
    "measurementPeriodBeginDate",
    "measurementPeriodEndDate",
    "administrationPeriodBeginDate",
    "administrationPeriodEndDate",
    "stabilityPeriodBeginDate",
    "stabilityPeriodEndDate",
    "safeHarborOverride",
    "safeHarborOverrideDisplay",
    "initialFlag",
    "initialFlagDisplay",
    "processingPriority"
})
public class US
    extends BaseWorkerAsgLegDDF
{

    @XmlElementRef(name = "acaEligibility", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> acaEligibility;
    @XmlElementRef(name = "acaEligibility_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> acaEligibilityDisplay;
    @XmlElementRef(name = "ACAFullTime", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> acaFullTime;
    @XmlElementRef(name = "ACAFullTime_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> acaFullTimeDisplay;
    @XmlElementRef(name = "limitedNonassessmentPeriod", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> limitedNonassessmentPeriod;
    @XmlElementRef(name = "limitedNonassessmentPeriod_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> limitedNonassessmentPeriodDisplay;
    @XmlElementRef(name = "measurementPeriodBeginDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> measurementPeriodBeginDate;
    @XmlElementRef(name = "measurementPeriodEndDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> measurementPeriodEndDate;
    @XmlElementRef(name = "administrationPeriodBeginDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> administrationPeriodBeginDate;
    @XmlElementRef(name = "administrationPeriodEndDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> administrationPeriodEndDate;
    @XmlElementRef(name = "stabilityPeriodBeginDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> stabilityPeriodBeginDate;
    @XmlElementRef(name = "stabilityPeriodEndDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> stabilityPeriodEndDate;
    @XmlElementRef(name = "safeHarborOverride", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> safeHarborOverride;
    @XmlElementRef(name = "safeHarborOverride_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> safeHarborOverrideDisplay;
    @XmlElementRef(name = "initialFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> initialFlag;
    @XmlElementRef(name = "initialFlag_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> initialFlagDisplay;
    @XmlElementRef(name = "processingPriority", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> processingPriority;

    /**
     * Gets the value of the acaEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcaEligibility() {
        return acaEligibility;
    }

    /**
     * Sets the value of the acaEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcaEligibility(JAXBElement<String> value) {
        this.acaEligibility = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the acaEligibilityDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcaEligibilityDisplay() {
        return acaEligibilityDisplay;
    }

    /**
     * Sets the value of the acaEligibilityDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcaEligibilityDisplay(JAXBElement<String> value) {
        this.acaEligibilityDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the acaFullTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACAFullTime() {
        return acaFullTime;
    }

    /**
     * Sets the value of the acaFullTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACAFullTime(JAXBElement<String> value) {
        this.acaFullTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the acaFullTimeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACAFullTimeDisplay() {
        return acaFullTimeDisplay;
    }

    /**
     * Sets the value of the acaFullTimeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACAFullTimeDisplay(JAXBElement<String> value) {
        this.acaFullTimeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the limitedNonassessmentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitedNonassessmentPeriod() {
        return limitedNonassessmentPeriod;
    }

    /**
     * Sets the value of the limitedNonassessmentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitedNonassessmentPeriod(JAXBElement<String> value) {
        this.limitedNonassessmentPeriod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the limitedNonassessmentPeriodDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitedNonassessmentPeriodDisplay() {
        return limitedNonassessmentPeriodDisplay;
    }

    /**
     * Sets the value of the limitedNonassessmentPeriodDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitedNonassessmentPeriodDisplay(JAXBElement<String> value) {
        this.limitedNonassessmentPeriodDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the measurementPeriodBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMeasurementPeriodBeginDate() {
        return measurementPeriodBeginDate;
    }

    /**
     * Sets the value of the measurementPeriodBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMeasurementPeriodBeginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.measurementPeriodBeginDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the measurementPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMeasurementPeriodEndDate() {
        return measurementPeriodEndDate;
    }

    /**
     * Sets the value of the measurementPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMeasurementPeriodEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.measurementPeriodEndDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the administrationPeriodBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAdministrationPeriodBeginDate() {
        return administrationPeriodBeginDate;
    }

    /**
     * Sets the value of the administrationPeriodBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAdministrationPeriodBeginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.administrationPeriodBeginDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the administrationPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAdministrationPeriodEndDate() {
        return administrationPeriodEndDate;
    }

    /**
     * Sets the value of the administrationPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAdministrationPeriodEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.administrationPeriodEndDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the stabilityPeriodBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStabilityPeriodBeginDate() {
        return stabilityPeriodBeginDate;
    }

    /**
     * Sets the value of the stabilityPeriodBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStabilityPeriodBeginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.stabilityPeriodBeginDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the stabilityPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStabilityPeriodEndDate() {
        return stabilityPeriodEndDate;
    }

    /**
     * Sets the value of the stabilityPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStabilityPeriodEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.stabilityPeriodEndDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the safeHarborOverride property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSafeHarborOverride() {
        return safeHarborOverride;
    }

    /**
     * Sets the value of the safeHarborOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSafeHarborOverride(JAXBElement<String> value) {
        this.safeHarborOverride = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the safeHarborOverrideDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSafeHarborOverrideDisplay() {
        return safeHarborOverrideDisplay;
    }

    /**
     * Sets the value of the safeHarborOverrideDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSafeHarborOverrideDisplay(JAXBElement<String> value) {
        this.safeHarborOverrideDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the initialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitialFlag() {
        return initialFlag;
    }

    /**
     * Sets the value of the initialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitialFlag(JAXBElement<String> value) {
        this.initialFlag = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the initialFlagDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitialFlagDisplay() {
        return initialFlagDisplay;
    }

    /**
     * Sets the value of the initialFlagDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitialFlagDisplay(JAXBElement<String> value) {
        this.initialFlagDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the processingPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProcessingPriority() {
        return processingPriority;
    }

    /**
     * Sets the value of the processingPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProcessingPriority(JAXBElement<BigDecimal> value) {
        this.processingPriority = ((JAXBElement<BigDecimal> ) value);
    }

}
