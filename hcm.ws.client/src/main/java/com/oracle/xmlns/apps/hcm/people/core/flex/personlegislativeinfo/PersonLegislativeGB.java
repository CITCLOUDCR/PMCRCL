
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonLegislativeGB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeGB">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative">
 *       &lt;sequence>
 *         &lt;element name="_NINO_VERIFIED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NINO_VERIFIED_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_VERIFIED_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_REPONSE_STATUS_RETURNED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_REPONSE_STATUS_RETURNED_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_VERIFICATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_VERIFICATION_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CORRELATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PARTNER_FIRST_FORENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PARTNER_SECOND_FORENAMES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PARTNER_SURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PARTNER_NATIONAL_INSURANCE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SEXUAL_ORIENTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SEXUAL_ORIENTATION_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_UNQ_TAXPAYER_REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeGB", propOrder = {
    "ninoverified",
    "ninoverifiedDisplay",
    "verifieddate",
    "reponsestatusreturned",
    "reponsestatusreturnedDisplay",
    "verificationtype",
    "verificationtypeDisplay",
    "correlationid",
    "partnerfirstforename",
    "partnersecondforenames",
    "partnersurname",
    "partnernationalinsurancenum",
    "sexualorientation",
    "sexualorientationDisplay",
    "unqtaxpayerref"
})
public class PersonLegislativeGB
    extends PersonLegislative
{

    @XmlElementRef(name = "_NINO_VERIFIED", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> ninoverified;
    @XmlElementRef(name = "_NINO_VERIFIED_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> ninoverifiedDisplay;
    @XmlElementRef(name = "_VERIFIED_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> verifieddate;
    @XmlElementRef(name = "_REPONSE_STATUS_RETURNED", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> reponsestatusreturned;
    @XmlElementRef(name = "_REPONSE_STATUS_RETURNED_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> reponsestatusreturnedDisplay;
    @XmlElementRef(name = "_VERIFICATION_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> verificationtype;
    @XmlElementRef(name = "_VERIFICATION_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> verificationtypeDisplay;
    @XmlElementRef(name = "_CORRELATION_ID", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> correlationid;
    @XmlElementRef(name = "_PARTNER_FIRST_FORENAME", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> partnerfirstforename;
    @XmlElementRef(name = "_PARTNER_SECOND_FORENAMES", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> partnersecondforenames;
    @XmlElementRef(name = "_PARTNER_SURNAME", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> partnersurname;
    @XmlElementRef(name = "_PARTNER_NATIONAL_INSURANCE_NUM", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> partnernationalinsurancenum;
    @XmlElementRef(name = "_SEXUAL_ORIENTATION", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> sexualorientation;
    @XmlElementRef(name = "_SEXUAL_ORIENTATION_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> sexualorientationDisplay;
    @XmlElementRef(name = "_UNQ_TAXPAYER_REF", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> unqtaxpayerref;

    /**
     * Gets the value of the ninoverified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNINOVERIFIED() {
        return ninoverified;
    }

    /**
     * Sets the value of the ninoverified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNINOVERIFIED(JAXBElement<String> value) {
        this.ninoverified = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ninoverifiedDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNINOVERIFIEDDisplay() {
        return ninoverifiedDisplay;
    }

    /**
     * Sets the value of the ninoverifiedDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNINOVERIFIEDDisplay(JAXBElement<String> value) {
        this.ninoverifiedDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the verifieddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVERIFIEDDATE() {
        return verifieddate;
    }

    /**
     * Sets the value of the verifieddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVERIFIEDDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.verifieddate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the reponsestatusreturned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREPONSESTATUSRETURNED() {
        return reponsestatusreturned;
    }

    /**
     * Sets the value of the reponsestatusreturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREPONSESTATUSRETURNED(JAXBElement<String> value) {
        this.reponsestatusreturned = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reponsestatusreturnedDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREPONSESTATUSRETURNEDDisplay() {
        return reponsestatusreturnedDisplay;
    }

    /**
     * Sets the value of the reponsestatusreturnedDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREPONSESTATUSRETURNEDDisplay(JAXBElement<String> value) {
        this.reponsestatusreturnedDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the verificationtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVERIFICATIONTYPE() {
        return verificationtype;
    }

    /**
     * Sets the value of the verificationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVERIFICATIONTYPE(JAXBElement<String> value) {
        this.verificationtype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the verificationtypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVERIFICATIONTYPEDisplay() {
        return verificationtypeDisplay;
    }

    /**
     * Sets the value of the verificationtypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVERIFICATIONTYPEDisplay(JAXBElement<String> value) {
        this.verificationtypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the correlationid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCORRELATIONID() {
        return correlationid;
    }

    /**
     * Sets the value of the correlationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCORRELATIONID(JAXBElement<String> value) {
        this.correlationid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnerfirstforename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARTNERFIRSTFORENAME() {
        return partnerfirstforename;
    }

    /**
     * Sets the value of the partnerfirstforename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARTNERFIRSTFORENAME(JAXBElement<String> value) {
        this.partnerfirstforename = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnersecondforenames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARTNERSECONDFORENAMES() {
        return partnersecondforenames;
    }

    /**
     * Sets the value of the partnersecondforenames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARTNERSECONDFORENAMES(JAXBElement<String> value) {
        this.partnersecondforenames = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnersurname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARTNERSURNAME() {
        return partnersurname;
    }

    /**
     * Sets the value of the partnersurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARTNERSURNAME(JAXBElement<String> value) {
        this.partnersurname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnernationalinsurancenum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARTNERNATIONALINSURANCENUM() {
        return partnernationalinsurancenum;
    }

    /**
     * Sets the value of the partnernationalinsurancenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARTNERNATIONALINSURANCENUM(JAXBElement<String> value) {
        this.partnernationalinsurancenum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sexualorientation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSEXUALORIENTATION() {
        return sexualorientation;
    }

    /**
     * Sets the value of the sexualorientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSEXUALORIENTATION(JAXBElement<String> value) {
        this.sexualorientation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sexualorientationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSEXUALORIENTATIONDisplay() {
        return sexualorientationDisplay;
    }

    /**
     * Sets the value of the sexualorientationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSEXUALORIENTATIONDisplay(JAXBElement<String> value) {
        this.sexualorientationDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unqtaxpayerref property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUNQTAXPAYERREF() {
        return unqtaxpayerref;
    }

    /**
     * Sets the value of the unqtaxpayerref property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUNQTAXPAYERREF(JAXBElement<String> value) {
        this.unqtaxpayerref = ((JAXBElement<String> ) value);
    }

}
