package com.oracle.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class DocumentUtil {

	//Convert String to JAXBElement<XMLGregorianCalendar>	
	public static JAXBElement<XMLGregorianCalendar> getXMLGregorianCalendar(String element, String value) throws DatatypeConfigurationException{							
		if(value != null)
		{
			XMLGregorianCalendar xmlGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(value);
			return new JAXBElement<XMLGregorianCalendar>(new QName("http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", element), XMLGregorianCalendar.class, xmlGC);	
		}
		else{
			return null;
		}
	   
	}															

	//Convert String to JAXBElement<String>
	public static JAXBElement<String> getXMLString(String element, String value) throws DatatypeConfigurationException{	
		if(value != null)
		{
			return new JAXBElement<String>(new QName("http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", element), String.class, value);
		}
		else{
			return null;
		}
	}
	
	//Convert String to JAXBElement<XMLGregorianCalendar>	
	public static JAXBElement<XMLGregorianCalendar> getXMLGregorianCalendarBas(String element, String value) throws DatatypeConfigurationException{	
		if(value != null)
		{
			XMLGregorianCalendar xmlGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(value);
			return new JAXBElement<XMLGregorianCalendar>(new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", element), XMLGregorianCalendar.class, xmlGC);
		}
		else{
			return null;
		}	
	}

	//Convert String to JAXBElement<String>
	public static JAXBElement<String> getXMLStringBas(String element, String value) throws DatatypeConfigurationException{							
		if(value != null)
		{
			return new JAXBElement<String>(new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", element), String.class, value);	
		}
		else{
			return null;
		}
	}
	
	//Convert String to JAXBElement<Boolean>
	public static JAXBElement<Boolean> getXMLBoolean(String element, Boolean value) throws DatatypeConfigurationException{							
		if(value != null)
		{
			return new JAXBElement<Boolean>(new QName("http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", element), Boolean.class, value);
		}
		else{
			return null;
		}
	}
	
	//Convert String to JAXBElement<String>
	public static JAXBElement<String> getXMLStringDff(String element, String value) throws DatatypeConfigurationException{							
		if(value != null)
		{	
			return new JAXBElement<String>(new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", element), String.class, value);
		}
		else{
			return null;
		}
	}
	
		
	public static JAXBElement<String> getXMLStringPersonDFF(String element, String value) throws DatatypeConfigurationException{							
		if(value != null)
		{	
			return new JAXBElement<String>(new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", element), String.class, value);
		}
		else{
			return null;
		}
	}

}
