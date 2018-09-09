
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WorkerDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkerDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EffectiveLatestChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeopleGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LegalEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WorkAtHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmploymentCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegislationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormalHours" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PeriodOfServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ManagerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GradeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BusinessUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BusinessGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HourlySalariedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorkTermsAssignmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ActualTerminationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonNameId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RangeStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonVisaDetails" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonVisaDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonPassportDetails" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonPassportDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonNidDetails" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonNidDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkerManager" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}WorkerManager" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerDetails", propOrder = {
    "assignmentId",
    "effectiveStartDate",
    "effectiveEndDate",
    "effectiveSequence",
    "effectiveLatestChange",
    "assignmentType",
    "assignmentNumber",
    "peopleGroupId",
    "legalEntityId",
    "workAtHome",
    "employeeCategory",
    "employmentCategory",
    "legislationCode",
    "normalHours",
    "frequency",
    "personId",
    "periodOfServiceId",
    "personTypeId",
    "managerFlag",
    "locationId",
    "jobId",
    "gradeId",
    "businessUnitId",
    "businessGroupId",
    "hourlySalariedCode",
    "positionId",
    "organizationId",
    "primaryFlag",
    "workTermsAssignmentId",
    "actualTerminationDate",
    "periodType",
    "fullName",
    "personNameId",
    "userPersonType",
    "businessUnit",
    "position",
    "positionCode",
    "job",
    "jobCode",
    "grade",
    "gradeCode",
    "department",
    "location",
    "locationName",
    "displayName",
    "firstName",
    "lastName",
    "personStartDate",
    "username",
    "userId",
    "userActiveFlag",
    "personNumber",
    "legalEntity",
    "rangeStartDate",
    "rangeEndDate",
    "rangeMode",
    "personVisaDetails",
    "personPassportDetails",
    "personNidDetails",
    "workerManager"
})
public class WorkerDetails {

    @XmlElement(name = "AssignmentId")
    protected Long assignmentId;
    @XmlElement(name = "EffectiveStartDate")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElement(name = "EffectiveSequence")
    protected Integer effectiveSequence;
    @XmlElement(name = "EffectiveLatestChange")
    protected String effectiveLatestChange;
    @XmlElement(name = "AssignmentType")
    protected String assignmentType;
    @XmlElementRef(name = "AssignmentNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentNumber;
    @XmlElementRef(name = "PeopleGroupId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> peopleGroupId;
    @XmlElementRef(name = "LegalEntityId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> legalEntityId;
    @XmlElementRef(name = "WorkAtHome", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> workAtHome;
    @XmlElementRef(name = "EmployeeCategory", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> employeeCategory;
    @XmlElementRef(name = "EmploymentCategory", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> employmentCategory;
    @XmlElementRef(name = "LegislationCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> legislationCode;
    @XmlElementRef(name = "NormalHours", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> normalHours;
    @XmlElementRef(name = "Frequency", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> frequency;
    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElementRef(name = "PeriodOfServiceId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> periodOfServiceId;
    @XmlElementRef(name = "PersonTypeId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> personTypeId;
    @XmlElementRef(name = "ManagerFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> managerFlag;
    @XmlElementRef(name = "LocationId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> locationId;
    @XmlElementRef(name = "JobId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> jobId;
    @XmlElementRef(name = "GradeId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> gradeId;
    @XmlElementRef(name = "BusinessUnitId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> businessUnitId;
    @XmlElement(name = "BusinessGroupId")
    protected Long businessGroupId;
    @XmlElementRef(name = "HourlySalariedCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> hourlySalariedCode;
    @XmlElementRef(name = "PositionId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> positionId;
    @XmlElementRef(name = "OrganizationId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> organizationId;
    @XmlElement(name = "PrimaryFlag")
    protected Boolean primaryFlag;
    @XmlElementRef(name = "WorkTermsAssignmentId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> workTermsAssignmentId;
    @XmlElementRef(name = "ActualTerminationDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> actualTerminationDate;
    @XmlElement(name = "PeriodType")
    protected String periodType;
    @XmlElementRef(name = "FullName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> fullName;
    @XmlElement(name = "PersonNameId")
    protected Long personNameId;
    @XmlElement(name = "UserPersonType")
    protected String userPersonType;
    @XmlElementRef(name = "BusinessUnit", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> businessUnit;
    @XmlElement(name = "Position")
    protected String position;
    @XmlElement(name = "PositionCode")
    protected String positionCode;
    @XmlElementRef(name = "Job", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> job;
    @XmlElementRef(name = "JobCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> jobCode;
    @XmlElement(name = "Grade")
    protected String grade;
    @XmlElement(name = "GradeCode")
    protected String gradeCode;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElementRef(name = "DisplayName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "FirstName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "PersonStartDate")
    protected XMLGregorianCalendar personStartDate;
    @XmlElementRef(name = "Username", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "UserId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> userId;
    @XmlElementRef(name = "UserActiveFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> userActiveFlag;
    @XmlElement(name = "PersonNumber")
    protected String personNumber;
    @XmlElement(name = "LegalEntity")
    protected String legalEntity;
    @XmlElementRef(name = "RangeStartDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rangeStartDate;
    @XmlElementRef(name = "RangeEndDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rangeEndDate;
    @XmlElementRef(name = "RangeMode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> rangeMode;
    @XmlElement(name = "PersonVisaDetails")
    protected List<PersonVisaDetails> personVisaDetails;
    @XmlElement(name = "PersonPassportDetails")
    protected List<PersonPassportDetails> personPassportDetails;
    @XmlElement(name = "PersonNidDetails")
    protected List<PersonNidDetails> personNidDetails;
    @XmlElement(name = "WorkerManager")
    protected List<WorkerManager> workerManager;

    /**
     * Gets the value of the assignmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssignmentId() {
        return assignmentId;
    }

    /**
     * Sets the value of the assignmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssignmentId(Long value) {
        this.assignmentId = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the effectiveSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEffectiveSequence() {
        return effectiveSequence;
    }

    /**
     * Sets the value of the effectiveSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEffectiveSequence(Integer value) {
        this.effectiveSequence = value;
    }

    /**
     * Gets the value of the effectiveLatestChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveLatestChange() {
        return effectiveLatestChange;
    }

    /**
     * Sets the value of the effectiveLatestChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveLatestChange(String value) {
        this.effectiveLatestChange = value;
    }

    /**
     * Gets the value of the assignmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentType() {
        return assignmentType;
    }

    /**
     * Sets the value of the assignmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentType(String value) {
        this.assignmentType = value;
    }

    /**
     * Gets the value of the assignmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentNumber() {
        return assignmentNumber;
    }

    /**
     * Sets the value of the assignmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentNumber(JAXBElement<String> value) {
        this.assignmentNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the peopleGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPeopleGroupId() {
        return peopleGroupId;
    }

    /**
     * Sets the value of the peopleGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPeopleGroupId(JAXBElement<Long> value) {
        this.peopleGroupId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the legalEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLegalEntityId() {
        return legalEntityId;
    }

    /**
     * Sets the value of the legalEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLegalEntityId(JAXBElement<Long> value) {
        this.legalEntityId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the workAtHome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkAtHome() {
        return workAtHome;
    }

    /**
     * Sets the value of the workAtHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkAtHome(JAXBElement<String> value) {
        this.workAtHome = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employeeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeCategory() {
        return employeeCategory;
    }

    /**
     * Sets the value of the employeeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeCategory(JAXBElement<String> value) {
        this.employeeCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmploymentCategory() {
        return employmentCategory;
    }

    /**
     * Sets the value of the employmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmploymentCategory(JAXBElement<String> value) {
        this.employmentCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the legislationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegislationCode() {
        return legislationCode;
    }

    /**
     * Sets the value of the legislationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegislationCode(JAXBElement<String> value) {
        this.legislationCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the normalHours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNormalHours() {
        return normalHours;
    }

    /**
     * Sets the value of the normalHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNormalHours(JAXBElement<BigDecimal> value) {
        this.normalHours = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequency(JAXBElement<String> value) {
        this.frequency = ((JAXBElement<String> ) value);
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
     * Gets the value of the periodOfServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPeriodOfServiceId() {
        return periodOfServiceId;
    }

    /**
     * Sets the value of the periodOfServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPeriodOfServiceId(JAXBElement<Long> value) {
        this.periodOfServiceId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the personTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPersonTypeId() {
        return personTypeId;
    }

    /**
     * Sets the value of the personTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPersonTypeId(JAXBElement<Long> value) {
        this.personTypeId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the managerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getManagerFlag() {
        return managerFlag;
    }

    /**
     * Sets the value of the managerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setManagerFlag(JAXBElement<Boolean> value) {
        this.managerFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationId(JAXBElement<Long> value) {
        this.locationId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setJobId(JAXBElement<Long> value) {
        this.jobId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the gradeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getGradeId() {
        return gradeId;
    }

    /**
     * Sets the value of the gradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setGradeId(JAXBElement<Long> value) {
        this.gradeId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the businessUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * Sets the value of the businessUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBusinessUnitId(JAXBElement<Long> value) {
        this.businessUnitId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the businessGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessGroupId() {
        return businessGroupId;
    }

    /**
     * Sets the value of the businessGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessGroupId(Long value) {
        this.businessGroupId = value;
    }

    /**
     * Gets the value of the hourlySalariedCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHourlySalariedCode() {
        return hourlySalariedCode;
    }

    /**
     * Sets the value of the hourlySalariedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHourlySalariedCode(JAXBElement<String> value) {
        this.hourlySalariedCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPositionId(JAXBElement<Long> value) {
        this.positionId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrganizationId(JAXBElement<Long> value) {
        this.organizationId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the workTermsAssignmentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getWorkTermsAssignmentId() {
        return workTermsAssignmentId;
    }

    /**
     * Sets the value of the workTermsAssignmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setWorkTermsAssignmentId(JAXBElement<Long> value) {
        this.workTermsAssignmentId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodType(String value) {
        this.periodType = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullName(JAXBElement<String> value) {
        this.fullName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personNameId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonNameId() {
        return personNameId;
    }

    /**
     * Sets the value of the personNameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonNameId(Long value) {
        this.personNameId = value;
    }

    /**
     * Gets the value of the userPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPersonType() {
        return userPersonType;
    }

    /**
     * Sets the value of the userPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPersonType(String value) {
        this.userPersonType = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnit(JAXBElement<String> value) {
        this.businessUnit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the positionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionCode(String value) {
        this.positionCode = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJob(JAXBElement<String> value) {
        this.job = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobCode(JAXBElement<String> value) {
        this.jobCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * Gets the value of the gradeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeCode() {
        return gradeCode;
    }

    /**
     * Sets the value of the gradeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeCode(String value) {
        this.gradeCode = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the personStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonStartDate() {
        return personStartDate;
    }

    /**
     * Sets the value of the personStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonStartDate(XMLGregorianCalendar value) {
        this.personStartDate = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUserId(JAXBElement<Long> value) {
        this.userId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the userActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserActiveFlag() {
        return userActiveFlag;
    }

    /**
     * Sets the value of the userActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserActiveFlag(JAXBElement<Boolean> value) {
        this.userActiveFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNumber(String value) {
        this.personNumber = value;
    }

    /**
     * Gets the value of the legalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntity() {
        return legalEntity;
    }

    /**
     * Sets the value of the legalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntity(String value) {
        this.legalEntity = value;
    }

    /**
     * Gets the value of the rangeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRangeStartDate() {
        return rangeStartDate;
    }

    /**
     * Sets the value of the rangeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRangeStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.rangeStartDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the rangeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRangeEndDate() {
        return rangeEndDate;
    }

    /**
     * Sets the value of the rangeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRangeEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.rangeEndDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the rangeMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRangeMode() {
        return rangeMode;
    }

    /**
     * Sets the value of the rangeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRangeMode(JAXBElement<String> value) {
        this.rangeMode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personVisaDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personVisaDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonVisaDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonVisaDetails }
     * 
     * 
     */
    public List<PersonVisaDetails> getPersonVisaDetails() {
        if (personVisaDetails == null) {
            personVisaDetails = new ArrayList<PersonVisaDetails>();
        }
        return this.personVisaDetails;
    }

    /**
     * Gets the value of the personPassportDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPassportDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPassportDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPassportDetails }
     * 
     * 
     */
    public List<PersonPassportDetails> getPersonPassportDetails() {
        if (personPassportDetails == null) {
            personPassportDetails = new ArrayList<PersonPassportDetails>();
        }
        return this.personPassportDetails;
    }

    /**
     * Gets the value of the personNidDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNidDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNidDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNidDetails }
     * 
     * 
     */
    public List<PersonNidDetails> getPersonNidDetails() {
        if (personNidDetails == null) {
            personNidDetails = new ArrayList<PersonNidDetails>();
        }
        return this.personNidDetails;
    }

    /**
     * Gets the value of the workerManager property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerManager property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerManager().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerManager }
     * 
     * 
     */
    public List<WorkerManager> getWorkerManager() {
        if (workerManager == null) {
            workerManager = new ArrayList<WorkerManager>();
        }
        return this.workerManager;
    }

}
