package com.oracle.ws.client;

import com.oracle.ws.client.DTOs.Photo;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
// comentario prueba
public class test {

//    private RestTemplate restTemplate = new RestTemplate();

    public static void main (String[] args){
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "https://hdes-test.fa.us2.oraclecloud.com/hcmRestApi/resources/latest/emps?q=PersonId=300000001619709";
//        HttpEntity entity = new HttpEntity(createHeaders("SOIN", "Admin1234"));
//        HttpEntity response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

//        response.toString();

//        POST!
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "https://hdes-test.fa.us2.oraclecloud.com/hcmRestApi/resources/latest/emps";
//        Employee emp = new Employee();
//        emp.setSalutation("MS.");
//        emp.setLegalEntityId("300100003448002");
//        emp.setFirstName("Mirando");
//        emp.setMiddleName("Ky");
//        emp.setLastName("Rachell");
//        emp.setDisplayName("Mirando Ky Ra");
//        emp.setWorkPhoneCountryCode("1");
//        emp.setWorkPhoneAreaCode("1");
//        emp.setWorkPhoneNumber("506-993-0001");
//        emp.setHomePhoneCountryCode("1");
//        emp.setHomePhoneAreaCode("1");
//        emp.setHomePhoneNumber("506-993-0001");
//        emp.setHomeFaxCountryCode("1");
//        emp.setHomeFaxAreaCode("1");
//        emp.setHomeFaxNumber("11111111");
//        emp.setNameSuffix("Jr.");
//        emp.setNationalIdExpirationDate("4712-12-31");
//        emp.setWorkEmail("mirando@oracle.com");
//        emp.setAddressLine1("Oracle");
//        emp.setAddressLine2("500 Park");
//
//        emp.setCity("San Francisco");
//        emp.setRegion("California");
//        emp.setCountry("US");
//        emp.setPostalCode("94061");
//        emp.setCitizenshipLegislationCode("CR");
//        emp.setPassportNumber("11551155");
//        emp.setPassportIssueDate("2002-12-31");
//        emp.setReligion("Christian");
//        emp.setLicenseNumber("9988998899");
//        emp.setCreationDate("2016-04-13T21:44:24-07:00");
//        emp.setLastUpdateDate("2016-04-13T21:44:25-07:00");
//        emp.setGender("F");
//        emp.setDateOfBirth("1990-09-09");
//        emp.setNationalId("80808080");
//        emp.setMaritalStatus("S");
//        emp.setNationalIdCountry("US");
//        emp.setNationalIdType("SSN");
//        emp.setUserName("rachelll");
//
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
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://hdes-test.fa.us2.oraclecloud.com:443/hcmRestApi/resources/11.13.18.05/emps/00020000000EACED00057708000110D931C4B2130000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000165B67A680078/child/photo";
        Photo photo = new Photo();
        photo.setImage("test");
        photo.setImageName("Imageprofile");
        photo.setPrimaryFlag("Y");

//        String requestJson = "{\"Image\":\"test\",\"ImageName\":\"Imageprofile\",\"PrimaryFlag\":\"Y\"}";


        HttpHeaders httpHeaders= createHeaders("SOIN","Admin1234");
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<String> request = new HttpEntity<String>(requestJson,httpHeaders);
        HttpEntity<Photo> request = new HttpEntity<Photo>(photo,httpHeaders);

        ResponseEntity<Photo> response = restTemplate.exchange(url,HttpMethod.POST,request,Photo.class);
        System.out.println(response.toString());

	}

    static HttpHeaders createHeaders(final String username, final String password){
        return new HttpHeaders() {{
            String auth = username + ":" + password;
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
