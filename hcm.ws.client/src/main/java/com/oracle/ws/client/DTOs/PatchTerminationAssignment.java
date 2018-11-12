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
    private String PrimaryWorkRelationFlag;

    @JsonProperty("PrimaryAssignmentFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String PrimaryAssignmentFlag;

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
        return PrimaryWorkRelationFlag;
    }

    public void setPrimaryWorkRelationFlag(String primaryWorkRelationFlag) {
        PrimaryWorkRelationFlag = primaryWorkRelationFlag;
    }

    public String getPrimaryAssignmentFlag() {
        return PrimaryAssignmentFlag;
    }

    public void setPrimaryAssignmentFlag(String primaryAssignmentFlag) {
        PrimaryAssignmentFlag = primaryAssignmentFlag;
    }
}
