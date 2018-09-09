
package com.oracle.xmlns.apps.hcm.people.core.flex.persondff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.persondff package. 
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

    private final static QName _PersonDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", "personDFF");
    private final static QName _PersonDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", "__FLEX_Context");
    private final static QName _PersonDFFPadecimiento_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", "padecimiento");
    private final static QName _PersonDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _PersonDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", "_FLEX_NumOfSegments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.persondff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonDFF }
     * 
     */
    public PersonDFF createPersonDFF() {
        return new PersonDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", name = "personDFF")
    public JAXBElement<PersonDFF> createPersonDFF(PersonDFF value) {
        return new JAXBElement<PersonDFF>(_PersonDFF_QNAME, PersonDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", name = "__FLEX_Context", scope = PersonDFF.class)
    public JAXBElement<String> createPersonDFFFLEXContext(String value) {
        return new JAXBElement<String>(_PersonDFFFLEXContext_QNAME, String.class, PersonDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", name = "padecimiento", scope = PersonDFF.class)
    public JAXBElement<String> createPersonDFFPadecimiento(String value) {
        return new JAXBElement<String>(_PersonDFFPadecimiento_QNAME, String.class, PersonDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", name = "__FLEX_Context_DisplayValue", scope = PersonDFF.class)
    public JAXBElement<String> createPersonDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_PersonDFFFLEXContextDisplayValue_QNAME, String.class, PersonDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personDFF/", name = "_FLEX_NumOfSegments", scope = PersonDFF.class)
    public JAXBElement<Integer> createPersonDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_PersonDFFFLEXNumOfSegments_QNAME, Integer.class, PersonDFF.class, value);
    }

}
