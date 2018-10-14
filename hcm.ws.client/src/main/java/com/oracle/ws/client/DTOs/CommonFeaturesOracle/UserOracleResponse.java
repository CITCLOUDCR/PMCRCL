package com.oracle.ws.client.DTOs.CommonFeaturesOracle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class UserOracleResponse {

    @JsonProperty("Resources")
    private ArrayList<UserOracleResources> resourses;

    public UserOracleResponse(){
        resourses = new ArrayList<UserOracleResources>();
    }

    public ArrayList<UserOracleResources> getResourses() {
        return resourses;
    }

    public void setResourses(ArrayList<UserOracleResources> resourses) {
        this.resourses = resourses;
    }
}
