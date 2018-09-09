
package com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfodff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfodff package. 
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

    private final static QName _PersonLegislativeInfoDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfoDFF/", "personLegislativeInfoDFF");
    private final static QName _PersonLegislativeInfoDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfoDFF/", "_FLEX_NumOfSegments");
    private final static QName _PersonLegislativeInfoDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfoDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _PersonLegislativeInfoDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfoDFF/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.personlegislativeinfodff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonLegislativeInfoDFF }
     * 
     */
    public PersonLegislativeInfoDFF createPersonLegislativeInfoDFF() {
        return new PersonLegislativeInfoDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonLegislativeInfoDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfoDFF/", name = "personLegislativeInfoDFF")
    public JAXBElement<PersonLegislativeInfoDFF> createPersonLegislativeInfoDFF(PersonLegislativeInfoDFF value) {
        return new JAXBElement<PersonLegislativeInfoDFF>(_PersonLegislativeInfoDFF_QNAME, PersonLegislativeInfoDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfoDFF/", name = "_FLEX_NumOfSegments", scope = PersonLegislativeInfoDFF.class)
    public JAXBElement<Integer> createPersonLegislativeInfoDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_PersonLegislativeInfoDFFFLEXNumOfSegments_QNAME, Integer.class, PersonLegislativeInfoDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfoDFF/", name = "__FLEX_Context_DisplayValue", scope = PersonLegislativeInfoDFF.class)
    public JAXBElement<String> createPersonLegislativeInfoDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_PersonLegislativeInfoDFFFLEXContextDisplayValue_QNAME, String.class, PersonLegislativeInfoDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personLegislativeInfoDFF/", name = "__FLEX_Context", scope = PersonLegislativeInfoDFF.class)
    public JAXBElement<String> createPersonLegislativeInfoDFFFLEXContext(String value) {
        return new JAXBElement<String>(_PersonLegislativeInfoDFFFLEXContext_QNAME, String.class, PersonLegislativeInfoDFF.class, value);
    }

}
