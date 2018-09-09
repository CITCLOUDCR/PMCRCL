
package com.oracle.xmlns.apps.hcm.people.core.flex.phonedff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.phonedff package. 
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

    private final static QName _PhoneDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/phoneDFF/", "phoneDFF");
    private final static QName _PhoneDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/phoneDFF/", "__FLEX_Context");
    private final static QName _PhoneDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/phoneDFF/", "_FLEX_NumOfSegments");
    private final static QName _PhoneDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/phoneDFF/", "__FLEX_Context_DisplayValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.phonedff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PhoneDFF }
     * 
     */
    public PhoneDFF createPhoneDFF() {
        return new PhoneDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/phoneDFF/", name = "phoneDFF")
    public JAXBElement<PhoneDFF> createPhoneDFF(PhoneDFF value) {
        return new JAXBElement<PhoneDFF>(_PhoneDFF_QNAME, PhoneDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/phoneDFF/", name = "__FLEX_Context", scope = PhoneDFF.class)
    public JAXBElement<String> createPhoneDFFFLEXContext(String value) {
        return new JAXBElement<String>(_PhoneDFFFLEXContext_QNAME, String.class, PhoneDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/phoneDFF/", name = "_FLEX_NumOfSegments", scope = PhoneDFF.class)
    public JAXBElement<Integer> createPhoneDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_PhoneDFFFLEXNumOfSegments_QNAME, Integer.class, PhoneDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/phoneDFF/", name = "__FLEX_Context_DisplayValue", scope = PhoneDFF.class)
    public JAXBElement<String> createPhoneDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_PhoneDFFFLEXContextDisplayValue_QNAME, String.class, PhoneDFF.class, value);
    }

}
