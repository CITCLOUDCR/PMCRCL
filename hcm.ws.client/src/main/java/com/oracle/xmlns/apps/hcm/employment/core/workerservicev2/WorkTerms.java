
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
import com.oracle.xmlns.apps.financials.generalledger.accounts.codecombinations.publicflex.account.Account;
import com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentextrainfoeff.category.JAssignmentEitCategory;
import com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentddf.BaseWorkerAsgLegDDF;
import com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentdff.BaseWorkerAsgDFF;
import com.oracle.xmlns.apps.hcm.employment.core.publicflex.peoplegroupkff.PeopleGroupKFF;


/**
 * <p>Java class for WorkTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssignmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentStatusTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentStatusTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssignmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BargainingUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BusinessUnitShortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectiveAgreementId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DateProbationEnd" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveLatestChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="WorkerCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstablishmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReportingEstablishment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpenseCheckSendToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GradeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradeLadderPgmId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GradeLadderPgmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HourlySalariedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalMailstop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalOfficeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="JobCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LabourUnionMemberFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NormalHours" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoticePeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NoticePeriodUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodOfServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateStart" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="WorkerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionOverrideFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryWorkTermsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProbationPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProbationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectedEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProjectedStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProposedWorkerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProposedUserPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetirementAge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RetirementDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SpecialCeilingStepId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SpecialCeilingStep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StepEntryDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SystemPersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorSiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WorkAtHomeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorkTermsAssignmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FreezeStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="FreezeUntilDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RangeStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RangeStartSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RangeEndSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RangeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxReportingUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TaxReportingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeopleGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullPartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermanentTemporary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectiveAgreementIdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultExpenseAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assignment" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}Assignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}Contract" minOccurs="0"/>
 *         &lt;element name="WorkTermsSupervisor" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}WorkTermsSupervisor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkTermsWorkMeasure" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}WorkTermsWorkMeasure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkTermsGradeSteps" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}WorkTermsGradeSteps" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BaseWorkerAsgDFF" type="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/}BaseWorkerAsgDFF" minOccurs="0"/>
 *         &lt;element name="BaseWorkerAsgLegDDF" type="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDDF/}BaseWorkerAsgLegDDF" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/}Account" minOccurs="0"/>
 *         &lt;element name="WorkTermsPeopleGroup" type="{http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/}PeopleGroupKFF" minOccurs="0"/>
 *         &lt;element name="j_AssignmentEitCategoryWT" type="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/}j_AssignmentEitCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkTerms", propOrder = {
    "actionCode",
    "assignmentId",
    "assignmentName",
    "assignmentNumber",
    "assignmentStatusTypeCode",
    "assignmentStatusTypeId",
    "assignmentType",
    "bargainingUnitCode",
    "billingTitle",
    "businessUnitId",
    "businessUnitShortCode",
    "collectiveAgreementId",
    "contractId",
    "dateProbationEnd",
    "effectiveEndDate",
    "effectiveLatestChange",
    "effectiveSequence",
    "effectiveStartDate",
    "workerCategory",
    "assignmentCategory",
    "establishmentId",
    "reportingEstablishment",
    "expenseCheckSendToAddress",
    "gradeId",
    "gradeCode",
    "gradeLadderPgmId",
    "gradeLadderPgmName",
    "hourlySalariedCode",
    "internalBuilding",
    "internalFloor",
    "internalLocation",
    "internalMailstop",
    "internalOfficeNumber",
    "jobId",
    "jobCode",
    "labourUnionMemberFlag",
    "locationId",
    "locationCode",
    "managerFlag",
    "normalHours",
    "frequency",
    "noticePeriod",
    "noticePeriodUOM",
    "organizationId",
    "departmentName",
    "periodOfServiceId",
    "personId",
    "personNumber",
    "dateStart",
    "workerType",
    "legalEmployerName",
    "personTypeId",
    "personTypeCode",
    "positionId",
    "positionCode",
    "positionOverrideFlag",
    "primaryWorkTermsFlag",
    "probationPeriod",
    "probationUnit",
    "projectedEndDate",
    "projectedStartDate",
    "proposedWorkerType",
    "proposedUserPersonType",
    "reasonCode",
    "retirementAge",
    "retirementDate",
    "specialCeilingStepId",
    "specialCeilingStep",
    "stepEntryDate",
    "systemPersonType",
    "taxAddressId",
    "endTime",
    "startTime",
    "vendorSiteId",
    "workAtHomeFlag",
    "workTermsAssignmentId",
    "vendorId",
    "freezeStartDate",
    "freezeUntilDate",
    "objectVersionNumber",
    "rangeStartDate",
    "rangeEndDate",
    "rangeStartSequence",
    "rangeEndSequence",
    "rangeMode",
    "guid",
    "sourceSystemOwner",
    "sourceSystemId",
    "categoryCode",
    "taxReportingUnitId",
    "taxReportingUnit",
    "peopleGroup",
    "fullPartTime",
    "permanentTemporary",
    "collectiveAgreementIdCode",
    "defaultExpenseAccount",
    "assignment",
    "contract",
    "workTermsSupervisor",
    "workTermsWorkMeasure",
    "workTermsGradeSteps",
    "baseWorkerAsgDFF",
    "baseWorkerAsgLegDDF",
    "account",
    "workTermsPeopleGroup",
    "jAssignmentEitCategoryWT"
})
public class WorkTerms {

    @XmlElementRef(name = "ActionCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> actionCode;
    @XmlElement(name = "AssignmentId")
    protected Long assignmentId;
    @XmlElementRef(name = "AssignmentName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentName;
    @XmlElementRef(name = "AssignmentNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentNumber;
    @XmlElement(name = "AssignmentStatusTypeCode")
    protected String assignmentStatusTypeCode;
    @XmlElement(name = "AssignmentStatusTypeId")
    protected Long assignmentStatusTypeId;
    @XmlElement(name = "AssignmentType")
    protected String assignmentType;
    @XmlElementRef(name = "BargainingUnitCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> bargainingUnitCode;
    @XmlElementRef(name = "BillingTitle", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> billingTitle;
    @XmlElement(name = "BusinessUnitId")
    protected Long businessUnitId;
    @XmlElementRef(name = "BusinessUnitShortCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> businessUnitShortCode;
    @XmlElementRef(name = "CollectiveAgreementId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> collectiveAgreementId;
    @XmlElementRef(name = "ContractId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> contractId;
    @XmlElementRef(name = "DateProbationEnd", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateProbationEnd;
    @XmlElement(name = "EffectiveEndDate")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElement(name = "EffectiveLatestChange")
    protected String effectiveLatestChange;
    @XmlElement(name = "EffectiveSequence")
    protected Integer effectiveSequence;
    @XmlElement(name = "EffectiveStartDate")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElementRef(name = "WorkerCategory", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> workerCategory;
    @XmlElementRef(name = "AssignmentCategory", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentCategory;
    @XmlElementRef(name = "EstablishmentId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> establishmentId;
    @XmlElementRef(name = "ReportingEstablishment", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> reportingEstablishment;
    @XmlElementRef(name = "ExpenseCheckSendToAddress", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> expenseCheckSendToAddress;
    @XmlElementRef(name = "GradeId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> gradeId;
    @XmlElementRef(name = "GradeCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> gradeCode;
    @XmlElementRef(name = "GradeLadderPgmId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> gradeLadderPgmId;
    @XmlElementRef(name = "GradeLadderPgmName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> gradeLadderPgmName;
    @XmlElementRef(name = "HourlySalariedCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> hourlySalariedCode;
    @XmlElementRef(name = "InternalBuilding", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> internalBuilding;
    @XmlElementRef(name = "InternalFloor", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> internalFloor;
    @XmlElementRef(name = "InternalLocation", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> internalLocation;
    @XmlElementRef(name = "InternalMailstop", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> internalMailstop;
    @XmlElementRef(name = "InternalOfficeNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> internalOfficeNumber;
    @XmlElementRef(name = "JobId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> jobId;
    @XmlElementRef(name = "JobCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> jobCode;
    @XmlElementRef(name = "LabourUnionMemberFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> labourUnionMemberFlag;
    @XmlElementRef(name = "LocationId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> locationId;
    @XmlElementRef(name = "LocationCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> locationCode;
    @XmlElementRef(name = "ManagerFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> managerFlag;
    @XmlElementRef(name = "NormalHours", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> normalHours;
    @XmlElementRef(name = "Frequency", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> frequency;
    @XmlElementRef(name = "NoticePeriod", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> noticePeriod;
    @XmlElementRef(name = "NoticePeriodUOM", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> noticePeriodUOM;
    @XmlElementRef(name = "OrganizationId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> organizationId;
    @XmlElementRef(name = "DepartmentName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> departmentName;
    @XmlElement(name = "PeriodOfServiceId")
    protected Long periodOfServiceId;
    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElementRef(name = "PersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> personNumber;
    @XmlElementRef(name = "DateStart", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateStart;
    @XmlElementRef(name = "WorkerType", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> workerType;
    @XmlElementRef(name = "LegalEmployerName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> legalEmployerName;
    @XmlElementRef(name = "PersonTypeId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> personTypeId;
    @XmlElementRef(name = "PersonTypeCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> personTypeCode;
    @XmlElementRef(name = "PositionId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> positionId;
    @XmlElementRef(name = "PositionCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> positionCode;
    @XmlElement(name = "PositionOverrideFlag")
    protected Boolean positionOverrideFlag;
    @XmlElement(name = "PrimaryWorkTermsFlag")
    protected Boolean primaryWorkTermsFlag;
    @XmlElementRef(name = "ProbationPeriod", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> probationPeriod;
    @XmlElementRef(name = "ProbationUnit", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> probationUnit;
    @XmlElementRef(name = "ProjectedEndDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> projectedEndDate;
    @XmlElementRef(name = "ProjectedStartDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> projectedStartDate;
    @XmlElementRef(name = "ProposedWorkerType", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> proposedWorkerType;
    @XmlElementRef(name = "ProposedUserPersonType", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> proposedUserPersonType;
    @XmlElementRef(name = "ReasonCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> reasonCode;
    @XmlElementRef(name = "RetirementAge", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> retirementAge;
    @XmlElementRef(name = "RetirementDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> retirementDate;
    @XmlElementRef(name = "SpecialCeilingStepId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> specialCeilingStepId;
    @XmlElementRef(name = "SpecialCeilingStep", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> specialCeilingStep;
    @XmlElementRef(name = "StepEntryDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> stepEntryDate;
    @XmlElementRef(name = "SystemPersonType", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> systemPersonType;
    @XmlElementRef(name = "TaxAddressId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> taxAddressId;
    @XmlElementRef(name = "EndTime", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> endTime;
    @XmlElementRef(name = "StartTime", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> startTime;
    @XmlElementRef(name = "VendorSiteId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> vendorSiteId;
    @XmlElementRef(name = "WorkAtHomeFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> workAtHomeFlag;
    @XmlElementRef(name = "WorkTermsAssignmentId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> workTermsAssignmentId;
    @XmlElementRef(name = "VendorId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> vendorId;
    @XmlElement(name = "FreezeStartDate")
    protected XMLGregorianCalendar freezeStartDate;
    @XmlElement(name = "FreezeUntilDate")
    protected XMLGregorianCalendar freezeUntilDate;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "RangeStartDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rangeStartDate;
    @XmlElementRef(name = "RangeEndDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rangeEndDate;
    @XmlElementRef(name = "RangeStartSequence", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Integer> rangeStartSequence;
    @XmlElementRef(name = "RangeEndSequence", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Integer> rangeEndSequence;
    @XmlElementRef(name = "RangeMode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> rangeMode;
    @XmlElementRef(name = "GUID", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> guid;
    @XmlElementRef(name = "SourceSystemOwner", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemOwner;
    @XmlElementRef(name = "SourceSystemId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemId;
    @XmlElement(name = "CategoryCode")
    protected String categoryCode;
    @XmlElementRef(name = "TaxReportingUnitId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> taxReportingUnitId;
    @XmlElementRef(name = "TaxReportingUnit", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> taxReportingUnit;
    @XmlElementRef(name = "PeopleGroup", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> peopleGroup;
    @XmlElementRef(name = "FullPartTime", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> fullPartTime;
    @XmlElementRef(name = "PermanentTemporary", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> permanentTemporary;
    @XmlElementRef(name = "CollectiveAgreementIdCode", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> collectiveAgreementIdCode;
    @XmlElementRef(name = "DefaultExpenseAccount", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> defaultExpenseAccount;
    @XmlElement(name = "Assignment")
    protected List<Assignment> assignment;
    @XmlElement(name = "Contract")
    protected Contract contract;
    @XmlElement(name = "WorkTermsSupervisor")
    protected List<WorkTermsSupervisor> workTermsSupervisor;
    @XmlElement(name = "WorkTermsWorkMeasure")
    protected List<WorkTermsWorkMeasure> workTermsWorkMeasure;
    @XmlElement(name = "WorkTermsGradeSteps")
    protected List<WorkTermsGradeSteps> workTermsGradeSteps;
    @XmlElement(name = "BaseWorkerAsgDFF")
    protected BaseWorkerAsgDFF baseWorkerAsgDFF;
    @XmlElement(name = "BaseWorkerAsgLegDDF")
    protected BaseWorkerAsgLegDDF baseWorkerAsgLegDDF;
    @XmlElement(name = "Account")
    protected Account account;
    @XmlElement(name = "WorkTermsPeopleGroup")
    protected PeopleGroupKFF workTermsPeopleGroup;
    @XmlElement(name = "j_AssignmentEitCategoryWT")
    protected JAssignmentEitCategory jAssignmentEitCategoryWT;

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
     * Gets the value of the assignmentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentName() {
        return assignmentName;
    }

    /**
     * Sets the value of the assignmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentName(JAXBElement<String> value) {
        this.assignmentName = ((JAXBElement<String> ) value);
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
     * Gets the value of the assignmentStatusTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentStatusTypeCode() {
        return assignmentStatusTypeCode;
    }

    /**
     * Sets the value of the assignmentStatusTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentStatusTypeCode(String value) {
        this.assignmentStatusTypeCode = value;
    }

    /**
     * Gets the value of the assignmentStatusTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssignmentStatusTypeId() {
        return assignmentStatusTypeId;
    }

    /**
     * Sets the value of the assignmentStatusTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssignmentStatusTypeId(Long value) {
        this.assignmentStatusTypeId = value;
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
     * Gets the value of the bargainingUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBargainingUnitCode() {
        return bargainingUnitCode;
    }

    /**
     * Sets the value of the bargainingUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBargainingUnitCode(JAXBElement<String> value) {
        this.bargainingUnitCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the billingTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingTitle() {
        return billingTitle;
    }

    /**
     * Sets the value of the billingTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingTitle(JAXBElement<String> value) {
        this.billingTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the businessUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * Sets the value of the businessUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessUnitId(Long value) {
        this.businessUnitId = value;
    }

    /**
     * Gets the value of the businessUnitShortCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnitShortCode() {
        return businessUnitShortCode;
    }

    /**
     * Sets the value of the businessUnitShortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnitShortCode(JAXBElement<String> value) {
        this.businessUnitShortCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the collectiveAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCollectiveAgreementId() {
        return collectiveAgreementId;
    }

    /**
     * Sets the value of the collectiveAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCollectiveAgreementId(JAXBElement<Long> value) {
        this.collectiveAgreementId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContractId(JAXBElement<Long> value) {
        this.contractId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the dateProbationEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateProbationEnd() {
        return dateProbationEnd;
    }

    /**
     * Sets the value of the dateProbationEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateProbationEnd(JAXBElement<XMLGregorianCalendar> value) {
        this.dateProbationEnd = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the workerCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerCategory() {
        return workerCategory;
    }

    /**
     * Sets the value of the workerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerCategory(JAXBElement<String> value) {
        this.workerCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the assignmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentCategory() {
        return assignmentCategory;
    }

    /**
     * Sets the value of the assignmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentCategory(JAXBElement<String> value) {
        this.assignmentCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the establishmentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEstablishmentId() {
        return establishmentId;
    }

    /**
     * Sets the value of the establishmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEstablishmentId(JAXBElement<Long> value) {
        this.establishmentId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the reportingEstablishment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportingEstablishment() {
        return reportingEstablishment;
    }

    /**
     * Sets the value of the reportingEstablishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportingEstablishment(JAXBElement<String> value) {
        this.reportingEstablishment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expenseCheckSendToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpenseCheckSendToAddress() {
        return expenseCheckSendToAddress;
    }

    /**
     * Sets the value of the expenseCheckSendToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpenseCheckSendToAddress(JAXBElement<String> value) {
        this.expenseCheckSendToAddress = ((JAXBElement<String> ) value);
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
     * Gets the value of the gradeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGradeCode() {
        return gradeCode;
    }

    /**
     * Sets the value of the gradeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGradeCode(JAXBElement<String> value) {
        this.gradeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gradeLadderPgmId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getGradeLadderPgmId() {
        return gradeLadderPgmId;
    }

    /**
     * Sets the value of the gradeLadderPgmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setGradeLadderPgmId(JAXBElement<Long> value) {
        this.gradeLadderPgmId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the gradeLadderPgmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGradeLadderPgmName() {
        return gradeLadderPgmName;
    }

    /**
     * Sets the value of the gradeLadderPgmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGradeLadderPgmName(JAXBElement<String> value) {
        this.gradeLadderPgmName = ((JAXBElement<String> ) value);
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
     * Gets the value of the internalBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalBuilding() {
        return internalBuilding;
    }

    /**
     * Sets the value of the internalBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalBuilding(JAXBElement<String> value) {
        this.internalBuilding = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the internalFloor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalFloor() {
        return internalFloor;
    }

    /**
     * Sets the value of the internalFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalFloor(JAXBElement<String> value) {
        this.internalFloor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the internalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalLocation() {
        return internalLocation;
    }

    /**
     * Sets the value of the internalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalLocation(JAXBElement<String> value) {
        this.internalLocation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the internalMailstop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalMailstop() {
        return internalMailstop;
    }

    /**
     * Sets the value of the internalMailstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalMailstop(JAXBElement<String> value) {
        this.internalMailstop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the internalOfficeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalOfficeNumber() {
        return internalOfficeNumber;
    }

    /**
     * Sets the value of the internalOfficeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalOfficeNumber(JAXBElement<String> value) {
        this.internalOfficeNumber = ((JAXBElement<String> ) value);
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
     * Gets the value of the labourUnionMemberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLabourUnionMemberFlag() {
        return labourUnionMemberFlag;
    }

    /**
     * Sets the value of the labourUnionMemberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLabourUnionMemberFlag(JAXBElement<Boolean> value) {
        this.labourUnionMemberFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationCode(JAXBElement<String> value) {
        this.locationCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the noticePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNoticePeriod() {
        return noticePeriod;
    }

    /**
     * Sets the value of the noticePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNoticePeriod(JAXBElement<Long> value) {
        this.noticePeriod = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the noticePeriodUOM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoticePeriodUOM() {
        return noticePeriodUOM;
    }

    /**
     * Sets the value of the noticePeriodUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoticePeriodUOM(JAXBElement<String> value) {
        this.noticePeriodUOM = ((JAXBElement<String> ) value);
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
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentName(JAXBElement<String> value) {
        this.departmentName = ((JAXBElement<String> ) value);
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
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateStart(JAXBElement<XMLGregorianCalendar> value) {
        this.dateStart = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the workerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerType() {
        return workerType;
    }

    /**
     * Sets the value of the workerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerType(JAXBElement<String> value) {
        this.workerType = ((JAXBElement<String> ) value);
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
     * Gets the value of the personTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonTypeCode() {
        return personTypeCode;
    }

    /**
     * Sets the value of the personTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonTypeCode(JAXBElement<String> value) {
        this.personTypeCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the positionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPositionCode(JAXBElement<String> value) {
        this.positionCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the positionOverrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPositionOverrideFlag() {
        return positionOverrideFlag;
    }

    /**
     * Sets the value of the positionOverrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPositionOverrideFlag(Boolean value) {
        this.positionOverrideFlag = value;
    }

    /**
     * Gets the value of the primaryWorkTermsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryWorkTermsFlag() {
        return primaryWorkTermsFlag;
    }

    /**
     * Sets the value of the primaryWorkTermsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryWorkTermsFlag(Boolean value) {
        this.primaryWorkTermsFlag = value;
    }

    /**
     * Gets the value of the probationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProbationPeriod() {
        return probationPeriod;
    }

    /**
     * Sets the value of the probationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProbationPeriod(JAXBElement<BigDecimal> value) {
        this.probationPeriod = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the probationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProbationUnit() {
        return probationUnit;
    }

    /**
     * Sets the value of the probationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProbationUnit(JAXBElement<String> value) {
        this.probationUnit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the projectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectedEndDate() {
        return projectedEndDate;
    }

    /**
     * Sets the value of the projectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectedEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.projectedEndDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the projectedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectedStartDate() {
        return projectedStartDate;
    }

    /**
     * Sets the value of the projectedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectedStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.projectedStartDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the proposedWorkerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProposedWorkerType() {
        return proposedWorkerType;
    }

    /**
     * Sets the value of the proposedWorkerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProposedWorkerType(JAXBElement<String> value) {
        this.proposedWorkerType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the proposedUserPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProposedUserPersonType() {
        return proposedUserPersonType;
    }

    /**
     * Sets the value of the proposedUserPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProposedUserPersonType(JAXBElement<String> value) {
        this.proposedUserPersonType = ((JAXBElement<String> ) value);
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
     * Gets the value of the retirementAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRetirementAge() {
        return retirementAge;
    }

    /**
     * Sets the value of the retirementAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRetirementAge(JAXBElement<Long> value) {
        this.retirementAge = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the retirementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRetirementDate() {
        return retirementDate;
    }

    /**
     * Sets the value of the retirementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRetirementDate(JAXBElement<XMLGregorianCalendar> value) {
        this.retirementDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the specialCeilingStepId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSpecialCeilingStepId() {
        return specialCeilingStepId;
    }

    /**
     * Sets the value of the specialCeilingStepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSpecialCeilingStepId(JAXBElement<Long> value) {
        this.specialCeilingStepId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the specialCeilingStep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialCeilingStep() {
        return specialCeilingStep;
    }

    /**
     * Sets the value of the specialCeilingStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialCeilingStep(JAXBElement<String> value) {
        this.specialCeilingStep = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stepEntryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStepEntryDate() {
        return stepEntryDate;
    }

    /**
     * Sets the value of the stepEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStepEntryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.stepEntryDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the systemPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSystemPersonType() {
        return systemPersonType;
    }

    /**
     * Sets the value of the systemPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSystemPersonType(JAXBElement<String> value) {
        this.systemPersonType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the taxAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTaxAddressId() {
        return taxAddressId;
    }

    /**
     * Sets the value of the taxAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTaxAddressId(JAXBElement<Long> value) {
        this.taxAddressId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<String> value) {
        this.endTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<String> value) {
        this.startTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the vendorSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVendorSiteId() {
        return vendorSiteId;
    }

    /**
     * Sets the value of the vendorSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVendorSiteId(JAXBElement<Long> value) {
        this.vendorSiteId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the workAtHomeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWorkAtHomeFlag() {
        return workAtHomeFlag;
    }

    /**
     * Sets the value of the workAtHomeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWorkAtHomeFlag(JAXBElement<Boolean> value) {
        this.workAtHomeFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVendorId(JAXBElement<Long> value) {
        this.vendorId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the freezeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFreezeStartDate() {
        return freezeStartDate;
    }

    /**
     * Sets the value of the freezeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFreezeStartDate(XMLGregorianCalendar value) {
        this.freezeStartDate = value;
    }

    /**
     * Gets the value of the freezeUntilDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFreezeUntilDate() {
        return freezeUntilDate;
    }

    /**
     * Sets the value of the freezeUntilDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFreezeUntilDate(XMLGregorianCalendar value) {
        this.freezeUntilDate = value;
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
     * Gets the value of the rangeStartSequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRangeStartSequence() {
        return rangeStartSequence;
    }

    /**
     * Sets the value of the rangeStartSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRangeStartSequence(JAXBElement<Integer> value) {
        this.rangeStartSequence = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rangeEndSequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRangeEndSequence() {
        return rangeEndSequence;
    }

    /**
     * Sets the value of the rangeEndSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRangeEndSequence(JAXBElement<Integer> value) {
        this.rangeEndSequence = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the taxReportingUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTaxReportingUnitId() {
        return taxReportingUnitId;
    }

    /**
     * Sets the value of the taxReportingUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTaxReportingUnitId(JAXBElement<Long> value) {
        this.taxReportingUnitId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the taxReportingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxReportingUnit() {
        return taxReportingUnit;
    }

    /**
     * Sets the value of the taxReportingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxReportingUnit(JAXBElement<String> value) {
        this.taxReportingUnit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the peopleGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPeopleGroup() {
        return peopleGroup;
    }

    /**
     * Sets the value of the peopleGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPeopleGroup(JAXBElement<String> value) {
        this.peopleGroup = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fullPartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullPartTime() {
        return fullPartTime;
    }

    /**
     * Sets the value of the fullPartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullPartTime(JAXBElement<String> value) {
        this.fullPartTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the permanentTemporary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermanentTemporary() {
        return permanentTemporary;
    }

    /**
     * Sets the value of the permanentTemporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermanentTemporary(JAXBElement<String> value) {
        this.permanentTemporary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the collectiveAgreementIdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollectiveAgreementIdCode() {
        return collectiveAgreementIdCode;
    }

    /**
     * Sets the value of the collectiveAgreementIdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollectiveAgreementIdCode(JAXBElement<String> value) {
        this.collectiveAgreementIdCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the defaultExpenseAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultExpenseAccount() {
        return defaultExpenseAccount;
    }

    /**
     * Sets the value of the defaultExpenseAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultExpenseAccount(JAXBElement<String> value) {
        this.defaultExpenseAccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the assignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Assignment }
     * 
     * 
     */
    public List<Assignment> getAssignment() {
        if (assignment == null) {
            assignment = new ArrayList<Assignment>();
        }
        return this.assignment;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

    /**
     * Gets the value of the workTermsSupervisor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workTermsSupervisor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkTermsSupervisor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkTermsSupervisor }
     * 
     * 
     */
    public List<WorkTermsSupervisor> getWorkTermsSupervisor() {
        if (workTermsSupervisor == null) {
            workTermsSupervisor = new ArrayList<WorkTermsSupervisor>();
        }
        return this.workTermsSupervisor;
    }

    /**
     * Gets the value of the workTermsWorkMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workTermsWorkMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkTermsWorkMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkTermsWorkMeasure }
     * 
     * 
     */
    public List<WorkTermsWorkMeasure> getWorkTermsWorkMeasure() {
        if (workTermsWorkMeasure == null) {
            workTermsWorkMeasure = new ArrayList<WorkTermsWorkMeasure>();
        }
        return this.workTermsWorkMeasure;
    }

    /**
     * Gets the value of the workTermsGradeSteps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workTermsGradeSteps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkTermsGradeSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkTermsGradeSteps }
     * 
     * 
     */
    public List<WorkTermsGradeSteps> getWorkTermsGradeSteps() {
        if (workTermsGradeSteps == null) {
            workTermsGradeSteps = new ArrayList<WorkTermsGradeSteps>();
        }
        return this.workTermsGradeSteps;
    }

    /**
     * Gets the value of the baseWorkerAsgDFF property.
     * 
     * @return
     *     possible object is
     *     {@link BaseWorkerAsgDFF }
     *     
     */
    public BaseWorkerAsgDFF getBaseWorkerAsgDFF() {
        return baseWorkerAsgDFF;
    }

    /**
     * Sets the value of the baseWorkerAsgDFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseWorkerAsgDFF }
     *     
     */
    public void setBaseWorkerAsgDFF(BaseWorkerAsgDFF value) {
        this.baseWorkerAsgDFF = value;
    }

    /**
     * Gets the value of the baseWorkerAsgLegDDF property.
     * 
     * @return
     *     possible object is
     *     {@link BaseWorkerAsgLegDDF }
     *     
     */
    public BaseWorkerAsgLegDDF getBaseWorkerAsgLegDDF() {
        return baseWorkerAsgLegDDF;
    }

    /**
     * Sets the value of the baseWorkerAsgLegDDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseWorkerAsgLegDDF }
     *     
     */
    public void setBaseWorkerAsgLegDDF(BaseWorkerAsgLegDDF value) {
        this.baseWorkerAsgLegDDF = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the workTermsPeopleGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PeopleGroupKFF }
     *     
     */
    public PeopleGroupKFF getWorkTermsPeopleGroup() {
        return workTermsPeopleGroup;
    }

    /**
     * Sets the value of the workTermsPeopleGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeopleGroupKFF }
     *     
     */
    public void setWorkTermsPeopleGroup(PeopleGroupKFF value) {
        this.workTermsPeopleGroup = value;
    }

    /**
     * Gets the value of the jAssignmentEitCategoryWT property.
     * 
     * @return
     *     possible object is
     *     {@link JAssignmentEitCategory }
     *     
     */
    public JAssignmentEitCategory getJAssignmentEitCategoryWT() {
        return jAssignmentEitCategoryWT;
    }

    /**
     * Sets the value of the jAssignmentEitCategoryWT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAssignmentEitCategory }
     *     
     */
    public void setJAssignmentEitCategoryWT(JAssignmentEitCategory value) {
        this.jAssignmentEitCategoryWT = value;
    }

}
