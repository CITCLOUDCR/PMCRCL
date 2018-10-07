package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
public class ResponseRole {

    @JsonProperty("RoleName")
    public String roleName;
    @JsonProperty("RoleCommonName")
    public String roleCommonName;
    @JsonProperty("RoleGUID")
    public String roleGUID;
    @JsonProperty("StartDate")
    public String startDate;
    @JsonProperty("EndDate")
    public String endDate;
    @JsonProperty("CreationDate")
    public String creationDate;
    @JsonProperty("LastUpdateDate")
    public String lastUpdateDate;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCommonName() {
        return roleCommonName;
    }

    public void setRoleCommonName(String roleCommonName) {
        this.roleCommonName = roleCommonName;
    }

    public String getRoleGUID() {
        return roleGUID;
    }

    public void setRoleGUID(String roleGUID) {
        this.roleGUID = roleGUID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

}
