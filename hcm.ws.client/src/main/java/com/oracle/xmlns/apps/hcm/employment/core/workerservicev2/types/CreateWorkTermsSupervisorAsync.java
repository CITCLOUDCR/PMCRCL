
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.ActionsList;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkTermsSupervisor;


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
 *         &lt;element name="AL" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}WorkTermsSupervisor"/>
 *         &lt;element name="pActionList" type="{http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/}ActionsList"/>
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
    "pActionList"
})
@XmlRootElement(name = "createWorkTermsSupervisorAsync")
public class CreateWorkTermsSupervisorAsync {

    @XmlElement(name = "AL", required = true)
    protected WorkTermsSupervisor al;
    @XmlElement(required = true)
    protected ActionsList pActionList;

    /**
     * Gets the value of the al property.
     * 
     * @return
     *     possible object is
     *     {@link WorkTermsSupervisor }
     *     
     */
    public WorkTermsSupervisor getAL() {
        return al;
    }

    /**
     * Sets the value of the al property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkTermsSupervisor }
     *     
     */
    public void setAL(WorkTermsSupervisor value) {
        this.al = value;
    }

    /**
     * Gets the value of the pActionList property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsList }
     *     
     */
    public ActionsList getPActionList() {
        return pActionList;
    }

    /**
     * Sets the value of the pActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsList }
     *     
     */
    public void setPActionList(ActionsList value) {
        this.pActionList = value;
    }

}
