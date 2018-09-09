
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonLegislativeCN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeCN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative">
 *       &lt;sequence>
 *         &lt;element name="_ORIGINAL_HOMETOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HUKOU_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HUKOU_TYPE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HUKOU_LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HUKOU_LOCATION_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HEALTH_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HEALTH_STATUS_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NUMBER_OF_CHILDREN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_EXPATRIATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_EXPATRIATE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeCN", propOrder = {
    "originalhometown",
    "hukoutype",
    "hukoutypeDisplay",
    "hukoulocation",
    "hukoulocationDisplay",
    "healthstatus",
    "healthstatusDisplay",
    "numberofchildren",
    "expatriate",
    "expatriateDisplay"
})
public class PersonLegislativeCN
    extends PersonLegislative
{

    @XmlElementRef(name = "_ORIGINAL_HOMETOWN", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> originalhometown;
    @XmlElementRef(name = "_HUKOU_TYPE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> hukoutype;
    @XmlElementRef(name = "_HUKOU_TYPE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> hukoutypeDisplay;
    @XmlElementRef(name = "_HUKOU_LOCATION", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> hukoulocation;
    @XmlElementRef(name = "_HUKOU_LOCATION_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> hukoulocationDisplay;
    @XmlElementRef(name = "_HEALTH_STATUS", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> healthstatus;
    @XmlElementRef(name = "_HEALTH_STATUS_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> healthstatusDisplay;
    @XmlElementRef(name = "_NUMBER_OF_CHILDREN", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> numberofchildren;
    @XmlElementRef(name = "_EXPATRIATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> expatriate;
    @XmlElementRef(name = "_EXPATRIATE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> expatriateDisplay;

    /**
     * Gets the value of the originalhometown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORIGINALHOMETOWN() {
        return originalhometown;
    }

    /**
     * Sets the value of the originalhometown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORIGINALHOMETOWN(JAXBElement<String> value) {
        this.originalhometown = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hukoutype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHUKOUTYPE() {
        return hukoutype;
    }

    /**
     * Sets the value of the hukoutype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHUKOUTYPE(JAXBElement<String> value) {
        this.hukoutype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hukoutypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHUKOUTYPEDisplay() {
        return hukoutypeDisplay;
    }

    /**
     * Sets the value of the hukoutypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHUKOUTYPEDisplay(JAXBElement<String> value) {
        this.hukoutypeDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hukoulocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHUKOULOCATION() {
        return hukoulocation;
    }

    /**
     * Sets the value of the hukoulocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHUKOULOCATION(JAXBElement<String> value) {
        this.hukoulocation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hukoulocationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHUKOULOCATIONDisplay() {
        return hukoulocationDisplay;
    }

    /**
     * Sets the value of the hukoulocationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHUKOULOCATIONDisplay(JAXBElement<String> value) {
        this.hukoulocationDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the healthstatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHEALTHSTATUS() {
        return healthstatus;
    }

    /**
     * Sets the value of the healthstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHEALTHSTATUS(JAXBElement<String> value) {
        this.healthstatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the healthstatusDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHEALTHSTATUSDisplay() {
        return healthstatusDisplay;
    }

    /**
     * Sets the value of the healthstatusDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHEALTHSTATUSDisplay(JAXBElement<String> value) {
        this.healthstatusDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numberofchildren property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNUMBEROFCHILDREN() {
        return numberofchildren;
    }

    /**
     * Sets the value of the numberofchildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNUMBEROFCHILDREN(JAXBElement<BigDecimal> value) {
        this.numberofchildren = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the expatriate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXPATRIATE() {
        return expatriate;
    }

    /**
     * Sets the value of the expatriate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXPATRIATE(JAXBElement<String> value) {
        this.expatriate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expatriateDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXPATRIATEDisplay() {
        return expatriateDisplay;
    }

    /**
     * Sets the value of the expatriateDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXPATRIATEDisplay(JAXBElement<String> value) {
        this.expatriateDisplay = ((JAXBElement<String> ) value);
    }

}
