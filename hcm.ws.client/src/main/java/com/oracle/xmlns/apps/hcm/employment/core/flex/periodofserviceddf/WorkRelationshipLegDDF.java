
package com.oracle.xmlns.apps.hcm.employment.core.flex.periodofserviceddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkRelationshipLegDDF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkRelationshipLegDDF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeriodOfServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="__FLEX_Context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="__FLEX_Context_DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FLEX_NumOfSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkRelationshipLegDDF", propOrder = {
    "periodOfServiceId",
    "flexContext",
    "flexContextDisplayValue",
    "flexNumOfSegments"
})
@XmlSeeAlso({
    WorkRelationshipLegDDFNL.class,
    WorkRelationshipLegDDFFR.class,
    WorkRelationshipLegDDFUS.class,
    WorkRelationshipLegDDFSA.class,
    WorkRelationshipLegDDFCA.class
})
public class WorkRelationshipLegDDF {

    @XmlElement(name = "PeriodOfServiceId")
    protected Long periodOfServiceId;
    @XmlElementRef(name = "__FLEX_Context", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> flexContext;
    @XmlElementRef(name = "__FLEX_Context_DisplayValue", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> flexContextDisplayValue;
    @XmlElementRef(name = "_FLEX_NumOfSegments", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<Integer> flexNumOfSegments;

    /**
     * Gets the value of the periodOfServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodOfServiceId() {
        return periodOfServiceId;
    }

    /**
     * Sets the value of the periodOfServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodOfServiceId(Long value) {
        this.periodOfServiceId = value;
    }

    /**
     * Gets the value of the flexContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLEXContext() {
        return flexContext;
    }

    /**
     * Sets the value of the flexContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLEXContext(JAXBElement<String> value) {
        this.flexContext = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flexContextDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLEXContextDisplayValue() {
        return flexContextDisplayValue;
    }

    /**
     * Sets the value of the flexContextDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLEXContextDisplayValue(JAXBElement<String> value) {
        this.flexContextDisplayValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flexNumOfSegments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFLEXNumOfSegments() {
        return flexNumOfSegments;
    }

    /**
     * Sets the value of the flexNumOfSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFLEXNumOfSegments(JAXBElement<Integer> value) {
        this.flexNumOfSegments = ((JAXBElement<Integer> ) value);
    }

}
