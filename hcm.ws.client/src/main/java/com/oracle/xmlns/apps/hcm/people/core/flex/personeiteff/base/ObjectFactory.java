
package com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.base;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.base package. 
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

    private final static QName _JPersonExtraInformationPerEitprivate_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", "j_PersonExtraInformationPerEitprivate");
    private final static QName _JPersonExtraInformation_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", "j_PersonExtraInformation");
    private final static QName _JPersonExtraInformationSourceSystemId_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", "SourceSystemId");
    private final static QName _JPersonExtraInformationGUID_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", "GUID");
    private final static QName _JPersonExtraInformationPersonNumber_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", "PersonNumber");
    private final static QName _JPersonExtraInformationSourceSystemOwner_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", "SourceSystemOwner");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JPersonExtraInformation }
     * 
     */
    public JPersonExtraInformation createJPersonExtraInformation() {
        return new JPersonExtraInformation();
    }

    /**
     * Create an instance of {@link JPersonExtraInformationPerEitprivate }
     * 
     */
    public JPersonExtraInformationPerEitprivate createJPersonExtraInformationPerEitprivate() {
        return new JPersonExtraInformationPerEitprivate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JPersonExtraInformationPerEitprivate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", name = "j_PersonExtraInformationPerEitprivate")
    public JAXBElement<JPersonExtraInformationPerEitprivate> createJPersonExtraInformationPerEitprivate(JPersonExtraInformationPerEitprivate value) {
        return new JAXBElement<JPersonExtraInformationPerEitprivate>(_JPersonExtraInformationPerEitprivate_QNAME, JPersonExtraInformationPerEitprivate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JPersonExtraInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", name = "j_PersonExtraInformation")
    public JAXBElement<JPersonExtraInformation> createJPersonExtraInformation(JPersonExtraInformation value) {
        return new JAXBElement<JPersonExtraInformation>(_JPersonExtraInformation_QNAME, JPersonExtraInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", name = "SourceSystemId", scope = JPersonExtraInformation.class)
    public JAXBElement<String> createJPersonExtraInformationSourceSystemId(String value) {
        return new JAXBElement<String>(_JPersonExtraInformationSourceSystemId_QNAME, String.class, JPersonExtraInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", name = "GUID", scope = JPersonExtraInformation.class)
    public JAXBElement<String> createJPersonExtraInformationGUID(String value) {
        return new JAXBElement<String>(_JPersonExtraInformationGUID_QNAME, String.class, JPersonExtraInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", name = "PersonNumber", scope = JPersonExtraInformation.class)
    public JAXBElement<String> createJPersonExtraInformationPersonNumber(String value) {
        return new JAXBElement<String>(_JPersonExtraInformationPersonNumber_QNAME, String.class, JPersonExtraInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/", name = "SourceSystemOwner", scope = JPersonExtraInformation.class)
    public JAXBElement<String> createJPersonExtraInformationSourceSystemOwner(String value) {
        return new JAXBElement<String>(_JPersonExtraInformationSourceSystemOwner_QNAME, String.class, JPersonExtraInformation.class, value);
    }

}
