
package com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff.PersonExtraInformationContext;


/**
 * <p>Java class for OraHrxCaDesignatedGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OraHrxCaDesignatedGroups">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/}PersonExtraInformationContext">
 *       &lt;sequence>
 *         &lt;element name="PeiAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraHrxCaDgAboriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraHrxCaDgDisabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraHrxCaDgVisibleMinority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OraHrxCaDesignatedGroups", propOrder = {
    "peiAttributeCategory",
    "oraHrxCaDgAboriginal",
    "oraHrxCaDgDisabled",
    "oraHrxCaDgVisibleMinority"
})
public class OraHrxCaDesignatedGroups
    extends PersonExtraInformationContext
{

    @XmlElementRef(name = "PeiAttributeCategory", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> peiAttributeCategory;
    @XmlElementRef(name = "oraHrxCaDgAboriginal", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> oraHrxCaDgAboriginal;
    @XmlElementRef(name = "oraHrxCaDgDisabled", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> oraHrxCaDgDisabled;
    @XmlElementRef(name = "oraHrxCaDgVisibleMinority", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> oraHrxCaDgVisibleMinority;

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
     * Gets the value of the oraHrxCaDgAboriginal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOraHrxCaDgAboriginal() {
        return oraHrxCaDgAboriginal;
    }

    /**
     * Sets the value of the oraHrxCaDgAboriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOraHrxCaDgAboriginal(JAXBElement<String> value) {
        this.oraHrxCaDgAboriginal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oraHrxCaDgDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOraHrxCaDgDisabled() {
        return oraHrxCaDgDisabled;
    }

    /**
     * Sets the value of the oraHrxCaDgDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOraHrxCaDgDisabled(JAXBElement<String> value) {
        this.oraHrxCaDgDisabled = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oraHrxCaDgVisibleMinority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOraHrxCaDgVisibleMinority() {
        return oraHrxCaDgVisibleMinority;
    }

    /**
     * Sets the value of the oraHrxCaDgVisibleMinority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOraHrxCaDgVisibleMinority(JAXBElement<String> value) {
        this.oraHrxCaDgVisibleMinority = ((JAXBElement<String> ) value);
    }

}
