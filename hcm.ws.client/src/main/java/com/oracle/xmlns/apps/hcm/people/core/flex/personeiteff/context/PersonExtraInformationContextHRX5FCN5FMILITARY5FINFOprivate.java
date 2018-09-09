
package com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff.PersonExtraInformationContext;


/**
 * <p>Java class for PersonExtraInformationContextHRX_5FCN_5FMILITARY_5FINFOprivate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonExtraInformationContextHRX_5FCN_5FMILITARY_5FINFOprivate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/}PersonExtraInformationContext">
 *       &lt;sequence>
 *         &lt;element name="PeiAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_JOIN_PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_JOIN_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_APPROVE_DATE_LEAVE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_APPROVE_UNIT_LEAVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_LAST_POSITION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_LAST_RANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_LAST_RANK_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_LAST_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_LAST_LEVEL_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_LAST_PROF_TITLE_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_LAST_SALARY_GRADE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_RESERVE_OFFICIAL_RESIGNATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_RESERVE_OFFICIAL_RESIGNATION_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonExtraInformationContextHRX_5FCN_5FMILITARY_5FINFOprivate", propOrder = {
    "peiAttributeCategory",
    "joinplace",
    "joindate",
    "approvedateleave",
    "approveunitleave",
    "lastposition",
    "lastrank",
    "lastrankDisplay",
    "lastlevel",
    "lastlevelDisplay",
    "lastproftitlelevel",
    "lastsalarygrade",
    "reserveofficialresignation",
    "reserveofficialresignationDisplay"
})
public class PersonExtraInformationContextHRX5FCN5FMILITARY5FINFOprivate
    extends PersonExtraInformationContext
{

    @XmlElementRef(name = "PeiAttributeCategory", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> peiAttributeCategory;
    @XmlElementRef(name = "_JOIN_PLACE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> joinplace;
    @XmlElementRef(name = "_JOIN_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> joindate;
    @XmlElementRef(name = "_APPROVE_DATE_LEAVE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> approvedateleave;
    @XmlElementRef(name = "_APPROVE_UNIT_LEAVE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> approveunitleave;
    @XmlElementRef(name = "_LAST_POSITION", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> lastposition;
    @XmlElementRef(name = "_LAST_RANK", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> lastrank;
    @XmlElementRef(name = "_LAST_RANK_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> lastrankDisplay;
    @XmlElementRef(name = "_LAST_LEVEL", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> lastlevel;
    @XmlElementRef(name = "_LAST_LEVEL_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> lastlevelDisplay;
    @XmlElementRef(name = "_LAST_PROF_TITLE_LEVEL", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> lastproftitlelevel;
    @XmlElementRef(name = "_LAST_SALARY_GRADE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> lastsalarygrade;
    @XmlElementRef(name = "_RESERVE_OFFICIAL_RESIGNATION", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> reserveofficialresignation;
    @XmlElementRef(name = "_RESERVE_OFFICIAL_RESIGNATION_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> reserveofficialresignationDisplay;

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
     * Gets the value of the approvedateleave property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAPPROVEDATELEAVE() {
        return approvedateleave;
    }

    /**
     * Sets the value of the approvedateleave property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAPPROVEDATELEAVE(JAXBElement<XMLGregorianCalendar> value) {
        this.approvedateleave = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the approveunitleave property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAPPROVEUNITLEAVE() {
        return approveunitleave;
    }

    /**
     * Sets the value of the approveunitleave property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAPPROVEUNITLEAVE(JAXBElement<String> value) {
        this.approveunitleave = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastposition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTPOSITION() {
        return lastposition;
    }

    /**
     * Sets the value of the lastposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTPOSITION(JAXBElement<String> value) {
        this.lastposition = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastrank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTRANK() {
        return lastrank;
    }

    /**
     * Sets the value of the lastrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTRANK(JAXBElement<String> value) {
        this.lastrank = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastrankDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTRANKDisplay() {
        return lastrankDisplay;
    }

    /**
     * Sets the value of the lastrankDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTRANKDisplay(JAXBElement<String> value) {
        this.lastrankDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastlevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTLEVEL() {
        return lastlevel;
    }

    /**
     * Sets the value of the lastlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTLEVEL(JAXBElement<String> value) {
        this.lastlevel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastlevelDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTLEVELDisplay() {
        return lastlevelDisplay;
    }

    /**
     * Sets the value of the lastlevelDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTLEVELDisplay(JAXBElement<String> value) {
        this.lastlevelDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastproftitlelevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTPROFTITLELEVEL() {
        return lastproftitlelevel;
    }

    /**
     * Sets the value of the lastproftitlelevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTPROFTITLELEVEL(JAXBElement<String> value) {
        this.lastproftitlelevel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastsalarygrade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTSALARYGRADE() {
        return lastsalarygrade;
    }

    /**
     * Sets the value of the lastsalarygrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTSALARYGRADE(JAXBElement<String> value) {
        this.lastsalarygrade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reserveofficialresignation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVEOFFICIALRESIGNATION() {
        return reserveofficialresignation;
    }

    /**
     * Sets the value of the reserveofficialresignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVEOFFICIALRESIGNATION(JAXBElement<String> value) {
        this.reserveofficialresignation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reserveofficialresignationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVEOFFICIALRESIGNATIONDisplay() {
        return reserveofficialresignationDisplay;
    }

    /**
     * Sets the value of the reserveofficialresignationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVEOFFICIALRESIGNATIONDisplay(JAXBElement<String> value) {
        this.reserveofficialresignationDisplay = ((JAXBElement<String> ) value);
    }

}
