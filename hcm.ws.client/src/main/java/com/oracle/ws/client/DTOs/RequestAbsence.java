package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) //must be there all times most likely
public class RequestAbsence
{
	 @JsonProperty("personNumber")
	 private String PersonNumber;
	
	 @JsonProperty("employer")
	 private String Employer;
	 
	 @JsonProperty("absenceType")
	 private String AbsenceType;
	 
	 @JsonProperty("startDate")
	 private String StartDate;
	 
	 @JsonProperty("startTime")
	 private String StartTime;
	 
	 @JsonProperty("endDate")
	 private String EndDate;
	
	 @JsonProperty("endTime")
	 private String EndTime;
	 
	 @JsonProperty("absenceStatusCd")
	 private String AbsenceStatusCd;
	 
	 public String getAbsenceType()
	 {
	   return AbsenceType;
	 }

	 public void setAbsenceType(String AbsenceType)
	 {
	     this.AbsenceType = AbsenceType;
	 }
	 	 
	 public String getEmployer()
	 {
	   return Employer;
	 }

	 public void setEmployer(String Employer)
	 {
	     this.Employer = Employer;
	 }
	 
	 public String getPersonNumber()
	 {
	   return PersonNumber;
	 }

	 public void setPersonNumber(String PersonNumber)
	 {
	     this.PersonNumber = PersonNumber;
	 }
	 
	 public String getStartDate()
	 {
	   return StartDate;
	 }

	 public void setStartDate(String StartDate)
	 {
	     this.StartDate = StartDate;
	 }
	 
	 public String getStartTime()
	 {
	   return StartTime;
	 }

	 public void setStartTime(String StartTime)
	 {
	     this.StartTime = StartTime;
	 }
	 
	 public String getEndDate()
	 {
	   return EndDate;
	 }

	 public void setEndDate(String EndDate)
	 {
	     this.EndDate = EndDate;
	 }
	 
	 public String getAbsenceStatusCd()
	 {
	   return AbsenceStatusCd;
	 }

	 public void setAbsenceStatusCd(String AbsenceStatusCd)
	 {
	     this.AbsenceStatusCd = AbsenceStatusCd;
	 }
	 
	 public String getEndTime()
	 {
	   return EndTime;
	 }

	 public void setEndTime(String EndTime)
	 {
	     this.EndTime = EndTime;
	 }
	 
}
