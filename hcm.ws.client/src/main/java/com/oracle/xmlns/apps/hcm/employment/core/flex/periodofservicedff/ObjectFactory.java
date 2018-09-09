
package com.oracle.xmlns.apps.hcm.employment.core.flex.periodofservicedff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.employment.core.flex.periodofservicedff package. 
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

    private final static QName _WorkRelationshipDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDFF/", "workRelationshipDFF");
    private final static QName _WorkRelationshipDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _WorkRelationshipDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDFF/", "_FLEX_NumOfSegments");
    private final static QName _WorkRelationshipDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDFF/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.employment.core.flex.periodofservicedff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WorkRelationshipDFF }
     * 
     */
    public WorkRelationshipDFF createWorkRelationshipDFF() {
        return new WorkRelationshipDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRelationshipDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDFF/", name = "workRelationshipDFF")
    public JAXBElement<WorkRelationshipDFF> createWorkRelationshipDFF(WorkRelationshipDFF value) {
        return new JAXBElement<WorkRelationshipDFF>(_WorkRelationshipDFF_QNAME, WorkRelationshipDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDFF/", name = "__FLEX_Context_DisplayValue", scope = WorkRelationshipDFF.class)
    public JAXBElement<String> createWorkRelationshipDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_WorkRelationshipDFFFLEXContextDisplayValue_QNAME, String.class, WorkRelationshipDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDFF/", name = "_FLEX_NumOfSegments", scope = WorkRelationshipDFF.class)
    public JAXBElement<Integer> createWorkRelationshipDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_WorkRelationshipDFFFLEXNumOfSegments_QNAME, Integer.class, WorkRelationshipDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/periodOfServiceDFF/", name = "__FLEX_Context", scope = WorkRelationshipDFF.class)
    public JAXBElement<String> createWorkRelationshipDFFFLEXContext(String value) {
        return new JAXBElement<String>(_WorkRelationshipDFFFLEXContext_QNAME, String.class, WorkRelationshipDFF.class, value);
    }

}
