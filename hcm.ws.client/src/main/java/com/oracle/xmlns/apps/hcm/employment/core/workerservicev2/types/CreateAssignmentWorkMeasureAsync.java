
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.ActionsList;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.AssignmentWorkMeasure;


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
 *         &lt;element name="AL" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}AssignmentWorkMeasure"/>
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
    "al",
    "actionList"
})
@XmlRootElement(name = "createAssignmentWorkMeasureAsync")
public class CreateAssignmentWorkMeasureAsync {

    @XmlElement(name = "AL", required = true)
    protected AssignmentWorkMeasure al;
    @XmlElement(name = "ActionList", required = true)
    protected ActionsList actionList;

    /**
     * Gets the value of the al property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentWorkMeasure }
     *     
     */
    public AssignmentWorkMeasure getAL() {
        return al;
    }

    /**
     * Sets the value of the al property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentWorkMeasure }
     *     
     */
    public void setAL(AssignmentWorkMeasure value) {
        this.al = value;
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
