package com.oracle.ws.client.DTOs;

import java.util.ArrayList;
import java.util.List;

public class ResponseListEmployee {
    private List<ResponseEmployee> items;

    public ResponseListEmployee() {
        items = new ArrayList<ResponseEmployee>();
    }

    public List<ResponseEmployee> getItems() {
        return items;
    }

    public void setItems(List<ResponseEmployee> items) {
        this.items = items;
    }

    // standard constructor and getter/setter
}
