
package com.oracle.xmlns.apps.hcm.employment.core.flex.contractddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContractLegDDFFR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractLegDDFFR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/}ContractLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_CTR_DURATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CTR_DURATION_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CTR_SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CTR_SUB_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CONTRACT_SUB_TYPE_START_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_CTR_SUB_TYPE_END_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_CTR_PERSON_REPLACED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CTR_PENSION_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CTR_PENSION_CATEGORY_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CTR_CATEG_AGIRC_ARRCO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CTR_CATEG_AGIRC_ARRCO_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_COMPETITIVE_CLAUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_COMPETITIVE_CLAUSE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_MOBILITY_CLAUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_MOBILITY_CLAUSE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_EXCLUSIVITY_CLAUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_EXCLUSIVITY_CLAUSE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HRX_OTHER_CLAUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractLegDDFFR", propOrder = {
    "ctrdurationtype",
    "ctrdurationtypeDisplay",
    "ctrsubtype",
    "ctrsubtypeDisplay",
    "contractsubtypestartdate",
    "ctrsubtypeenddate",
    "ctrpersonreplaced",
    "ctrpensioncategory",
    "ctrpensioncategoryDisplay",
    "ctrcategagircarrco",
    "ctrcategagircarrcoDisplay",
    "hrxcompetitiveclause",
    "hrxcompetitiveclauseDisplay",
    "hrxmobilityclause",
    "hrxmobilityclauseDisplay",
    "hrxexclusivityclause",
    "hrxexclusivityclauseDisplay",
    "hrxotherclause"
})
public class ContractLegDDFFR
    extends ContractLegDDF
{

    @XmlElementRef(name = "_CTR_DURATION_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ctrdurationtype;
    @XmlElementRef(name = "_CTR_DURATION_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ctrdurationtypeDisplay;
    @XmlElementRef(name = "_CTR_SUB_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ctrsubtype;
    @XmlElementRef(name = "_CTR_SUB_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ctrsubtypeDisplay;
    @XmlElementRef(name = "_CONTRACT_SUB_TYPE_START_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> contractsubtypestartdate;
    @XmlElementRef(name = "_CTR_SUB_TYPE_END_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> ctrsubtypeenddate;
    @XmlElementRef(name = "_CTR_PERSON_REPLACED", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ctrpersonreplaced;
    @XmlElementRef(name = "_CTR_PENSION_CATEGORY", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ctrpensioncategory;
    @XmlElementRef(name = "_CTR_PENSION_CATEGORY_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ctrpensioncategoryDisplay;
    @XmlElementRef(name = "_CTR_CATEG_AGIRC_ARRCO", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ctrcategagircarrco;
    @XmlElementRef(name = "_CTR_CATEG_AGIRC_ARRCO_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ctrcategagircarrcoDisplay;
    @XmlElementRef(name = "_HRX_COMPETITIVE_CLAUSE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxcompetitiveclause;
    @XmlElementRef(name = "_HRX_COMPETITIVE_CLAUSE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxcompetitiveclauseDisplay;
    @XmlElementRef(name = "_HRX_MOBILITY_CLAUSE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxmobilityclause;
    @XmlElementRef(name = "_HRX_MOBILITY_CLAUSE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxmobilityclauseDisplay;
    @XmlElementRef(name = "_HRX_EXCLUSIVITY_CLAUSE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxexclusivityclause;
    @XmlElementRef(name = "_HRX_EXCLUSIVITY_CLAUSE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxexclusivityclauseDisplay;
    @XmlElementRef(name = "_HRX_OTHER_CLAUSE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hrxotherclause;

    /**
     * Gets the value of the ctrdurationtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRDURATIONTYPE() {
        return ctrdurationtype;
    }

    /**
     * Sets the value of the ctrdurationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRDURATIONTYPE(JAXBElement<String> value) {
        this.ctrdurationtype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctrdurationtypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRDURATIONTYPEDisplay() {
        return ctrdurationtypeDisplay;
    }

    /**
     * Sets the value of the ctrdurationtypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRDURATIONTYPEDisplay(JAXBElement<String> value) {
        this.ctrdurationtypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctrsubtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRSUBTYPE() {
        return ctrsubtype;
    }

    /**
     * Sets the value of the ctrsubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRSUBTYPE(JAXBElement<String> value) {
        this.ctrsubtype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctrsubtypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRSUBTYPEDisplay() {
        return ctrsubtypeDisplay;
    }

    /**
     * Sets the value of the ctrsubtypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRSUBTYPEDisplay(JAXBElement<String> value) {
        this.ctrsubtypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contractsubtypestartdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCONTRACTSUBTYPESTARTDATE() {
        return contractsubtypestartdate;
    }

    /**
     * Sets the value of the contractsubtypestartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCONTRACTSUBTYPESTARTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.contractsubtypestartdate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the ctrsubtypeenddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCTRSUBTYPEENDDATE() {
        return ctrsubtypeenddate;
    }

    /**
     * Sets the value of the ctrsubtypeenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCTRSUBTYPEENDDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.ctrsubtypeenddate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the ctrpersonreplaced property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRPERSONREPLACED() {
        return ctrpersonreplaced;
    }

    /**
     * Sets the value of the ctrpersonreplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRPERSONREPLACED(JAXBElement<String> value) {
        this.ctrpersonreplaced = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctrpensioncategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRPENSIONCATEGORY() {
        return ctrpensioncategory;
    }

    /**
     * Sets the value of the ctrpensioncategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRPENSIONCATEGORY(JAXBElement<String> value) {
        this.ctrpensioncategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctrpensioncategoryDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRPENSIONCATEGORYDisplay() {
        return ctrpensioncategoryDisplay;
    }

    /**
     * Sets the value of the ctrpensioncategoryDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRPENSIONCATEGORYDisplay(JAXBElement<String> value) {
        this.ctrpensioncategoryDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctrcategagircarrco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRCATEGAGIRCARRCO() {
        return ctrcategagircarrco;
    }

    /**
     * Sets the value of the ctrcategagircarrco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRCATEGAGIRCARRCO(JAXBElement<String> value) {
        this.ctrcategagircarrco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctrcategagircarrcoDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRCATEGAGIRCARRCODisplay() {
        return ctrcategagircarrcoDisplay;
    }

    /**
     * Sets the value of the ctrcategagircarrcoDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRCATEGAGIRCARRCODisplay(JAXBElement<String> value) {
        this.ctrcategagircarrcoDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxcompetitiveclause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXCOMPETITIVECLAUSE() {
        return hrxcompetitiveclause;
    }

    /**
     * Sets the value of the hrxcompetitiveclause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXCOMPETITIVECLAUSE(JAXBElement<String> value) {
        this.hrxcompetitiveclause = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxcompetitiveclauseDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXCOMPETITIVECLAUSEDisplay() {
        return hrxcompetitiveclauseDisplay;
    }

    /**
     * Sets the value of the hrxcompetitiveclauseDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXCOMPETITIVECLAUSEDisplay(JAXBElement<String> value) {
        this.hrxcompetitiveclauseDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxmobilityclause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXMOBILITYCLAUSE() {
        return hrxmobilityclause;
    }

    /**
     * Sets the value of the hrxmobilityclause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXMOBILITYCLAUSE(JAXBElement<String> value) {
        this.hrxmobilityclause = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxmobilityclauseDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXMOBILITYCLAUSEDisplay() {
        return hrxmobilityclauseDisplay;
    }

    /**
     * Sets the value of the hrxmobilityclauseDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXMOBILITYCLAUSEDisplay(JAXBElement<String> value) {
        this.hrxmobilityclauseDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxexclusivityclause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXEXCLUSIVITYCLAUSE() {
        return hrxexclusivityclause;
    }

    /**
     * Sets the value of the hrxexclusivityclause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXEXCLUSIVITYCLAUSE(JAXBElement<String> value) {
        this.hrxexclusivityclause = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxexclusivityclauseDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXEXCLUSIVITYCLAUSEDisplay() {
        return hrxexclusivityclauseDisplay;
    }

    /**
     * Sets the value of the hrxexclusivityclauseDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXEXCLUSIVITYCLAUSEDisplay(JAXBElement<String> value) {
        this.hrxexclusivityclauseDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hrxotherclause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHRXOTHERCLAUSE() {
        return hrxotherclause;
    }

    /**
     * Sets the value of the hrxotherclause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHRXOTHERCLAUSE(JAXBElement<String> value) {
        this.hrxotherclause = ((JAXBElement<String> ) value);
    }

}
