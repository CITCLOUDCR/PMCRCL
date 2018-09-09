package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee implements Serializable {
    @JsonProperty("Salutation")
    private String salutation;
    @JsonProperty("LegalEntityId")
    private String legalEntityId;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("MiddleName")
    private String middleName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("DisplayName")
    private String displayName;
    @JsonProperty("WorkPhoneCountryCode")
    private String workPhoneCountryCode;
    @JsonProperty("WorkPhoneAreaCode")
    private String workPhoneAreaCode;
    @JsonProperty("WorkPhoneNumber")
    private String workPhoneNumber;
    @JsonProperty("WorkMobilePhoneCountryCode")
    private String workMobilePhoneCountryCode;
    @JsonProperty("WorkMobilePhoneAreaCode")
    private String workMobilePhoneAreaCode;
    @JsonProperty("WorkMobilePhoneNumber")
    private String workMobilePhoneNumber;
    @JsonProperty("HomeFaxCountryCode")
    private String homeFaxCountryCode;
    @JsonProperty("HomeFaxAreaCode")
    private String homeFaxAreaCode;
    @JsonProperty("HomeFaxNumber")
    private String homeFaxNumber;
    @JsonProperty("HomePhoneCountryCode")
    private String homePhoneCountryCode;
    @JsonProperty("HomePhoneAreaCode")
    private String homePhoneAreaCode;
    @JsonProperty("HomePhoneNumber")
    private String homePhoneNumber;
    @JsonProperty("NameSuffix")
    private String nameSuffix;
    @JsonProperty("NationalIdExpirationDate")
    private String nationalIdExpirationDate;
    @JsonProperty("WorkEmail")
    private String workEmail;
    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("AddressLine2")
    private String addressLine2;
    @JsonProperty("AddressLine3")
    private Object addressLine3;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Region")
    private String region;
    @JsonProperty("Region2")
    private Object region2;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonProperty("CitizenshipLegislationCode")
    private String citizenshipLegislationCode;
    @JsonProperty("PassportNumber")
    private String passportNumber;
    @JsonProperty("PassportIssueDate")
    private String passportIssueDate;
    @JsonProperty("Religion")
    private String religion;
    @JsonProperty("LicenseNumber")
    private String licenseNumber;
    @JsonProperty("DateOfBirth")
    private String dateOfBirth;
    @JsonProperty("Ethnicity")
    private String ethnicity;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("MaritalStatus")
    private String maritalStatus;
    @JsonProperty("NationalIdCountry")
    private String nationalIdCountry;
    @JsonProperty("NationalId")
    private String nationalId;
    @JsonProperty("NationalIdType")
    private String nationalIdType;
    @JsonProperty("UserName")
    private String userName;
    @JsonProperty("CreationDate")
    private String creationDate;
    @JsonProperty("LastUpdateDate")
    private String lastUpdateDate;

//    "CreationDate" : "2016-04-13T21:44:24-07:00",
//            "LastUpdateDate" : "2016-04-13T21:44:25-07:00",
//
//    @JsonProperty("assignments")
//    private List<Assignment> assignments = null;

    @JsonProperty("Salutation")
    public String getSalutation() {
        return salutation;
    }

    @JsonProperty("Salutation")
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    @JsonProperty("LegalEntityId")
    public String getLegalEntityId() {
        return legalEntityId;
    }

    @JsonProperty("LegalEntityId")
    public void setLegalEntityId(String legalEntityId) {
        this.legalEntityId = legalEntityId;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("MiddleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("MiddleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("DisplayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("DisplayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("WorkPhoneCountryCode")
    public String getWorkPhoneCountryCode() {
        return workPhoneCountryCode;
    }

    @JsonProperty("WorkPhoneCountryCode")
    public void setWorkPhoneCountryCode(String workPhoneCountryCode) {
        this.workPhoneCountryCode = workPhoneCountryCode;
    }

    @JsonProperty("WorkPhoneAreaCode")
    public String getWorkPhoneAreaCode() {
        return workPhoneAreaCode;
    }

    @JsonProperty("WorkPhoneAreaCode")
    public void setWorkPhoneAreaCode(String workPhoneAreaCode) {
        this.workPhoneAreaCode = workPhoneAreaCode;
    }

    @JsonProperty("WorkPhoneNumber")
    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    @JsonProperty("WorkPhoneNumber")
    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @JsonProperty("WorkMobilePhoneCountryCode")
    public String getWorkMobilePhoneCountryCode() {
        return workMobilePhoneCountryCode;
    }

    @JsonProperty("WorkMobilePhoneCountryCode")
    public void setWorkMobilePhoneCountryCode(String workMobilePhoneCountryCode) {
        this.workMobilePhoneCountryCode = workMobilePhoneCountryCode;
    }

    @JsonProperty("WorkMobilePhoneAreaCode")
    public String getWorkMobilePhoneAreaCode() {
        return workMobilePhoneAreaCode;
    }

    @JsonProperty("WorkMobilePhoneAreaCode")
    public void setWorkMobilePhoneAreaCode(String workMobilePhoneAreaCode) {
        this.workMobilePhoneAreaCode = workMobilePhoneAreaCode;
    }

    @JsonProperty("WorkMobilePhoneNumber")
    public String getWorkMobilePhoneNumber() {
        return workMobilePhoneNumber;
    }

    @JsonProperty("WorkMobilePhoneNumber")
    public void setWorkMobilePhoneNumber(String workMobilePhoneNumber) {
        this.workMobilePhoneNumber = workMobilePhoneNumber;
    }

    @JsonProperty("HomeFaxCountryCode")
    public String getHomeFaxCountryCode() {
        return homeFaxCountryCode;
    }

    @JsonProperty("HomeFaxCountryCode")
    public void setHomeFaxCountryCode(String homeFaxCountryCode) {
        this.homeFaxCountryCode = homeFaxCountryCode;
    }

    @JsonProperty("HomeFaxAreaCode")
    public String getHomeFaxAreaCode() {
        return homeFaxAreaCode;
    }

    @JsonProperty("HomeFaxAreaCode")
    public void setHomeFaxAreaCode(String homeFaxAreaCode) {
        this.homeFaxAreaCode = homeFaxAreaCode;
    }

    @JsonProperty("HomeFaxNumber")
    public String getHomeFaxNumber() {
        return homeFaxNumber;
    }

    @JsonProperty("HomeFaxNumber")
    public void setHomeFaxNumber(String homeFaxNumber) {
        this.homeFaxNumber = homeFaxNumber;
    }

    @JsonProperty("HomePhoneCountryCode")
    public String getHomePhoneCountryCode() {
        return homePhoneCountryCode;
    }

    @JsonProperty("HomePhoneCountryCode")
    public void setHomePhoneCountryCode(String homePhoneCountryCode) {
        this.homePhoneCountryCode = homePhoneCountryCode;
    }

    @JsonProperty("HomePhoneAreaCode")
    public String getHomePhoneAreaCode() {
        return homePhoneAreaCode;
    }

    @JsonProperty("HomePhoneAreaCode")
    public void setHomePhoneAreaCode(String homePhoneAreaCode) {
        this.homePhoneAreaCode = homePhoneAreaCode;
    }

    @JsonProperty("HomePhoneNumber")
    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    @JsonProperty("HomePhoneNumber")
    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    @JsonProperty("NameSuffix")
    public String getNameSuffix() {
        return nameSuffix;
    }

    @JsonProperty("NameSuffix")
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    @JsonProperty("NationalIdExpirationDate")
    public String getNationalIdExpirationDate() {
        return nationalIdExpirationDate;
    }

    @JsonProperty("NationalIdExpirationDate")
    public void setNationalIdExpirationDate(String nationalIdExpirationDate) {
        this.nationalIdExpirationDate = nationalIdExpirationDate;
    }

    @JsonProperty("WorkEmail")
    public String getWorkEmail() {
        return workEmail;
    }

    @JsonProperty("WorkEmail")
    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    @JsonProperty("AddressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("AddressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("AddressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("AddressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("AddressLine3")
    public Object getAddressLine3() {
        return addressLine3;
    }

    @JsonProperty("AddressLine3")
    public void setAddressLine3(Object addressLine3) {
        this.addressLine3 = addressLine3;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("Region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("Region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("Region2")
    public Object getRegion2() {
        return region2;
    }

    @JsonProperty("Region2")
    public void setRegion2(Object region2) {
        this.region2 = region2;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("CitizenshipLegislationCode")
    public String getCitizenshipLegislationCode() {
        return citizenshipLegislationCode;
    }

    @JsonProperty("CitizenshipLegislationCode")
    public void setCitizenshipLegislationCode(String citizenshipLegislationCode) {
        this.citizenshipLegislationCode = citizenshipLegislationCode;
    }

    @JsonProperty("PassportNumber")
    public String getPassportNumber() {
        return passportNumber;
    }

    @JsonProperty("PassportNumber")
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @JsonProperty("PassportIssueDate")
    public String getPassportIssueDate() {
        return passportIssueDate;
    }

    @JsonProperty("PassportIssueDate")
    public void setPassportIssueDate(String passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    @JsonProperty("Religion")
    public String getReligion() {
        return religion;
    }

    @JsonProperty("Religion")
    public void setReligion(String religion) {
        this.religion = religion;
    }

    @JsonProperty("LicenseNumber")
    public String getLicenseNumber() {
        return licenseNumber;
    }

    @JsonProperty("LicenseNumber")
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @JsonProperty("DateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("DateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("Ethnicity")
    public String getEthnicity() {
        return ethnicity;
    }

    @JsonProperty("Ethnicity")
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    @JsonProperty("Gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("Gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("MaritalStatus")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    @JsonProperty("MaritalStatus")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @JsonProperty("NationalIdCountry")
    public String getNationalIdCountry() {
        return nationalIdCountry;
    }

    @JsonProperty("NationalIdCountry")
    public void setNationalIdCountry(String nationalIdCountry) {
        this.nationalIdCountry = nationalIdCountry;
    }

    @JsonProperty("NationalId")
    public String getNationalId() {
        return nationalId;
    }

    @JsonProperty("NationalId")
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    @JsonProperty("NationalIdType")
    public String getNationalIdType() {
        return nationalIdType;
    }

    @JsonProperty("NationalIdType")
    public void setNationalIdType(String nationalIdType) {
        this.nationalIdType = nationalIdType;
    }

    @JsonProperty("UserName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("UserName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("CreationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("CreationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("LastUpdateDate")
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    @JsonProperty("LastUpdateDate")
    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

//    @JsonProperty("assignments")
//    public List<Assignment> getAssignments() {
//        return assignments;
//    }
//
//    @JsonProperty("assignments")
//    public void setAssignments(List<Assignment> assignments) {
//        this.assignments = assignments;
//    }


//    "Salutation" : null,
//            "FirstName" : "MarÃ­a",
//            "MiddleName" : "Ibel",
//            "LastName" : "Herrera",
//            "PreviousLastName" : null,
//            "NameSuffix" : null,
//            "DisplayName" : "MarÃ­a Ibel Herrera Cordero",
//            "PreferredName" : null,
//            "Honors" : null,
//            "CorrespondenceLanguage" : null,
//            "PersonNumber" : "1669",
//            "WorkPhoneCountryCode" : null,
//            "WorkPhoneAreaCode" : null,
//            "WorkPhoneNumber" : null,
//            "WorkPhoneExtension" : null,
//            "WorkFaxCountryCode" : null,
//            "WorkFaxAreaCode" : null,
//            "WorkFaxNumber" : null,
//            "WorkFaxExtension" : null,
//            "WorkMobilePhoneCountryCode" : null,
//            "WorkMobilePhoneAreaCode" : null,
//            "WorkMobilePhoneNumber" : null,
//            "WorkMobilePhoneExtension" : null,
//            "HomePhoneCountryCode" : null,
//            "HomePhoneAreaCode" : null,
//            "HomePhoneNumber" : null,
//            "HomePhoneExtension" : null,
//            "HomeFaxCountryCode" : null,
//            "HomeFaxAreaCode" : null,
//            "HomeFaxNumber" : null,
//            "HomeFaxExtension" : null,
//            "WorkEmail" : "miherrerac@purdymo.com",
//            "AddressLine1" : "115 mts Sur de los tanques de AYA en Junquillo arriba.",
//            "AddressLine2" : null,
//            "AddressLine3" : null,
//            "City" : "Santiago",
//            "Region" : null,
//            "Region2" : "Puriscal",
//            "Country" : "CR",
//            "PostalCode" : null,
//            "DateOfBirth" : "1967-10-09",
//            "Ethnicity" : null,
//            "ProjectedTerminationDate" : null,
//            "LegalEntityId" : 300000001545660,
//            "HireDate" : "2016-06-01",
//            "TerminationDate" : null,
//            "Gender" : "F",
//            "MaritalStatus" : "D",
//            "NationalIdType" : null,
//            "NationalId" : null,
//            "NationalIdCountry" : null,
//            "NationalIdExpirationDate" : null,
//            "PersonId" : 300000001619709,
//            "EffectiveStartDate" : "2016-06-01",
//            "UserName" : "MARIA.HERRERAC",
//            "CitizenshipId" : null,
//            "CitizenshipStatus" : null,
//            "CitizenshipLegislationCode" : null,
//            "CitizenshipToDate" : null,
//            "Religion" : null,
//            "ReligionId" : null,
//            "PassportIssueDate" : null,
//            "PassportNumber" : null,
//            "PassportIssuingCountry" : null,
//            "PassportId" : null,
//            "PassportExpirationDate" : null,
//            "LicenseNumber" : null,
//            "DriversLicenseExpirationDate" : null,
//            "DriversLicenseIssuingCountry" : null,
//            "DriversLicenseId" : null,
//            "MilitaryVetStatus" : "N",
//            "CreationDate" : "2017-10-04T17:19:00+00:00",
//            "LastUpdateDate" : "2017-10-04T17:19:01.617+00:00",
//            "WorkerType" : "E",

//    {
//            "LegalEntityId" : "300100003448002",
//            "FirstName": "Miranda",
//            "MiddleName": "Kyle",
//            "LastName": "Rachell",
//            "DisplayName" : "Miranda Kyle Rachell",
//            "WorkPhoneCountryCode" : "1",
//            "WorkPhoneNumber" : "781-993-0000",
//            "WorkMobilePhoneCountryCode" : "1",
//            "WorkMobilePhoneNumber" : "581-993-0000",
//            "HomePhoneCountryCode":"1",
//            "HomePhoneNumber":"122993333",
//            "NationalIdExpirationDate" : "4712-12-31",
//            "WorkEmail" : "miranda.kyle@oracle.com",
//            "AddressLine1" : "Oracle Corporation,
//            "AddressLine2" : "500 Oracle Parkway",
//            "AddressLine3" : null,
//            "City" : "San Francisco",
//            "Region" : "California",
//            "Region2" : null,
//            "Country" : "US",
//            "CitizenshipLegislationCode" : "US",
//            "LicenseNumber" : "9955500858",
//            "DateOfBirth": "1990-09-09",
//            "Gender" : "F",
//            "MaritalStatus" : "S",
//            "NationalIdCountry": "US",
//            "NationalId": "554-44-3025",
//            "NationalIdType": "SSN",
//            "UserName":"rachell",
//
//
//            "assignments" :
//[
//
//        {
//
//            "AssignmentName": "Rachell_Assignment_1",
//                "BusinessUnitId" : "202",
//                "JobId" : "18",
//                "WorkerCategory" : "WC",
//                "AssignmentCategory" : "FR",
//                "WorkingAtHome" : "N",
//                "WorkingAsManager" : "N",
//                "SalaryCode" : "H",
//                "WorkingHours" : "12",
//                "Frequency" : "D",
//                "SalaryAmount" : "100000",
//                "SalaryBasisId" : "100010024999994",
//                "ManagerAssignmentId" : "389",
//                "ManagerId" : "383",
//                "ActionCode" : "HIRE",
//                "ActionReasonCode" : "NEWHIRE",
//                "AssignmentStatus" : "ACTIVE",
//                "WorkTaxAddressId" : "300100011952957",
//                "ManagerType" : "LINE_MANAGER"
//        }
//
//]

//    }
}
