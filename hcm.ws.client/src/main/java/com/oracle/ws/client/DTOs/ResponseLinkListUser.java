package com.oracle.ws.client.DTOs;

import java.util.ArrayList;
import java.util.List;

public class ResponseLinkListUser {

    private List<ResponseLinkUser> items;

    public ResponseLinkListUser() {
        items = new ArrayList<ResponseLinkUser>();
    }

    public List<ResponseLinkUser> getItems() {
        return items;
    }

    public void setItems(List<ResponseLinkUser> items) {
        this.items = items;
    }
}
