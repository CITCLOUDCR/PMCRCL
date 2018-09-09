
package com.oracle.xmlns.apps.hcm.people.core.flex.driverslicensetypedff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.driverslicensetypedff package. 
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

    private final static QName _DriversLicenseTypeDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", "driversLicenseTypeDFF");
    private final static QName _DriversLicenseTypeDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", "__FLEX_Context");
    private final static QName _DriversLicenseTypeDFFCategoria_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", "categoria");
    private final static QName _DriversLicenseTypeDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _DriversLicenseTypeDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", "_FLEX_NumOfSegments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.driverslicensetypedff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DriversLicenseTypeDFF }
     * 
     */
    public DriversLicenseTypeDFF createDriversLicenseTypeDFF() {
        return new DriversLicenseTypeDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriversLicenseTypeDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", name = "driversLicenseTypeDFF")
    public JAXBElement<DriversLicenseTypeDFF> createDriversLicenseTypeDFF(DriversLicenseTypeDFF value) {
        return new JAXBElement<DriversLicenseTypeDFF>(_DriversLicenseTypeDFF_QNAME, DriversLicenseTypeDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", name = "__FLEX_Context", scope = DriversLicenseTypeDFF.class)
    public JAXBElement<String> createDriversLicenseTypeDFFFLEXContext(String value) {
        return new JAXBElement<String>(_DriversLicenseTypeDFFFLEXContext_QNAME, String.class, DriversLicenseTypeDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", name = "categoria", scope = DriversLicenseTypeDFF.class)
    public JAXBElement<String> createDriversLicenseTypeDFFCategoria(String value) {
        return new JAXBElement<String>(_DriversLicenseTypeDFFCategoria_QNAME, String.class, DriversLicenseTypeDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", name = "__FLEX_Context_DisplayValue", scope = DriversLicenseTypeDFF.class)
    public JAXBElement<String> createDriversLicenseTypeDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_DriversLicenseTypeDFFFLEXContextDisplayValue_QNAME, String.class, DriversLicenseTypeDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/driversLicenseTypeDFF/", name = "_FLEX_NumOfSegments", scope = DriversLicenseTypeDFF.class)
    public JAXBElement<Integer> createDriversLicenseTypeDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_DriversLicenseTypeDFFFLEXNumOfSegments_QNAME, Integer.class, DriversLicenseTypeDFF.class, value);
    }

}
