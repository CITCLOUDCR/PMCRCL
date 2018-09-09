
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonContactRelationship;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeList" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}PersonContactRelationship"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attributeList"
})
@XmlRootElement(name = "updatePersonContactRelationshipAsync")
public class UpdatePersonContactRelationshipAsync {

    @XmlElement(required = true)
    protected PersonContactRelationship attributeList;

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link PersonContactRelationship }
     *     
     */
    public PersonContactRelationship getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonContactRelationship }
     *     
     */
    public void setAttributeList(PersonContactRelationship value) {
        this.attributeList = value;
    }

}
