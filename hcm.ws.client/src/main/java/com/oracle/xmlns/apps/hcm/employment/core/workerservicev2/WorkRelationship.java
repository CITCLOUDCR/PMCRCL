
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.hcm.employment.core.flex.periodofserviceddf.WorkRelationshipLegDDF;
import com.oracle.xmlns.apps.hcm.employment.core.flex.periodofservicedff.WorkRelationshipDFF;


/**
 * <p>Java class for WorkRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalEmployerSeniorityDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ActualTerminationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LegalEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnterpriseSeniorityDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastWorkingDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DateStart" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="NotifiedTerminationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OnMilitaryServiceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PeriodOfServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProjectedTerminationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RehireAuthorizerPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RehireAuthorizor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RehireReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevokeUserAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkerComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RehireRecommendationFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorkerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DateOfDeath" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="HideUntilDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DateForPrimaryFlagChange" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CancelWorkRelationshipFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TerminateWorkRelationshipFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReverseTerminationFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorrectTerminationFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GlobalTransferFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorkTerms" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}WorkTerms" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkRelationshipDFF" type="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDFF/}WorkRelationshipDFF" minOccurs="0"/>
 *         &lt;element name="WorkRelationshipDDF" type="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDDF/}WorkRelationshipLegDDF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkRelationship", propOrder = {
    "legalEmployerSeniorityDate",
    "actualTerminationDate",
    "legalEntityId",
    "comments",
    "enterpriseSeniorityDate",
    "lastWorkingDate",
    "dateStart",
    "notifiedTerminationDate",
    "objectVersionNumber",
    "onMilitaryServiceFlag",
    "periodOfServiceId",
    "personId",
    "primaryFlag",
    "projectedTerminationDate",
    "rehireAuthorizerPersonId",
    "rehireAuthorizor",
    "rehireReason",
    "revokeUserAccess",
    "workerNumber",
    "workerComments",
    "personNumber",
    "legalEmployerName",
    "rehireRecommendationFlag",
    "workerType",
    "guid",
    "sourceSystemId",
    "sourceSystemOwner",
    "actionCode",
    "reasonCode",
    "newStartDate",
    "dateOfDeath",
    "hideUntilDate",
    "dateForPrimaryFlagChange",
    "cancelWorkRelationshipFlag",
    "terminateWorkRelationshipFlag",
    "reverseTerminationFlag",
    "correctTerminationFlag",
    "globalTransferFlag",
    "workTerms",
    "workRelationshipDFF",
    "workRelationshipDDF"
})
public class WorkRelationship {

    @XmlElementRef(name = "LegalEmployerSeniorityDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> legalEmployerSeniorityDate;
    @XmlElementRef(name = "ActualTerminationDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> actualTerminationDate;
    @XmlElement(name = "LegalEntityId")
    protected Long legalEntityId;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "EnterpriseSeniorityDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> enterpriseSeniorityDate;
    @XmlElementRef(name = "LastWorkingDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastWorkingDate;
    @XmlElement(name = "DateStart")
    protected XMLGregorianCalendar dateStart;
    @XmlElementRef(name = "NotifiedTerminationDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> notifiedTerminationDate;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElement(name = "OnMilitaryServiceFlag")
    protected Boolean onMilitaryServiceFlag;
    @XmlElement(name = "PeriodOfServiceId")
    protected Long periodOfServiceId;
    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "PrimaryFlag")
    protected Boolean primaryFlag;
    @XmlElementRef(name = "ProjectedTerminationDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> projectedTerminationDate;
    @XmlElementRef(name = "RehireAuthorizerPersonId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> rehireAuthorizerPersonId;
    @XmlElementRef(name = "RehireAuthorizor", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> rehireAuthorizor;
    @XmlElementRef(name = "RehireReason", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> rehireReason;
    @XmlElementRef(name = "RevokeUserAccess", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> revokeUserAccess;
    @XmlElementRef(name = "WorkerNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> workerNumber;
    @XmlElementRef(name = "WorkerComments", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> workerComments;
    @XmlElementRef(name = "PersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> personNumber;
    @XmlElementRef(name = "LegalEmployerName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> legalEmployerName;
    @XmlElement(name = "RehireRecommendationFlag")
    protected Boolean rehireRecommendationFlag;
    @XmlElement(name = "WorkerType")
    protected String workerType;
    @XmlElementRef(name = "GUID", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> guid;
    @XmlElementRef(name = "SourceSystemId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemId;
    @XmlElementRef(name = "SourceSystemOwner", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemOwner;
    @XmlElementRef(name = "ActionCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> actionCode;
    @XmlElementRef(name = "ReasonCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> reasonCode;
    @XmlElementRef(name = "NewStartDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> newStartDate;
    @XmlElementRef(name = "DateOfDeath", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateOfDeath;
    @XmlElementRef(name = "HideUntilDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> hideUntilDate;
    @XmlElementRef(name = "DateForPrimaryFlagChange", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateForPrimaryFlagChange;
    @XmlElementRef(name = "CancelWorkRelationshipFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> cancelWorkRelationshipFlag;
    @XmlElementRef(name = "TerminateWorkRelationshipFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> terminateWorkRelationshipFlag;
    @XmlElementRef(name = "ReverseTerminationFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> reverseTerminationFlag;
    @XmlElementRef(name = "CorrectTerminationFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> correctTerminationFlag;
    @XmlElementRef(name = "GlobalTransferFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> globalTransferFlag;
    @XmlElement(name = "WorkTerms")
    protected List<WorkTerms> workTerms;
    @XmlElement(name = "WorkRelationshipDFF")
    protected WorkRelationshipDFF workRelationshipDFF;
    @XmlElement(name = "WorkRelationshipDDF")
    protected WorkRelationshipLegDDF workRelationshipDDF;

    /**
     * Gets the value of the legalEmployerSeniorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLegalEmployerSeniorityDate() {
        return legalEmployerSeniorityDate;
    }

    /**
     * Sets the value of the legalEmployerSeniorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLegalEmployerSeniorityDate(JAXBElement<XMLGregorianCalendar> value) {
        this.legalEmployerSeniorityDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

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
     * Gets the value of the legalEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLegalEntityId() {
        return legalEntityId;
    }

    /**
     * Sets the value of the legalEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLegalEntityId(Long value) {
        this.legalEntityId = value;
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
     * Gets the value of the enterpriseSeniorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEnterpriseSeniorityDate() {
        return enterpriseSeniorityDate;
    }

    /**
     * Sets the value of the enterpriseSeniorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEnterpriseSeniorityDate(JAXBElement<XMLGregorianCalendar> value) {
        this.enterpriseSeniorityDate = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStart(XMLGregorianCalendar value) {
        this.dateStart = value;
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
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber(Integer value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the onMilitaryServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnMilitaryServiceFlag() {
        return onMilitaryServiceFlag;
    }

    /**
     * Sets the value of the onMilitaryServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnMilitaryServiceFlag(Boolean value) {
        this.onMilitaryServiceFlag = value;
    }

    /**
     * Gets the value of the periodOfServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodOfServiceId() {
        return periodOfServiceId;
    }

    /**
     * Sets the value of the periodOfServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodOfServiceId(Long value) {
        this.periodOfServiceId = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryFlag(Boolean value) {
        this.primaryFlag = value;
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

    /**
     * Gets the value of the rehireAuthorizerPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRehireAuthorizerPersonId() {
        return rehireAuthorizerPersonId;
    }

    /**
     * Sets the value of the rehireAuthorizerPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRehireAuthorizerPersonId(JAXBElement<Long> value) {
        this.rehireAuthorizerPersonId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the rehireAuthorizor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRehireAuthorizor() {
        return rehireAuthorizor;
    }

    /**
     * Sets the value of the rehireAuthorizor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRehireAuthorizor(JAXBElement<String> value) {
        this.rehireAuthorizor = ((JAXBElement<String> ) value);
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
     * Gets the value of the workerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerNumber() {
        return workerNumber;
    }

    /**
     * Sets the value of the workerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerNumber(JAXBElement<String> value) {
        this.workerNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workerComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerComments() {
        return workerComments;
    }

    /**
     * Sets the value of the workerComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerComments(JAXBElement<String> value) {
        this.workerComments = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonNumber(JAXBElement<String> value) {
        this.personNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the legalEmployerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalEmployerName() {
        return legalEmployerName;
    }

    /**
     * Sets the value of the legalEmployerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalEmployerName(JAXBElement<String> value) {
        this.legalEmployerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rehireRecommendationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRehireRecommendationFlag() {
        return rehireRecommendationFlag;
    }

    /**
     * Sets the value of the rehireRecommendationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRehireRecommendationFlag(Boolean value) {
        this.rehireRecommendationFlag = value;
    }

    /**
     * Gets the value of the workerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkerType() {
        return workerType;
    }

    /**
     * Sets the value of the workerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkerType(String value) {
        this.workerType = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGUID(JAXBElement<String> value) {
        this.guid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sourceSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Sets the value of the sourceSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemId(JAXBElement<String> value) {
        this.sourceSystemId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sourceSystemOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemOwner() {
        return sourceSystemOwner;
    }

    /**
     * Sets the value of the sourceSystemOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemOwner(JAXBElement<String> value) {
        this.sourceSystemOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActionCode(JAXBElement<String> value) {
        this.actionCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<String> value) {
        this.reasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the newStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNewStartDate() {
        return newStartDate;
    }

    /**
     * Sets the value of the newStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNewStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.newStartDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfDeath(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfDeath = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the dateForPrimaryFlagChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateForPrimaryFlagChange() {
        return dateForPrimaryFlagChange;
    }

    /**
     * Sets the value of the dateForPrimaryFlagChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateForPrimaryFlagChange(JAXBElement<XMLGregorianCalendar> value) {
        this.dateForPrimaryFlagChange = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the cancelWorkRelationshipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCancelWorkRelationshipFlag() {
        return cancelWorkRelationshipFlag;
    }

    /**
     * Sets the value of the cancelWorkRelationshipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCancelWorkRelationshipFlag(JAXBElement<Boolean> value) {
        this.cancelWorkRelationshipFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the terminateWorkRelationshipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTerminateWorkRelationshipFlag() {
        return terminateWorkRelationshipFlag;
    }

    /**
     * Sets the value of the terminateWorkRelationshipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTerminateWorkRelationshipFlag(JAXBElement<Boolean> value) {
        this.terminateWorkRelationshipFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the reverseTerminationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReverseTerminationFlag() {
        return reverseTerminationFlag;
    }

    /**
     * Sets the value of the reverseTerminationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReverseTerminationFlag(JAXBElement<Boolean> value) {
        this.reverseTerminationFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the correctTerminationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCorrectTerminationFlag() {
        return correctTerminationFlag;
    }

    /**
     * Sets the value of the correctTerminationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCorrectTerminationFlag(JAXBElement<Boolean> value) {
        this.correctTerminationFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the globalTransferFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGlobalTransferFlag() {
        return globalTransferFlag;
    }

    /**
     * Sets the value of the globalTransferFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGlobalTransferFlag(JAXBElement<Boolean> value) {
        this.globalTransferFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the workTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkTerms }
     * 
     * 
     */
    public List<WorkTerms> getWorkTerms() {
        if (workTerms == null) {
            workTerms = new ArrayList<WorkTerms>();
        }
        return this.workTerms;
    }

    /**
     * Gets the value of the workRelationshipDFF property.
     * 
     * @return
     *     possible object is
     *     {@link WorkRelationshipDFF }
     *     
     */
    public WorkRelationshipDFF getWorkRelationshipDFF() {
        return workRelationshipDFF;
    }

    /**
     * Sets the value of the workRelationshipDFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkRelationshipDFF }
     *     
     */
    public void setWorkRelationshipDFF(WorkRelationshipDFF value) {
        this.workRelationshipDFF = value;
    }

    /**
     * Gets the value of the workRelationshipDDF property.
     * 
     * @return
     *     possible object is
     *     {@link WorkRelationshipLegDDF }
     *     
     */
    public WorkRelationshipLegDDF getWorkRelationshipDDF() {
        return workRelationshipDDF;
    }

    /**
     * Sets the value of the workRelationshipDDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkRelationshipLegDDF }
     *     
     */
    public void setWorkRelationshipDDF(WorkRelationshipLegDDF value) {
        this.workRelationshipDDF = value;
    }

}
