package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class RequestAssignment {
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
}
