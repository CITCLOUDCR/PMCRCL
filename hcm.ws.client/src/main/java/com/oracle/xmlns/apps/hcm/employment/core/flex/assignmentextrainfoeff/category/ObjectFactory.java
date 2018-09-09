
package com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentextrainfoeff.category;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentextrainfoeff.category package. 
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

    private final static QName _JCategoryPerAsgEitprivate_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", "j_CategoryPerAsgEitprivate");
    private final static QName _JAssignmentEitCategory_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", "j_AssignmentEitCategory");
    private final static QName _JAssignmentEitCategoryGUID_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", "GUID");
    private final static QName _JAssignmentEitCategoryRangeStartDate_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", "RangeStartDate");
    private final static QName _JAssignmentEitCategorySourceSystemId_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", "SourceSystemId");
    private final static QName _JAssignmentEitCategorySourceSystemOwner_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", "SourceSystemOwner");
    private final static QName _JAssignmentEitCategoryRangeMode_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", "RangeMode");
    private final static QName _JAssignmentEitCategoryRangeEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", "RangeEndDate");
    private final static QName _JAssignmentEitCategoryAssignmentNumber_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", "AssignmentNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.employment.core.flex.assignmentextrainfoeff.category
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JCategoryPerAsgEitprivate }
     * 
     */
    public JCategoryPerAsgEitprivate createJCategoryPerAsgEitprivate() {
        return new JCategoryPerAsgEitprivate();
    }

    /**
     * Create an instance of {@link JAssignmentEitCategory }
     * 
     */
    public JAssignmentEitCategory createJAssignmentEitCategory() {
        return new JAssignmentEitCategory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JCategoryPerAsgEitprivate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", name = "j_CategoryPerAsgEitprivate")
    public JAXBElement<JCategoryPerAsgEitprivate> createJCategoryPerAsgEitprivate(JCategoryPerAsgEitprivate value) {
        return new JAXBElement<JCategoryPerAsgEitprivate>(_JCategoryPerAsgEitprivate_QNAME, JCategoryPerAsgEitprivate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAssignmentEitCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", name = "j_AssignmentEitCategory")
    public JAXBElement<JAssignmentEitCategory> createJAssignmentEitCategory(JAssignmentEitCategory value) {
        return new JAXBElement<JAssignmentEitCategory>(_JAssignmentEitCategory_QNAME, JAssignmentEitCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", name = "GUID", scope = JAssignmentEitCategory.class)
    public JAXBElement<String> createJAssignmentEitCategoryGUID(String value) {
        return new JAXBElement<String>(_JAssignmentEitCategoryGUID_QNAME, String.class, JAssignmentEitCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", name = "RangeStartDate", scope = JAssignmentEitCategory.class)
    public JAXBElement<XMLGregorianCalendar> createJAssignmentEitCategoryRangeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_JAssignmentEitCategoryRangeStartDate_QNAME, XMLGregorianCalendar.class, JAssignmentEitCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", name = "SourceSystemId", scope = JAssignmentEitCategory.class)
    public JAXBElement<String> createJAssignmentEitCategorySourceSystemId(String value) {
        return new JAXBElement<String>(_JAssignmentEitCategorySourceSystemId_QNAME, String.class, JAssignmentEitCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", name = "SourceSystemOwner", scope = JAssignmentEitCategory.class)
    public JAXBElement<String> createJAssignmentEitCategorySourceSystemOwner(String value) {
        return new JAXBElement<String>(_JAssignmentEitCategorySourceSystemOwner_QNAME, String.class, JAssignmentEitCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", name = "RangeMode", scope = JAssignmentEitCategory.class)
    public JAXBElement<String> createJAssignmentEitCategoryRangeMode(String value) {
        return new JAXBElement<String>(_JAssignmentEitCategoryRangeMode_QNAME, String.class, JAssignmentEitCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", name = "RangeEndDate", scope = JAssignmentEitCategory.class)
    public JAXBElement<XMLGregorianCalendar> createJAssignmentEitCategoryRangeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_JAssignmentEitCategoryRangeEndDate_QNAME, XMLGregorianCalendar.class, JAssignmentEitCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignmentExtraInfoEFF/Category/", name = "AssignmentNumber", scope = JAssignmentEitCategory.class)
    public JAXBElement<String> createJAssignmentEitCategoryAssignmentNumber(String value) {
        return new JAXBElement<String>(_JAssignmentEitCategoryAssignmentNumber_QNAME, String.class, JAssignmentEitCategory.class, value);
    }

}
