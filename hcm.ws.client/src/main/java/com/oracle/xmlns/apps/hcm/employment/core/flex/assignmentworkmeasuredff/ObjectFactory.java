
package com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentworkmeasuredff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentworkmeasuredff package. 
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

    private final static QName _AsgWorkMeasureDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentWorkMeasureDFF/", "asgWorkMeasureDFF");
    private final static QName _AsgWorkMeasureDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentWorkMeasureDFF/", "_FLEX_NumOfSegments");
    private final static QName _AsgWorkMeasureDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentWorkMeasureDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _AsgWorkMeasureDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentWorkMeasureDFF/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentworkmeasuredff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsgWorkMeasureDFF }
     * 
     */
    public AsgWorkMeasureDFF createAsgWorkMeasureDFF() {
        return new AsgWorkMeasureDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsgWorkMeasureDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentWorkMeasureDFF/", name = "asgWorkMeasureDFF")
    public JAXBElement<AsgWorkMeasureDFF> createAsgWorkMeasureDFF(AsgWorkMeasureDFF value) {
        return new JAXBElement<AsgWorkMeasureDFF>(_AsgWorkMeasureDFF_QNAME, AsgWorkMeasureDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentWorkMeasureDFF/", name = "_FLEX_NumOfSegments", scope = AsgWorkMeasureDFF.class)
    public JAXBElement<Integer> createAsgWorkMeasureDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_AsgWorkMeasureDFFFLEXNumOfSegments_QNAME, Integer.class, AsgWorkMeasureDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentWorkMeasureDFF/", name = "__FLEX_Context_DisplayValue", scope = AsgWorkMeasureDFF.class)
    public JAXBElement<String> createAsgWorkMeasureDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_AsgWorkMeasureDFFFLEXContextDisplayValue_QNAME, String.class, AsgWorkMeasureDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentWorkMeasureDFF/", name = "__FLEX_Context", scope = AsgWorkMeasureDFF.class)
    public JAXBElement<String> createAsgWorkMeasureDFFFLEXContext(String value) {
        return new JAXBElement<String>(_AsgWorkMeasureDFFFLEXContext_QNAME, String.class, AsgWorkMeasureDFF.class, value);
    }

}
