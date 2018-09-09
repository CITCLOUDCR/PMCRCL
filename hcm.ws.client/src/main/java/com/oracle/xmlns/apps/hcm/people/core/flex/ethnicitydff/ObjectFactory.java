
package com.oracle.xmlns.apps.hcm.people.core.flex.ethnicitydff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.ethnicitydff package. 
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

    private final static QName _EthnicityDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/ethnicityDFF/", "ethnicityDFF");
    private final static QName _EthnicityDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/ethnicityDFF/", "__FLEX_Context");
    private final static QName _EthnicityDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/ethnicityDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _EthnicityDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/ethnicityDFF/", "_FLEX_NumOfSegments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.ethnicitydff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EthnicityDFF }
     * 
     */
    public EthnicityDFF createEthnicityDFF() {
        return new EthnicityDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EthnicityDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/ethnicityDFF/", name = "ethnicityDFF")
    public JAXBElement<EthnicityDFF> createEthnicityDFF(EthnicityDFF value) {
        return new JAXBElement<EthnicityDFF>(_EthnicityDFF_QNAME, EthnicityDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/ethnicityDFF/", name = "__FLEX_Context", scope = EthnicityDFF.class)
    public JAXBElement<String> createEthnicityDFFFLEXContext(String value) {
        return new JAXBElement<String>(_EthnicityDFFFLEXContext_QNAME, String.class, EthnicityDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/ethnicityDFF/", name = "__FLEX_Context_DisplayValue", scope = EthnicityDFF.class)
    public JAXBElement<String> createEthnicityDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_EthnicityDFFFLEXContextDisplayValue_QNAME, String.class, EthnicityDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/ethnicityDFF/", name = "_FLEX_NumOfSegments", scope = EthnicityDFF.class)
    public JAXBElement<Integer> createEthnicityDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_EthnicityDFFFLEXNumOfSegments_QNAME, Integer.class, EthnicityDFF.class, value);
    }

}
