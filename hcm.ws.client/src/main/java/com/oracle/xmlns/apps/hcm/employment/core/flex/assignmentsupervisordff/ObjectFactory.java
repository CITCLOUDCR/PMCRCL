
package com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentsupervisordff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentsupervisordff package. 
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

    private final static QName _AsgSupervisorDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentSupervisorDFF/", "asgSupervisorDFF");
    private final static QName _AsgSupervisorDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentSupervisorDFF/", "__FLEX_Context");
    private final static QName _AsgSupervisorDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentSupervisorDFF/", "_FLEX_NumOfSegments");
    private final static QName _AsgSupervisorDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentSupervisorDFF/", "__FLEX_Context_DisplayValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentsupervisordff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsgSupervisorDFF }
     * 
     */
    public AsgSupervisorDFF createAsgSupervisorDFF() {
        return new AsgSupervisorDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsgSupervisorDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentSupervisorDFF/", name = "asgSupervisorDFF")
    public JAXBElement<AsgSupervisorDFF> createAsgSupervisorDFF(AsgSupervisorDFF value) {
        return new JAXBElement<AsgSupervisorDFF>(_AsgSupervisorDFF_QNAME, AsgSupervisorDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentSupervisorDFF/", name = "__FLEX_Context", scope = AsgSupervisorDFF.class)
    public JAXBElement<String> createAsgSupervisorDFFFLEXContext(String value) {
        return new JAXBElement<String>(_AsgSupervisorDFFFLEXContext_QNAME, String.class, AsgSupervisorDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentSupervisorDFF/", name = "_FLEX_NumOfSegments", scope = AsgSupervisorDFF.class)
    public JAXBElement<Integer> createAsgSupervisorDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_AsgSupervisorDFFFLEXNumOfSegments_QNAME, Integer.class, AsgSupervisorDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentSupervisorDFF/", name = "__FLEX_Context_DisplayValue", scope = AsgSupervisorDFF.class)
    public JAXBElement<String> createAsgSupervisorDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_AsgSupervisorDFFFLEXContextDisplayValue_QNAME, String.class, AsgSupervisorDFF.class, value);
    }

}
