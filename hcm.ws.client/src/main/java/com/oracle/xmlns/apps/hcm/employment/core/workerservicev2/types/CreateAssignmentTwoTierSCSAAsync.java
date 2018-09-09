
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.ActionsList;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.Assignment;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.Contract;


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
 *         &lt;element name="Assignment" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}Assignment"/>
 *         &lt;element name="Contract" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}Contract"/>
 *         &lt;element name="ActionList" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}ActionsList"/>
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
    "assignment",
    "contract",
    "actionList"
})
@XmlRootElement(name = "createAssignmentTwoTierSCSAAsync")
public class CreateAssignmentTwoTierSCSAAsync {

    @XmlElement(name = "Assignment", required = true)
    protected Assignment assignment;
    @XmlElement(name = "Contract", required = true)
    protected Contract contract;
    @XmlElement(name = "ActionList", required = true)
    protected ActionsList actionList;

    /**
     * Gets the value of the assignment property.
     * 
     * @return
     *     possible object is
     *     {@link Assignment }
     *     
     */
    public Assignment getAssignment() {
        return assignment;
    }

    /**
     * Sets the value of the assignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Assignment }
     *     
     */
    public void setAssignment(Assignment value) {
        this.assignment = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

    /**
     * Gets the value of the actionList property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsList }
     *     
     */
    public ActionsList getActionList() {
        return actionList;
    }

    /**
     * Sets the value of the actionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsList }
     *     
     */
    public void setActionList(ActionsList value) {
        this.actionList = value;
    }

}
