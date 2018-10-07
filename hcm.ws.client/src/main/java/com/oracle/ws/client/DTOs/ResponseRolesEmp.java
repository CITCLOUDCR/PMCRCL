package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class ResponseRolesEmp {

    private List<ResponseRole> items;

    public ResponseRolesEmp() {
        items = new ArrayList<ResponseRole>();
    }

    public void setItems(List<ResponseRole> items) {
        this.items = items;
    }

    public List<ResponseRole> getItems() {
        return items;
    }
}
