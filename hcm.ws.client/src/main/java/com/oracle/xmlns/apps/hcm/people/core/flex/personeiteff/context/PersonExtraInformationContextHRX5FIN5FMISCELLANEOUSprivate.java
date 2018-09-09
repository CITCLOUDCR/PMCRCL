
package com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff.PersonExtraInformationContext;


/**
 * <p>Java class for PersonExtraInformationContextHRX_5FIN_5FMISCELLANEOUSprivate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonExtraInformationContextHRX_5FIN_5FMISCELLANEOUSprivate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/}PersonExtraInformationContext">
 *       &lt;sequence>
 *         &lt;element name="PeiAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_COMMUNITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_COMMUNITY_DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CASTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HEIGHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_EX_SERVICE_PERSON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_RESIDENTIAL_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_RESIDENTIAL_STATUS_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PAN_APPLIED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PAN_REFERENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonExtraInformationContextHRX_5FIN_5FMISCELLANEOUSprivate", propOrder = {
    "peiAttributeCategory",
    "community",
    "communityDisplayValue",
    "caste",
    "height",
    "weight",
    "exserviceperson",
    "residentialstatus",
    "residentialstatusDisplay",
    "panapplied",
    "panreferencenumber"
})
public class PersonExtraInformationContextHRX5FIN5FMISCELLANEOUSprivate
    extends PersonExtraInformationContext
{

    @XmlElementRef(name = "PeiAttributeCategory", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> peiAttributeCategory;
    @XmlElementRef(name = "_COMMUNITY", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> community;
    @XmlElementRef(name = "_COMMUNITY_DisplayValue", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> communityDisplayValue;
    @XmlElementRef(name = "_CASTE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> caste;
    @XmlElementRef(name = "_HEIGHT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> height;
    @XmlElementRef(name = "_WEIGHT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> weight;
    @XmlElementRef(name = "_EX_SERVICE_PERSON", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> exserviceperson;
    @XmlElementRef(name = "_RESIDENTIAL_STATUS", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> residentialstatus;
    @XmlElementRef(name = "_RESIDENTIAL_STATUS_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> residentialstatusDisplay;
    @XmlElementRef(name = "_PAN_APPLIED", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> panapplied;
    @XmlElementRef(name = "_PAN_REFERENCE_NUMBER", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> panreferencenumber;

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
     * Gets the value of the community property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMMUNITY() {
        return community;
    }

    /**
     * Sets the value of the community property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMMUNITY(JAXBElement<String> value) {
        this.community = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the communityDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMMUNITYDisplayValue() {
        return communityDisplayValue;
    }

    /**
     * Sets the value of the communityDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMMUNITYDisplayValue(JAXBElement<String> value) {
        this.communityDisplayValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the caste property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCASTE() {
        return caste;
    }

    /**
     * Sets the value of the caste property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCASTE(JAXBElement<String> value) {
        this.caste = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHEIGHT() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHEIGHT(JAXBElement<String> value) {
        this.height = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWEIGHT() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWEIGHT(JAXBElement<BigDecimal> value) {
        this.weight = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the exserviceperson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXSERVICEPERSON() {
        return exserviceperson;
    }

    /**
     * Sets the value of the exserviceperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXSERVICEPERSON(JAXBElement<String> value) {
        this.exserviceperson = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the residentialstatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENTIALSTATUS() {
        return residentialstatus;
    }

    /**
     * Sets the value of the residentialstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENTIALSTATUS(JAXBElement<String> value) {
        this.residentialstatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the residentialstatusDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESIDENTIALSTATUSDisplay() {
        return residentialstatusDisplay;
    }

    /**
     * Sets the value of the residentialstatusDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESIDENTIALSTATUSDisplay(JAXBElement<String> value) {
        this.residentialstatusDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the panapplied property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPANAPPLIED() {
        return panapplied;
    }

    /**
     * Sets the value of the panapplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPANAPPLIED(JAXBElement<String> value) {
        this.panapplied = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the panreferencenumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPANREFERENCENUMBER() {
        return panreferencenumber;
    }

    /**
     * Sets the value of the panreferencenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPANREFERENCENUMBER(JAXBElement<String> value) {
        this.panreferencenumber = ((JAXBElement<String> ) value);
    }

}
