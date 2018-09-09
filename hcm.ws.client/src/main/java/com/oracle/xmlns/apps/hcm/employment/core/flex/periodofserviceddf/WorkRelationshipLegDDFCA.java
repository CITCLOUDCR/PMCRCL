
package com.oracle.xmlns.apps.hcm.employment.core.flex.periodofserviceddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkRelationshipLegDDFCA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkRelationshipLegDDFCA">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/}WorkRelationshipLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_NAIC_OVERRIDE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NAIC_OVERRIDE_CODE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkRelationshipLegDDFCA", propOrder = {
    "naicoverridecode",
    "naicoverridecodeDisplay"
})
public class WorkRelationshipLegDDFCA
    extends WorkRelationshipLegDDF
{

    @XmlElementRef(name = "_NAIC_OVERRIDE_CODE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> naicoverridecode;
    @XmlElementRef(name = "_NAIC_OVERRIDE_CODE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> naicoverridecodeDisplay;

    /**
     * Gets the value of the naicoverridecode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICOVERRIDECODE() {
        return naicoverridecode;
    }

    /**
     * Sets the value of the naicoverridecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICOVERRIDECODE(JAXBElement<String> value) {
        this.naicoverridecode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the naicoverridecodeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICOVERRIDECODEDisplay() {
        return naicoverridecodeDisplay;
    }

    /**
     * Sets the value of the naicoverridecodeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICOVERRIDECODEDisplay(JAXBElement<String> value) {
        this.naicoverridecodeDisplay = ((JAXBElement<String> ) value);
    }

}
