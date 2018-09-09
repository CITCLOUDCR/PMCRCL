
package com.oracle.xmlns.apps.hcm.employment.core.flex.periodofserviceddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WorkRelationshipLegDDFFR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkRelationshipLegDDFFR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/}WorkRelationshipLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_PSE_COVERED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PSE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PSE_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PSE_START_DT" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_PSE_END_DT" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_PSE_AGREEMENT_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_PRIORITY_FOR_REHIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NOTICE_PERIOD_START_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_NOTICE_PERIOD_END_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkRelationshipLegDDFFR", propOrder = {
    "psecovered",
    "psetype",
    "psetypeDisplay",
    "psestartdt",
    "pseenddt",
    "pseagreementdate",
    "priorityforrehire",
    "noticeperiodstartdate",
    "noticeperiodenddate"
})
public class WorkRelationshipLegDDFFR
    extends WorkRelationshipLegDDF
{

    @XmlElementRef(name = "_PSE_COVERED", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> psecovered;
    @XmlElementRef(name = "_PSE_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> psetype;
    @XmlElementRef(name = "_PSE_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> psetypeDisplay;
    @XmlElementRef(name = "_PSE_START_DT", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> psestartdt;
    @XmlElementRef(name = "_PSE_END_DT", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> pseenddt;
    @XmlElementRef(name = "_PSE_AGREEMENT_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> pseagreementdate;
    @XmlElementRef(name = "_PRIORITY_FOR_REHIRE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> priorityforrehire;
    @XmlElementRef(name = "_NOTICE_PERIOD_START_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> noticeperiodstartdate;
    @XmlElementRef(name = "_NOTICE_PERIOD_END_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> noticeperiodenddate;

    /**
     * Gets the value of the psecovered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPSECOVERED() {
        return psecovered;
    }

    /**
     * Sets the value of the psecovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPSECOVERED(JAXBElement<String> value) {
        this.psecovered = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the psetype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPSETYPE() {
        return psetype;
    }

    /**
     * Sets the value of the psetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPSETYPE(JAXBElement<String> value) {
        this.psetype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the psetypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPSETYPEDisplay() {
        return psetypeDisplay;
    }

    /**
     * Sets the value of the psetypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPSETYPEDisplay(JAXBElement<String> value) {
        this.psetypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the psestartdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPSESTARTDT() {
        return psestartdt;
    }

    /**
     * Sets the value of the psestartdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPSESTARTDT(JAXBElement<XMLGregorianCalendar> value) {
        this.psestartdt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the pseenddt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPSEENDDT() {
        return pseenddt;
    }

    /**
     * Sets the value of the pseenddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPSEENDDT(JAXBElement<XMLGregorianCalendar> value) {
        this.pseenddt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the pseagreementdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPSEAGREEMENTDATE() {
        return pseagreementdate;
    }

    /**
     * Sets the value of the pseagreementdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPSEAGREEMENTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.pseagreementdate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the priorityforrehire property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRIORITYFORREHIRE() {
        return priorityforrehire;
    }

    /**
     * Sets the value of the priorityforrehire property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRIORITYFORREHIRE(JAXBElement<String> value) {
        this.priorityforrehire = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noticeperiodstartdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNOTICEPERIODSTARTDATE() {
        return noticeperiodstartdate;
    }

    /**
     * Sets the value of the noticeperiodstartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNOTICEPERIODSTARTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.noticeperiodstartdate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the noticeperiodenddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNOTICEPERIODENDDATE() {
        return noticeperiodenddate;
    }

    /**
     * Sets the value of the noticeperiodenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNOTICEPERIODENDDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.noticeperiodenddate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
