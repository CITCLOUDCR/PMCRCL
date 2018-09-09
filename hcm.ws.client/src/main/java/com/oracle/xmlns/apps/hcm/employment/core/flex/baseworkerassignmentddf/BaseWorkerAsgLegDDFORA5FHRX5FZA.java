
package com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseWorkerAsgLegDDFORA_5FHRX_5FZA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseWorkerAsgLegDDFORA_5FHRX_5FZA">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/}BaseWorkerAsgLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_ORA_HRX_ZA_NATURE_OF_PERSON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_ORA_HRX_ZA_NATURE_OF_PERSON_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseWorkerAsgLegDDFORA_5FHRX_5FZA", propOrder = {
    "orahrxzanatureofperson",
    "orahrxzanatureofpersonDisplay"
})
public class BaseWorkerAsgLegDDFORA5FHRX5FZA
    extends BaseWorkerAsgLegDDF
{

    @XmlElementRef(name = "_ORA_HRX_ZA_NATURE_OF_PERSON", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> orahrxzanatureofperson;
    @XmlElementRef(name = "_ORA_HRX_ZA_NATURE_OF_PERSON_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> orahrxzanatureofpersonDisplay;

    /**
     * Gets the value of the orahrxzanatureofperson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORAHRXZANATUREOFPERSON() {
        return orahrxzanatureofperson;
    }

    /**
     * Sets the value of the orahrxzanatureofperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORAHRXZANATUREOFPERSON(JAXBElement<String> value) {
        this.orahrxzanatureofperson = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orahrxzanatureofpersonDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORAHRXZANATUREOFPERSONDisplay() {
        return orahrxzanatureofpersonDisplay;
    }

    /**
     * Sets the value of the orahrxzanatureofpersonDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORAHRXZANATUREOFPERSONDisplay(JAXBElement<String> value) {
        this.orahrxzanatureofpersonDisplay = ((JAXBElement<String> ) value);
    }

}
