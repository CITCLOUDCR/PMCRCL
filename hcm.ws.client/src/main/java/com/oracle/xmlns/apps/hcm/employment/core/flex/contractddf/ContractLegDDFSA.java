
package com.oracle.xmlns.apps.hcm.employment.core.flex.contractddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractLegDDFSA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractLegDDFSA">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/}ContractLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_EMPLOYMENT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_EMPLOYMENT_STATUS_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_PROFESSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractLegDDFSA", propOrder = {
    "employmentstatus",
    "employmentstatusDisplay",
    "profession"
})
public class ContractLegDDFSA
    extends ContractLegDDF
{

    @XmlElementRef(name = "_EMPLOYMENT_STATUS", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> employmentstatus;
    @XmlElementRef(name = "_EMPLOYMENT_STATUS_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> employmentstatusDisplay;
    @XmlElementRef(name = "_PROFESSION", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> profession;

    /**
     * Gets the value of the employmentstatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMPLOYMENTSTATUS() {
        return employmentstatus;
    }

    /**
     * Sets the value of the employmentstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMPLOYMENTSTATUS(JAXBElement<String> value) {
        this.employmentstatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employmentstatusDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMPLOYMENTSTATUSDisplay() {
        return employmentstatusDisplay;
    }

    /**
     * Sets the value of the employmentstatusDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMPLOYMENTSTATUSDisplay(JAXBElement<String> value) {
        this.employmentstatusDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPROFESSION() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPROFESSION(JAXBElement<String> value) {
        this.profession = ((JAXBElement<String> ) value);
    }

}
