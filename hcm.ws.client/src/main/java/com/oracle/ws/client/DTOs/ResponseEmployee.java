package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class ResponseEmployee {
    @JsonProperty("Salutation")
    private String salutation;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("MiddleName")
    private String middleName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("PreviousLastName")
    private String previousLastName;
    @JsonProperty("NameSuffix")
    private String nameSuffix;
    @JsonProperty("DisplayName")
    private String displayName;
    @JsonProperty("PreferredName")
    private String preferredName;
    @JsonProperty("Honors")
    private String honors;
    @JsonProperty("CorrespondenceLanguage")
    private String correspondenceLanguage;
    @JsonProperty("PersonNumber")
    private String personNumber;
    @JsonProperty("WorkPhoneCountryCode")
    private String workPhoneCountryCode;
    @JsonProperty("WorkPhoneAreaCode")
    private String workPhoneAreaCode;
    @JsonProperty("WorkPhoneNumber")
    private String workPhoneNumber;
    @JsonProperty("WorkPhoneExtension")
    private String workPhoneExtension;
    @JsonProperty("WorkFaxCountryCode")
    private String workFaxCountryCode;
    @JsonProperty("WorkFaxAreaCode")
    private String workFaxAreaCode;
    @JsonProperty("WorkFaxNumber")
    private String workFaxNumber;
    @JsonProperty("WorkFaxExtension")
    private String workFaxExtension;
    @JsonProperty("WorkMobilePhoneCountryCode")
    private String workMobilePhoneCountryCode;
    @JsonProperty("WorkMobilePhoneAreaCode")
    private String workMobilePhoneAreaCode;
    @JsonProperty("WorkMobilePhoneNumber")
    private String workMobilePhoneNumber;
    @JsonProperty("WorkMobilePhoneExtension")
    private String workMobilePhoneExtension;
    @JsonProperty("HomePhoneCountryCode")
    private String homePhoneCountryCode;
    @JsonProperty("HomePhoneAreaCode")
    private String homePhoneAreaCode;
    @JsonProperty("HomePhoneNumber")
    private String homePhoneNumber;
    @JsonProperty("HomePhoneExtension")
    private String homePhoneExtension;
    @JsonProperty("HomeFaxCountryCode")
    private String homeFaxCountryCode;
    @JsonProperty("HomeFaxAreaCode")
    private String homeFaxAreaCode;
    @JsonProperty("HomeFaxNumber")
    private String homeFaxNumber;
    @JsonProperty("HomeFaxExtension")
    private String homeFaxExtension;
    @JsonProperty("WorkEmail")
    private String workEmail;
    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("AddressLine2")
    private String addressLine2;
    @JsonProperty("AddressLine3")
    private String addressLine3;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Region")
    private String region;
    @JsonProperty("Region2")
    private String region2;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonProperty("DateOfBirth")
    private String dateOfBirth;
    @JsonProperty("Ethnicity")
    private String ethnicity;
    @JsonProperty("ProjectedTerminationDate")
    private String projectedTerminationDate;
    @JsonProperty("LegalEntityId")
    private String legalEntityId;
    @JsonProperty("HireDate")
    private String hireDate;
    @JsonProperty("TerminationDate")
    private String terminationDate;
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
    @JsonProperty("NationalIdExpirationDate")
    private String nationalIdExpirationDate;
    @JsonProperty("PersonId")
    private String personId;
    @JsonProperty("EffectiveStartDate")
    private String effectiveStartDate;
    @JsonProperty("UserName")
    private String userName;
    @JsonProperty("CitizenshipId")
    private String citizenshipId;
    @JsonProperty("CitizenshipStatus")
    private String citizenshipStatus;
    @JsonProperty("CitizenshipLegislationCode")
    private String citizenshipLegislationCode;
    @JsonProperty("CitizenshipToDate")
    private String citizenshipToDate;
    @JsonProperty("Religion")
    private String religion;
    @JsonProperty("ReligionId")
    private String religionId;
    @JsonProperty("PassportIssueDate")
    private String passportIssueDate;
    @JsonProperty("PassportNumber")
    private String passportNumber;
    @JsonProperty("PassportIssuingCountry")
    private String passportIssuingCountry;
    @JsonProperty("PassportId")
    private String passportId;
    @JsonProperty("PassportExpirationDate")
    private String passportExpirationDate;
    @JsonProperty("LicenseNumber")
    private String licenseNumber;
    @JsonProperty("DriversLicenseExpirationDate")
    private String driversLicenseExpirationDate;
    @JsonProperty("DriversLicenseIssuingCountry")
    private String driversLicenseIssuingCountry;
    @JsonProperty("DriversLicenseId")
    private String driversLicenseId;
    @JsonProperty("MilitaryVetStatus")
    private String militaryVetStatus;
    @JsonProperty("CreationDate")
    private String creationDate;
    @JsonProperty("LastUpdateDate")
    private String lastUpdateDate;
    @JsonProperty("WorkerType")
    private String workerType;





    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getHonors() {
        return honors;
    }

    public void setHonors(String honors) {
        this.honors = honors;
    }

    public String getCorrespondenceLanguage() {
        return correspondenceLanguage;
    }

    public void setCorrespondenceLanguage(String correspondenceLanguage) {
        this.correspondenceLanguage = correspondenceLanguage;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getWorkPhoneCountryCode() {
        return workPhoneCountryCode;
    }

    public void setWorkPhoneCountryCode(String workPhoneCountryCode) {
        this.workPhoneCountryCode = workPhoneCountryCode;
    }

    public String getWorkPhoneAreaCode() {
        return workPhoneAreaCode;
    }

    public void setWorkPhoneAreaCode(String workPhoneAreaCode) {
        this.workPhoneAreaCode = workPhoneAreaCode;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public String getWorkPhoneExtension() {
        return workPhoneExtension;
    }

    public void setWorkPhoneExtension(String workPhoneExtension) {
        this.workPhoneExtension = workPhoneExtension;
    }

    public String getWorkFaxCountryCode() {
        return workFaxCountryCode;
    }

    public void setWorkFaxCountryCode(String workFaxCountryCode) {
        this.workFaxCountryCode = workFaxCountryCode;
    }

    public String getWorkFaxAreaCode() {
        return workFaxAreaCode;
    }

    public void setWorkFaxAreaCode(String workFaxAreaCode) {
        this.workFaxAreaCode = workFaxAreaCode;
    }

    public String getWorkFaxNumber() {
        return workFaxNumber;
    }

    public void setWorkFaxNumber(String workFaxNumber) {
        this.workFaxNumber = workFaxNumber;
    }

    public String getWorkFaxExtension() {
        return workFaxExtension;
    }

    public void setWorkFaxExtension(String workFaxExtension) {
        this.workFaxExtension = workFaxExtension;
    }

    public String getWorkMobilePhoneCountryCode() {
        return workMobilePhoneCountryCode;
    }

    public void setWorkMobilePhoneCountryCode(String workMobilePhoneCountryCode) {
        this.workMobilePhoneCountryCode = workMobilePhoneCountryCode;
    }

    public String getWorkMobilePhoneAreaCode() {
        return workMobilePhoneAreaCode;
    }

    public void setWorkMobilePhoneAreaCode(String workMobilePhoneAreaCode) {
        this.workMobilePhoneAreaCode = workMobilePhoneAreaCode;
    }

    public String getWorkMobilePhoneNumber() {
        return workMobilePhoneNumber;
    }

    public void setWorkMobilePhoneNumber(String workMobilePhoneNumber) {
        this.workMobilePhoneNumber = workMobilePhoneNumber;
    }

    public String getWorkMobilePhoneExtension() {
        return workMobilePhoneExtension;
    }

    public void setWorkMobilePhoneExtension(String workMobilePhoneExtension) {
        this.workMobilePhoneExtension = workMobilePhoneExtension;
    }

    public String getHomePhoneCountryCode() {
        return homePhoneCountryCode;
    }

    public void setHomePhoneCountryCode(String homePhoneCountryCode) {
        this.homePhoneCountryCode = homePhoneCountryCode;
    }

    public String getHomePhoneAreaCode() {
        return homePhoneAreaCode;
    }

    public void setHomePhoneAreaCode(String homePhoneAreaCode) {
        this.homePhoneAreaCode = homePhoneAreaCode;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getHomePhoneExtension() {
        return homePhoneExtension;
    }

    public void setHomePhoneExtension(String homePhoneExtension) {
        this.homePhoneExtension = homePhoneExtension;
    }

    public String getHomeFaxCountryCode() {
        return homeFaxCountryCode;
    }

    public void setHomeFaxCountryCode(String homeFaxCountryCode) {
        this.homeFaxCountryCode = homeFaxCountryCode;
    }

    public String getHomeFaxAreaCode() {
        return homeFaxAreaCode;
    }

    public void setHomeFaxAreaCode(String homeFaxAreaCode) {
        this.homeFaxAreaCode = homeFaxAreaCode;
    }

    public String getHomeFaxNumber() {
        return homeFaxNumber;
    }

    public void setHomeFaxNumber(String homeFaxNumber) {
        this.homeFaxNumber = homeFaxNumber;
    }

    public String getHomeFaxExtension() {
        return homeFaxExtension;
    }

    public void setHomeFaxExtension(String homeFaxExtension) {
        this.homeFaxExtension = homeFaxExtension;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion2() {
        return region2;
    }

    public void setRegion2(String region2) {
        this.region2 = region2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getProjectedTerminationDate() {
        return projectedTerminationDate;
    }

    public void setProjectedTerminationDate(String projectedTerminationDate) {
        this.projectedTerminationDate = projectedTerminationDate;
    }

    public String getLegalEntityId() {
        return legalEntityId;
    }

    public void setLegalEntityId(String legalEntityId) {
        this.legalEntityId = legalEntityId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(String terminationDate) {
        this.terminationDate = terminationDate;
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

    public String getNationalIdExpirationDate() {
        return nationalIdExpirationDate;
    }

    public void setNationalIdExpirationDate(String nationalIdExpirationDate) {
        this.nationalIdExpirationDate = nationalIdExpirationDate;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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

    public String getCitizenshipId() {
        return citizenshipId;
    }

    public void setCitizenshipId(String citizenshipId) {
        this.citizenshipId = citizenshipId;
    }

    public String getCitizenshipStatus() {
        return citizenshipStatus;
    }

    public void setCitizenshipStatus(String citizenshipStatus) {
        this.citizenshipStatus = citizenshipStatus;
    }

    public String getCitizenshipLegislationCode() {
        return citizenshipLegislationCode;
    }

    public void setCitizenshipLegislationCode(String citizenshipLegislationCode) {
        this.citizenshipLegislationCode = citizenshipLegislationCode;
    }

    public String getCitizenshipToDate() {
        return citizenshipToDate;
    }

    public void setCitizenshipToDate(String citizenshipToDate) {
        this.citizenshipToDate = citizenshipToDate;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getReligionId() {
        return religionId;
    }

    public void setReligionId(String religionId) {
        this.religionId = religionId;
    }

    public String getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(String passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportIssuingCountry() {
        return passportIssuingCountry;
    }

    public void setPassportIssuingCountry(String passportIssuingCountry) {
        this.passportIssuingCountry = passportIssuingCountry;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getPassportExpirationDate() {
        return passportExpirationDate;
    }

    public void setPassportExpirationDate(String passportExpirationDate) {
        this.passportExpirationDate = passportExpirationDate;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getDriversLicenseExpirationDate() {
        return driversLicenseExpirationDate;
    }

    public void setDriversLicenseExpirationDate(String driversLicenseExpirationDate) {
        this.driversLicenseExpirationDate = driversLicenseExpirationDate;
    }

    public String getDriversLicenseIssuingCountry() {
        return driversLicenseIssuingCountry;
    }

    public void setDriversLicenseIssuingCountry(String driversLicenseIssuingCountry) {
        this.driversLicenseIssuingCountry = driversLicenseIssuingCountry;
    }

    public String getDriversLicenseId() {
        return driversLicenseId;
    }

    public void setDriversLicenseId(String driversLicenseId) {
        this.driversLicenseId = driversLicenseId;
    }

    public String getMilitaryVetStatus() {
        return militaryVetStatus;
    }

    public void setMilitaryVetStatus(String militaryVetStatus) {
        this.militaryVetStatus = militaryVetStatus;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getWorkerType() {
        return workerType;
    }

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }
}
