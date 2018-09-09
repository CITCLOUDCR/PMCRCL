
package com.oracle.xmlns.apps.hcm.people.core.flex.personpassportlegddf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonPassportLegDDFAE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPassportLegDDFAE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/}PersonPassportLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_ALTERNATE_ISSUE_PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_ACCOMPANYING_PERSONS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPassportLegDDFAE", propOrder = {
    "alternateissueplace",
    "accompanyingpersons"
})
public class PersonPassportLegDDFAE
    extends PersonPassportLegDDF
{

    @XmlElementRef(name = "_ALTERNATE_ISSUE_PLACE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", type = JAXBElement.class)
    protected JAXBElement<String> alternateissueplace;
    @XmlElementRef(name = "_ACCOMPANYING_PERSONS", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> accompanyingpersons;

    /**
     * Gets the value of the alternateissueplace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALTERNATEISSUEPLACE() {
        return alternateissueplace;
    }

    /**
     * Sets the value of the alternateissueplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALTERNATEISSUEPLACE(JAXBElement<String> value) {
        this.alternateissueplace = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the accompanyingpersons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getACCOMPANYINGPERSONS() {
        return accompanyingpersons;
    }

    /**
     * Sets the value of the accompanyingpersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setACCOMPANYINGPERSONS(JAXBElement<BigDecimal> value) {
        this.accompanyingpersons = ((JAXBElement<BigDecimal> ) value);
    }

}
