
package com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff.PersonExtraInformationContext;


/**
 * <p>Java class for PersonExtraInformationContextHRX_5FCN_5FPERSONAL_5FFILE_5FINFOprivate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonExtraInformationContextHRX_5FCN_5FPERSONAL_5FFILE_5FINFOprivate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/}PersonExtraInformationContext">
 *       &lt;sequence>
 *         &lt;element name="PeiAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FILE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_ARCHIVE_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_ARCHIVE_FORMAT_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_TRANSFER_IN_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_SOURCE_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_TRANSFER_OUT_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_TARGET_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_ORIGINAL_COPY_LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_DUPLICATE_COPY_LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonExtraInformationContextHRX_5FCN_5FPERSONAL_5FFILE_5FINFOprivate", propOrder = {
    "peiAttributeCategory",
    "filenumber",
    "archiveformat",
    "archiveformatDisplay",
    "transferindate",
    "sourceunit",
    "transferoutdate",
    "targetunit",
    "originalcopylocation",
    "duplicatecopylocation"
})
public class PersonExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivate
    extends PersonExtraInformationContext
{

    @XmlElementRef(name = "PeiAttributeCategory", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> peiAttributeCategory;
    @XmlElementRef(name = "_FILE_NUMBER", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> filenumber;
    @XmlElementRef(name = "_ARCHIVE_FORMAT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> archiveformat;
    @XmlElementRef(name = "_ARCHIVE_FORMAT_Display", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> archiveformatDisplay;
    @XmlElementRef(name = "_TRANSFER_IN_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> transferindate;
    @XmlElementRef(name = "_SOURCE_UNIT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> sourceunit;
    @XmlElementRef(name = "_TRANSFER_OUT_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> transferoutdate;
    @XmlElementRef(name = "_TARGET_UNIT", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> targetunit;
    @XmlElementRef(name = "_ORIGINAL_COPY_LOCATION", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> originalcopylocation;
    @XmlElementRef(name = "_DUPLICATE_COPY_LOCATION", namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/", type = JAXBElement.class)
    protected JAXBElement<String> duplicatecopylocation;

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
     * Gets the value of the filenumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFILENUMBER() {
        return filenumber;
    }

    /**
     * Sets the value of the filenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFILENUMBER(JAXBElement<String> value) {
        this.filenumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the archiveformat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getARCHIVEFORMAT() {
        return archiveformat;
    }

    /**
     * Sets the value of the archiveformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setARCHIVEFORMAT(JAXBElement<String> value) {
        this.archiveformat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the archiveformatDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getARCHIVEFORMATDisplay() {
        return archiveformatDisplay;
    }

    /**
     * Sets the value of the archiveformatDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setARCHIVEFORMATDisplay(JAXBElement<String> value) {
        this.archiveformatDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the transferindate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTRANSFERINDATE() {
        return transferindate;
    }

    /**
     * Sets the value of the transferindate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTRANSFERINDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.transferindate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the sourceunit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSOURCEUNIT() {
        return sourceunit;
    }

    /**
     * Sets the value of the sourceunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSOURCEUNIT(JAXBElement<String> value) {
        this.sourceunit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the transferoutdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTRANSFEROUTDATE() {
        return transferoutdate;
    }

    /**
     * Sets the value of the transferoutdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTRANSFEROUTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.transferoutdate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the targetunit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTARGETUNIT() {
        return targetunit;
    }

    /**
     * Sets the value of the targetunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTARGETUNIT(JAXBElement<String> value) {
        this.targetunit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the originalcopylocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORIGINALCOPYLOCATION() {
        return originalcopylocation;
    }

    /**
     * Sets the value of the originalcopylocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORIGINALCOPYLOCATION(JAXBElement<String> value) {
        this.originalcopylocation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the duplicatecopylocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUPLICATECOPYLOCATION() {
        return duplicatecopylocation;
    }

    /**
     * Sets the value of the duplicatecopylocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUPLICATECOPYLOCATION(JAXBElement<String> value) {
        this.duplicatecopylocation = ((JAXBElement<String> ) value);
    }

}
