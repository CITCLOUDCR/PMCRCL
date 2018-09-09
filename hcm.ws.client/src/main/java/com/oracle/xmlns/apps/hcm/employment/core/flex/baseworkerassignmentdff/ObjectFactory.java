
package com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentdff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentdff package. 
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

    private final static QName _BaseWorkerAsgDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "baseWorkerAsgDFF");
    private final static QName _BaseWorkerAsgDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "__FLEX_Context");
    private final static QName _BaseWorkerAsgDFFCuentaCliente_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "cuentaCliente");
    private final static QName _BaseWorkerAsgDFFBanco_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "banco");
    private final static QName _BaseWorkerAsgDFFCentroFuncionalDepartamento_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "centroFuncionalDepartamento");
    private final static QName _BaseWorkerAsgDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _BaseWorkerAsgDFFCentroFuncionalContable_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "centroFuncionalContable");
    private final static QName _BaseWorkerAsgDFFCuenta_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "cuenta");
    private final static QName _BaseWorkerAsgDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "_FLEX_NumOfSegments");
    private final static QName _BaseWorkerAsgDFFTipoCuenta_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", "tipoCuenta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentdff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaseWorkerAsgDFF }
     * 
     */
    public BaseWorkerAsgDFF createBaseWorkerAsgDFF() {
        return new BaseWorkerAsgDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseWorkerAsgDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "baseWorkerAsgDFF")
    public JAXBElement<BaseWorkerAsgDFF> createBaseWorkerAsgDFF(BaseWorkerAsgDFF value) {
        return new JAXBElement<BaseWorkerAsgDFF>(_BaseWorkerAsgDFF_QNAME, BaseWorkerAsgDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "__FLEX_Context", scope = BaseWorkerAsgDFF.class)
    public JAXBElement<String> createBaseWorkerAsgDFFFLEXContext(String value) {
        return new JAXBElement<String>(_BaseWorkerAsgDFFFLEXContext_QNAME, String.class, BaseWorkerAsgDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "cuentaCliente", scope = BaseWorkerAsgDFF.class)
    public JAXBElement<String> createBaseWorkerAsgDFFCuentaCliente(String value) {
        return new JAXBElement<String>(_BaseWorkerAsgDFFCuentaCliente_QNAME, String.class, BaseWorkerAsgDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "banco", scope = BaseWorkerAsgDFF.class)
    public JAXBElement<String> createBaseWorkerAsgDFFBanco(String value) {
        return new JAXBElement<String>(_BaseWorkerAsgDFFBanco_QNAME, String.class, BaseWorkerAsgDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "centroFuncionalDepartamento", scope = BaseWorkerAsgDFF.class)
    public JAXBElement<String> createBaseWorkerAsgDFFCentroFuncionalDepartamento(String value) {
        return new JAXBElement<String>(_BaseWorkerAsgDFFCentroFuncionalDepartamento_QNAME, String.class, BaseWorkerAsgDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "__FLEX_Context_DisplayValue", scope = BaseWorkerAsgDFF.class)
    public JAXBElement<String> createBaseWorkerAsgDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_BaseWorkerAsgDFFFLEXContextDisplayValue_QNAME, String.class, BaseWorkerAsgDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "centroFuncionalContable", scope = BaseWorkerAsgDFF.class)
    public JAXBElement<String> createBaseWorkerAsgDFFCentroFuncionalContable(String value) {
        return new JAXBElement<String>(_BaseWorkerAsgDFFCentroFuncionalContable_QNAME, String.class, BaseWorkerAsgDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "cuenta", scope = BaseWorkerAsgDFF.class)
    public JAXBElement<String> createBaseWorkerAsgDFFCuenta(String value) {
        return new JAXBElement<String>(_BaseWorkerAsgDFFCuenta_QNAME, String.class, BaseWorkerAsgDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "_FLEX_NumOfSegments", scope = BaseWorkerAsgDFF.class)
    public JAXBElement<Integer> createBaseWorkerAsgDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_BaseWorkerAsgDFFFLEXNumOfSegments_QNAME, Integer.class, BaseWorkerAsgDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/baseWorkerAssignmentDFF/", name = "tipoCuenta", scope = BaseWorkerAsgDFF.class)
    public JAXBElement<String> createBaseWorkerAsgDFFTipoCuenta(String value) {
        return new JAXBElement<String>(_BaseWorkerAsgDFFTipoCuenta_QNAME, String.class, BaseWorkerAsgDFF.class, value);
    }

}
