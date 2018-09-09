
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonUserInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonUserInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonUserInformationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="UserGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendCredentialsEmailFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CredentialsEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeneratedUserAccountFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UsernameMatchingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailMatchingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreateUserIfNoMatchingEmailFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PersonUserManualRoles" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonUserManualRoles" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonUserInformation", propOrder = {
    "personUserInformationId",
    "personId",
    "personNumber",
    "startDate",
    "userGUID",
    "userName",
    "sendCredentialsEmailFlag",
    "credentialsEmailAddress",
    "generatedUserAccountFlag",
    "usernameMatchingFlag",
    "emailAddress",
    "emailMatchingFlag",
    "createUserIfNoMatchingEmailFlag",
    "personUserManualRoles"
})
public class PersonUserInformation {

    @XmlElementRef(name = "PersonUserInformationId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> personUserInformationId;
    @XmlElementRef(name = "PersonId", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Long> personId;
    @XmlElementRef(name = "PersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> personNumber;
    @XmlElementRef(name = "StartDate", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "UserGUID", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> userGUID;
    @XmlElementRef(name = "UserName", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "SendCredentialsEmailFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> sendCredentialsEmailFlag;
    @XmlElementRef(name = "CredentialsEmailAddress", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> credentialsEmailAddress;
    @XmlElementRef(name = "GeneratedUserAccountFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> generatedUserAccountFlag;
    @XmlElementRef(name = "UsernameMatchingFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> usernameMatchingFlag;
    @XmlElementRef(name = "EmailAddress", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "EmailMatchingFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> emailMatchingFlag;
    @XmlElementRef(name = "CreateUserIfNoMatchingEmailFlag", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<Boolean> createUserIfNoMatchingEmailFlag;
    @XmlElement(name = "PersonUserManualRoles")
    protected List<PersonUserManualRoles> personUserManualRoles;

    /**
     * Gets the value of the personUserInformationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPersonUserInformationId() {
        return personUserInformationId;
    }

    /**
     * Sets the value of the personUserInformationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPersonUserInformationId(JAXBElement<Long> value) {
        this.personUserInformationId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPersonId(JAXBElement<Long> value) {
        this.personId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonNumber(JAXBElement<String> value) {
        this.personNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the userGUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserGUID() {
        return userGUID;
    }

    /**
     * Sets the value of the userGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserGUID(JAXBElement<String> value) {
        this.userGUID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sendCredentialsEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSendCredentialsEmailFlag() {
        return sendCredentialsEmailFlag;
    }

    /**
     * Sets the value of the sendCredentialsEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSendCredentialsEmailFlag(JAXBElement<Boolean> value) {
        this.sendCredentialsEmailFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the credentialsEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCredentialsEmailAddress() {
        return credentialsEmailAddress;
    }

    /**
     * Sets the value of the credentialsEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCredentialsEmailAddress(JAXBElement<String> value) {
        this.credentialsEmailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the generatedUserAccountFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGeneratedUserAccountFlag() {
        return generatedUserAccountFlag;
    }

    /**
     * Sets the value of the generatedUserAccountFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGeneratedUserAccountFlag(JAXBElement<Boolean> value) {
        this.generatedUserAccountFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the usernameMatchingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUsernameMatchingFlag() {
        return usernameMatchingFlag;
    }

    /**
     * Sets the value of the usernameMatchingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUsernameMatchingFlag(JAXBElement<Boolean> value) {
        this.usernameMatchingFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailMatchingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEmailMatchingFlag() {
        return emailMatchingFlag;
    }

    /**
     * Sets the value of the emailMatchingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEmailMatchingFlag(JAXBElement<Boolean> value) {
        this.emailMatchingFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the createUserIfNoMatchingEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCreateUserIfNoMatchingEmailFlag() {
        return createUserIfNoMatchingEmailFlag;
    }

    /**
     * Sets the value of the createUserIfNoMatchingEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCreateUserIfNoMatchingEmailFlag(JAXBElement<Boolean> value) {
        this.createUserIfNoMatchingEmailFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the personUserManualRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personUserManualRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonUserManualRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonUserManualRoles }
     * 
     * 
     */
    public List<PersonUserManualRoles> getPersonUserManualRoles() {
        if (personUserManualRoles == null) {
            personUserManualRoles = new ArrayList<PersonUserManualRoles>();
        }
        return this.personUserManualRoles;
    }

}
