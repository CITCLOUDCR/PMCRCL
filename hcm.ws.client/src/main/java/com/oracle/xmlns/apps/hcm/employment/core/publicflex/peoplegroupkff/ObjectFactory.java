
package com.oracle.xmlns.apps.hcm.employment.core.publicflex.peoplegroupkff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.employment.core.publicflex.peoplegroupkff package. 
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

    private final static QName _PeopleGroupKFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", "peopleGroupKFF");
    private final static QName _PeopleGroupKFFPeopleGroupFlexfield_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", "peopleGroupKFFPeople__Group__Flexfield");
    private final static QName _PeopleGroupKFFEndDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", "EndDateActive");
    private final static QName _PeopleGroupKFFFNDACFFConcatenatedStorage_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", "FND_ACFF_ConcatenatedStorage");
    private final static QName _PeopleGroupKFFFNDACFFDelimiter_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", "FND_ACFF_Delimiter");
    private final static QName _PeopleGroupKFFStartDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", "StartDateActive");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.employment.core.publicflex.peoplegroupkff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeopleGroupKFFPeopleGroupFlexfield }
     * 
     */
    public PeopleGroupKFFPeopleGroupFlexfield createPeopleGroupKFFPeopleGroupFlexfield() {
        return new PeopleGroupKFFPeopleGroupFlexfield();
    }

    /**
     * Create an instance of {@link PeopleGroupKFF }
     * 
     */
    public PeopleGroupKFF createPeopleGroupKFF() {
        return new PeopleGroupKFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeopleGroupKFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", name = "peopleGroupKFF")
    public JAXBElement<PeopleGroupKFF> createPeopleGroupKFF(PeopleGroupKFF value) {
        return new JAXBElement<PeopleGroupKFF>(_PeopleGroupKFF_QNAME, PeopleGroupKFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeopleGroupKFFPeopleGroupFlexfield }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", name = "peopleGroupKFFPeople__Group__Flexfield")
    public JAXBElement<PeopleGroupKFFPeopleGroupFlexfield> createPeopleGroupKFFPeopleGroupFlexfield(PeopleGroupKFFPeopleGroupFlexfield value) {
        return new JAXBElement<PeopleGroupKFFPeopleGroupFlexfield>(_PeopleGroupKFFPeopleGroupFlexfield_QNAME, PeopleGroupKFFPeopleGroupFlexfield.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", name = "EndDateActive", scope = PeopleGroupKFF.class)
    public JAXBElement<XMLGregorianCalendar> createPeopleGroupKFFEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PeopleGroupKFFEndDateActive_QNAME, XMLGregorianCalendar.class, PeopleGroupKFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", name = "FND_ACFF_ConcatenatedStorage", scope = PeopleGroupKFF.class)
    public JAXBElement<String> createPeopleGroupKFFFNDACFFConcatenatedStorage(String value) {
        return new JAXBElement<String>(_PeopleGroupKFFFNDACFFConcatenatedStorage_QNAME, String.class, PeopleGroupKFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", name = "FND_ACFF_Delimiter", scope = PeopleGroupKFF.class)
    public JAXBElement<String> createPeopleGroupKFFFNDACFFDelimiter(String value) {
        return new JAXBElement<String>(_PeopleGroupKFFFNDACFFDelimiter_QNAME, String.class, PeopleGroupKFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/publicFlex/peopleGroupKFF/", name = "StartDateActive", scope = PeopleGroupKFF.class)
    public JAXBElement<XMLGregorianCalendar> createPeopleGroupKFFStartDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PeopleGroupKFFStartDateActive_QNAME, XMLGregorianCalendar.class, PeopleGroupKFF.class, value);
    }

}
