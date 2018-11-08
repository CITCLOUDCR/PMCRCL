package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class RequestAssignment {

    @JsonProperty("PositionId")
    private String positionId;
    @JsonProperty("JobId")
    private String jobId;
    @JsonProperty("DepartmentId")
    private String departmentId;
    @JsonProperty("LocationId")
    private String locationId;
    
    @JsonProperty("AssignmentNumber")
    private String assignmentNumber;
    @JsonProperty("PrimaryAssignmentFlag")
    private String primaryAssignmentFlag;

    @JsonProperty("AssignmentName")
    private String assignmentName;
    @JsonProperty("BusinessUnitId")
    private String businessUnitId;
    @JsonProperty("WorkerCategory")
    private String workerCategory;
    @JsonProperty("AssignmentCategory")
    private String assignmentCategory;
    @JsonProperty("WorkingAtHome")
    private String workingAtHome;
    @JsonProperty("WorkingAsManager")
    private String workingAsManager;
    @JsonProperty("SalaryCode")
    private String salaryCode;
    @JsonProperty("WorkingHours")
    private String workingHours;
    @JsonProperty("Frequency")
    private String frequency;
    @JsonProperty("SalaryAmount")
    private String salaryAmount;
    @JsonProperty("SalaryBasisId")
    private String salaryBasisId;
    @JsonProperty("ActionCode")
    private String actionCode;
    @JsonProperty("ActionReasonCode")
    private String actionReasonCode;
    @JsonProperty("AssignmentStatus")
    private String assignmentStatus;
    @JsonProperty("EffectiveEndDate")
    private String effectiveEndDate;
    @JsonProperty("EffectiveStartDate")
    private String effectiveStartDate;

    @JsonProperty("AssignmentProjectedEndDate")
    private String assignmentProjectedEndDate;

    @JsonProperty("RegularTemporary")
    private String regularTemporary;
    
    @JsonProperty("FullPartTime")
    private String fullPartTime;
	
    @JsonProperty("ProjectedStartDate")
    private String projectedStartDate;
    
    @JsonProperty("LegalEntityId")
    private String legalEntityId;


    @JsonProperty("assignmentDFF")
    private List<RequestAssignmentDFF> assignmentDFF = null;


    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public String getWorkerCategory() {
        return workerCategory;
    }

    public void setWorkerCategory(String workerCategory) {
        this.workerCategory = workerCategory;
    }

    public String getAssignmentCategory() {
        return assignmentCategory;
    }

    public void setAssignmentCategory(String assignmentCategory) {
        this.assignmentCategory = assignmentCategory;
    }

    public String getWorkingAtHome() {
        return workingAtHome;
    }

    public void setWorkingAtHome(String workingAtHome) {
        this.workingAtHome = workingAtHome;
    }

    public String getWorkingAsManager() {
        return workingAsManager;
    }

    public void setWorkingAsManager(String workingAsManager) {
        this.workingAsManager = workingAsManager;
    }

    public String getSalaryCode() {
        return salaryCode;
    }

    public void setSalaryCode(String salaryCode) {
        this.salaryCode = salaryCode;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(String salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public String getSalaryBasisId() {
        return salaryBasisId;
    }

    public void setSalaryBasisId(String salaryBasisId) {
        this.salaryBasisId = salaryBasisId;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getActionReasonCode() {
        return actionReasonCode;
    }

    public void setActionReasonCode(String actionReasonCode) {
        this.actionReasonCode = actionReasonCode;
    }

    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    public List<RequestAssignmentDFF> getAssignmentDFF() {
        return assignmentDFF;
    }

    public void setAssignmentDFF(List<RequestAssignmentDFF> assignmentDFF) {
        this.assignmentDFF = assignmentDFF;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getJobId() 
    {
        return jobId;
    }

    public void setJobId(String jobId) 
    {
        this.jobId = jobId;
    }
    
    public String getDepartmentId() 
    {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) 
    {
        this.departmentId = departmentId;
    }
    
    public String getLocationId() 
    {
        return locationId;
    }

    public void setLocationId(String locationId) 
    {
        this.locationId = locationId;
    }
    
    public String getAssignmentNumber() {
        return assignmentNumber;
    }

    public void setAssignmentNumber(String assignmentNumber) {
        this.assignmentNumber = assignmentNumber;
    }

    public String getPrimaryAssignmentFlag() {
        return primaryAssignmentFlag;
    }

    public void setPrimaryAssignmentFlag(String primaryAssignmentFlag) {
        this.primaryAssignmentFlag = primaryAssignmentFlag;
    }
    
    
    public String getEffectiveEndDate()
    {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(String effectiveEndDate) 
    {
        this.effectiveEndDate = effectiveEndDate;
    }
    
    
    public String getEffectiveStartDate()
    {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(String effectiveStartDate) 
    {
        this.effectiveStartDate = effectiveStartDate;
    }

    public String getAssignmentProjectedEndDate() {
        return assignmentProjectedEndDate;
    }

    public void setAssignmentProjectedEndDate(String assignmentProjectedEndDate) {
        this.assignmentProjectedEndDate = assignmentProjectedEndDate;
    }

    public String getRegularTemporary() {
        return regularTemporary;
    }

    public void setRegularTemporary(String regularTemporary) {
        this.regularTemporary = regularTemporary;
    }
    
    public String getFullPartTime()
    {
        return fullPartTime;
    }

    public void setFullPartTime(String fullPartTime) 
    {
        this.fullPartTime = fullPartTime;
    }
    
    public String getLegalEntityId()
    {
        return legalEntityId;
    }

    public void setLegalEntityId(String legalEntityId) 
    {
        this.legalEntityId = legalEntityId;
    }
    
}
