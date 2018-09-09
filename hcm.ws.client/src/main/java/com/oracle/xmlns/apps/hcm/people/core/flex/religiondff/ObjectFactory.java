
package com.oracle.xmlns.apps.hcm.people.core.flex.religiondff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.religiondff package. 
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

    private final static QName _ReligionDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/religionDFF/", "religionDFF");
    private final static QName _ReligionDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/religionDFF/", "__FLEX_Context");
    private final static QName _ReligionDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/religionDFF/", "_FLEX_NumOfSegments");
    private final static QName _ReligionDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/religionDFF/", "__FLEX_Context_DisplayValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.religiondff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReligionDFF }
     * 
     */
    public ReligionDFF createReligionDFF() {
        return new ReligionDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReligionDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/religionDFF/", name = "religionDFF")
    public JAXBElement<ReligionDFF> createReligionDFF(ReligionDFF value) {
        return new JAXBElement<ReligionDFF>(_ReligionDFF_QNAME, ReligionDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/religionDFF/", name = "__FLEX_Context", scope = ReligionDFF.class)
    public JAXBElement<String> createReligionDFFFLEXContext(String value) {
        return new JAXBElement<String>(_ReligionDFFFLEXContext_QNAME, String.class, ReligionDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/religionDFF/", name = "_FLEX_NumOfSegments", scope = ReligionDFF.class)
    public JAXBElement<Integer> createReligionDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_ReligionDFFFLEXNumOfSegments_QNAME, Integer.class, ReligionDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/religionDFF/", name = "__FLEX_Context_DisplayValue", scope = ReligionDFF.class)
    public JAXBElement<String> createReligionDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_ReligionDFFFLEXContextDisplayValue_QNAME, String.class, ReligionDFF.class, value);
    }

}
