
package com.oracle.xmlns.apps.hcm.people.core.flex.visapermitdff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.visapermitdff package. 
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

    private final static QName _VisaPermitDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/visaPermitDFF/", "visaPermitDFF");
    private final static QName _VisaPermitDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/visaPermitDFF/", "__FLEX_Context");
    private final static QName _VisaPermitDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/visaPermitDFF/", "_FLEX_NumOfSegments");
    private final static QName _VisaPermitDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/visaPermitDFF/", "__FLEX_Context_DisplayValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.visapermitdff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VisaPermitDFF }
     * 
     */
    public VisaPermitDFF createVisaPermitDFF() {
        return new VisaPermitDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisaPermitDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/visaPermitDFF/", name = "visaPermitDFF")
    public JAXBElement<VisaPermitDFF> createVisaPermitDFF(VisaPermitDFF value) {
        return new JAXBElement<VisaPermitDFF>(_VisaPermitDFF_QNAME, VisaPermitDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/visaPermitDFF/", name = "__FLEX_Context", scope = VisaPermitDFF.class)
    public JAXBElement<String> createVisaPermitDFFFLEXContext(String value) {
        return new JAXBElement<String>(_VisaPermitDFFFLEXContext_QNAME, String.class, VisaPermitDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/visaPermitDFF/", name = "_FLEX_NumOfSegments", scope = VisaPermitDFF.class)
    public JAXBElement<Integer> createVisaPermitDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_VisaPermitDFFFLEXNumOfSegments_QNAME, Integer.class, VisaPermitDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/visaPermitDFF/", name = "__FLEX_Context_DisplayValue", scope = VisaPermitDFF.class)
    public JAXBElement<String> createVisaPermitDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_VisaPermitDFFFLEXContextDisplayValue_QNAME, String.class, VisaPermitDFF.class, value);
    }

}
