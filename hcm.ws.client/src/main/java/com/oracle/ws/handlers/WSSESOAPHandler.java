package com.oracle.ws.handlers;

import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Detail;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

/**
 * @author Edison
 *
 */
public class WSSESOAPHandler implements SOAPHandler<SOAPMessageContext> {
	private String userName = "";
	private String password = "";	
	private String message = "";
	private String xml_generated = "";
	
	
	public void setWSSE(String usr, String psw) {
		this.userName = usr;
		this.password = psw;
		
	}
	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (outboundProperty.booleanValue()) {
			try {
				
				SOAPMessage soapMessage = context.getMessage();
				SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapMessage.getSOAPHeader();
				SOAPBody soapBody = soapMessage.getSOAPBody();
				
				/**
				// STEP 1: Agregar nuevas entradas de prefijo / espacio de nombres
		        soapEnvelope.addNamespaceDeclaration("soapenv", "http://schemas.xmlsoap.org/soap/envelope/");
		        soapEnvelope.addNamespaceDeclaration("typ", "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/types/");
		        soapEnvelope.addNamespaceDeclaration("wor", "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/");
	
		        
		        // STEP 2: Establecemos prefijos de espacio de nombres deseados
		        //Establecemos el prefijo de espacio de nombres deseado para el envelope, el header y el body
		        soapEnvelope.setPrefix("soapenv");		        
		        soapBody.setPrefix("soapenv");		        
		        //addDesiredBodyNamespaceEntries(soapBody.getChildElements());
		        
		        // STEP 3:Eliminar entradas de prefijo / espacio de nombres entradas añadidas por JAX-WS
		        soapEnvelope.removeNamespaceDeclaration("S");
		        
		        // IMPORTANT! "Save" the changes
		        soapMessage.saveChanges();
				**/

				//Autentificacion BASIC				 
				context.put(BindingProvider.USERNAME_PROPERTY, this.userName);
                context.put(BindingProvider.PASSWORD_PROPERTY, this.password);
				
                
                
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                soapMessage.writeTo(out);
                String strMsg = new String(out.toByteArray(), "UTF-8");                
                this.setXml_generated(strMsg);
                
			}
			catch (Exception e) {
				e.printStackTrace();
				return true;
			}
			
			
			
			
			
		}
		return true;
	}
	

	 
	 private Set<String> getNamespacePrefixList(Iterator namespacePrefixIter) {
		    Set<String> namespacePrefixesSet = new HashSet<String>();
		    while (namespacePrefixIter.hasNext()) {
		      namespacePrefixesSet.add((String) namespacePrefixIter.next());
		    }
		    return namespacePrefixesSet;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		SOAPMessage soapMessage = context.getMessage();
	    SOAPBody body;
	    
		try {
				body = soapMessage.getSOAPBody();
			    SOAPFault fault = body.getFault();
			    String code = fault.getFaultCode();
			    String faultString = fault.getFaultString();
			    Detail detail = fault.getDetail();
			    QName qName = fault.getFaultCodeAsQName();
			    
			    //seteamos todo el faultString como mensaje de exception ya que contiene el error detallado.			    
			    this.setMessage(faultString);

			    
		}catch (NoClassDefFoundError e) {	        
	        return true;
		}catch (ExceptionInInitializerError e) {	        
	        return true;	     
		}catch (ClassCastException e) {
			return true;
		}catch (NullPointerException e) {			        
			return true;			     
		}catch (SOAPException e) {			
			return true;
		}catch(SOAPFaultException e){
			return true;
		}catch(Exception e){
			return true;
		}
		
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getXml_generated() {
		return xml_generated;
	}

	public void setXml_generated(String xml_generated) {
		this.xml_generated = xml_generated;
	}



}


/**
if(detail != null){
	 Iterator<SOAPElement> iter = detail.getChildElements();			    	
	 while(iter.hasNext()){
	        SOAPElement element = iter.next();
	        
	        // Obtener el primer nivel del detalle
	        if(element.getElementName().getLocalName().equals("ServiceErrorMessage")){
	        	
	        	Iterator<SOAPElement> iter2 = element.getChildElements();
	        	while(iter2.hasNext()){
	        		 SOAPElement element2 = iter2.next();
	        		 if(element2.getElementName().getLocalName().equals("code")){
	        			 element2.getValue();
	        		 }
	        		 if(element2.getElementName().getLocalName().equals("message")){
	        			 element2.getValue();
	        		 }
	        	}
	       
	        	
	        }
	        
	       
	 }
}
**/
