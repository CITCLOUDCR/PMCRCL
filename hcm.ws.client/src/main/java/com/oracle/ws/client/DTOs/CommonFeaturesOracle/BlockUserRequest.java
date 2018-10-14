package com.oracle.ws.client.DTOs.CommonFeaturesOracle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class BlockUserRequest {

    @JsonProperty("schemas")
    private ArrayList<String> schemas;

    @JsonProperty("active")
    private boolean active;

    public BlockUserRequest(){
        schemas = new ArrayList<String>(){{add("urn:scim:schemas:core:2.0:User");}};
    }

    public ArrayList<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(ArrayList<String> schemas) {
        this.schemas = schemas;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
