
package com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentddf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseWorkerAsgLegDDFFR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseWorkerAsgLegDDFFR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/}BaseWorkerAsgLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_WORKING_DAYS_ANNUAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_NUMBER_OF_DAYS_WORK_HOME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_TELEWORKING_TIME_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_TELEWORKING_TIME_UNIT_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_TRAINING_DURATION_HOURS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_JOB_POPULATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_JOB_POPULATION_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FR_ACTIVITY_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FR_ACTIVITY_MODE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseWorkerAsgLegDDFFR", propOrder = {
    "workingdaysannual",
    "numberofdaysworkhome",
    "teleworkingtimeunit",
    "teleworkingtimeunitDisplay",
    "trainingdurationhours",
    "jobpopulationtype",
    "jobpopulationtypeDisplay",
    "fractivitymode",
    "fractivitymodeDisplay"
})
public class BaseWorkerAsgLegDDFFR
    extends BaseWorkerAsgLegDDF
{

    @XmlElementRef(name = "_WORKING_DAYS_ANNUAL", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> workingdaysannual;
    @XmlElementRef(name = "_NUMBER_OF_DAYS_WORK_HOME", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> numberofdaysworkhome;
    @XmlElementRef(name = "_TELEWORKING_TIME_UNIT", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> teleworkingtimeunit;
    @XmlElementRef(name = "_TELEWORKING_TIME_UNIT_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> teleworkingtimeunitDisplay;
    @XmlElementRef(name = "_TRAINING_DURATION_HOURS", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> trainingdurationhours;
    @XmlElementRef(name = "_JOB_POPULATION_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> jobpopulationtype;
    @XmlElementRef(name = "_JOB_POPULATION_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> jobpopulationtypeDisplay;
    @XmlElementRef(name = "_FR_ACTIVITY_MODE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> fractivitymode;
    @XmlElementRef(name = "_FR_ACTIVITY_MODE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> fractivitymodeDisplay;

    /**
     * Gets the value of the workingdaysannual property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWORKINGDAYSANNUAL() {
        return workingdaysannual;
    }

    /**
     * Sets the value of the workingdaysannual property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWORKINGDAYSANNUAL(JAXBElement<BigDecimal> value) {
        this.workingdaysannual = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the numberofdaysworkhome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNUMBEROFDAYSWORKHOME() {
        return numberofdaysworkhome;
    }

    /**
     * Sets the value of the numberofdaysworkhome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNUMBEROFDAYSWORKHOME(JAXBElement<BigDecimal> value) {
        this.numberofdaysworkhome = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the teleworkingtimeunit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTELEWORKINGTIMEUNIT() {
        return teleworkingtimeunit;
    }

    /**
     * Sets the value of the teleworkingtimeunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTELEWORKINGTIMEUNIT(JAXBElement<String> value) {
        this.teleworkingtimeunit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the teleworkingtimeunitDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTELEWORKINGTIMEUNITDisplay() {
        return teleworkingtimeunitDisplay;
    }

    /**
     * Sets the value of the teleworkingtimeunitDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTELEWORKINGTIMEUNITDisplay(JAXBElement<String> value) {
        this.teleworkingtimeunitDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trainingdurationhours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRAININGDURATIONHOURS() {
        return trainingdurationhours;
    }

    /**
     * Sets the value of the trainingdurationhours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRAININGDURATIONHOURS(JAXBElement<BigDecimal> value) {
        this.trainingdurationhours = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the jobpopulationtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJOBPOPULATIONTYPE() {
        return jobpopulationtype;
    }

    /**
     * Sets the value of the jobpopulationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJOBPOPULATIONTYPE(JAXBElement<String> value) {
        this.jobpopulationtype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jobpopulationtypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJOBPOPULATIONTYPEDisplay() {
        return jobpopulationtypeDisplay;
    }

    /**
     * Sets the value of the jobpopulationtypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJOBPOPULATIONTYPEDisplay(JAXBElement<String> value) {
        this.jobpopulationtypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fractivitymode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFRACTIVITYMODE() {
        return fractivitymode;
    }

    /**
     * Sets the value of the fractivitymode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFRACTIVITYMODE(JAXBElement<String> value) {
        this.fractivitymode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fractivitymodeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFRACTIVITYMODEDisplay() {
        return fractivitymodeDisplay;
    }

    /**
     * Sets the value of the fractivitymodeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFRACTIVITYMODEDisplay(JAXBElement<String> value) {
        this.fractivitymodeDisplay = ((JAXBElement<String> ) value);
    }

}
