
package com.oracle.xmlns.apps.hcm.people.core.flex.citizenshipsdff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.citizenshipsdff package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CitizenshipDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/citizenshipsDFF/", "citizenshipDFF");
    private final static QName _CitizenshipDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/citizenshipsDFF/", "__FLEX_Context");
    private final static QName _CitizenshipDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/citizenshipsDFF/", "_FLEX_NumOfSegments");
    private final static QName _CitizenshipDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/citizenshipsDFF/", "__FLEX_Context_DisplayValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.citizenshipsdff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CitizenshipDFF }
     * 
     */
    public CitizenshipDFF createCitizenshipDFF() {
        return new CitizenshipDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitizenshipDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/citizenshipsDFF/", name = "citizenshipDFF")
    public JAXBElement<CitizenshipDFF> createCitizenshipDFF(CitizenshipDFF value) {
        return new JAXBElement<CitizenshipDFF>(_CitizenshipDFF_QNAME, CitizenshipDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/citizenshipsDFF/", name = "__FLEX_Context", scope = CitizenshipDFF.class)
    public JAXBElement<String> createCitizenshipDFFFLEXContext(String value) {
        return new JAXBElement<String>(_CitizenshipDFFFLEXContext_QNAME, String.class, CitizenshipDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/citizenshipsDFF/", name = "_FLEX_NumOfSegments", scope = CitizenshipDFF.class)
    public JAXBElement<Integer> createCitizenshipDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_CitizenshipDFFFLEXNumOfSegments_QNAME, Integer.class, CitizenshipDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/citizenshipsDFF/", name = "__FLEX_Context_DisplayValue", scope = CitizenshipDFF.class)
    public JAXBElement<String> createCitizenshipDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_CitizenshipDFFFLEXContextDisplayValue_QNAME, String.class, CitizenshipDFF.class, value);
    }

}
