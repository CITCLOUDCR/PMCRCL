package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class Photo {
    @JsonProperty("ImageName")
    private String imageName;
    @JsonProperty("PrimaryFlag")
    private String primaryFlag;
    @JsonProperty("Image")
    private String image;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getPrimaryFlag() {
        return primaryFlag;
    }

    public void setPrimaryFlag(String primaryFlag) {
        this.primaryFlag = primaryFlag;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

//    public String getImageId() {
//        return imageId;
//    }
//
//    public void setImageId(String imageId) {
//        this.imageId = imageId;
//    }
}
