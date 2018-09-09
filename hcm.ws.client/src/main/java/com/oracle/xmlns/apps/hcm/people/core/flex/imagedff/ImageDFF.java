
package com.oracle.xmlns.apps.hcm.people.core.flex.imagedff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imageDFF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imageDFF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="__FLEX_Context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="__FLEX_Context_DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FLEX_NumOfSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imageDFF", propOrder = {
    "imageId",
    "flexContext",
    "flexContextDisplayValue",
    "flexNumOfSegments"
})
public class ImageDFF {

    @XmlElement(name = "ImageId")
    protected Long imageId;
    @XmlElementRef(name = "__FLEX_Context", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", type = JAXBElement.class)
    protected JAXBElement<String> flexContext;
    @XmlElementRef(name = "__FLEX_Context_DisplayValue", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", type = JAXBElement.class)
    protected JAXBElement<String> flexContextDisplayValue;
    @XmlElementRef(name = "_FLEX_NumOfSegments", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", type = JAXBElement.class)
    protected JAXBElement<Integer> flexNumOfSegments;

    /**
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImageId(Long value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the flexContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLEXContext() {
        return flexContext;
    }

    /**
     * Sets the value of the flexContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLEXContext(JAXBElement<String> value) {
        this.flexContext = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flexContextDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLEXContextDisplayValue() {
        return flexContextDisplayValue;
    }

    /**
     * Sets the value of the flexContextDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLEXContextDisplayValue(JAXBElement<String> value) {
        this.flexContextDisplayValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flexNumOfSegments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFLEXNumOfSegments() {
        return flexNumOfSegments;
    }

    /**
     * Sets the value of the flexNumOfSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFLEXNumOfSegments(JAXBElement<Integer> value) {
        this.flexNumOfSegments = ((JAXBElement<Integer> ) value);
    }

}
