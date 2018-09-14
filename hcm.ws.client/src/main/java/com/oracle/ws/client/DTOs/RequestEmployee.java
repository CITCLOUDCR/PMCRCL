package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class RequestEmployee {
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("PreviousLastName")
    private String previousLastName;
    @JsonProperty("DisplayName")
    private String displayName;
    @JsonProperty("PersonNumber")
    private String personNumber;
    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("DateOfBirth")
    private String dateOfBirth;
    @JsonProperty("LegalEntityId")
    private String legalEntityId;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("MaritalStatus")
    private String maritalStatus;
    @JsonProperty("NationalIdType")
    private String nationalIdType;
    @JsonProperty("NationalId")
    private String nationalId;
    @JsonProperty("NationalIdCountry")
    private String nationalIdCountry;
    @JsonProperty("EffectiveStartDate")
    private String effectiveStartDate;
    @JsonProperty("UserName")
    private String userName;
    @JsonProperty("assignments")
    private List<RequestAssignment> assignments = null;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLegalEntityId() {
        return legalEntityId;
    }

    public void setLegalEntityId(String legalEntityId) {
        this.legalEntityId = legalEntityId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNationalIdType() {
        return nationalIdType;
    }

    public void setNationalIdType(String nationalIdType) {
        this.nationalIdType = nationalIdType;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getNationalIdCountry() {
        return nationalIdCountry;
    }

    public void setNationalIdCountry(String nationalIdCountry) {
        this.nationalIdCountry = nationalIdCountry;
    }

    public String getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(String effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<RequestAssignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<RequestAssignment> assignments) {
        this.assignments = assignments;
    }
}
