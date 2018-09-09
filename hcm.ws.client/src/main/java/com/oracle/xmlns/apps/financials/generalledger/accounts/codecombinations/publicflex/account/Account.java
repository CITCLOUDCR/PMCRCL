
package com.oracle.xmlns.apps.financials.generalledger.accounts.codecombinations.publicflex.account;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_FLEX_StructureInstanceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FLEX_StructureInstanceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StartDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EnabledFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_CODE_COMBINATION_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="_CHART_OF_ACCOUNTS_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FND_ACFF_ConcatenatedStorage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FND_ACFF_Delimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "flexStructureInstanceCode",
    "flexStructureInstanceId",
    "startDateActive",
    "endDateActive",
    "enabledFlag",
    "codecombinationid",
    "chartofaccountsid",
    "fndacffConcatenatedStorage",
    "fndacffDelimiter"
})
public class Account {

    @XmlElement(name = "_FLEX_StructureInstanceCode")
    protected String flexStructureInstanceCode;
    @XmlElement(name = "_FLEX_StructureInstanceId")
    protected Long flexStructureInstanceId;
    @XmlElementRef(name = "StartDateActive", namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startDateActive;
    @XmlElementRef(name = "EndDateActive", namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDateActive;
    @XmlElement(name = "EnabledFlag")
    protected String enabledFlag;
    @XmlElement(name = "_CODE_COMBINATION_ID")
    protected Long codecombinationid;
    @XmlElement(name = "_CHART_OF_ACCOUNTS_ID")
    protected Long chartofaccountsid;
    @XmlElementRef(name = "FND_ACFF_ConcatenatedStorage", namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", type = JAXBElement.class)
    protected JAXBElement<String> fndacffConcatenatedStorage;
    @XmlElementRef(name = "FND_ACFF_Delimiter", namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", type = JAXBElement.class)
    protected JAXBElement<String> fndacffDelimiter;

    /**
     * Gets the value of the flexStructureInstanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLEXStructureInstanceCode() {
        return flexStructureInstanceCode;
    }

    /**
     * Sets the value of the flexStructureInstanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLEXStructureInstanceCode(String value) {
        this.flexStructureInstanceCode = value;
    }

    /**
     * Gets the value of the flexStructureInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFLEXStructureInstanceId() {
        return flexStructureInstanceId;
    }

    /**
     * Sets the value of the flexStructureInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFLEXStructureInstanceId(Long value) {
        this.flexStructureInstanceId = value;
    }

    /**
     * Gets the value of the startDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDateActive() {
        return startDateActive;
    }

    /**
     * Sets the value of the startDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDateActive(JAXBElement<XMLGregorianCalendar> value) {
        this.startDateActive = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the endDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateActive() {
        return endDateActive;
    }

    /**
     * Sets the value of the endDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateActive(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateActive = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the enabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledFlag() {
        return enabledFlag;
    }

    /**
     * Sets the value of the enabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledFlag(String value) {
        this.enabledFlag = value;
    }

    /**
     * Gets the value of the codecombinationid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCODECOMBINATIONID() {
        return codecombinationid;
    }

    /**
     * Sets the value of the codecombinationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCODECOMBINATIONID(Long value) {
        this.codecombinationid = value;
    }

    /**
     * Gets the value of the chartofaccountsid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCHARTOFACCOUNTSID() {
        return chartofaccountsid;
    }

    /**
     * Sets the value of the chartofaccountsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCHARTOFACCOUNTSID(Long value) {
        this.chartofaccountsid = value;
    }

    /**
     * Gets the value of the fndacffConcatenatedStorage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFNDACFFConcatenatedStorage() {
        return fndacffConcatenatedStorage;
    }

    /**
     * Sets the value of the fndacffConcatenatedStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFNDACFFConcatenatedStorage(JAXBElement<String> value) {
        this.fndacffConcatenatedStorage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fndacffDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFNDACFFDelimiter() {
        return fndacffDelimiter;
    }

    /**
     * Sets the value of the fndacffDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFNDACFFDelimiter(JAXBElement<String> value) {
        this.fndacffDelimiter = ((JAXBElement<String> ) value);
    }

}
