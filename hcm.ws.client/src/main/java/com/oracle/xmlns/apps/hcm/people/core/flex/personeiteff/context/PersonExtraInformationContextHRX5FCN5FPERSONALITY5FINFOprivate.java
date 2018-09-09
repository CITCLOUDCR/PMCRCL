
package com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff.PersonExtraInformationContext;


/**
 * <p>Java class for PersonExtraInformationContextHRX_5FCN_5FPERSONALITY_5FINFOprivate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonExtraInformationContextHRX_5FCN_5FPERSONALITY_5FINFOprivate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/}PersonExtraInformationContext">
 *       &lt;sequence>
 *         &lt;element name="PeiAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_IDENTITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_IDENTITY_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonExtraInformationContextHRX_5FCN_5FPERSONALITY_5FINFOprivate", propOrder = {
    "peiAttributeCategory",
    "identity",
    "identityDisplay"
})
public class PersonExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivate
    extends PersonExtraInformationContext
{

    @XmlElementRef(name = "PeiAttributeCategory", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> peiAttributeCategory;
    @XmlElementRef(name = "_IDENTITY", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> identity;
    @XmlElementRef(name = "_IDENTITY_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> identityDisplay;

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
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDENTITY() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDENTITY(JAXBElement<String> value) {
        this.identity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the identityDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDENTITYDisplay() {
        return identityDisplay;
    }

    /**
     * Sets the value of the identityDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDENTITYDisplay(JAXBElement<String> value) {
        this.identityDisplay = ((JAXBElement<String> ) value);
    }

}
