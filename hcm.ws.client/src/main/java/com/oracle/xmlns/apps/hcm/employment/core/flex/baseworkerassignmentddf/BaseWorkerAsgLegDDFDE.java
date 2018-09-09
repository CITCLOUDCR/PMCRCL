
package com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentddf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BaseWorkerAsgLegDDFDE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseWorkerAsgLegDDFDE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/}BaseWorkerAsgLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_HRX_DE_DIS_EXEMPT_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_DIS_EXEMPT_1_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_DIS_EXEMPT_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_DIS_EXEMPT_2_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_DIS_EXEMPT_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_DE_DIS_EXEMPT_3_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraHrxDeAnnVacDaysEe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="oraHrxDeWorkDaysEe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="oraHrxDeIrrWorkDaysEe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraHrxDeWaitPerStartEe" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="oraHrxDeWaitPerLengEe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="oraHrxDeWaitPerUomEe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraHrxDeWaitPerUomEe_DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraHrxDeProRataTempEe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseWorkerAsgLegDDFDE", propOrder = {
    "hrxdedisexempt1",
    "hrxdedisexempt1Display",
    "hrxdedisexempt2",
    "hrxdedisexempt2Display",
    "hrxdedisexempt3",
    "hrxdedisexempt3Display",
    "oraHrxDeAnnVacDaysEe",
    "oraHrxDeWorkDaysEe",
    "oraHrxDeIrrWorkDaysEe",
    "oraHrxDeWaitPerStartEe",
    "oraHrxDeWaitPerLengEe",
    "oraHrxDeWaitPerUomEe",
    "oraHrxDeWaitPerUomEeDisplayValue",
    "oraHrxDeProRataTempEe"
})
public class BaseWorkerAsgLegDDFDE
    extends BaseWorkerAsgLegDDF
{

    @XmlElementRef(name = "_HRX_DE_DIS_EXEMPT_1", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdedisexempt1;
    @XmlElementRef(name = "_HRX_DE_DIS_EXEMPT_1_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdedisexempt1Display;
    @XmlElementRef(name = "_HRX_DE_DIS_EXEMPT_2", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdedisexempt2;
    @XmlElementRef(name = "_HRX_DE_DIS_EXEMPT_2_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdedisexempt2Display;
    @XmlElementRef(name = "_HRX_DE_DIS_EXEMPT_3", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdedisexempt3;
    @XmlElementRef(name = "_HRX_DE_DIS_EXEMPT_3_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxdedisexempt3Display;
    @XmlElementRef(name = "oraHrxDeAnnVacDaysEe", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> oraHrxDeAnnVacDaysEe;
    @XmlElementRef(name = "oraHrxDeWorkDaysEe", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> oraHrxDeWorkDaysEe;
    @XmlElementRef(name = "oraHrxDeIrrWorkDaysEe", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> oraHrxDeIrrWorkDaysEe;
    @XmlElementRef(name = "oraHrxDeWaitPerStartEe", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> oraHrxDeWaitPerStartEe;
    @XmlElementRef(name = "oraHrxDeWaitPerLengEe", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> oraHrxDeWaitPerLengEe;
    @XmlElementRef(name = "oraHrxDeWaitPerUomEe", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> oraHrxDeWaitPerUomEe;
    @XmlElementRef(name = "oraHrxDeWaitPerUomEe_DisplayValue", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> oraHrxDeWaitPerUomEeDisplayValue;
    @XmlElementRef(name = "oraHrxDeProRataTempEe", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> oraHrxDeProRataTempEe;

    /**
     * Gets the value of the hrxdedisexempt1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEDISEXEMPT1() {
        return hrxdedisexempt1;
    }

    /**
     * Sets the value of the hrxdedisexempt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEDISEXEMPT1(JAXBElement<String> value) {
        this.hrxdedisexempt1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdedisexempt1Display property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEDISEXEMPT1Display() {
        return hrxdedisexempt1Display;
    }

    /**
     * Sets the value of the hrxdedisexempt1Display property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEDISEXEMPT1Display(JAXBElement<String> value) {
        this.hrxdedisexempt1Display = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdedisexempt2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEDISEXEMPT2() {
        return hrxdedisexempt2;
    }

    /**
     * Sets the value of the hrxdedisexempt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEDISEXEMPT2(JAXBElement<String> value) {
        this.hrxdedisexempt2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdedisexempt2Display property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEDISEXEMPT2Display() {
        return hrxdedisexempt2Display;
    }

    /**
     * Sets the value of the hrxdedisexempt2Display property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEDISEXEMPT2Display(JAXBElement<String> value) {
        this.hrxdedisexempt2Display = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdedisexempt3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEDISEXEMPT3() {
        return hrxdedisexempt3;
    }

    /**
     * Sets the value of the hrxdedisexempt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEDISEXEMPT3(JAXBElement<String> value) {
        this.hrxdedisexempt3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxdedisexempt3Display property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXDEDISEXEMPT3Display() {
        return hrxdedisexempt3Display;
    }

    /**
     * Sets the value of the hrxdedisexempt3Display property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXDEDISEXEMPT3Display(JAXBElement<String> value) {
        this.hrxdedisexempt3Display = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oraHrxDeAnnVacDaysEe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOraHrxDeAnnVacDaysEe() {
        return oraHrxDeAnnVacDaysEe;
    }

    /**
     * Sets the value of the oraHrxDeAnnVacDaysEe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOraHrxDeAnnVacDaysEe(JAXBElement<BigDecimal> value) {
        this.oraHrxDeAnnVacDaysEe = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the oraHrxDeWorkDaysEe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOraHrxDeWorkDaysEe() {
        return oraHrxDeWorkDaysEe;
    }

    /**
     * Sets the value of the oraHrxDeWorkDaysEe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOraHrxDeWorkDaysEe(JAXBElement<BigDecimal> value) {
        this.oraHrxDeWorkDaysEe = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the oraHrxDeIrrWorkDaysEe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOraHrxDeIrrWorkDaysEe() {
        return oraHrxDeIrrWorkDaysEe;
    }

    /**
     * Sets the value of the oraHrxDeIrrWorkDaysEe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOraHrxDeIrrWorkDaysEe(JAXBElement<String> value) {
        this.oraHrxDeIrrWorkDaysEe = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oraHrxDeWaitPerStartEe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOraHrxDeWaitPerStartEe() {
        return oraHrxDeWaitPerStartEe;
    }

    /**
     * Sets the value of the oraHrxDeWaitPerStartEe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOraHrxDeWaitPerStartEe(JAXBElement<XMLGregorianCalendar> value) {
        this.oraHrxDeWaitPerStartEe = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the oraHrxDeWaitPerLengEe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOraHrxDeWaitPerLengEe() {
        return oraHrxDeWaitPerLengEe;
    }

    /**
     * Sets the value of the oraHrxDeWaitPerLengEe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOraHrxDeWaitPerLengEe(JAXBElement<BigDecimal> value) {
        this.oraHrxDeWaitPerLengEe = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the oraHrxDeWaitPerUomEe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOraHrxDeWaitPerUomEe() {
        return oraHrxDeWaitPerUomEe;
    }

    /**
     * Sets the value of the oraHrxDeWaitPerUomEe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOraHrxDeWaitPerUomEe(JAXBElement<String> value) {
        this.oraHrxDeWaitPerUomEe = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oraHrxDeWaitPerUomEeDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOraHrxDeWaitPerUomEeDisplayValue() {
        return oraHrxDeWaitPerUomEeDisplayValue;
    }

    /**
     * Sets the value of the oraHrxDeWaitPerUomEeDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOraHrxDeWaitPerUomEeDisplayValue(JAXBElement<String> value) {
        this.oraHrxDeWaitPerUomEeDisplayValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oraHrxDeProRataTempEe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOraHrxDeProRataTempEe() {
        return oraHrxDeProRataTempEe;
    }

    /**
     * Sets the value of the oraHrxDeProRataTempEe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOraHrxDeProRataTempEe(JAXBElement<String> value) {
        this.oraHrxDeProRataTempEe = ((JAXBElement<String> ) value);
    }

}
