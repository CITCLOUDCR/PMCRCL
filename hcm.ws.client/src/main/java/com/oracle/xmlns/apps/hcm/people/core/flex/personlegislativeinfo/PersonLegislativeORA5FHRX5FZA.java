
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonLegislativeORA_5FHRX_5FZA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonLegislativeORA_5FHRX_5FZA">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/}PersonLegislative">
 *       &lt;sequence>
 *         &lt;element name="_ORA_HRX_ZA_FOREIGN_NATIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLegislativeORA_5FHRX_5FZA", propOrder = {
    "orahrxzaforeignnational"
})
public class PersonLegislativeORA5FHRX5FZA
    extends PersonLegislative
{

    @XmlElementRef(name = "_ORA_HRX_ZA_FOREIGN_NATIONAL", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfo/", type = JAXBElement.class)
    protected JAXBElement<String> orahrxzaforeignnational;

    /**
     * Gets the value of the orahrxzaforeignnational property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORAHRXZAFOREIGNNATIONAL() {
        return orahrxzaforeignnational;
    }

    /**
     * Sets the value of the orahrxzaforeignnational property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORAHRXZAFOREIGNNATIONAL(JAXBElement<String> value) {
        this.orahrxzaforeignnational = ((JAXBElement<String> ) value);
    }

}
