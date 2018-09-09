
package com.oracle.xmlns.apps.hcm.people.core.flex.emailaddressdff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.people.core.flex.emailaddressdff package. 
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

    private final static QName _EmailAddressDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/emailAddressDFF/", "emailAddressDFF");
    private final static QName _EmailAddressDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/emailAddressDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _EmailAddressDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/emailAddressDFF/", "_FLEX_NumOfSegments");
    private final static QName _EmailAddressDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/core/flex/emailAddressDFF/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.people.core.flex.emailaddressdff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmailAddressDFF }
     * 
     */
    public EmailAddressDFF createEmailAddressDFF() {
        return new EmailAddressDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddressDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/emailAddressDFF/", name = "emailAddressDFF")
    public JAXBElement<EmailAddressDFF> createEmailAddressDFF(EmailAddressDFF value) {
        return new JAXBElement<EmailAddressDFF>(_EmailAddressDFF_QNAME, EmailAddressDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/emailAddressDFF/", name = "__FLEX_Context_DisplayValue", scope = EmailAddressDFF.class)
    public JAXBElement<String> createEmailAddressDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_EmailAddressDFFFLEXContextDisplayValue_QNAME, String.class, EmailAddressDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/emailAddressDFF/", name = "_FLEX_NumOfSegments", scope = EmailAddressDFF.class)
    public JAXBElement<Integer> createEmailAddressDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_EmailAddressDFFFLEXNumOfSegments_QNAME, Integer.class, EmailAddressDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/people/core/flex/emailAddressDFF/", name = "__FLEX_Context", scope = EmailAddressDFF.class)
    public JAXBElement<String> createEmailAddressDFFFLEXContext(String value) {
        return new JAXBElement<String>(_EmailAddressDFFFLEXContext_QNAME, String.class, EmailAddressDFF.class, value);
    }

}
