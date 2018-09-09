
package com.oracle.xmlns.apps.hcm.employment.core.flex.contractdff;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.hcm.employment.core.flex.contractdff package. 
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

    private final static QName _ContractDFF_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDFF/", "contractDFF");
    private final static QName _ContractDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDFF/", "__FLEX_Context");
    private final static QName _ContractDFFFLEXContextDisplayValue_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDFF/", "__FLEX_Context_DisplayValue");
    private final static QName _ContractDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDFF/", "_FLEX_NumOfSegments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.hcm.employment.core.flex.contractdff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContractDFF }
     * 
     */
    public ContractDFF createContractDFF() {
        return new ContractDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDFF/", name = "contractDFF")
    public JAXBElement<ContractDFF> createContractDFF(ContractDFF value) {
        return new JAXBElement<ContractDFF>(_ContractDFF_QNAME, ContractDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDFF/", name = "__FLEX_Context", scope = ContractDFF.class)
    public JAXBElement<String> createContractDFFFLEXContext(String value) {
        return new JAXBElement<String>(_ContractDFFFLEXContext_QNAME, String.class, ContractDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDFF/", name = "__FLEX_Context_DisplayValue", scope = ContractDFF.class)
    public JAXBElement<String> createContractDFFFLEXContextDisplayValue(String value) {
        return new JAXBElement<String>(_ContractDFFFLEXContextDisplayValue_QNAME, String.class, ContractDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDFF/", name = "_FLEX_NumOfSegments", scope = ContractDFF.class)
    public JAXBElement<Integer> createContractDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_ContractDFFFLEXNumOfSegments_QNAME, Integer.class, ContractDFF.class, value);
    }

}
