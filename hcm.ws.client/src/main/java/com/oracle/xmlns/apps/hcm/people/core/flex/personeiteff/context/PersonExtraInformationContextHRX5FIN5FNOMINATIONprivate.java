
package com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff.PersonExtraInformationContext;


/**
 * <p>Java class for PersonExtraInformationContextHRX_5FIN_5FNOMINATIONprivate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonExtraInformationContextHRX_5FIN_5FNOMINATIONprivate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/}PersonExtraInformationContext">
 *       &lt;sequence>
 *         &lt;element name="FLEX_PARAM_PERSON_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FLEX_PARAM_EFFECTIVE_START_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PeiAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SEQUENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_BENEFIT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_BENEFIT_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CONTACT_PERSON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CONTACT_PERSON_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PERCENT_SHARE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_NOMINATION_END_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonExtraInformationContextHRX_5FIN_5FNOMINATIONprivate", propOrder = {
    "flexparampersonid",
    "flexparameffectivestartdate",
    "peiAttributeCategory",
    "sequencenumber",
    "benefittype",
    "benefittypeDisplay",
    "contactperson",
    "contactpersonDisplay",
    "percentshare",
    "nominationendreason"
})
public class PersonExtraInformationContextHRX5FIN5FNOMINATIONprivate
    extends PersonExtraInformationContext
{

    @XmlElementRef(name = "FLEX_PARAM_PERSON_ID", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> flexparampersonid;
    @XmlElementRef(name = "FLEX_PARAM_EFFECTIVE_START_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> flexparameffectivestartdate;
    @XmlElementRef(name = "PeiAttributeCategory", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> peiAttributeCategory;
    @XmlElement(name = "_SEQUENCE_NUMBER")
    protected BigDecimal sequencenumber;
    @XmlElementRef(name = "_BENEFIT_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> benefittype;
    @XmlElementRef(name = "_BENEFIT_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> benefittypeDisplay;
    @XmlElementRef(name = "_CONTACT_PERSON", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> contactperson;
    @XmlElementRef(name = "_CONTACT_PERSON_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> contactpersonDisplay;
    @XmlElementRef(name = "_PERCENT_SHARE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> percentshare;
    @XmlElementRef(name = "_NOMINATION_END_REASON", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> nominationendreason;

    /**
     * Gets the value of the flexparampersonid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFLEXPARAMPERSONID() {
        return flexparampersonid;
    }

    /**
     * Sets the value of the flexparampersonid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFLEXPARAMPERSONID(JAXBElement<BigDecimal> value) {
        this.flexparampersonid = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the flexparameffectivestartdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFLEXPARAMEFFECTIVESTARTDATE() {
        return flexparameffectivestartdate;
    }

    /**
     * Sets the value of the flexparameffectivestartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFLEXPARAMEFFECTIVESTARTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.flexparameffectivestartdate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

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
     * Gets the value of the sequencenumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSEQUENCENUMBER() {
        return sequencenumber;
    }

    /**
     * Sets the value of the sequencenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSEQUENCENUMBER(BigDecimal value) {
        this.sequencenumber = value;
    }

    /**
     * Gets the value of the benefittype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBENEFITTYPE() {
        return benefittype;
    }

    /**
     * Sets the value of the benefittype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBENEFITTYPE(JAXBElement<String> value) {
        this.benefittype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the benefittypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBENEFITTYPEDisplay() {
        return benefittypeDisplay;
    }

    /**
     * Sets the value of the benefittypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBENEFITTYPEDisplay(JAXBElement<String> value) {
        this.benefittypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactperson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONTACTPERSON() {
        return contactperson;
    }

    /**
     * Sets the value of the contactperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONTACTPERSON(JAXBElement<String> value) {
        this.contactperson = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactpersonDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONTACTPERSONDisplay() {
        return contactpersonDisplay;
    }

    /**
     * Sets the value of the contactpersonDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONTACTPERSONDisplay(JAXBElement<String> value) {
        this.contactpersonDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the percentshare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPERCENTSHARE() {
        return percentshare;
    }

    /**
     * Sets the value of the percentshare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPERCENTSHARE(JAXBElement<BigDecimal> value) {
        this.percentshare = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the nominationendreason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNOMINATIONENDREASON() {
        return nominationendreason;
    }

    /**
     * Sets the value of the nominationendreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNOMINATIONENDREASON(JAXBElement<String> value) {
        this.nominationendreason = ((JAXBElement<String> ) value);
    }

}
