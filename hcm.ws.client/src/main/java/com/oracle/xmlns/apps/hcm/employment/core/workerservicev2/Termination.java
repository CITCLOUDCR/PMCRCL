
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Termination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Termination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualTerminationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="NotifiedTerminationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastWorkingDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RehireReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RehireRecommendation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RehireAuthorizerPersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevokeUserAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfDeath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkerDateOfDeath" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="HideUntilDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProjectedTerminationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Termination", propOrder = {
    "actualTerminationDate",
    "notifiedTerminationDate",
    "lastWorkingDate",
    "rehireReason",
    "rehireRecommendation",
    "comments",
    "rehireAuthorizerPersonNumber",
    "revokeUserAccess",
    "dateOfDeath",
    "workerDateOfDeath",
    "hideUntilDate",
    "projectedTerminationDate"
})
public class Termination {

    @XmlElementRef(name = "ActualTerminationDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> actualTerminationDate;
    @XmlElementRef(name = "NotifiedTerminationDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> notifiedTerminationDate;
    @XmlElementRef(name = "LastWorkingDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastWorkingDate;
    @XmlElementRef(name = "RehireReason", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> rehireReason;
    @XmlElementRef(name = "RehireRecommendation", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> rehireRecommendation;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "RehireAuthorizerPersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> rehireAuthorizerPersonNumber;
    @XmlElementRef(name = "RevokeUserAccess", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> revokeUserAccess;
    @XmlElementRef(name = "DateOfDeath", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> dateOfDeath;
    @XmlElementRef(name = "WorkerDateOfDeath", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> workerDateOfDeath;
    @XmlElementRef(name = "HideUntilDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> hideUntilDate;
    @XmlElementRef(name = "ProjectedTerminationDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> projectedTerminationDate;

    /**
     * Gets the value of the actualTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualTerminationDate() {
        return actualTerminationDate;
    }

    /**
     * Sets the value of the actualTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualTerminationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualTerminationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the notifiedTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNotifiedTerminationDate() {
        return notifiedTerminationDate;
    }

    /**
     * Sets the value of the notifiedTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNotifiedTerminationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.notifiedTerminationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the lastWorkingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastWorkingDate() {
        return lastWorkingDate;
    }

    /**
     * Sets the value of the lastWorkingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastWorkingDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastWorkingDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the rehireReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRehireReason() {
        return rehireReason;
    }

    /**
     * Sets the value of the rehireReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRehireReason(JAXBElement<String> value) {
        this.rehireReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rehireRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRehireRecommendation() {
        return rehireRecommendation;
    }

    /**
     * Sets the value of the rehireRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRehireRecommendation(JAXBElement<String> value) {
        this.rehireRecommendation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rehireAuthorizerPersonNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRehireAuthorizerPersonNumber() {
        return rehireAuthorizerPersonNumber;
    }

    /**
     * Sets the value of the rehireAuthorizerPersonNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRehireAuthorizerPersonNumber(JAXBElement<String> value) {
        this.rehireAuthorizerPersonNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the revokeUserAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevokeUserAccess() {
        return revokeUserAccess;
    }

    /**
     * Sets the value of the revokeUserAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevokeUserAccess(JAXBElement<String> value) {
        this.revokeUserAccess = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateOfDeath(JAXBElement<String> value) {
        this.dateOfDeath = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workerDateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWorkerDateOfDeath() {
        return workerDateOfDeath;
    }

    /**
     * Sets the value of the workerDateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWorkerDateOfDeath(JAXBElement<XMLGregorianCalendar> value) {
        this.workerDateOfDeath = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the hideUntilDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getHideUntilDate() {
        return hideUntilDate;
    }

    /**
     * Sets the value of the hideUntilDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setHideUntilDate(JAXBElement<XMLGregorianCalendar> value) {
        this.hideUntilDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the projectedTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectedTerminationDate() {
        return projectedTerminationDate;
    }

    /**
     * Sets the value of the projectedTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectedTerminationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.projectedTerminationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
