
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDetails" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonCitizenship" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonCitizenship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonDeliveryMethod" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonDeliveryMethod" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonDriversLicence" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonDriversLicence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonEmail" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonEmail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonEthnicity" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonEthnicity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonImage" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonImage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonLegislativeData" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonLegislativeData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonNationalIdentifier" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonNationalIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonPassport" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonPassport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonPhone" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonPhone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonReligion" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonReligion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonVisa" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonVisa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonAddress" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonExternalIdentifier" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}ExternalIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "personId",
    "personNumber",
    "personDetails",
    "personCitizenship",
    "personDeliveryMethod",
    "personDriversLicence",
    "personEmail",
    "personEthnicity",
    "personImage",
    "personLegislativeData",
    "personName",
    "personNationalIdentifier",
    "personPassport",
    "personPhone",
    "personReligion",
    "personVisa",
    "personAddress",
    "personExternalIdentifier"
})
public class Person {

    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElementRef(name = "PersonNumber", namespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> personNumber;
    @XmlElement(name = "PersonDetails")
    protected List<PersonDetails> personDetails;
    @XmlElement(name = "PersonCitizenship")
    protected List<PersonCitizenship> personCitizenship;
    @XmlElement(name = "PersonDeliveryMethod")
    protected List<PersonDeliveryMethod> personDeliveryMethod;
    @XmlElement(name = "PersonDriversLicence")
    protected List<PersonDriversLicence> personDriversLicence;
    @XmlElement(name = "PersonEmail")
    protected List<PersonEmail> personEmail;
    @XmlElement(name = "PersonEthnicity")
    protected List<PersonEthnicity> personEthnicity;
    @XmlElement(name = "PersonImage")
    protected List<PersonImage> personImage;
    @XmlElement(name = "PersonLegislativeData")
    protected List<PersonLegislativeData> personLegislativeData;
    @XmlElement(name = "PersonName")
    protected List<PersonName> personName;
    @XmlElement(name = "PersonNationalIdentifier")
    protected List<PersonNationalIdentifier> personNationalIdentifier;
    @XmlElement(name = "PersonPassport")
    protected List<PersonPassport> personPassport;
    @XmlElement(name = "PersonPhone")
    protected List<PersonPhone> personPhone;
    @XmlElement(name = "PersonReligion")
    protected List<PersonReligion> personReligion;
    @XmlElement(name = "PersonVisa")
    protected List<PersonVisa> personVisa;
    @XmlElement(name = "PersonAddress")
    protected List<PersonAddress> personAddress;
    @XmlElement(name = "PersonExternalIdentifier")
    protected List<ExternalIdentifier> personExternalIdentifier;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
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
     * Gets the value of the personDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDetails }
     * 
     * 
     */
    public List<PersonDetails> getPersonDetails() {
        if (personDetails == null) {
            personDetails = new ArrayList<PersonDetails>();
        }
        return this.personDetails;
    }

    /**
     * Gets the value of the personCitizenship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personCitizenship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonCitizenship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonCitizenship }
     * 
     * 
     */
    public List<PersonCitizenship> getPersonCitizenship() {
        if (personCitizenship == null) {
            personCitizenship = new ArrayList<PersonCitizenship>();
        }
        return this.personCitizenship;
    }

    /**
     * Gets the value of the personDeliveryMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDeliveryMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDeliveryMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDeliveryMethod }
     * 
     * 
     */
    public List<PersonDeliveryMethod> getPersonDeliveryMethod() {
        if (personDeliveryMethod == null) {
            personDeliveryMethod = new ArrayList<PersonDeliveryMethod>();
        }
        return this.personDeliveryMethod;
    }

    /**
     * Gets the value of the personDriversLicence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDriversLicence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDriversLicence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDriversLicence }
     * 
     * 
     */
    public List<PersonDriversLicence> getPersonDriversLicence() {
        if (personDriversLicence == null) {
            personDriversLicence = new ArrayList<PersonDriversLicence>();
        }
        return this.personDriversLicence;
    }

    /**
     * Gets the value of the personEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonEmail }
     * 
     * 
     */
    public List<PersonEmail> getPersonEmail() {
        if (personEmail == null) {
            personEmail = new ArrayList<PersonEmail>();
        }
        return this.personEmail;
    }

    /**
     * Gets the value of the personEthnicity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personEthnicity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonEthnicity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonEthnicity }
     * 
     * 
     */
    public List<PersonEthnicity> getPersonEthnicity() {
        if (personEthnicity == null) {
            personEthnicity = new ArrayList<PersonEthnicity>();
        }
        return this.personEthnicity;
    }

    /**
     * Gets the value of the personImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonImage }
     * 
     * 
     */
    public List<PersonImage> getPersonImage() {
        if (personImage == null) {
            personImage = new ArrayList<PersonImage>();
        }
        return this.personImage;
    }

    /**
     * Gets the value of the personLegislativeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personLegislativeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonLegislativeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonLegislativeData }
     * 
     * 
     */
    public List<PersonLegislativeData> getPersonLegislativeData() {
        if (personLegislativeData == null) {
            personLegislativeData = new ArrayList<PersonLegislativeData>();
        }
        return this.personLegislativeData;
    }

    /**
     * Gets the value of the personName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonName }
     * 
     * 
     */
    public List<PersonName> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<PersonName>();
        }
        return this.personName;
    }

    /**
     * Gets the value of the personNationalIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNationalIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNationalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNationalIdentifier }
     * 
     * 
     */
    public List<PersonNationalIdentifier> getPersonNationalIdentifier() {
        if (personNationalIdentifier == null) {
            personNationalIdentifier = new ArrayList<PersonNationalIdentifier>();
        }
        return this.personNationalIdentifier;
    }

    /**
     * Gets the value of the personPassport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPassport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPassport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPassport }
     * 
     * 
     */
    public List<PersonPassport> getPersonPassport() {
        if (personPassport == null) {
            personPassport = new ArrayList<PersonPassport>();
        }
        return this.personPassport;
    }

    /**
     * Gets the value of the personPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPhone }
     * 
     * 
     */
    public List<PersonPhone> getPersonPhone() {
        if (personPhone == null) {
            personPhone = new ArrayList<PersonPhone>();
        }
        return this.personPhone;
    }

    /**
     * Gets the value of the personReligion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personReligion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonReligion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonReligion }
     * 
     * 
     */
    public List<PersonReligion> getPersonReligion() {
        if (personReligion == null) {
            personReligion = new ArrayList<PersonReligion>();
        }
        return this.personReligion;
    }

    /**
     * Gets the value of the personVisa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personVisa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonVisa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonVisa }
     * 
     * 
     */
    public List<PersonVisa> getPersonVisa() {
        if (personVisa == null) {
            personVisa = new ArrayList<PersonVisa>();
        }
        return this.personVisa;
    }

    /**
     * Gets the value of the personAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonAddress }
     * 
     * 
     */
    public List<PersonAddress> getPersonAddress() {
        if (personAddress == null) {
            personAddress = new ArrayList<PersonAddress>();
        }
        return this.personAddress;
    }

    /**
     * Gets the value of the personExternalIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personExternalIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonExternalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalIdentifier }
     * 
     * 
     */
    public List<ExternalIdentifier> getPersonExternalIdentifier() {
        if (personExternalIdentifier == null) {
            personExternalIdentifier = new ArrayList<ExternalIdentifier>();
        }
        return this.personExternalIdentifier;
    }

}
