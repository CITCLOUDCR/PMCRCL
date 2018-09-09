
package com.oracle.xmlns.apps.hcm.employment.core.flex.contractddf;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContractLegDDFCN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractLegDDFCN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/}ContractLegDDF">
 *       &lt;sequence>
 *         &lt;element name="_CONST_PROB_DATE" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="_NOTICE_PRD_RESIGN_PROB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_NOTICE_PRD_DISMISS_PROB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_NOTICE_PERIOD_DISMISS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_NOTICE_PRD_RESIGN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_NOTICE_DURATION_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NOTICE_DURATION_UNIT_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_COMPETITION_CLAUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_COMPETITION_CLAUSE_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_NDA_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CANCELLATION_FILE_NUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractLegDDFCN", propOrder = {
    "constprobdate",
    "noticeprdresignprob",
    "noticeprddismissprob",
    "noticeperioddismiss",
    "noticeprdresign",
    "noticedurationunit",
    "noticedurationunitDisplay",
    "competitionclause",
    "competitionclauseDisplay",
    "nda",
    "ndaDisplay",
    "cancellationfilenum"
})
public class ContractLegDDFCN
    extends ContractLegDDF
{

    @XmlElementRef(name = "_CONST_PROB_DATE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> constprobdate;
    @XmlElementRef(name = "_NOTICE_PRD_RESIGN_PROB", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> noticeprdresignprob;
    @XmlElementRef(name = "_NOTICE_PRD_DISMISS_PROB", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> noticeprddismissprob;
    @XmlElementRef(name = "_NOTICE_PERIOD_DISMISS", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> noticeperioddismiss;
    @XmlElementRef(name = "_NOTICE_PRD_RESIGN", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> noticeprdresign;
    @XmlElementRef(name = "_NOTICE_DURATION_UNIT", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> noticedurationunit;
    @XmlElementRef(name = "_NOTICE_DURATION_UNIT_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> noticedurationunitDisplay;
    @XmlElementRef(name = "_COMPETITION_CLAUSE", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> competitionclause;
    @XmlElementRef(name = "_COMPETITION_CLAUSE_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> competitionclauseDisplay;
    @XmlElementRef(name = "_NDA", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> nda;
    @XmlElementRef(name = "_NDA_Display", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> ndaDisplay;
    @XmlElementRef(name = "_CANCELLATION_FILE_NUM", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/flex/contractDDF/", type = JAXBElement.class)
    protected JAXBElement<String> cancellationfilenum;

    /**
     * Gets the value of the constprobdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCONSTPROBDATE() {
        return constprobdate;
    }

    /**
     * Sets the value of the constprobdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCONSTPROBDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.constprobdate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the noticeprdresignprob property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNOTICEPRDRESIGNPROB() {
        return noticeprdresignprob;
    }

    /**
     * Sets the value of the noticeprdresignprob property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNOTICEPRDRESIGNPROB(JAXBElement<BigDecimal> value) {
        this.noticeprdresignprob = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the noticeprddismissprob property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNOTICEPRDDISMISSPROB() {
        return noticeprddismissprob;
    }

    /**
     * Sets the value of the noticeprddismissprob property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNOTICEPRDDISMISSPROB(JAXBElement<BigDecimal> value) {
        this.noticeprddismissprob = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the noticeperioddismiss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNOTICEPERIODDISMISS() {
        return noticeperioddismiss;
    }

    /**
     * Sets the value of the noticeperioddismiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNOTICEPERIODDISMISS(JAXBElement<BigDecimal> value) {
        this.noticeperioddismiss = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the noticeprdresign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNOTICEPRDRESIGN() {
        return noticeprdresign;
    }

    /**
     * Sets the value of the noticeprdresign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNOTICEPRDRESIGN(JAXBElement<BigDecimal> value) {
        this.noticeprdresign = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the noticedurationunit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNOTICEDURATIONUNIT() {
        return noticedurationunit;
    }

    /**
     * Sets the value of the noticedurationunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNOTICEDURATIONUNIT(JAXBElement<String> value) {
        this.noticedurationunit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noticedurationunitDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNOTICEDURATIONUNITDisplay() {
        return noticedurationunitDisplay;
    }

    /**
     * Sets the value of the noticedurationunitDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNOTICEDURATIONUNITDisplay(JAXBElement<String> value) {
        this.noticedurationunitDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the competitionclause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMPETITIONCLAUSE() {
        return competitionclause;
    }

    /**
     * Sets the value of the competitionclause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMPETITIONCLAUSE(JAXBElement<String> value) {
        this.competitionclause = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the competitionclauseDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMPETITIONCLAUSEDisplay() {
        return competitionclauseDisplay;
    }

    /**
     * Sets the value of the competitionclauseDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMPETITIONCLAUSEDisplay(JAXBElement<String> value) {
        this.competitionclauseDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNDA() {
        return nda;
    }

    /**
     * Sets the value of the nda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNDA(JAXBElement<String> value) {
        this.nda = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ndaDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNDADisplay() {
        return ndaDisplay;
    }

    /**
     * Sets the value of the ndaDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNDADisplay(JAXBElement<String> value) {
        this.ndaDisplay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cancellationfilenum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCANCELLATIONFILENUM() {
        return cancellationfilenum;
    }

    /**
     * Sets the value of the cancellationfilenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCANCELLATIONFILENUM(JAXBElement<String> value) {
        this.cancellationfilenum = ((JAXBElement<String> ) value);
    }

}
