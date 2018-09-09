
package com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context.OraHrxCaDesignatedGroups;
import com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context.PersonExtraInformationContextHRX5FCN5FMILITARY5FINFOprivate;
import com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context.PersonExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivate;
import com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context.PersonExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivate;
import com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context.PersonExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivate;
import com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context.PersonExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivate;
import com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context.PersonExtraInformationContextHRX5FIN5FMISCELLANEOUSprivate;
import com.oracle.xmlns.apps.hcm.people.core.flex.personeiteff.context.PersonExtraInformationContextHRX5FIN5FNOMINATIONprivate;


/**
 * <p>Java class for j_PersonExtraInformationPerEitprivate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="j_PersonExtraInformationPerEitprivate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/base/}j_PersonExtraInformation">
 *       &lt;sequence>
 *         &lt;element name="PersonExtraInformationContextHRX_5FCN_5FOTHER_5FEMPLOYEE_5FINFOprivateVO" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/}PersonExtraInformationContextHRX_5FCN_5FOTHER_5FEMPLOYEE_5FINFOprivate" minOccurs="0"/>
 *         &lt;element name="PersonExtraInformationContextHRX_5FIN_5FMISCELLANEOUSprivateVO" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/}PersonExtraInformationContextHRX_5FIN_5FMISCELLANEOUSprivate" minOccurs="0"/>
 *         &lt;element name="PersonExtraInformationContextHRX_5FCN_5FPERSONAL_5FFILE_5FINFOprivateVO" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/}PersonExtraInformationContextHRX_5FCN_5FPERSONAL_5FFILE_5FINFOprivate" minOccurs="0"/>
 *         &lt;element name="PersonExtraInformationContextHRX_5FCN_5FPERSONALITY_5FINFOprivateVO" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/}PersonExtraInformationContextHRX_5FCN_5FPERSONALITY_5FINFOprivate" minOccurs="0"/>
 *         &lt;element name="PersonExtraInformationContextHRX_5FCN_5FPOLITICAL_5FINFOprivateVO" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/}PersonExtraInformationContextHRX_5FCN_5FPOLITICAL_5FINFOprivate" minOccurs="0"/>
 *         &lt;element name="PersonExtraInformationContextHRX_5FCN_5FMILITARY_5FINFOprivateVO" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/}PersonExtraInformationContextHRX_5FCN_5FMILITARY_5FINFOprivate" minOccurs="0"/>
 *         &lt;element name="PersonExtraInformationContextORA_5FHRX_5FCA_5FDESIGNATED_5FGROUPSprivateVO" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/}OraHrxCaDesignatedGroups" minOccurs="0"/>
 *         &lt;element name="PersonExtraInformationContextHRX_5FIN_5FNOMINATIONprivateVO" type="{http://xmlns.oracle.com/apps/hcm/people/core/flex/personEITEFF/context/}PersonExtraInformationContextHRX_5FIN_5FNOMINATIONprivate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "j_PersonExtraInformationPerEitprivate", propOrder = {
    "personExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivateVO",
    "personExtraInformationContextHRX5FIN5FMISCELLANEOUSprivateVO",
    "personExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivateVO",
    "personExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivateVO",
    "personExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivateVO",
    "personExtraInformationContextHRX5FCN5FMILITARY5FINFOprivateVO",
    "personExtraInformationContextORA5FHRX5FCA5FDESIGNATED5FGROUPSprivateVO",
    "personExtraInformationContextHRX5FIN5FNOMINATIONprivateVO"
})
public class JPersonExtraInformationPerEitprivate
    extends JPersonExtraInformation
{

    @XmlElement(name = "PersonExtraInformationContextHRX_5FCN_5FOTHER_5FEMPLOYEE_5FINFOprivateVO")
    protected PersonExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivate personExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivateVO;
    @XmlElement(name = "PersonExtraInformationContextHRX_5FIN_5FMISCELLANEOUSprivateVO")
    protected PersonExtraInformationContextHRX5FIN5FMISCELLANEOUSprivate personExtraInformationContextHRX5FIN5FMISCELLANEOUSprivateVO;
    @XmlElement(name = "PersonExtraInformationContextHRX_5FCN_5FPERSONAL_5FFILE_5FINFOprivateVO")
    protected PersonExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivate personExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivateVO;
    @XmlElement(name = "PersonExtraInformationContextHRX_5FCN_5FPERSONALITY_5FINFOprivateVO")
    protected PersonExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivate personExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivateVO;
    @XmlElement(name = "PersonExtraInformationContextHRX_5FCN_5FPOLITICAL_5FINFOprivateVO")
    protected PersonExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivate personExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivateVO;
    @XmlElement(name = "PersonExtraInformationContextHRX_5FCN_5FMILITARY_5FINFOprivateVO")
    protected PersonExtraInformationContextHRX5FCN5FMILITARY5FINFOprivate personExtraInformationContextHRX5FCN5FMILITARY5FINFOprivateVO;
    @XmlElement(name = "PersonExtraInformationContextORA_5FHRX_5FCA_5FDESIGNATED_5FGROUPSprivateVO")
    protected OraHrxCaDesignatedGroups personExtraInformationContextORA5FHRX5FCA5FDESIGNATED5FGROUPSprivateVO;
    @XmlElement(name = "PersonExtraInformationContextHRX_5FIN_5FNOMINATIONprivateVO")
    protected List<PersonExtraInformationContextHRX5FIN5FNOMINATIONprivate> personExtraInformationContextHRX5FIN5FNOMINATIONprivateVO;

    /**
     * Gets the value of the personExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivateVO property.
     * 
     * @return
     *     possible object is
     *     {@link PersonExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivate }
     *     
     */
    public PersonExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivate getPersonExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivateVO() {
        return personExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivateVO;
    }

    /**
     * Sets the value of the personExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivateVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivate }
     *     
     */
    public void setPersonExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivateVO(PersonExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivate value) {
        this.personExtraInformationContextHRX5FCN5FOTHER5FEMPLOYEE5FINFOprivateVO = value;
    }

    /**
     * Gets the value of the personExtraInformationContextHRX5FIN5FMISCELLANEOUSprivateVO property.
     * 
     * @return
     *     possible object is
     *     {@link PersonExtraInformationContextHRX5FIN5FMISCELLANEOUSprivate }
     *     
     */
    public PersonExtraInformationContextHRX5FIN5FMISCELLANEOUSprivate getPersonExtraInformationContextHRX5FIN5FMISCELLANEOUSprivateVO() {
        return personExtraInformationContextHRX5FIN5FMISCELLANEOUSprivateVO;
    }

    /**
     * Sets the value of the personExtraInformationContextHRX5FIN5FMISCELLANEOUSprivateVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonExtraInformationContextHRX5FIN5FMISCELLANEOUSprivate }
     *     
     */
    public void setPersonExtraInformationContextHRX5FIN5FMISCELLANEOUSprivateVO(PersonExtraInformationContextHRX5FIN5FMISCELLANEOUSprivate value) {
        this.personExtraInformationContextHRX5FIN5FMISCELLANEOUSprivateVO = value;
    }

    /**
     * Gets the value of the personExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivateVO property.
     * 
     * @return
     *     possible object is
     *     {@link PersonExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivate }
     *     
     */
    public PersonExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivate getPersonExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivateVO() {
        return personExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivateVO;
    }

    /**
     * Sets the value of the personExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivateVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivate }
     *     
     */
    public void setPersonExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivateVO(PersonExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivate value) {
        this.personExtraInformationContextHRX5FCN5FPERSONAL5FFILE5FINFOprivateVO = value;
    }

    /**
     * Gets the value of the personExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivateVO property.
     * 
     * @return
     *     possible object is
     *     {@link PersonExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivate }
     *     
     */
    public PersonExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivate getPersonExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivateVO() {
        return personExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivateVO;
    }

    /**
     * Sets the value of the personExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivateVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivate }
     *     
     */
    public void setPersonExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivateVO(PersonExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivate value) {
        this.personExtraInformationContextHRX5FCN5FPERSONALITY5FINFOprivateVO = value;
    }

    /**
     * Gets the value of the personExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivateVO property.
     * 
     * @return
     *     possible object is
     *     {@link PersonExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivate }
     *     
     */
    public PersonExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivate getPersonExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivateVO() {
        return personExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivateVO;
    }

    /**
     * Sets the value of the personExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivateVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivate }
     *     
     */
    public void setPersonExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivateVO(PersonExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivate value) {
        this.personExtraInformationContextHRX5FCN5FPOLITICAL5FINFOprivateVO = value;
    }

    /**
     * Gets the value of the personExtraInformationContextHRX5FCN5FMILITARY5FINFOprivateVO property.
     * 
     * @return
     *     possible object is
     *     {@link PersonExtraInformationContextHRX5FCN5FMILITARY5FINFOprivate }
     *     
     */
    public PersonExtraInformationContextHRX5FCN5FMILITARY5FINFOprivate getPersonExtraInformationContextHRX5FCN5FMILITARY5FINFOprivateVO() {
        return personExtraInformationContextHRX5FCN5FMILITARY5FINFOprivateVO;
    }

    /**
     * Sets the value of the personExtraInformationContextHRX5FCN5FMILITARY5FINFOprivateVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonExtraInformationContextHRX5FCN5FMILITARY5FINFOprivate }
     *     
     */
    public void setPersonExtraInformationContextHRX5FCN5FMILITARY5FINFOprivateVO(PersonExtraInformationContextHRX5FCN5FMILITARY5FINFOprivate value) {
        this.personExtraInformationContextHRX5FCN5FMILITARY5FINFOprivateVO = value;
    }

    /**
     * Gets the value of the personExtraInformationContextORA5FHRX5FCA5FDESIGNATED5FGROUPSprivateVO property.
     * 
     * @return
     *     possible object is
     *     {@link OraHrxCaDesignatedGroups }
     *     
     */
    public OraHrxCaDesignatedGroups getPersonExtraInformationContextORA5FHRX5FCA5FDESIGNATED5FGROUPSprivateVO() {
        return personExtraInformationContextORA5FHRX5FCA5FDESIGNATED5FGROUPSprivateVO;
    }

    /**
     * Sets the value of the personExtraInformationContextORA5FHRX5FCA5FDESIGNATED5FGROUPSprivateVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OraHrxCaDesignatedGroups }
     *     
     */
    public void setPersonExtraInformationContextORA5FHRX5FCA5FDESIGNATED5FGROUPSprivateVO(OraHrxCaDesignatedGroups value) {
        this.personExtraInformationContextORA5FHRX5FCA5FDESIGNATED5FGROUPSprivateVO = value;
    }

    /**
     * Gets the value of the personExtraInformationContextHRX5FIN5FNOMINATIONprivateVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personExtraInformationContextHRX5FIN5FNOMINATIONprivateVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonExtraInformationContextHRX5FIN5FNOMINATIONprivateVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonExtraInformationContextHRX5FIN5FNOMINATIONprivate }
     * 
     * 
     */
    public List<PersonExtraInformationContextHRX5FIN5FNOMINATIONprivate> getPersonExtraInformationContextHRX5FIN5FNOMINATIONprivateVO() {
        if (personExtraInformationContextHRX5FIN5FNOMINATIONprivateVO == null) {
            personExtraInformationContextHRX5FIN5FNOMINATIONprivateVO = new ArrayList<PersonExtraInformationContextHRX5FIN5FNOMINATIONprivate>();
        }
        return this.personExtraInformationContextHRX5FIN5FNOMINATIONprivateVO;
    }

}
