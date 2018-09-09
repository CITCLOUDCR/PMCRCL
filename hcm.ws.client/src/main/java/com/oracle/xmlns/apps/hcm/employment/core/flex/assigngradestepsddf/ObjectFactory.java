
package com.oracle.xmlns.apps.hcm.employment.core.flex.assigngradestepsddf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.employment.core.flex.assigngradestepsddf package. 
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

    private final static QName _AssignGradeStepsLegDDF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignGradeStepsDDF/", "assignGradeStepsLegDDF");
    private final static QName _AssignGradeStepsLegDDFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignGradeStepsDDF/", "_FLEX_NumOfSegments");
    private final static QName _AssignGradeStepsLegDDFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignGradeStepsDDF/", "__FLEX_Context_DisplayValue");
    private final static QName _AssignGradeStepsLegDDFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignGradeStepsDDF/", "__FLEX_Context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.employment.core.flex.assigngradestepsddf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssignGradeStepsLegDDF }
     * 
     */
    public AssignGradeStepsLegDDF createAssignGradeStepsLegDDF() {
        return new AssignGradeStepsLegDDF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignGradeStepsLegDDF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignGradeStepsDDF/", name = "assignGradeStepsLegDDF")
    public JAXBElement<AssignGradeStepsLegDDF> createAssignGradeStepsLegDDF(AssignGradeStepsLegDDF value) {
        return new JAXBElement<AssignGradeStepsLegDDF>(_AssignGradeStepsLegDDF_QNAME, AssignGradeStepsLegDDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignGradeStepsDDF/", name = "_FLEX_NumOfSegments", scope = AssignGradeStepsLegDDF.class)
    public JAXBElement<Integer> createAssignGradeStepsLegDDFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_AssignGradeStepsLegDDFFLEXNumOfSegments_QNAME, Integer.class, AssignGradeStepsLegDDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignGradeStepsDDF/", name = "__FLEX_Context_DisplayValue", scope = AssignGradeStepsLegDDF.class)
    public JAXBElement<String> createAssignGradeStepsLegDDFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_AssignGradeStepsLegDDFFLEXContextDisplayValue_QNAME, String.class, AssignGradeStepsLegDDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/assignGradeStepsDDF/", name = "__FLEX_Context", scope = AssignGradeStepsLegDDF.class)
    public JAXBElement<String> createAssignGradeStepsLegDDFFLEXContext(String value) {
        return new JAXBElement<String>(_AssignGradeStepsLegDDFFLEXContext_QNAME, String.class, AssignGradeStepsLegDDF.class, value);
    }

}
