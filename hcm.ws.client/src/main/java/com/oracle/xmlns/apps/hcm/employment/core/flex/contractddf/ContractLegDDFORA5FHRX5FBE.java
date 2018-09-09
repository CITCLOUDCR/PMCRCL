
package com.oracle.xmlns.apps.hcm.employment.core.flex.contractddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContractLegDDFORA_5FHRX_5FBE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractLegDDFORA_5FHRX_5FBE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/}ContractLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_END_CONTRACT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_END_CONTRACT_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_END_CONTRACT_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_END_CONTRACT_REASON_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_MANDATORY_REPLACEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_END_MANDATORY_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_REPLACING_PERSON_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_REPLACING_CONTRACT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_WORKING_SCHEDULE_PATTERN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_WORKING_SCHEDULE_PATTERN_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractLegDDFORA_5FHRX_5FBE", propOrder = {
    "endcontracttype",
    "endcontracttypeDisplay",
    "endcontractreason",
    "endcontractreasonDisplay",
    "mandatoryreplacement",
    "endmandatorydate",
    "replacingpersonno",
    "replacingcontractno",
    "workingschedulepattern",
    "workingschedulepatternDisplay"
})
public class ContractLegDDFORA5FHRX5FBE
    extends ContractLegDDF
{

    @XmlElementRef(name = "_END_CONTRACT_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> endcontracttype;
    @XmlElementRef(name = "_END_CONTRACT_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> endcontracttypeDisplay;
    @XmlElementRef(name = "_END_CONTRACT_REASON", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> endcontractreason;
    @XmlElementRef(name = "_END_CONTRACT_REASON_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> endcontractreasonDisplay;
    @XmlElementRef(name = "_MANDATORY_REPLACEMENT", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> mandatoryreplacement;
    @XmlElementRef(name = "_END_MANDATORY_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endmandatorydate;
    @XmlElementRef(name = "_REPLACING_PERSON_NO", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> replacingpersonno;
    @XmlElementRef(name = "_REPLACING_CONTRACT_NO", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> replacingcontractno;
    @XmlElementRef(name = "_WORKING_SCHEDULE_PATTERN", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> workingschedulepattern;
    @XmlElementRef(name = "_WORKING_SCHEDULE_PATTERN_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> workingschedulepatternDisplay;

    /**
     * Gets the value of the endcontracttype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getENDCONTRACTTYPE() {
        return endcontracttype;
    }

    /**
     * Sets the value of the endcontracttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setENDCONTRACTTYPE(JAXBElement<String> value) {
        this.endcontracttype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endcontracttypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getENDCONTRACTTYPEDisplay() {
        return endcontracttypeDisplay;
    }

    /**
     * Sets the value of the endcontracttypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setENDCONTRACTTYPEDisplay(JAXBElement<String> value) {
        this.endcontracttypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endcontractreason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getENDCONTRACTREASON() {
        return endcontractreason;
    }

    /**
     * Sets the value of the endcontractreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setENDCONTRACTREASON(JAXBElement<String> value) {
        this.endcontractreason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endcontractreasonDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getENDCONTRACTREASONDisplay() {
        return endcontractreasonDisplay;
    }

    /**
     * Sets the value of the endcontractreasonDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setENDCONTRACTREASONDisplay(JAXBElement<String> value) {
        this.endcontractreasonDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mandatoryreplacement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMANDATORYREPLACEMENT() {
        return mandatoryreplacement;
    }

    /**
     * Sets the value of the mandatoryreplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMANDATORYREPLACEMENT(JAXBElement<String> value) {
        this.mandatoryreplacement = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endmandatorydate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getENDMANDATORYDATE() {
        return endmandatorydate;
    }

    /**
     * Sets the value of the endmandatorydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setENDMANDATORYDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.endmandatorydate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the replacingpersonno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREPLACINGPERSONNO() {
        return replacingpersonno;
    }

    /**
     * Sets the value of the replacingpersonno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREPLACINGPERSONNO(JAXBElement<String> value) {
        this.replacingpersonno = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the replacingcontractno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREPLACINGCONTRACTNO() {
        return replacingcontractno;
    }

    /**
     * Sets the value of the replacingcontractno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREPLACINGCONTRACTNO(JAXBElement<String> value) {
        this.replacingcontractno = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workingschedulepattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWORKINGSCHEDULEPATTERN() {
        return workingschedulepattern;
    }

    /**
     * Sets the value of the workingschedulepattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWORKINGSCHEDULEPATTERN(JAXBElement<String> value) {
        this.workingschedulepattern = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workingschedulepatternDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWORKINGSCHEDULEPATTERNDisplay() {
        return workingschedulepatternDisplay;
    }

    /**
     * Sets the value of the workingschedulepatternDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWORKINGSCHEDULEPATTERNDisplay(JAXBElement<String> value) {
        this.workingschedulepatternDisplay = ((JAXBElement<String> ) value);
    }

}
