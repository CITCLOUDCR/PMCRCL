
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonLegislativeUS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeUS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative">
 *       &lt;sequence>
 *         &lt;element name="VeteranSelfIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VeteranSelfIdentification_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disableveteran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activedutywartime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="armedForcesServiceMedal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recentlySeparatedVeteran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="militaryDischargeDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeUS", propOrder = {
    "veteranSelfIdentification",
    "veteranSelfIdentificationDisplay",
    "disableveteran",
    "activedutywartime",
    "armedForcesServiceMedal",
    "recentlySeparatedVeteran",
    "militaryDischargeDate"
})
public class PersonLegislativeUS
    extends PersonLegislative
{

    @XmlElementRef(name = "VeteranSelfIdentification", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> veteranSelfIdentification;
    @XmlElementRef(name = "VeteranSelfIdentification_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> veteranSelfIdentificationDisplay;
    @XmlElementRef(name = "disableveteran", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> disableveteran;
    @XmlElementRef(name = "activedutywartime", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> activedutywartime;
    @XmlElementRef(name = "armedForcesServiceMedal", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> armedForcesServiceMedal;
    @XmlElementRef(name = "recentlySeparatedVeteran", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> recentlySeparatedVeteran;
    @XmlElementRef(name = "militaryDischargeDate", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> militaryDischargeDate;

    /**
     * Gets the value of the veteranSelfIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVeteranSelfIdentification() {
        return veteranSelfIdentification;
    }

    /**
     * Sets the value of the veteranSelfIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVeteranSelfIdentification(JAXBElement<String> value) {
        this.veteranSelfIdentification = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the veteranSelfIdentificationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVeteranSelfIdentificationDisplay() {
        return veteranSelfIdentificationDisplay;
    }

    /**
     * Sets the value of the veteranSelfIdentificationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVeteranSelfIdentificationDisplay(JAXBElement<String> value) {
        this.veteranSelfIdentificationDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the disableveteran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisableveteran() {
        return disableveteran;
    }

    /**
     * Sets the value of the disableveteran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisableveteran(JAXBElement<String> value) {
        this.disableveteran = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the activedutywartime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivedutywartime() {
        return activedutywartime;
    }

    /**
     * Sets the value of the activedutywartime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivedutywartime(JAXBElement<String> value) {
        this.activedutywartime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the armedForcesServiceMedal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArmedForcesServiceMedal() {
        return armedForcesServiceMedal;
    }

    /**
     * Sets the value of the armedForcesServiceMedal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArmedForcesServiceMedal(JAXBElement<String> value) {
        this.armedForcesServiceMedal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recentlySeparatedVeteran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecentlySeparatedVeteran() {
        return recentlySeparatedVeteran;
    }

    /**
     * Sets the value of the recentlySeparatedVeteran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecentlySeparatedVeteran(JAXBElement<String> value) {
        this.recentlySeparatedVeteran = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the militaryDischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMilitaryDischargeDate() {
        return militaryDischargeDate;
    }

    /**
     * Sets the value of the militaryDischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMilitaryDischargeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.militaryDischargeDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
