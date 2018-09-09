package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assignment {
    @JsonProperty("AssignmentName")
    private String assignmentName;
    @JsonProperty("BusinessUnitId")
    private String businessUnitId;
    @JsonProperty("JobId")
    private String jobId;
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
    @JsonProperty("ManagerAssignmentId")
    private String managerAssignmentId;
    @JsonProperty("ManagerId")
    private String managerId;
    @JsonProperty("ActionCode")
    private String actionCode;
    @JsonProperty("ActionReasonCode")
    private String actionReasonCode;
    @JsonProperty("AssignmentStatus")
    private String assignmentStatus;
    @JsonProperty("WorkTaxAddressId")
    private String workTaxAddressId;
    @JsonProperty("ManagerType")
    private String managerType;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AssignmentName")
    public String getAssignmentName() {
        return assignmentName;
    }

    @JsonProperty("AssignmentName")
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    @JsonProperty("BusinessUnitId")
    public String getBusinessUnitId() {
        return businessUnitId;
    }

    @JsonProperty("BusinessUnitId")
    public void setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    @JsonProperty("JobId")
    public String getJobId() {
        return jobId;
    }

    @JsonProperty("JobId")
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @JsonProperty("WorkerCategory")
    public String getWorkerCategory() {
        return workerCategory;
    }

    @JsonProperty("WorkerCategory")
    public void setWorkerCategory(String workerCategory) {
        this.workerCategory = workerCategory;
    }

    @JsonProperty("AssignmentCategory")
    public String getAssignmentCategory() {
        return assignmentCategory;
    }

    @JsonProperty("AssignmentCategory")
    public void setAssignmentCategory(String assignmentCategory) {
        this.assignmentCategory = assignmentCategory;
    }

    @JsonProperty("WorkingAtHome")
    public String getWorkingAtHome() {
        return workingAtHome;
    }

    @JsonProperty("WorkingAtHome")
    public void setWorkingAtHome(String workingAtHome) {
        this.workingAtHome = workingAtHome;
    }

    @JsonProperty("WorkingAsManager")
    public String getWorkingAsManager() {
        return workingAsManager;
    }

    @JsonProperty("WorkingAsManager")
    public void setWorkingAsManager(String workingAsManager) {
        this.workingAsManager = workingAsManager;
    }

    @JsonProperty("SalaryCode")
    public String getSalaryCode() {
        return salaryCode;
    }

    @JsonProperty("SalaryCode")
    public void setSalaryCode(String salaryCode) {
        this.salaryCode = salaryCode;
    }

    @JsonProperty("WorkingHours")
    public String getWorkingHours() {
        return workingHours;
    }

    @JsonProperty("WorkingHours")
    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    @JsonProperty("Frequency")
    public String getFrequency() {
        return frequency;
    }

    @JsonProperty("Frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("SalaryAmount")
    public String getSalaryAmount() {
        return salaryAmount;
    }

    @JsonProperty("SalaryAmount")
    public void setSalaryAmount(String salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    @JsonProperty("SalaryBasisId")
    public String getSalaryBasisId() {
        return salaryBasisId;
    }

    @JsonProperty("SalaryBasisId")
    public void setSalaryBasisId(String salaryBasisId) {
        this.salaryBasisId = salaryBasisId;
    }

    @JsonProperty("ManagerAssignmentId")
    public String getManagerAssignmentId() {
        return managerAssignmentId;
    }

    @JsonProperty("ManagerAssignmentId")
    public void setManagerAssignmentId(String managerAssignmentId) {
        this.managerAssignmentId = managerAssignmentId;
    }

    @JsonProperty("ManagerId")
    public String getManagerId() {
        return managerId;
    }

    @JsonProperty("ManagerId")
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    @JsonProperty("ActionCode")
    public String getActionCode() {
        return actionCode;
    }

    @JsonProperty("ActionCode")
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    @JsonProperty("ActionReasonCode")
    public String getActionReasonCode() {
        return actionReasonCode;
    }

    @JsonProperty("ActionReasonCode")
    public void setActionReasonCode(String actionReasonCode) {
        this.actionReasonCode = actionReasonCode;
    }

    @JsonProperty("AssignmentStatus")
    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    @JsonProperty("AssignmentStatus")
    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    @JsonProperty("WorkTaxAddressId")
    public String getWorkTaxAddressId() {
        return workTaxAddressId;
    }

    @JsonProperty("WorkTaxAddressId")
    public void setWorkTaxAddressId(String workTaxAddressId) {
        this.workTaxAddressId = workTaxAddressId;
    }

    @JsonProperty("ManagerType")
    public String getManagerType() {
        return managerType;
    }

    @JsonProperty("ManagerType")
    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }

//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
}
