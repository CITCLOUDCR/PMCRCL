package com.oracle.ws.client.DTOs;

import java.util.ArrayList;
import java.util.List;

public class ResponseLinkUser {
    private List<ResponseLink> links;

    public ResponseLinkUser() {
        links = new ArrayList<ResponseLink>();
    }

    public List<ResponseLink> getLinks() {
        return links;
    }

    public void setLinks(List<ResponseLink> links) {
        this.links = links;
    }
}
