
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkRelationship;


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
 *         &lt;element name="AL" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}WorkRelationship"/>
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
    "al"
})
@XmlRootElement(name = "updateWorkRelationshipAsync")
public class UpdateWorkRelationshipAsync {

    @XmlElement(name = "AL", required = true)
    protected WorkRelationship al;

    /**
     * Gets the value of the al property.
     * 
     * @return
     *     possible object is
     *     {@link WorkRelationship }
     *     
     */
    public WorkRelationship getAL() {
        return al;
    }

    /**
     * Sets the value of the al property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkRelationship }
     *     
     */
    public void setAL(WorkRelationship value) {
        this.al = value;
    }

}
