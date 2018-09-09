
package com.oracle.xmlns.apps.hcm.people.core.flex.personpassportlegddf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonPassportLegDDFKW complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPassportLegDDFKW">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/}PersonPassportLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_ACCOMPANY_PERSON" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPassportLegDDFKW", propOrder = {
    "accompanyperson"
})
public class PersonPassportLegDDFKW
    extends PersonPassportLegDDF
{

    @XmlElementRef(name = "_ACCOMPANY_PERSON", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> accompanyperson;

    /**
     * Gets the value of the accompanyperson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getACCOMPANYPERSON() {
        return accompanyperson;
    }

    /**
     * Sets the value of the accompanyperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setACCOMPANYPERSON(JAXBElement<BigDecimal> value) {
        this.accompanyperson = ((JAXBElement<BigDecimal> ) value);
    }

}
