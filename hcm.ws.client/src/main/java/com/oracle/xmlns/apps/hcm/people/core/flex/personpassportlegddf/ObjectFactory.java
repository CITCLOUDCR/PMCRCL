
package com.oracle.xmlns.apps.hcm.people.core.flex.personpassportlegddf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.personpassportlegddf package. 
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

    private final static QName _PersonPassportLegDDFKW_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "personPassportLegDDFKW");
    private final static QName _PersonPassportLegDDFAE_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "personPassportLegDDFAE");
    private final static QName _PersonPassportLegDDF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "personPassportLegDDF");
    private final static QName _PersonPassportLegDDFIN_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "personPassportLegDDFIN");
    private final static QName _PersonPassportLegDDFKWACCOMPANYPERSON_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "_ACCOMPANY_PERSON");
    private final static QName _PersonPassportLegDDFINECNRREQUIRED_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "_ECNR_REQUIRED");
    private final static QName _PersonPassportLegDDFINNAME_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "_NAME");
    private final static QName _PersonPassportLegDDFAEACCOMPANYINGPERSONS_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "_ACCOMPANYING_PERSONS");
    private final static QName _PersonPassportLegDDFAEALTERNATEISSUEPLACE_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "_ALTERNATE_ISSUE_PLACE");
    private final static QName _PersonPassportLegDDFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "__FLEX_Context");
    private final static QName _PersonPassportLegDDFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "_FLEX_NumOfSegments");
    private final static QName _PersonPassportLegDDFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", "__FLEX_Context_DisplayValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.personpassportlegddf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonPassportLegDDFKW }
     * 
     */
    public PersonPassportLegDDFKW createPersonPassportLegDDFKW() {
        return new PersonPassportLegDDFKW();
    }

    /**
     * Create an instance of {@link PersonPassportLegDDFIN }
     * 
     */
    public PersonPassportLegDDFIN createPersonPassportLegDDFIN() {
        return new PersonPassportLegDDFIN();
    }

    /**
     * Create an instance of {@link PersonPassportLegDDFAE }
     * 
     */
    public PersonPassportLegDDFAE createPersonPassportLegDDFAE() {
        return new PersonPassportLegDDFAE();
    }

    /**
     * Create an instance of {@link PersonPassportLegDDF }
     * 
     */
    public PersonPassportLegDDF createPersonPassportLegDDF() {
        return new PersonPassportLegDDF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPassportLegDDFKW }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "personPassportLegDDFKW")
    public JAXBElement<PersonPassportLegDDFKW> createPersonPassportLegDDFKW(PersonPassportLegDDFKW value) {
        return new JAXBElement<PersonPassportLegDDFKW>(_PersonPassportLegDDFKW_QNAME, PersonPassportLegDDFKW.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPassportLegDDFAE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "personPassportLegDDFAE")
    public JAXBElement<PersonPassportLegDDFAE> createPersonPassportLegDDFAE(PersonPassportLegDDFAE value) {
        return new JAXBElement<PersonPassportLegDDFAE>(_PersonPassportLegDDFAE_QNAME, PersonPassportLegDDFAE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPassportLegDDF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "personPassportLegDDF")
    public JAXBElement<PersonPassportLegDDF> createPersonPassportLegDDF(PersonPassportLegDDF value) {
        return new JAXBElement<PersonPassportLegDDF>(_PersonPassportLegDDF_QNAME, PersonPassportLegDDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPassportLegDDFIN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "personPassportLegDDFIN")
    public JAXBElement<PersonPassportLegDDFIN> createPersonPassportLegDDFIN(PersonPassportLegDDFIN value) {
        return new JAXBElement<PersonPassportLegDDFIN>(_PersonPassportLegDDFIN_QNAME, PersonPassportLegDDFIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "_ACCOMPANY_PERSON", scope = PersonPassportLegDDFKW.class)
    public JAXBElement<BigDecimal> createPersonPassportLegDDFKWACCOMPANYPERSON(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonPassportLegDDFKWACCOMPANYPERSON_QNAME, BigDecimal.class, PersonPassportLegDDFKW.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "_ECNR_REQUIRED", scope = PersonPassportLegDDFIN.class)
    public JAXBElement<String> createPersonPassportLegDDFINECNRREQUIRED(String value) {
        return new JAXBElement<String>(_PersonPassportLegDDFINECNRREQUIRED_QNAME, String.class, PersonPassportLegDDFIN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "_NAME", scope = PersonPassportLegDDFIN.class)
    public JAXBElement<String> createPersonPassportLegDDFINNAME(String value) {
        return new JAXBElement<String>(_PersonPassportLegDDFINNAME_QNAME, String.class, PersonPassportLegDDFIN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "_ACCOMPANYING_PERSONS", scope = PersonPassportLegDDFAE.class)
    public JAXBElement<BigDecimal> createPersonPassportLegDDFAEACCOMPANYINGPERSONS(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonPassportLegDDFAEACCOMPANYINGPERSONS_QNAME, BigDecimal.class, PersonPassportLegDDFAE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "_ALTERNATE_ISSUE_PLACE", scope = PersonPassportLegDDFAE.class)
    public JAXBElement<String> createPersonPassportLegDDFAEALTERNATEISSUEPLACE(String value) {
        return new JAXBElement<String>(_PersonPassportLegDDFAEALTERNATEISSUEPLACE_QNAME, String.class, PersonPassportLegDDFAE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "__FLEX_Context", scope = PersonPassportLegDDF.class)
    public JAXBElement<String> createPersonPassportLegDDFFLEXContext(String value) {
        return new JAXBElement<String>(_PersonPassportLegDDFFLEXContext_QNAME, String.class, PersonPassportLegDDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "_FLEX_NumOfSegments", scope = PersonPassportLegDDF.class)
    public JAXBElement<Integer> createPersonPassportLegDDFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_PersonPassportLegDDFFLEXNumOfSegments_QNAME, Integer.class, PersonPassportLegDDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personPassportLegDDF/", name = "__FLEX_Context_DisplayValue", scope = PersonPassportLegDDF.class)
    public JAXBElement<String> createPersonPassportLegDDFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_PersonPassportLegDDFFLEXContextDisplayValue_QNAME, String.class, PersonPassportLegDDF.class, value);
    }

}
