
package com.oracle.xmlns.apps.hcm.employment.core.flex.contractddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractLegDDFCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractLegDDFCH">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/}ContractLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_MAIN_CONTRACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_MAIN_CONTRACT_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractLegDDFCH", propOrder = {
    "maincontract",
    "maincontractDisplay"
})
public class ContractLegDDFCH
    extends ContractLegDDF
{

    @XmlElementRef(name = "_MAIN_CONTRACT", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> maincontract;
    @XmlElementRef(name = "_MAIN_CONTRACT_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> maincontractDisplay;

    /**
     * Gets the value of the maincontract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMAINCONTRACT() {
        return maincontract;
    }

    /**
     * Sets the value of the maincontract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMAINCONTRACT(JAXBElement<String> value) {
        this.maincontract = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maincontractDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMAINCONTRACTDisplay() {
        return maincontractDisplay;
    }

    /**
     * Sets the value of the maincontractDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMAINCONTRACTDisplay(JAXBElement<String> value) {
        this.maincontractDisplay = ((JAXBElement<String> ) value);
    }

}
