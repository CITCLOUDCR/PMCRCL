package com.oracle.ws.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.ws.client.DTOs.*;
import org.apache.commons.codec.binary.Base64;
import org.omg.CORBA.TIMEOUT;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class test {

//    private RestTemplate restTemplate = new RestTemplate();

    public static void main (String[] args){
        RestTemplate restTemplate = new RestTemplate();
//        String url = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/00020000000EACED00057708000110D931C4B2130000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000165B67A680078/child/assignments";
////        String url2 = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps?q=PersonNumber="+"34056";
//        HttpEntity entity = new HttpEntity(createHeaders());
//        HttpEntity response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
//
//        response.toString();
//
//        HttpEntity response2 = restTemplate.exchange(url2, HttpMethod.GET, entity, ResponseListEmployee.class);
//
//        response2.toString();


//        POST!
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "https://hdes-test.fa.us2.oraclecloud.com/hcmRestApi/resources/latest/emps";
//
//        HttpHeaders httpHeaders = createHeaders();
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
////        HttpEntity<String> request = new HttpEntity<String>(requestJson,httpHeaders);
//
//
//
//
//        RequestEmployee emp = new RequestEmployee();
//        emp.setFirstName("Jimmi");
//        emp.setLastName("Rest");
//        emp.setPreviousLastName("Jack");
//        emp.setDisplayName("Rest Client Working");
//        emp.setPersonNumber("190505");
//        emp.setAddressLine1("Zapote");
//        emp.setCountry("CR");
//        emp.setDateOfBirth("1994-05-05");
//        //
//        emp.setLegalEntityId("300000001545611");
//        //
//        emp.setGender("M");
//        emp.setMaritalStatus("S");
//        emp.setNationalIdType("C");
//        emp.setNationalId("190515");
//        emp.setNationalIdCountry("CR");
//        emp.setEffectiveStartDate("2018-09-13");
//        emp.setUserName("JavaRest");
//
//        RequestAssignment assignment = new RequestAssignment();
//
//        assignment.setAssignmentName("rest_assignment");
//        assignment.setBusinessUnitId("300000001543620");
//        assignment.setWorkerCategory("WC");
//        assignment.setAssignmentCategory("FR");
//        assignment.setWorkingAtHome("N");
//        assignment.setWorkingAsManager("N");
//        assignment.setSalaryCode("H");
//        assignment.setWorkingHours("12");
//        assignment.setFrequency("D");
//        assignment.setSalaryAmount("350000");
//        assignment.setSalaryBasisId("300000001590736");
//        assignment.setActionCode("HIRE");
//        assignment.setActionReasonCode("NEWHIRE");
//        assignment.setAssignmentStatus("ACTIVE");
//
//        List<RequestAssignment> assignments = new ArrayList<RequestAssignment>();
//        assignments.add(assignment);
//        emp.setAssignments(assignments);
//
//        HttpEntity<RequestEmployee> request = new HttpEntity<RequestEmployee>(emp,httpHeaders);
//
//        try {
//            String json = new ObjectMapper().writeValueAsString(emp);
//            System.out.println(json);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//
//
//        ResponseEntity response = restTemplate.exchange(url,HttpMethod.POST,request,String.class);
//        System.out.println(response.toString());

//END POST
//        HttpEntity<Employee> request = new HttpEntity<Employee>(emp,createHeaders("SOIN","Admin1234"));
//        ResponseEntity<Employee> response = restTemplate.exchange(url,HttpMethod.POST,request,Employee.class);
//
//
//
//        System.out.println(response.toString());

//        Employee employee = response.getBody();
//PHOTO
//    {
//        "ImageName" : "Imageprofile",
//            "PrimaryFlag" : "Y",
//            "Image":"Test"
//    }
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "https://hdes-test.fa.us2.oraclecloud.com:443/hcmRestApi/resources/11.13.18.05/emps/00020000000EACED00057708000110D931C4B2130000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000165B67A680078/child/photo";
//        Photo photo = new Photo();
//        photo.setImage("test");
//        photo.setImageName("Imageprofile");
//        photo.setPrimaryFlag("Y");
//
////        String requestJson = "{\"Image\":\"test\",\"ImageName\":\"Imageprofile\",\"PrimaryFlag\":\"Y\"}";
//
//
//        HttpHeaders httpHeaders= createHeaders("SOIN","Admin1234");
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
////        HttpEntity<String> request = new HttpEntity<String>(requestJson,httpHeaders);
//        HttpEntity<Photo> request = new HttpEntity<Photo>(photo,httpHeaders);
//
//        ResponseEntity<Photo> response = restTemplate.exchange(url,HttpMethod.POST,request,Photo.class);
//        System.out.println(response.toString());

//PATCH


//        RestTemplate restTemplate = new RestTemplate();
//        String url = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/00020000000EACED00057708000110D931C4B2130000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000165B67A680078";
//        PatchObject test = new PatchObject();
//        test.setLastName("RESTTEMPLATE");
//
//        HttpHeaders httpHeaders = createHeaders();
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//        HttpEntity<PatchObject> request = new HttpEntity<PatchObject>(test,httpHeaders);
//
//
//        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
//
//        restTemplate.setRequestFactory(requestFactory);
//
//        HttpEntity response = restTemplate.exchange(url, HttpMethod.PATCH, request, ResponseEmployee.class);
//        response.toString();



//        PatchEmployee emp = new PatchEmployee();
//
//        emp.setMiddleName("segundo_nombre");
//        emp.setWorkEmail("correo_empresa");
//        emp.setHomePhoneNumber("123456789");
//        emp.setWorkMobilePhoneNumber("123456789");
//        emp.setDriverLicenseExpirationDate(null);
//
//        emp.setFirstName("nombre");
//        emp.setLastName("apellido_paterno");
//        emp.setPreviousLastName("apellido_materno");
//        emp.setDisplayName("nombre"+" "+"apellido_paterno"); /* devuelve null */
//        emp.setAddressLine1("direccion");
//        emp.setCountry("CR");
//        emp.setDateOfBirth("1994-05-19");
//        emp.setLegalEntityId("300000001545611"); /* devuelve null */
//        emp.setGender("M");
//        emp.setMaritalStatus("S");
//        emp.setNationalIdType("C");
//        emp.setNationalId("123456789");
//        emp.setNationalIdCountry("CR");
//        emp.setUserName("usuario");
//
//        RestTemplate restTemplate = new RestTemplate();
//        String url = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/00020000000EACED00057708000110D931C4B2130000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000165B67A680078";
//        PatchObject test = new PatchObject();
//        test.setLastName("RESTTEMPLATE");
//
//        HttpHeaders httpHeaders = createHeaders();
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//        HttpEntity<PatchEmployee> request = new HttpEntity<PatchEmployee>(emp, httpHeaders);
//
//
//        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
//
//        restTemplate.setRequestFactory(requestFactory);
//
//        try {
//            String json = new ObjectMapper().writeValueAsString(emp);
//            System.out.println(json);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        HttpEntity response = restTemplate.exchange(url, HttpMethod.PATCH, request, ResponseEmployee.class);
//        response.toString();


//       GETUSERID

        String findUserLink = "https://hdes-test.fa.us2.oraclecloud.com/hcmRestApi/resources/latest/emps?q=PersonNumber=1905";
        HttpEntity getHeaders = new HttpEntity(createHeaders());
        HttpEntity<ResponseLinkListUser> response = restTemplate.exchange(findUserLink,HttpMethod.GET,getHeaders,ResponseLinkListUser.class);

        System.out.println(response);

        if(response.getBody().getItems().size()!=0){
            String userId = response.getBody().getItems().get(0).getLinks().get(0).getHref().split("/")[7];
            String patchUrl = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/"+userId;

            HttpHeaders postHeaders = createHeaders();
            postHeaders.setContentType(MediaType.APPLICATION_JSON);

            PatchObject test = new PatchObject();
            test.setLastName("PatchComplete");

            restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());

            HttpEntity<PatchObject> requestObj = new HttpEntity<PatchObject>(test,postHeaders);

            HttpEntity resp = restTemplate.exchange(patchUrl,HttpMethod.PATCH,requestObj,ResponseEmployee.class);

            System.out.println(resp.toString());
        }

    }

    static HttpHeaders createHeaders(){
        return new HttpHeaders() {{
            String auth = "SOIN" + ":" + "Admin1234";
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")) );
            String authHeader = "Basic " + new String( encodedAuth );
            set( "Authorization", authHeader );
        }};
    }
	public static boolean getStatus(String url) {
		 
       boolean disponible = false;
        try {
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
 
            int code = connection.getResponseCode();
            if (code == 200) {
            	disponible = true;
            }
        } catch (Exception e) {
        	disponible = false;
        }
        return disponible;
    }


	public static boolean isNullOrEmpty(String valor){
		if(valor != null && !valor.trim().isEmpty())
			return true;
		else
			return false;
	}
}
