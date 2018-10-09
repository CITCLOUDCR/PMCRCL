package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class PatchAssignment {

    @JsonProperty("PositionId")
    private String positionId;
    @JsonProperty("JobId")
    private String jobId;
    @JsonProperty("DepartmentId")
    private String departmentId;
//    @JsonProperty("LocationId")
//    private String locationId;

//    @JsonProperty("PrimaryAssignmentFlag")
//    private String primaryAssignmentFlag;

    @JsonProperty("AssignmentName")
    private String assignmentName;
    @JsonProperty("BusinessUnitId")
    private String businessUnitId;

//    @JsonProperty("AssignmentCategory")
//    private String assignmentCategory;


    @JsonProperty("SalaryAmount")
    private String salaryAmount;

    @JsonProperty("ActionCode")
    private String actionCode;
    @JsonProperty("ActionReasonCode")
    private String actionReasonCode;

    @JsonProperty("assignmentDFF")
    private List<RequestAssignmentDFF> assignmentDFF = null;


    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

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

    public String getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(String salaryAmount) {
        this.salaryAmount = salaryAmount;
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

    public List<RequestAssignmentDFF> getAssignmentDFF() {
        return assignmentDFF;
    }

    public void setAssignmentDFF(List<RequestAssignmentDFF> assignmentDFF) {
        this.assignmentDFF = assignmentDFF;
    }
//    @JsonProperty("AssignmentStatus")
//    private String assignmentStatus;

//    @JsonProperty("assignmentDFF")
//    private List<RequestAssignmentDFF> assignmentDFF = null;


}
