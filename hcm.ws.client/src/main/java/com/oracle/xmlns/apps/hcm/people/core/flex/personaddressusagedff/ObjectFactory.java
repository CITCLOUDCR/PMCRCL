
package com.oracle.xmlns.apps.hcm.people.core.flex.personaddressusagedff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.personaddressusagedff package. 
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

    private final static QName _PersonAddressUsageDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personAddressUsageDFF/", "personAddressUsageDFF");
    private final static QName _PersonAddressUsageDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personAddressUsageDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _PersonAddressUsageDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personAddressUsageDFF/", "_FLEX_NumOfSegments");
    private final static QName _PersonAddressUsageDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personAddressUsageDFF/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.personaddressusagedff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonAddressUsageDFF }
     * 
     */
    public PersonAddressUsageDFF createPersonAddressUsageDFF() {
        return new PersonAddressUsageDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonAddressUsageDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personAddressUsageDFF/", name = "personAddressUsageDFF")
    public JAXBElement<PersonAddressUsageDFF> createPersonAddressUsageDFF(PersonAddressUsageDFF value) {
        return new JAXBElement<PersonAddressUsageDFF>(_PersonAddressUsageDFF_QNAME, PersonAddressUsageDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personAddressUsageDFF/", name = "__FLEX_Context_DisplayValue", scope = PersonAddressUsageDFF.class)
    public JAXBElement<String> createPersonAddressUsageDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_PersonAddressUsageDFFFLEXContextDisplayValue_QNAME, String.class, PersonAddressUsageDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personAddressUsageDFF/", name = "_FLEX_NumOfSegments", scope = PersonAddressUsageDFF.class)
    public JAXBElement<Integer> createPersonAddressUsageDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_PersonAddressUsageDFFFLEXNumOfSegments_QNAME, Integer.class, PersonAddressUsageDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personAddressUsageDFF/", name = "__FLEX_Context", scope = PersonAddressUsageDFF.class)
    public JAXBElement<String> createPersonAddressUsageDFFFLEXContext(String value) {
        return new JAXBElement<String>(_PersonAddressUsageDFFFLEXContext_QNAME, String.class, PersonAddressUsageDFF.class, value);
    }

}
