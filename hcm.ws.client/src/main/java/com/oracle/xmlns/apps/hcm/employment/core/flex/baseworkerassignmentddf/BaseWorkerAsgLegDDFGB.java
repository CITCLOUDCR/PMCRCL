
package com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseWorkerAsgLegDDFGB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseWorkerAsgLegDDFGB">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/}BaseWorkerAsgLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_WORKER_ENGAGEMENT_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_WORKER_ENGAGEMENT_DETAILS_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseWorkerAsgLegDDFGB", propOrder = {
    "workerengagementdetails",
    "workerengagementdetailsDisplay"
})
public class BaseWorkerAsgLegDDFGB
    extends BaseWorkerAsgLegDDF
{

    @XmlElementRef(name = "_WORKER_ENGAGEMENT_DETAILS", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> workerengagementdetails;
    @XmlElementRef(name = "_WORKER_ENGAGEMENT_DETAILS_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/", type = JAXBElement.class)
    protected JAXBElement<String> workerengagementdetailsDisplay;

    /**
     * Gets the value of the workerengagementdetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWORKERENGAGEMENTDETAILS() {
        return workerengagementdetails;
    }

    /**
     * Sets the value of the workerengagementdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWORKERENGAGEMENTDETAILS(JAXBElement<String> value) {
        this.workerengagementdetails = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workerengagementdetailsDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWORKERENGAGEMENTDETAILSDisplay() {
        return workerengagementdetailsDisplay;
    }

    /**
     * Sets the value of the workerengagementdetailsDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWORKERENGAGEMENTDETAILSDisplay(JAXBElement<String> value) {
        this.workerengagementdetailsDisplay = ((JAXBElement<String> ) value);
    }

}
