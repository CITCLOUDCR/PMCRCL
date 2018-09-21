package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatchEmployee {

    @JsonProperty("MiddleName")
    private String middleName;
    @JsonProperty("WorkEmail")
    private String workEmail;
    @JsonProperty("HomePhoneNumber")
    private String homePhoneNumber;
    @JsonProperty("WorkMobilePhoneNumber")
    private String workMobilePhoneNumber;
    @JsonProperty("DriversLicenseExpirationDate")
    private String driverLicenseExpirationDate;
    @JsonProperty("DriversLicenseId")
    private String driverLicenseId;

    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("PreviousLastName")
    private String previousLastName;
    @JsonProperty("DisplayName")
    private String displayName;

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
    @JsonProperty("UserName")
    private String userName;

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getWorkMobilePhoneNumber() {
        return workMobilePhoneNumber;
    }

    public void setWorkMobilePhoneNumber(String workMobilePhoneNumber) {
        this.workMobilePhoneNumber = workMobilePhoneNumber;
    }

    public String getDriverLicenseExpirationDate() {
        return driverLicenseExpirationDate;
    }

    public void setDriverLicenseExpirationDate(String driverLicenseExpirationDate) {
        this.driverLicenseExpirationDate = driverLicenseExpirationDate;
    }

    public String getDriverLicenseId() {
        return driverLicenseId;
    }

    public void setDriverLicenseId(String driverLicenseId) {
        this.driverLicenseId = driverLicenseId;
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
