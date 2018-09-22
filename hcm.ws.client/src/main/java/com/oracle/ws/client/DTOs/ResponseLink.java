package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseLink {

    @JsonProperty("rel")
    private String rel;
    @JsonProperty("href")
    private String href;
    @JsonProperty("name")
    private String name;
    @JsonProperty("kind")
    private String kind;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


}
