
package com.oracle.xmlns.apps.hcm.employment.core.flex.periodofserviceddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkRelationshipLegDDFSA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkRelationshipLegDDFSA">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/}WorkRelationshipLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_HIJRAH_HIRE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_HIJRAH_TERM_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkRelationshipLegDDFSA", propOrder = {
    "hijrahhiredate",
    "hijrahtermdate"
})
public class WorkRelationshipLegDDFSA
    extends WorkRelationshipLegDDF
{

    @XmlElementRef(name = "_HIJRAH_HIRE_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hijrahhiredate;
    @XmlElementRef(name = "_HIJRAH_TERM_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> hijrahtermdate;

    /**
     * Gets the value of the hijrahhiredate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHIJRAHHIREDATE() {
        return hijrahhiredate;
    }

    /**
     * Sets the value of the hijrahhiredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHIJRAHHIREDATE(JAXBElement<String> value) {
        this.hijrahhiredate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hijrahtermdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHIJRAHTERMDATE() {
        return hijrahtermdate;
    }

    /**
     * Sets the value of the hijrahtermdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHIJRAHTERMDATE(JAXBElement<String> value) {
        this.hijrahtermdate = ((JAXBElement<String> ) value);
    }

}
