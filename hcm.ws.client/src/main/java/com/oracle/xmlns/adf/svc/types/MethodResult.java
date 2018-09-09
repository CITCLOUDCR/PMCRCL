
package com.oracle.xmlns.adf.svc.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.adf.svc.errors.ServiceMessage;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.ActionsListResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.AssignmentGradeStepsResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.AssignmentResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.AssignmentSupervisorResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.AssignmentWorkMeasureResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.ContactRelationshipResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.ContractResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.ExternalIdentifierResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonAddressResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonCitizenshipResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonContactRelationshipResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonContactResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonDeliveryMethodResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonDetailsResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonDriversLicenceResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonEmailResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonEthnicityResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonImageResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonLegislativeDataResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonNameResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonNationalIdentifierResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonNidDetailsResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonPassportDetailsResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonPassportResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonPhoneResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonReligionResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonTypeUsageResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonUserInformationResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonUserManualRolesResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonVisaDetailsResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonVisaResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.TerminationResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkRelationshipResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkRelationshipUserKeyResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkTermsGradeStepsResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkTermsResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkTermsSupervisorResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkTermsWorkMeasureResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkerDetailsResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkerManagerResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkerResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkingHourPatternResult;


/**
 * <p>Java class for MethodResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://xmlns.oracle.com/adf/svc/errors/}ServiceMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodResult", propOrder = {
    "message"
})
@XmlSeeAlso({
    AssignmentGradeStepsResult.class,
    WorkerResult.class,
    PersonContactRelationshipResult.class,
    AssignmentWorkMeasureResult.class,
    PersonTypeUsageResult.class,
    WorkRelationshipResult.class,
    PersonContactResult.class,
    WorkerDetailsResult.class,
    AssignmentSupervisorResult.class,
    AssignmentResult.class,
    WorkTermsWorkMeasureResult.class,
    PersonResult.class,
    WorkTermsSupervisorResult.class,
    WorkTermsResult.class,
    WorkTermsGradeStepsResult.class,
    ExternalIdentifierResult.class,
    TerminationResult.class,
    PersonAddressResult.class,
    PersonReligionResult.class,
    PersonUserManualRolesResult.class,
    PersonDeliveryMethodResult.class,
    PersonImageResult.class,
    PersonDriversLicenceResult.class,
    WorkerManagerResult.class,
    WorkingHourPatternResult.class,
    PersonEmailResult.class,
    PersonVisaResult.class,
    PersonNidDetailsResult.class,
    ContactRelationshipResult.class,
    ActionsListResult.class,
    ContractResult.class,
    PersonUserInformationResult.class,
    PersonPhoneResult.class,
    PersonEthnicityResult.class,
    PersonPassportResult.class,
    PersonCitizenshipResult.class,
    WorkRelationshipUserKeyResult.class,
    PersonPassportDetailsResult.class,
    PersonLegislativeDataResult.class,
    PersonNameResult.class,
    PersonNationalIdentifierResult.class,
    PersonVisaDetailsResult.class,
    PersonDetailsResult.class,
    BigDecimalResult.class,
    DataObjectResult.class,
    BooleanResult.class,
    TimeResult.class,
    DateResult.class,
    BytesResult.class,
    DoubleResult.class,
    ShortResult.class,
    BigIntegerResult.class,
    DataHandlerResult.class,
    IntegerResult.class,
    FloatResult.class,
    StringResult.class,
    ByteResult.class,
    LongResult.class,
    TimestampResult.class
})
public class MethodResult {

    @XmlElement(name = "Message")
    protected List<ServiceMessage> message;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMessage }
     * 
     * 
     */
    public List<ServiceMessage> getMessage() {
        if (message == null) {
            message = new ArrayList<ServiceMessage>();
        }
        return this.message;
    }

}
