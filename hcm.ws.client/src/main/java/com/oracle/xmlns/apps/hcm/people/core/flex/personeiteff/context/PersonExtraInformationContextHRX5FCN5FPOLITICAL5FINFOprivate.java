
package com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff.PersonExtraInformationContext;


/**
 * <p>Java class for PersonExtraInformationContextHRX_5FCN_5FPOLITICAL_5FINFOprivate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonExtraInformationContextHRX_5FCN_5FPOLITICAL_5FINFOprivate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/}PersonExtraInformationContext">
 *       &lt;sequence>
 *         &lt;element name="PeiAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PARTY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PARTY_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_STATUS_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_INTRODUCER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_INTRODUCER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_JOIN_PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_JOIN_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_JOIN_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_MEMBER_FROM_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_EXCEPTION_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_EXCEPTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_EXCEPTION_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_EXCEPTION_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonExtraInformationContextHRX_5FCN_5FPOLITICAL_5FINFOprivate", propOrder = {
    "peiAttributeCategory",
    "partytype",
    "partytypeDisplay",
    "status",
    "statusDisplay",
    "introducer1",
    "introducer2",
    "joinplace",
    "joinunit",
    "joindate",
    "memberfromdate",
    "exceptiondate",
    "exceptiontype",
    "exceptiontypeDisplay",
    "exceptionreason"
})
public class PersonExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivate
    extends PersonExtraInformationContext
{

    @XmlElementRef(name = "PeiAttributeCategory", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> peiAttributeCategory;
    @XmlElementRef(name = "_PARTY_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> partytype;
    @XmlElementRef(name = "_PARTY_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> partytypeDisplay;
    @XmlElementRef(name = "_STATUS", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "_STATUS_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> statusDisplay;
    @XmlElementRef(name = "_INTRODUCER1", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> introducer1;
    @XmlElementRef(name = "_INTRODUCER2", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> introducer2;
    @XmlElementRef(name = "_JOIN_PLACE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> joinplace;
    @XmlElementRef(name = "_JOIN_UNIT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> joinunit;
    @XmlElementRef(name = "_JOIN_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> joindate;
    @XmlElementRef(name = "_MEMBER_FROM_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> memberfromdate;
    @XmlElementRef(name = "_EXCEPTION_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> exceptiondate;
    @XmlElementRef(name = "_EXCEPTION_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> exceptiontype;
    @XmlElementRef(name = "_EXCEPTION_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> exceptiontypeDisplay;
    @XmlElementRef(name = "_EXCEPTION_REASON", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> exceptionreason;

    /**
     * Gets the value of the peiAttributeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPeiAttributeCategory() {
        return peiAttributeCategory;
    }

    /**
     * Sets the value of the peiAttributeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPeiAttributeCategory(JAXBElement<String> value) {
        this.peiAttributeCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partytype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARTYTYPE() {
        return partytype;
    }

    /**
     * Sets the value of the partytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARTYTYPE(JAXBElement<String> value) {
        this.partytype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partytypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARTYTYPEDisplay() {
        return partytypeDisplay;
    }

    /**
     * Sets the value of the partytypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARTYTYPEDisplay(JAXBElement<String> value) {
        this.partytypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUS(JAXBElement<String> value) {
        this.status = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statusDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUSDisplay() {
        return statusDisplay;
    }

    /**
     * Sets the value of the statusDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUSDisplay(JAXBElement<String> value) {
        this.statusDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the introducer1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINTRODUCER1() {
        return introducer1;
    }

    /**
     * Sets the value of the introducer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINTRODUCER1(JAXBElement<String> value) {
        this.introducer1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the introducer2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINTRODUCER2() {
        return introducer2;
    }

    /**
     * Sets the value of the introducer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINTRODUCER2(JAXBElement<String> value) {
        this.introducer2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the joinplace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJOINPLACE() {
        return joinplace;
    }

    /**
     * Sets the value of the joinplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJOINPLACE(JAXBElement<String> value) {
        this.joinplace = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the joinunit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJOINUNIT() {
        return joinunit;
    }

    /**
     * Sets the value of the joinunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJOINUNIT(JAXBElement<String> value) {
        this.joinunit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the joindate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getJOINDATE() {
        return joindate;
    }

    /**
     * Sets the value of the joindate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setJOINDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.joindate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the memberfromdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMEMBERFROMDATE() {
        return memberfromdate;
    }

    /**
     * Sets the value of the memberfromdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMEMBERFROMDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.memberfromdate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the exceptiondate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEXCEPTIONDATE() {
        return exceptiondate;
    }

    /**
     * Sets the value of the exceptiondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEXCEPTIONDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.exceptiondate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the exceptiontype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXCEPTIONTYPE() {
        return exceptiontype;
    }

    /**
     * Sets the value of the exceptiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXCEPTIONTYPE(JAXBElement<String> value) {
        this.exceptiontype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exceptiontypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXCEPTIONTYPEDisplay() {
        return exceptiontypeDisplay;
    }

    /**
     * Sets the value of the exceptiontypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXCEPTIONTYPEDisplay(JAXBElement<String> value) {
        this.exceptiontypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exceptionreason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXCEPTIONREASON() {
        return exceptionreason;
    }

    /**
     * Sets the value of the exceptionreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXCEPTIONREASON(JAXBElement<String> value) {
        this.exceptionreason = ((JAXBElement<String> ) value);
    }

}
