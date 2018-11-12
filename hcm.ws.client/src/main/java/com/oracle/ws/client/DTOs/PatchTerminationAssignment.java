package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatchTerminationAssignment {
    @JsonProperty("ActionCode")
    private String actionCode;
    @JsonProperty("ActionReasonCode")
    private String actionReasonCode;
    @JsonProperty("AssignmentStatus")
    private String assignmentStatus;

    @JsonProperty("PrimaryWorkRelationFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String primaryWorkRelationFlag;

    @JsonProperty("PrimaryAssignmentFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String primaryAssignmentFlag;

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

    public String getPrimaryWorkRelationFlag() {
        return primaryWorkRelationFlag;
    }

    public void setPrimaryWorkRelationFlag(String primaryWorkRelationFlag) {
        primaryWorkRelationFlag = primaryWorkRelationFlag;
    }

    public String getPrimaryAssignmentFlag() {
        return primaryAssignmentFlag;
    }

    public void setPrimaryAssignmentFlag(String primaryAssignmentFlag) {
        primaryAssignmentFlag = primaryAssignmentFlag;
    }
}
