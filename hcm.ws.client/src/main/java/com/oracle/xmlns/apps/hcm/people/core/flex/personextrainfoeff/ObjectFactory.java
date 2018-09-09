
package com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff package. 
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

    private final static QName _PersonExtraInformationContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "personExtraInformationContext");
    private final static QName _PersonExtraInformationContextSourceSystemId_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "SourceSystemId");
    private final static QName _PersonExtraInformationContextGUID_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "GUID");
    private final static QName _PersonExtraInformationContextCategoryCode_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "CategoryCode");
    private final static QName _PersonExtraInformationContextRangeStartDate_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "RangeStartDate");
    private final static QName _PersonExtraInformationContextPersonNumber_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "PersonNumber");
    private final static QName _PersonExtraInformationContextSourceSystemOwner_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "SourceSystemOwner");
    private final static QName _PersonExtraInformationContextRangeEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "RangeEndDate");
    private final static QName _PersonExtraInformationContextRangeMode_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "RangeMode");
    private final static QName _PersonExtraInformationContextPeiInformationCategory_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", "PeiInformationCategory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.personextrainfoeff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonExtraInformationContext }
     * 
     */
    public PersonExtraInformationContext createPersonExtraInformationContext() {
        return new PersonExtraInformationContext();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonExtraInformationContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "personExtraInformationContext")
    public JAXBElement<PersonExtraInformationContext> createPersonExtraInformationContext(PersonExtraInformationContext value) {
        return new JAXBElement<PersonExtraInformationContext>(_PersonExtraInformationContext_QNAME, PersonExtraInformationContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "SourceSystemId", scope = PersonExtraInformationContext.class)
    public JAXBElement<String> createPersonExtraInformationContextSourceSystemId(String value) {
        return new JAXBElement<String>(_PersonExtraInformationContextSourceSystemId_QNAME, String.class, PersonExtraInformationContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "GUID", scope = PersonExtraInformationContext.class)
    public JAXBElement<String> createPersonExtraInformationContextGUID(String value) {
        return new JAXBElement<String>(_PersonExtraInformationContextGUID_QNAME, String.class, PersonExtraInformationContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "CategoryCode", scope = PersonExtraInformationContext.class)
    public JAXBElement<String> createPersonExtraInformationContextCategoryCode(String value) {
        return new JAXBElement<String>(_PersonExtraInformationContextCategoryCode_QNAME, String.class, PersonExtraInformationContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "RangeStartDate", scope = PersonExtraInformationContext.class)
    public JAXBElement<XMLGregorianCalendar> createPersonExtraInformationContextRangeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonExtraInformationContextRangeStartDate_QNAME, XMLGregorianCalendar.class, PersonExtraInformationContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "PersonNumber", scope = PersonExtraInformationContext.class)
    public JAXBElement<String> createPersonExtraInformationContextPersonNumber(String value) {
        return new JAXBElement<String>(_PersonExtraInformationContextPersonNumber_QNAME, String.class, PersonExtraInformationContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "SourceSystemOwner", scope = PersonExtraInformationContext.class)
    public JAXBElement<String> createPersonExtraInformationContextSourceSystemOwner(String value) {
        return new JAXBElement<String>(_PersonExtraInformationContextSourceSystemOwner_QNAME, String.class, PersonExtraInformationContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "RangeEndDate", scope = PersonExtraInformationContext.class)
    public JAXBElement<XMLGregorianCalendar> createPersonExtraInformationContextRangeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonExtraInformationContextRangeEndDate_QNAME, XMLGregorianCalendar.class, PersonExtraInformationContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "RangeMode", scope = PersonExtraInformationContext.class)
    public JAXBElement<String> createPersonExtraInformationContextRangeMode(String value) {
        return new JAXBElement<String>(_PersonExtraInformationContextRangeMode_QNAME, String.class, PersonExtraInformationContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personExtraInfoEFF/", name = "PeiInformationCategory", scope = PersonExtraInformationContext.class, defaultValue = "0")
    public JAXBElement<String> createPersonExtraInformationContextPeiInformationCategory(String value) {
        return new JAXBElement<String>(_PersonExtraInformationContextPeiInformationCategory_QNAME, String.class, PersonExtraInformationContext.class, value);
    }

}
