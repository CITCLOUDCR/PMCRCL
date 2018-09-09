
package com.oracle.xmlns.apps.hcm.people.core.flex.nationalidentifierdff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.nationalidentifierdff package. 
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

    private final static QName _NationalIdentifierDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/nationalIdentifierDFF/", "nationalIdentifierDFF");
    private final static QName _NationalIdentifierDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/nationalIdentifierDFF/", "_FLEX_NumOfSegments");
    private final static QName _NationalIdentifierDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/nationalIdentifierDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _NationalIdentifierDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/nationalIdentifierDFF/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.nationalidentifierdff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NationalIdentifierDFF }
     * 
     */
    public NationalIdentifierDFF createNationalIdentifierDFF() {
        return new NationalIdentifierDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NationalIdentifierDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/nationalIdentifierDFF/", name = "nationalIdentifierDFF")
    public JAXBElement<NationalIdentifierDFF> createNationalIdentifierDFF(NationalIdentifierDFF value) {
        return new JAXBElement<NationalIdentifierDFF>(_NationalIdentifierDFF_QNAME, NationalIdentifierDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/nationalIdentifierDFF/", name = "_FLEX_NumOfSegments", scope = NationalIdentifierDFF.class)
    public JAXBElement<Integer> createNationalIdentifierDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_NationalIdentifierDFFFLEXNumOfSegments_QNAME, Integer.class, NationalIdentifierDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/nationalIdentifierDFF/", name = "__FLEX_Context_DisplayValue", scope = NationalIdentifierDFF.class)
    public JAXBElement<String> createNationalIdentifierDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_NationalIdentifierDFFFLEXContextDisplayValue_QNAME, String.class, NationalIdentifierDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/nationalIdentifierDFF/", name = "__FLEX_Context", scope = NationalIdentifierDFF.class)
    public JAXBElement<String> createNationalIdentifierDFFFLEXContext(String value) {
        return new JAXBElement<String>(_NationalIdentifierDFFFLEXContext_QNAME, String.class, NationalIdentifierDFF.class, value);
    }

}
