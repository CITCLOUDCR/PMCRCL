
package com.oracle.xmlns.apps.hcm.people.core.flex.imagedff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.imagedff package. 
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

    private final static QName _ImageDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", "imageDFF");
    private final static QName _ImageDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", "__FLEX_Context");
    private final static QName _ImageDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", "_FLEX_NumOfSegments");
    private final static QName _ImageDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", "__FLEX_Context_DisplayValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.imagedff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImageDFF }
     * 
     */
    public ImageDFF createImageDFF() {
        return new ImageDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", name = "imageDFF")
    public JAXBElement<ImageDFF> createImageDFF(ImageDFF value) {
        return new JAXBElement<ImageDFF>(_ImageDFF_QNAME, ImageDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", name = "__FLEX_Context", scope = ImageDFF.class)
    public JAXBElement<String> createImageDFFFLEXContext(String value) {
        return new JAXBElement<String>(_ImageDFFFLEXContext_QNAME, String.class, ImageDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", name = "_FLEX_NumOfSegments", scope = ImageDFF.class)
    public JAXBElement<Integer> createImageDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_ImageDFFFLEXNumOfSegments_QNAME, Integer.class, ImageDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/imageDFF/", name = "__FLEX_Context_DisplayValue", scope = ImageDFF.class)
    public JAXBElement<String> createImageDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_ImageDFFFLEXContextDisplayValue_QNAME, String.class, ImageDFF.class, value);
    }

}
