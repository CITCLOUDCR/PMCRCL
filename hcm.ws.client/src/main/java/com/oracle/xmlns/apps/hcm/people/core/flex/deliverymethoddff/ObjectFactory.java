
package com.oracle.xmlns.apps.hcm.people.core.flex.deliverymethoddff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.deliverymethoddff package. 
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

    private final static QName _DeliveryMethodDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/deliveryMethodDFF/", "deliveryMethodDFF");
    private final static QName _DeliveryMethodDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/deliveryMethodDFF/", "__FLEX_Context");
    private final static QName _DeliveryMethodDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/deliveryMethodDFF/", "_FLEX_NumOfSegments");
    private final static QName _DeliveryMethodDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/deliveryMethodDFF/", "__FLEX_Context_DisplayValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.deliverymethoddff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeliveryMethodDFF }
     * 
     */
    public DeliveryMethodDFF createDeliveryMethodDFF() {
        return new DeliveryMethodDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryMethodDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/deliveryMethodDFF/", name = "deliveryMethodDFF")
    public JAXBElement<DeliveryMethodDFF> createDeliveryMethodDFF(DeliveryMethodDFF value) {
        return new JAXBElement<DeliveryMethodDFF>(_DeliveryMethodDFF_QNAME, DeliveryMethodDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/deliveryMethodDFF/", name = "__FLEX_Context", scope = DeliveryMethodDFF.class)
    public JAXBElement<String> createDeliveryMethodDFFFLEXContext(String value) {
        return new JAXBElement<String>(_DeliveryMethodDFFFLEXContext_QNAME, String.class, DeliveryMethodDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/deliveryMethodDFF/", name = "_FLEX_NumOfSegments", scope = DeliveryMethodDFF.class)
    public JAXBElement<Integer> createDeliveryMethodDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_DeliveryMethodDFFFLEXNumOfSegments_QNAME, Integer.class, DeliveryMethodDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/deliveryMethodDFF/", name = "__FLEX_Context_DisplayValue", scope = DeliveryMethodDFF.class)
    public JAXBElement<String> createDeliveryMethodDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_DeliveryMethodDFFFLEXContextDisplayValue_QNAME, String.class, DeliveryMethodDFF.class, value);
    }

}
