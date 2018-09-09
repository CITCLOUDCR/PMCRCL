
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.Termination;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkRelationshipUserKey;


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
 *         &lt;element name="WorkRelationshipUserKey" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}WorkRelationshipUserKey"/>
 *         &lt;element name="TerminationDetails" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}Termination"/>
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
    "workRelationshipUserKey",
    "terminationDetails"
})
@XmlRootElement(name = "correctWorkRelationshipTerminationAsync")
public class CorrectWorkRelationshipTerminationAsync {

    @XmlElement(name = "WorkRelationshipUserKey", required = true)
    protected WorkRelationshipUserKey workRelationshipUserKey;
    @XmlElement(name = "TerminationDetails", required = true)
    protected Termination terminationDetails;

    /**
     * Gets the value of the workRelationshipUserKey property.
     * 
     * @return
     *     possible object is
     *     {@link WorkRelationshipUserKey }
     *     
     */
    public WorkRelationshipUserKey getWorkRelationshipUserKey() {
        return workRelationshipUserKey;
    }

    /**
     * Sets the value of the workRelationshipUserKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkRelationshipUserKey }
     *     
     */
    public void setWorkRelationshipUserKey(WorkRelationshipUserKey value) {
        this.workRelationshipUserKey = value;
    }

    /**
     * Gets the value of the terminationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Termination }
     *     
     */
    public Termination getTerminationDetails() {
        return terminationDetails;
    }

    /**
     * Sets the value of the terminationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Termination }
     *     
     */
    public void setTerminationDetails(Termination value) {
        this.terminationDetails = value;
    }

}
