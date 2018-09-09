
package com.oracle.xmlns.apps.hcm.employment.core.flex.periodofserviceddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WorkRelationshipLegDDFNL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkRelationshipLegDDFNL">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/}WorkRelationshipLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_WORK_FOR_OTHER_EMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_SECNDMNT_ABROAD_EXCED_ONE_YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FDN_RECREATE_FILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FDN_FILE_CREATION_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_REPORTED_DATE_OF_BIRTH" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkRelationshipLegDDFNL", propOrder = {
    "workforotheremp",
    "secndmntabroadexcedoneyear",
    "fdnrecreatefile",
    "fdnfilecreationdate",
    "reporteddateofbirth"
})
public class WorkRelationshipLegDDFNL
    extends WorkRelationshipLegDDF
{

    @XmlElementRef(name = "_WORK_FOR_OTHER_EMP", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> workforotheremp;
    @XmlElementRef(name = "_SECNDMNT_ABROAD_EXCED_ONE_YEAR", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> secndmntabroadexcedoneyear;
    @XmlElementRef(name = "_FDN_RECREATE_FILE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<String> fdnrecreatefile;
    @XmlElementRef(name = "_FDN_FILE_CREATION_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fdnfilecreationdate;
    @XmlElementRef(name = "_REPORTED_DATE_OF_BIRTH", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> reporteddateofbirth;

    /**
     * Gets the value of the workforotheremp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWORKFOROTHEREMP() {
        return workforotheremp;
    }

    /**
     * Sets the value of the workforotheremp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWORKFOROTHEREMP(JAXBElement<String> value) {
        this.workforotheremp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the secndmntabroadexcedoneyear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSECNDMNTABROADEXCEDONEYEAR() {
        return secndmntabroadexcedoneyear;
    }

    /**
     * Sets the value of the secndmntabroadexcedoneyear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSECNDMNTABROADEXCEDONEYEAR(JAXBElement<String> value) {
        this.secndmntabroadexcedoneyear = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fdnrecreatefile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFDNRECREATEFILE() {
        return fdnrecreatefile;
    }

    /**
     * Sets the value of the fdnrecreatefile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFDNRECREATEFILE(JAXBElement<String> value) {
        this.fdnrecreatefile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fdnfilecreationdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFDNFILECREATIONDATE() {
        return fdnfilecreationdate;
    }

    /**
     * Sets the value of the fdnfilecreationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFDNFILECREATIONDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.fdnfilecreationdate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the reporteddateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getREPORTEDDATEOFBIRTH() {
        return reporteddateofbirth;
    }

    /**
     * Sets the value of the reporteddateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setREPORTEDDATEOFBIRTH(JAXBElement<XMLGregorianCalendar> value) {
        this.reporteddateofbirth = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
