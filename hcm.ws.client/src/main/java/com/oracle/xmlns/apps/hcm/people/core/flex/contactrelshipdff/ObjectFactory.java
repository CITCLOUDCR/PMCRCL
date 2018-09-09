
package com.oracle.xmlns.apps.hcm.people.core.flex.contactrelshipdff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.contactrelshipdff package. 
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

    private final static QName _ContactRelshipDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/contactRelshipDFF/", "contactRelshipDFF");
    private final static QName _ContactRelshipDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/contactRelshipDFF/", "_FLEX_NumOfSegments");
    private final static QName _ContactRelshipDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/contactRelshipDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _ContactRelshipDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/contactRelshipDFF/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.contactrelshipdff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactRelshipDFF }
     * 
     */
    public ContactRelshipDFF createContactRelshipDFF() {
        return new ContactRelshipDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactRelshipDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/contactRelshipDFF/", name = "contactRelshipDFF")
    public JAXBElement<ContactRelshipDFF> createContactRelshipDFF(ContactRelshipDFF value) {
        return new JAXBElement<ContactRelshipDFF>(_ContactRelshipDFF_QNAME, ContactRelshipDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/contactRelshipDFF/", name = "_FLEX_NumOfSegments", scope = ContactRelshipDFF.class)
    public JAXBElement<Integer> createContactRelshipDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_ContactRelshipDFFFLEXNumOfSegments_QNAME, Integer.class, ContactRelshipDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/contactRelshipDFF/", name = "__FLEX_Context_DisplayValue", scope = ContactRelshipDFF.class)
    public JAXBElement<String> createContactRelshipDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_ContactRelshipDFFFLEXContextDisplayValue_QNAME, String.class, ContactRelshipDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/contactRelshipDFF/", name = "__FLEX_Context", scope = ContactRelshipDFF.class)
    public JAXBElement<String> createContactRelshipDFFFLEXContext(String value) {
        return new JAXBElement<String>(_ContactRelshipDFFFLEXContext_QNAME, String.class, ContactRelshipDFF.class, value);
    }

}
