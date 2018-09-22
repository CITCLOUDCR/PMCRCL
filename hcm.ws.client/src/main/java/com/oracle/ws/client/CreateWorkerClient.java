package com.oracle.ws.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.ws.client.DTOs.*;
import com.oracle.ws.handlers.WSSESOAPHandler;
import com.oracle.ws.handlers.WSSESOAPHandlerResolver;
import com.oracle.xmlns.apps.hcm.employment.core.flex.baseworkerassignmentdff.BaseWorkerAsgDFF;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.ActionsList;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.Assignment;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.Person;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonAddress;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonDetails;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonDriversLicence;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonEmail;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonLegislativeData;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonName;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonNationalIdentifier;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonPhone;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.PersonUserInformation;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.Termination;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkRelationship;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkRelationshipUserKey;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkTerms;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.Worker;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkerDetails;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkerDetailsResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkerResult;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkerService;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.CreateWorkRelationship;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.CreateWorkRelationshipAsyncResponse;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.CreateWorkRelationshipResponse;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.CreateWorkerResponse;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.GetWorkerInformationByPersonNumberResponse;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.MergePersonResponse;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.TerminateWorkRelationship;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.UpdateAssignmentResponse;
import com.oracle.xmlns.apps.hcm.people.core.flex.driverslicensetypedff.DriversLicenseTypeDFF;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class CreateWorkerClient
{
    private static final Logger LOGGER = Logger.getLogger(CreateWorkerClient.class);
    DateTimeZone dateTimeZone = DateTimeZone.forID(DateTimeZone.getDefault().getID());

    private Properties properties;

    private HashMap<String,String> BussinesUnitCodes = new HashMap<String, String>()
    {{
        put("Purdy Motor S.A. BU", "300000001543545");
        put("Purdy Carrocería y Pintura BU", "300000001543620");
        put("Purdy Seguros, Agencia de Seguros S.A. BU", "300000001543695");
        put("Asociación Solidarista de empleados de Purdy Motor S.A. y afines BU", "300000001543770");
    }};

    private HashMap<String,String> LegalEntitiesIds = new HashMap<String, String>()
    {{
        put("Purdy Motor S.A.", "300000001545660");  
        put("Purdy Carrocería y Pintura", "300000001545611"); 
        put("Purdy Seguros, Agencia de Seguros S.A.", "300000001545709"); 
        put("Asociación Solidarista de empleados de Purdy Motor S.A. y afines", "300000001544105");
    }};

    Connection cn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public CreateWorkerClient()
    {
        initPropertyFile();
    }

    public void createWorker()
    {
        WSSESOAPHandler wsse = null;
        WSSESOAPHandlerResolver wsseHR = null;

        CreateWorkRelationshipResponse WRresponse = null;
        // CreateWorkerResponse response = null;
        MergePersonResponse mergeResponse = null;
        GetWorkerInformationByPersonNumberResponse informationResponse = null;
        UpdateAssignmentResponse updateAssignmentResponse = null;

        int id_number = 0;
        // String no_persona = "";
        String respuesta = "";
        String metodo = "";
        String xmlGenerado1 = null;String xmlGenerado2 = null;String xmlGenerado3 = null;


        try
        {
            Class.forName(properties.getProperty("db.driver"));
            cn = DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.user"), properties.getProperty("db.password"));

            String sql = "SELECT id_number, no_persona, fecha_contratacion, fecha_inicio, fecha_nacimiento,tipo_sangre, accion,"
                    + " codigo_legislacion, sexo, estado_civil,apellido_paterno, apellido_materno, nombre, segundo_nombre,"
                    + " correo_empresa,correo_personal, tipo_direccion, pais, direccion, telefono_particular1,telefono_particular2, "
                    + "telefono_particular3, movil_particular1,movil_particular2, movil_particular3, tipo_identificador1,"
                    + " numero_identificador1,tipo_identificador2, numero_identificador2, fecha_licencia1,categoria_licencia1, "
                    + "fecha_licencia2, categoria_licencia2, fecha_licencia3,categoria_licencia3, entidad_legal, tipo_trabajador, "
                    + "nombre_asignacion,departamento, codigo_posicion, unidad_negocio, nombre_banco,cuenta_bco, tipo_cuenta_bco, "
                    + "cuenta_cliente_bco, centro_funcional_dep,centro_funcional_cont, usuario, envia_credenciales, estado,"
                    + " metodo_ws,fecha_registro, fecha_procesamiento, respuesta_ws, flag_status,xml_enviado1, xml_enviado2,"
                    + " xml_enviado3, salario, bloqueo, fecha_aplicacion,fecha_vigencia, fecha_vencimiento, DescripcionAccion , TipoCese ,Recomendacion,NumeroAsignacion"
                    + " FROM hcm_colaboradores where estado not in (?)";


            ps = cn.prepareStatement(sql);
            ps.setString(1, "CP");
            rs = ps.executeQuery();

            ActionsList al = null;

            //new code
            //RestTemplate restTemplate = new RestTemplate();
            //  HttpEntity authenticationHeaders = new HttpEntity(createHeaders());

            //  HttpHeaders postHeaders = createHeaders();
            //  postHeaders.setContentType(MediaType.APPLICATION_JSON);


            RestTemplate restTemplate = new RestTemplate();
            String url = "https://hdes-test.fa.us2.oraclecloud.com/hcmRestApi/resources/latest/emps";
            HttpEntity authenticationHeaders = new HttpEntity(createHeaders());

            HttpHeaders httpHeaders = createHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);


            while (rs.next())
            {

                id_number = rs.getInt("id_number");
                if (rs.getString("accion").equals("HIRE"))
                {
                    String getEmpEndpoint = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps?q=PersonNumber="+rs.getString("no_persona");

                    LOGGER.info("### Ejecutando el metodo: getWorkerInformationByPersonNumber");

                    RequestEmployee newEmp = new RequestEmployee();


                    al = new ActionsList();

                    boolean existe = restTemplate.exchange(getEmpEndpoint, HttpMethod.GET, authenticationHeaders, ResponseListEmployee.class).getBody().getItems().size()!=0;

                    if(!existe)
                    {

                        LOGGER.info("Proceso de creacion de un trabajador");

                        LOGGER.info("Obteniendo datos del trabajador: " + rs.getString("nombre"));

                        RequestEmployee emp = new RequestEmployee();

                        //emp.setSaludation(rs.getString("MR."));
                        emp.setMiddleName(rs.getString("segundo_nombre"));
                        //emp.setHireDate(rs.getString("fecha_contratacion"));
                        //emp.setCitizenshipLegislationCode(rs.getString("codigo_legislacion"));
                        emp.setWorkEmail(rs.getString("correo_empresa"));
                        emp.setHomePhoneNumber(rs.getString("telefono_particular1"));
                        emp.setWorkMobilePhoneNumber(rs.getString("movil_particular1"));
                        //emp.setWorkPhoneNumber("");
                        emp.setDriverLicenseExpirationDate(rs.getString("fecha_licencia1"));
                        //emp.setDriverLicenseId(rs.getString(""));


                        emp.setFirstName(rs.getString("nombre"));
                        emp.setLastName(rs.getString("apellido_paterno"));
                        emp.setPreviousLastName(rs.getString("apellido_materno"));
                        emp.setDisplayName(rs.getString("nombre")+" "+rs.getString("apellido_paterno")); /* devuelve null */
                        emp.setPersonNumber(rs.getString("no_persona"));
                        emp.setAddressLine1(rs.getString("direccion"));
                        emp.setCountry(rs.getString("pais"));
                        emp.setDateOfBirth(rs.getString("fecha_nacimiento"));
                        emp.setLegalEntityId(LegalEntitiesIds.get(rs.getString("entidad_legal"))); /* devuelve null */
                        emp.setGender(rs.getString("sexo"));
                        emp.setMaritalStatus(rs.getString("estado_civil"));
                        emp.setNationalIdType(rs.getString("tipo_identificador1"));
                        emp.setNationalId(rs.getString("numero_identificador1"));
                        emp.setNationalIdCountry(rs.getString("pais"));
                        //emp.setEffectiveStartDate(rs.getString("fecha_contratacion"));
                        emp.setUserName(rs.getString("usuario"));

                        RequestAssignment assignment = new RequestAssignment();

                        String bussinesUnit = rs.getString("unidad_negocio");

                        //assignment.setPositionId(rs.getString("codigo_posicion"));
                        assignment.setAssignmentNumber(rs.getString("NumeroAsignacion"));
                        assignment.setPrimaryAssignmentFlag("Y");

                        assignment.setAssignmentName(rs.getString("nombre")+"_assignment_"+rs.getString("apellido_paterno"));   /* devuelve null */
                        assignment.setBusinessUnitId(BussinesUnitCodes.get(bussinesUnit)); /* devuelve null */
                        assignment.setWorkerCategory("WC");
                        assignment.setAssignmentCategory("FR");
                        assignment.setWorkingAtHome("N");
                        assignment.setWorkingAsManager("N");
                        assignment.setSalaryCode("H");
                        assignment.setWorkingHours("8");
                        assignment.setFrequency("D");
                        assignment.setSalaryBasisId("300000001590736");
                        assignment.setSalaryAmount(rs.getString("salario"));
                        assignment.setActionCode(rs.getString("accion"));
                        assignment.setActionReasonCode(rs.getString("estado"));
                        assignment.setAssignmentStatus("ACTIVE");
                       

                        RequestAssignmentDFF extraInfo = new RequestAssignmentDFF();

                        extraInfo.setBanco(rs.getString("nombre_banco"));
                        extraInfo.setCuenta(rs.getString("cuenta_bco"));
                        extraInfo.setTipoCuenta(rs.getString("tipo_cuenta_bco"));
                        extraInfo.setCuentaCliente(rs.getString("cuenta_cliente_bco"));
                        extraInfo.setCentroFuncionalDepartamento(rs.getString("centro_funcional_dep"));
                        extraInfo.setCentroFuncionalContable(rs.getString("centro_funcional_cont"));


                        List<RequestAssignmentDFF> assignmentsDFF = new ArrayList<RequestAssignmentDFF>();
                        assignmentsDFF.add(extraInfo);
                        assignment.setAssignmentDFF(assignmentsDFF);

                        List<RequestAssignment> assignments = new ArrayList<RequestAssignment>();
                        assignments.add(assignment);
                        emp.setAssignments(assignments);

                        try {
                            String json = new ObjectMapper().writeValueAsString(emp);
                            System.out.println(json);
                        } catch (JsonProcessingException e) {
                            e.printStackTrace();
                        }


                        HttpEntity<RequestEmployee> request = new HttpEntity<RequestEmployee>(emp,httpHeaders);
                        ResponseEntity response = restTemplate.exchange(url,HttpMethod.POST,request,String.class);
                        System.out.println(response.toString());

//          al.setActionCode(DocumentUtil.getXMLString("ActionCode", rs.getString("accion")));  /* comportamiento */
//          al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "NOM"));  /* accion  estado? */
//
                        LOGGER.info("Enviando datos al web service.");
                        LOGGER.info("### Ejecutando el metodo: createWorker");
                        metodo = "createWorker";

                        if (rs.getString("estado").equals("CT"))  // Nombramiento temporal.
                        {
//        	  /* Fecha_Final */
//        	   w.setRangeEndDate(DocumentUtil.getXMLGregorianCalendar("RangeEndDate", rs.getString("fecha_vencimiento")));
//        	   workTerms.setRangeEndDate(DocumentUtil.getXMLGregorianCalendar("RangeEndDate", rs.getString("fecha_vencimiento")));
//        	   assignment.setRangeEndDate(DocumentUtil.getXMLGregorianCalendar("RangeEndDate", rs.getString("fecha_vencimiento")));
//        	   /* Accion estado? */
//        	   al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "NOT"));
                        }

          /*     w = new Worker();
                 al = new ActionsList();  */

//          response.setResult(port.createWorker(w, al));
//          xmlGenerado1 = wsse.getXml_generated();


          /*if ((response.getResult() != null) && (response.getResult().getValue().size() > 0))
           {
            LOGGER.info("Obteniendo respuesta exitosa.");
            LOGGER.info("PersonId: " + ((Worker)response.getResult().getValue().get(0)).getPersonId());

            /* cambia el estado en HCM_colaboradores a "CP"
            int exito = updateResponseTable(id_number, "PersonId: " + ((Worker)response.getResult().getValue().get(0)).getPersonId().toString(), "OK", metodo, xmlGenerado1, xmlGenerado2, xmlGenerado3);

            if (exito == 1)
             {
              LOGGER.info("Datos actualizados correctamente en la base de datos.");
             }
          }
          */

                    }

                    else   /* cuando el colaborador ya esta registrado (NuevaRelacion = false) */
                    {




                        /*Verificar código Crear Nueva relación Laboral para Cese por Unidad de Negocio*/


                        WRresponse = new CreateWorkRelationshipResponse();

                        WorkRelationship workRelationship = new WorkRelationship();
                        workRelationship.setWorkerNumber(DocumentUtil.getXMLString("PersonNumber", rs.getString("no_persona")));
                        workRelationship.setDateStart(DatatypeFactory.newInstance().newXMLGregorianCalendar(rs.getString("fecha_contratacion")));
                        workRelationship.setLegalEmployerName(DocumentUtil.getXMLString("LegalEmployerName", rs.getString("entidad_legal")));
                        workRelationship.setWorkerType(rs.getString("tipo_trabajador"));
                        workRelationship.setPrimaryFlag(true);

                        WorkTerms workTerms = new WorkTerms();
                        workTerms.setBusinessUnitShortCode(DocumentUtil.getXMLString("BusinessUnitShortCode", rs.getString("unidad_negocio")));
                        workTerms.setRangeStartDate(DocumentUtil.getXMLGregorianCalendar("RangeStartDate", rs.getString("fecha_contratacion")));
                        workTerms.setPrimaryWorkTermsFlag(false);

                        Assignment assignment = new Assignment();
                        assignment.setBusinessUnitShortCode(DocumentUtil.getXMLString("BusinessUnitShortCode", rs.getString("unidad_negocio")));
                        assignment.setRangeStartDate(DocumentUtil.getXMLGregorianCalendar("RangeStartDate", rs.getString("fecha_contratacion")));
                        assignment.setAssignmentName(DocumentUtil.getXMLString("AssignmentName", rs.getString("nombre_asignacion")));
                        assignment.setDepartmentName(DocumentUtil.getXMLString("DepartmentName", rs.getString("departamento")));
                        assignment.setPositionCode(DocumentUtil.getXMLString("PositionCode", rs.getString("codigo_posicion")));
                        assignment.setPrimaryFlag(false);

                        BaseWorkerAsgDFF baseWorkerAsgDFF = new BaseWorkerAsgDFF();
                        baseWorkerAsgDFF.setBanco(DocumentUtil.getXMLStringBas("banco", rs.getString("nombre_banco")));
                        baseWorkerAsgDFF.setCuenta(DocumentUtil.getXMLStringBas("cuenta", rs.getString("cuenta_bco")));
                        baseWorkerAsgDFF.setTipoCuenta(DocumentUtil.getXMLStringBas("tipoCuenta", rs.getString("tipo_cuenta_bco")));
                        baseWorkerAsgDFF.setCuentaCliente(DocumentUtil.getXMLStringBas("cuentaCliente", rs.getString("cuenta_cliente_bco")));
                        baseWorkerAsgDFF.setCentroFuncionalDepartamento(DocumentUtil.getXMLStringBas("centroFuncionalDepartamento", rs.getString("centro_funcional_dep")));
                        baseWorkerAsgDFF.setCentroFuncionalContable(DocumentUtil.getXMLStringBas("centroFuncionalContable", rs.getString("centro_funcional_cont")));
                        assignment.setBaseWorkerAsgDFF(baseWorkerAsgDFF);


                        workTerms.getAssignment().add(assignment);


                        workRelationship.getWorkTerms().add(workTerms);



                        al = new ActionsList();


                        al.setActionCode(DocumentUtil.getXMLString("ActionCode","HIRE_ADD_WORK_RELATION"));
                        // al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "NOM"));

                        LOGGER.info("Enviando datos al web service.");
                        LOGGER.info("### Ejecutando el metodo: createWorker");
                        metodo = "createWorker";

                        // WRresponse.setResult(port.createWorkRelationship(workRelationship, al));
                        // xmlGenerado1 = wsse.getXml_generated();

                /*    if ((response.getResult() != null) && (WRresponse.getResult().getValue().size() > 0)) {
                      LOGGER.info("Obteniendo respuesta exitosa.");
                      LOGGER.info("PersonId: " + ((WorkRelationship)WRresponse.getResult().getValue().get(0)).getPersonId());


                      int exito = updateResponseTable(id_number, "PersonId: " + ((WorkRelationship)WRresponse.getResult().getValue().get(0)).getPersonId().toString(), "OK", metodo, xmlGenerado1, xmlGenerado2, xmlGenerado3);

                      if (exito == 1) {
                        LOGGER.info("Datos actualizados correctamente en la base de datos.");

                      }


                    }
                      */

                        /*Verificar código*/

                    }

                    /*Fin de Contratación HIRE */
                }
                //  Inicio de if de actualización
                else if ((rs.getString("accion").equals("ASG_CHANGE")) ||  /* cambio-ajuste */
                        (rs.getString("accion").equals("INABILITY"))  ||  /* Incapacidad */
                        (rs.getString("accion").equals("PERMISSION")) ||  /* permiso */
                        (rs.getString("accion").equals("VACATION")))      /* vacaciones */
                {


                    wsse = new WSSESOAPHandler();
                    wsse.setWSSE(properties.getProperty("ws.user"), properties.getProperty("ws.password"));
                    wsseHR = new WSSESOAPHandlerResolver(wsse);
                    Service service = Service.create(new URL(properties.getProperty("ws.endpoint")), new QName(properties.getProperty("ws.qname"), properties.getProperty("ws.name")));
                    service.setHandlerResolver(wsseHR);
                    WorkerService port = service.getPort(WorkerService.class);

                    respuesta = "";
                    id_number = rs.getInt("id_number");
                    mergeResponse = new MergePersonResponse();
                    Person attributeList = null;
                    attributeList = new Person();

                    LOGGER.info("Obteniendo datos del trabajador: " + rs.getString("nombre"));


                    attributeList.setPersonNumber(DocumentUtil.getXMLString("PersonNumber", rs.getString("no_persona")));



                    if (rs.getString("estado").equals("U"))  /* actualiza */
                    {


                        LOGGER.info("Proceso de actualizacion de un trabajador");

                        PatchEmployee emp = new PatchEmployee();

                        emp.setMiddleName(rs.getString("segundo_nombre"));
                        emp.setWorkEmail(rs.getString("correo_empresa"));
                        emp.setHomePhoneNumber(rs.getString("telefono_particular1"));
                        emp.setWorkMobilePhoneNumber(rs.getString("movil_particular1"));
                        emp.setDriverLicenseExpirationDate(rs.getString("fecha_licencia1"));

                        emp.setFirstName(rs.getString("nombre"));
                        emp.setLastName(rs.getString("apellido_paterno"));
                        emp.setPreviousLastName(rs.getString("apellido_materno"));
                        emp.setDisplayName(rs.getString("nombre")+" "+rs.getString("apellido_paterno")); /* devuelve null */
//                        emp.setPersonNumber(rs.getString("no_persona"));
                        emp.setAddressLine1(rs.getString("direccion"));
                        emp.setCountry(rs.getString("pais"));
                        emp.setDateOfBirth(rs.getString("fecha_nacimiento"));
                        emp.setLegalEntityId(LegalEntitiesIds.get(rs.getString("entidad_legal"))); /* devuelve null */
                        emp.setGender(rs.getString("sexo"));
                        emp.setMaritalStatus(rs.getString("estado_civil"));
                        emp.setNationalIdType(rs.getString("tipo_identificador1"));
                        emp.setNationalId(rs.getString("numero_identificador1"));
                        emp.setNationalIdCountry(rs.getString("pais"));
                        emp.setUserName(rs.getString("usuario"));

                        try {
                            String json = new ObjectMapper().writeValueAsString(emp);
                            System.out.println(json);
                        } catch (JsonProcessingException e) {
                            e.printStackTrace();
                        }


                        String findUserLink = "https://hdes-test.fa.us2.oraclecloud.com/hcmRestApi/resources/latest/emps?q=PersonNumber="+rs.getString("no_persona");
                        HttpEntity getHeaders = new HttpEntity(createHeaders());
                        HttpEntity<ResponseLinkListUser> response = restTemplate.exchange(findUserLink,HttpMethod.GET,getHeaders,ResponseLinkListUser.class);

                        System.out.println(response);

                        if(response.getBody().getItems().size()!=0){
                            String userId = response.getBody().getItems().get(0).getLinks().get(0).getHref().split("/")[7];
                            String patchUrl = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/"+userId;

                            HttpEntity<PatchEmployee> request = new HttpEntity<PatchEmployee>(emp, httpHeaders);

                            HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

                            restTemplate.setRequestFactory(requestFactory);

                            HttpEntity<ResponseEmployee> patchResponse = restTemplate.exchange(patchUrl, HttpMethod.PATCH, request, ResponseEmployee.class);
                            System.out.println(patchResponse);

                            LOGGER.info("Enviando datos al web service.");
                            LOGGER.info("### Ejecutando el metodo: mergePerson");

//                        mergeResponse.setResult(port.mergePerson(attributeList));

//                        xmlGenerado1 = wsse.getXml_generated();

//                        if ((mergeResponse.getResult() != null) && (mergeResponse.getResult().getValue().size() > 0)) {
                            if(((ResponseEntity<ResponseEmployee>) patchResponse).getStatusCode().equals(HttpStatus.OK)){
                                LOGGER.info("Se ejecuto con exito el metodo");
                                LOGGER.info("Obteniendo respuesta exitosa.");
                                LOGGER.info("PersonId: " + patchResponse.getBody().getPersonId());
//                            respuesta = respuesta + "PersonId: " + mergeResponse.getResult().getValue().get(0).getPersonId();
                            }
                        }else{
                            System.out.println("No se pudo realizar el patch, usuario no encontrado");
                        }

//                        String urlPatchEmp = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/00020000000EACED00057708000110D931C4B2130000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000165B67A680078";
//                        PatchObject test = new PatchObject();
//                        test.setLastName("RESTTEMPLATE");
//
//                        HttpHeaders httpHeaders = createHeaders();
//                        httpHeaders.setContentType(MediaType.APPLICATION_JSON);



////                        HttpEntity<RequestEmployee> request = new HttpEntity<RequestEmployee>(emp,httpHeaders);
////                        ResponseEntity response = restTemplate.exchange(url,HttpMethod.POST,request,String.class);
////                        System.out.println(response.toString());
////
//
//                        emp.setDateOfBirth(rs.getString("fecha_nacimiento"));
//
////                        emp.setCitizenshipLegislationCode(rs.getString("codigo_legislacion"));
//                        emp.setMaritalStatus(rs.getString("estado_civil"));
//
////                        personName.setNameType("GLOBAL");
//
//                        emp.setFirstName(rs.getString("nombre"));
//                        emp.setMiddleName(rs.getString("segundo_nombre"));
//                        emp.setLastName(rs.getString("apellido_paterno"));
//                        emp.setPreviousLastName(rs.getString("apellido_materno"));
//
//                        emp.setNationalIdCountry(rs.getString("pais"));
//
//                        if ((isNotNullOrEmpty(rs.getString("tipo_identificador1"))) && (isNotNullOrEmpty(rs.getString("numero_identificador1")))) {
//                            emp.setNationalId(rs.getString("numero_identificador1"));
//                            emp.setNationalIdType(rs.getString("tipo_identificador1"));
//                        }
//                        else if ((isNotNullOrEmpty(rs.getString("tipo_identificador2"))) && (isNotNullOrEmpty(rs.getString("numero_identificador2")))) {
//                            emp.setNationalId(rs.getString("numero_identificador2"));
//                            emp.setNationalIdType(rs.getString("tipo_identificador2"));
//                        }
//
//
//                        if (isNotNullOrEmpty(rs.getString("categoria_licencia1")))
////                            personDriversLicence1.setLicenseNumber(DocumentUtil.getXMLString("LicenseNumber", rs.getString("categoria_licencia1")));
//                        if (isNotNullOrEmpty(rs.getString("fecha_licencia1")))
//                            emp.setDriverLicenseExpirationDate(rs.getString("fecha_licencia1"));
//
////                        DriversLicenseTypeDFF driversLicenseTypeDFF = new DriversLicenseTypeDFF();
////                        driversLicenseTypeDFF.setCategoria(DocumentUtil.getXMLStringDff("categoria", rs.getString("categoria_licencia1")));
////                        if (isNotNullOrEmpty(rs.getString("categoria_licencia1"))) { personDriversLicence1.setDriversLicenseTypeDFF(driversLicenseTypeDFF);
////                        }



//                        metodo = metodo + "mergePerson";

//                        LOGGER.info("Enviando datos al web service.");
//                        LOGGER.info("### Ejecutando el metodo: mergePerson");
//
////                        mergeResponse.setResult(port.mergePerson(attributeList));
//
////                        xmlGenerado1 = wsse.getXml_generated();
//
////                        if ((mergeResponse.getResult() != null) && (mergeResponse.getResult().getValue().size() > 0)) {
//                        if(){
//                            LOGGER.info("Se ejecuto con exito el metodo");
//                            LOGGER.info("Obteniendo respuesta exitosa.");
//                            LOGGER.info("PersonId: " + mergeResponse.getResult().getValue().get(0).getPersonId());
////                            respuesta = respuesta + "PersonId: " + mergeResponse.getResult().getValue().get(0).getPersonId();
//                        }
                    }



                    LOGGER.info("### Ejecutando el metodo: getWorkerInformationByPersonNumber");
                    informationResponse = new GetWorkerInformationByPersonNumberResponse();
                    metodo = metodo + "/getWorkerInformationByPersonNumber";
                    informationResponse.setResult(port.getWorkerInformationByPersonNumber(rs.getString("no_persona"), null));

                    xmlGenerado2 = wsse.getXml_generated();

                    if ((informationResponse.getResult() != null) && (informationResponse.getResult().getValue().size() > 0)) {
                        LOGGER.info("Se ejecuto con exito el metodo");
                        LOGGER.info("Obteniendo respuesta exitosa.");
                        LOGGER.info("AssignmentId: " + informationResponse.getResult().getValue().get(0).getAssignmentId());
                        respuesta = respuesta + " / AssignmentId: " + informationResponse.getResult().getValue().get(0).getAssignmentId();
                    }

                    LOGGER.info("### Ejecutando el metodo: updateAssignment");
                    updateAssignmentResponse = new UpdateAssignmentResponse();

                    al = new ActionsList();


                    Assignment assignment = null;

                    assignment = new Assignment();

                    assignment.setAssignmentId(informationResponse.getResult().getValue().get(0).getAssignmentId());
                    assignment.setPersonNumber(DocumentUtil.getXMLString("PersonNumber", rs.getString("no_persona")));
                    assignment.setRangeStartDate(DocumentUtil.getXMLGregorianCalendar("RangeStartDate", rs.getString("fecha_inicio")));
                    assignment.setBusinessUnitShortCode(DocumentUtil.getXMLString("BusinessUnitShortCode", rs.getString("unidad_negocio")));
                    assignment.setPositionCode(DocumentUtil.getXMLString("PositionCode", rs.getString("codigo_posicion")));
                    assignment.setDepartmentName(DocumentUtil.getXMLString("DepartmentName", rs.getString("departamento")));
                    assignment.setAssignmentName(DocumentUtil.getXMLString("AssignmentName", rs.getString("nombre_asignacion")));



                    BaseWorkerAsgDFF baseWorkerAsgDFF = new BaseWorkerAsgDFF();
                    baseWorkerAsgDFF.setBanco(DocumentUtil.getXMLStringBas("banco", rs.getString("nombre_banco")));
                    baseWorkerAsgDFF.setCuenta(DocumentUtil.getXMLStringBas("cuenta", rs.getString("cuenta_bco")));
                    baseWorkerAsgDFF.setTipoCuenta(DocumentUtil.getXMLStringBas("tipoCuenta", rs.getString("tipo_cuenta_bco")));
                    baseWorkerAsgDFF.setCuentaCliente(DocumentUtil.getXMLStringBas("cuentaCliente", rs.getString("cuenta_cliente_bco")));
                    baseWorkerAsgDFF.setCentroFuncionalDepartamento(DocumentUtil.getXMLStringBas("centroFuncionalDepartamento", rs.getString("centro_funcional_dep")));
                    baseWorkerAsgDFF.setCentroFuncionalContable(DocumentUtil.getXMLStringBas("centroFuncionalContable", rs.getString("centro_funcional_cont")));
                    assignment.setBaseWorkerAsgDFF(baseWorkerAsgDFF);


                    al.setActionCode(DocumentUtil.getXMLString("ActionCode", rs.getString("accion")));

                    if (rs.getString("estado").equals("ADL")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "ADL"));
                    } else if (rs.getString("estado").contains("AJT"))   // ajuste salario temporal
                    {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "AJT"));
                        // configurar Fecha_final
                        assignment.setRangeEndDate(DocumentUtil.getXMLGregorianCalendar("RangeEndDate", rs.getString("fecha_vencimiento")));
                    }
                    else if (rs.getString("estado").contains("AJU")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "AJU"));
                    } else if (rs.getString("estado").contains("AUM")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "AUM"));
                    } else if (rs.getString("estado").contains("CAC")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CAC"));
                    } else if (rs.getString("estado").contains("CAJ")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CAJ"));
                    } else if (rs.getString("estado").contains("CAS")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CAS"));
                    } else if (rs.getString("estado").contains("CCF")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CCF"));
                    } else if (rs.getString("estado").contains("CCT"))   // Cambio Centro de Costo (cambio de plaza) Temporal
                    {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CCT"));
                        // configurar Fecha_final
                        assignment.setRangeEndDate(DocumentUtil.getXMLGregorianCalendar("RangeEndDate", rs.getString("fecha_vencimiento")));
                    }
                    else if (rs.getString("estado").contains("CRV")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CRV"));
                    } else if (rs.getString("estado").contains("CSE")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CSE"));
                    } else if (rs.getString("estado").contains("LIM")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "LIM"));
                    } else if (rs.getString("estado").contains("PCO")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "PCO"));
                    } else if (rs.getString("estado").contains("PSI")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "PSI"));
                    } else if (rs.getString("estado").contains("TR1"))   // Traslado Temporal
                    {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "TR1"));
                        // configurar Fecha_final
                        assignment.setRangeEndDate(DocumentUtil.getXMLGregorianCalendar("RangeEndDate", rs.getString("fecha_vencimiento")));
                    }
                    else if (rs.getString("estado").contains("TRA")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "TRA"));
                    } else if (rs.getString("estado").contains("U")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "U"));
                    } else if (rs.getString("estado").contains("ASC")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "ASC"));
                    } else if (rs.getString("estado").contains("CAP")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CAP"));
                    } else if (rs.getString("estado").contains("CNP")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CNP"));
                    } else if (rs.getString("estado").contains("SUS")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "SUS"));
                    } else if (rs.getString("estado").contains("INS")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "INS"));
                    } else if (rs.getString("estado").contains("LCP")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "LCP"));
                    } else if (rs.getString("estado").contains("LMA")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "LMA"));
                    } else if (rs.getString("estado").contains("VAU")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "VAU"));
                    } else if (rs.getString("estado").contains("ICC")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "ISS"));
                    } else if (rs.getString("estado").contains("LIN")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "LIN"));
                    } else if (rs.getString("estado").contains("LDU")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "LDU"));
                    } else if (rs.getString("estado").contains("VAC")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "VAC"));
                    }

                    metodo = metodo + "/updateAssignment";
                    updateAssignmentResponse.setResult(port.updateAssignment(assignment, al));
                    xmlGenerado3 = wsse.getXml_generated();

                    if ((updateAssignmentResponse.getResult() != null) && (updateAssignmentResponse.getResult().getValue().size() > 0)) {
                        LOGGER.info("Se ejecuto con exito el metodo");
                        LOGGER.info("Obteniendo respuesta exitosa.");
                        LOGGER.info("Mensaje: Actualizacion de datos exitoso");
                        respuesta = respuesta + " / Mensaje: Actualizacion de datos exitoso";

                        // cambia el estado a "CP"
                        int exito = updateResponseTable(id_number, respuesta, "OK", metodo, xmlGenerado1, xmlGenerado2, xmlGenerado3);
                        if (exito == 1)
                        {
                            LOGGER.info("Datos actualizados correctamente en la base de datos.");
                        }

                    }


                }
                else if (rs.getString("accion").equals("TERMINATION"))
                {

                    LOGGER.info("Proceso de cese de un trabajador");

                    // String TypeRevokeUser = "";
                    wsse = new WSSESOAPHandler();
                    wsse.setWSSE(properties.getProperty("ws.user"), properties.getProperty("ws.password"));
                    wsseHR = new WSSESOAPHandlerResolver(wsse);
                    Service service = Service.create(new URL(properties.getProperty("ws.endpoint")), new QName(properties.getProperty("ws.qname"), properties.getProperty("ws.name")));
                    service.setHandlerResolver(wsseHR);
                    WorkerService port = service.getPort(WorkerService.class);

                    respuesta = "";
                    id_number = rs.getInt("id_number");
                    TerminateWorkRelationship terminateWorkRelationship = new TerminateWorkRelationship();

                    LOGGER.info("Obteniendo datos del trabajador: " + rs.getString("nombre"));

                    WorkRelationshipUserKey workRelationshipUserKey = new WorkRelationshipUserKey();
                    workRelationshipUserKey.setPersonNumber(DocumentUtil.getXMLString("PersonNumber", rs.getString("no_persona")));
                    workRelationshipUserKey.setStartDate(DocumentUtil.getXMLGregorianCalendar("StartDate", rs.getString("fecha_contratacion")));
                    workRelationshipUserKey.setWorkerType(DocumentUtil.getXMLString("WorkerType", rs.getString("tipo_trabajador")));
                    workRelationshipUserKey.setLegalEmployerName(DocumentUtil.getXMLString("LegalEmployerName", rs.getString("entidad_legal")));

                    terminateWorkRelationship.setWorkRelationshipUserKey(workRelationshipUserKey);

                    Termination termination = new Termination();
                    termination.setActualTerminationDate(DocumentUtil.getXMLGregorianCalendar("ActualTerminationDate", rs.getString("fecha_inicio")));

                    termination.setRehireRecommendation(DocumentUtil.getXMLString("RehireRecommendation","No"));
                    /*termination.setNotifiedTerminationDate(DocumentUtil.getXMLGregorianCalendar("NotifiedTerminationDate", rs.getString("fecha_inicio")));*/

                    termination.setRevokeUserAccess(DocumentUtil.getXMLString("RevokeUserAccess","I"));

                    terminateWorkRelationship.setTerminationDetails(termination);
                    al = new ActionsList();

                    if (rs.getString("estado").contains("CE1")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CE1"));
                    } else if (rs.getString("estado").contains("CE2")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CE2"));
                    } else if (rs.getString("estado").contains("CE3")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CE3"));
                    } else if (rs.getString("estado").contains("CE4")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CE4"));
                    } else if (rs.getString("estado").contains("CE5")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CE5"));
                    } else if (rs.getString("estado").contains("CE6")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CE6"));
                    } else if (rs.getString("estado").contains("CE8")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CE8"));
                    } else if (rs.getString("estado").contains("CE9")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "CE9"));
                    } else if (rs.getString("estado").contains("DEF")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "DEF"));
                    } else if (rs.getString("estado").contains("R10")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "R10"));
                    } else if (rs.getString("estado").contains("TCO")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "TCO"));
                    } else if (rs.getString("estado").contains("REN")) {
                        al.setReasonCode(DocumentUtil.getXMLString("ReasonCode", "REN"));
                    }

                    al.setActionCode(DocumentUtil.getXMLString("ActionCode", rs.getString("accion")));

                    terminateWorkRelationship.setActionList(al);




                    LOGGER.info("Enviando datos al web service.");
                    LOGGER.info("### Ejecutando el metodo: terminateWorkRelationship");


                    metodo = "terminateWorkRelationship";
                    port.terminateWorkRelationship(workRelationshipUserKey, termination, al);

                    xmlGenerado1 = wsse.getXml_generated();

                    if (wsse.getXml_generated() != null) {
                        LOGGER.info("Se ejecuto con exito el metodo");
                        LOGGER.info("Obteniendo respuesta exitosa.");

                        respuesta = respuesta + "debug";

                        int exito = updateResponseTable(id_number, respuesta, "OK", metodo, xmlGenerado1, xmlGenerado2, xmlGenerado3);
                        if (exito == 1) {
                            LOGGER.info("Datos actualizados correctamente en la base de datos.");
                        }
                    }
                    LOGGER.info("Fin del proceso de CESE de un trabajador");
                }
                else if (rs.getString("estado").equals("HI"))
                {
                    LOGGER.info("Proceso de historial de accion");

                    LOGGER.info("Fin del proceso de historial de accion");
                }
                else if (rs.getString("accion").equals("LOCK"))
                {
                    LOGGER.info("Proceso de Bloqueo de Usuario para las acciones temporales");
                    // crear metodo que bloquee a usuario

                    LOGGER.info("Fin del Proceso de Bloqueo de Usuario para las acciones temporales");
                }

            }  // fin while

            LOGGER.info("No hay trabajador que procesar ...");
            Thread.sleep(Integer.parseInt(properties.getProperty("sleep")));
        }
        catch (WebServiceException wex)
        {
            LOGGER.error("Error al acceder al WSDL " + properties.getProperty("ws.endpoint"));
            wex.printStackTrace();



            try
            {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();

            if (wsse.getMessage() != null) {
                System.out.println(wsse.getXml_generated());
                LOGGER.error("\nException: " + wsse.getMessage());

                if ((metodo.trim().equals("createWorker")) || (metodo.trim().equals("mergePerson"))) {
                    xmlGenerado1 = xmlGenerado1 == null ? wsse.getXml_generated() : xmlGenerado1;
                }
                else if (metodo.equals("mergePerson/getWorkerInformationByPersonNumber")) {
                    xmlGenerado2 = xmlGenerado2 == null ? wsse.getXml_generated() : xmlGenerado2;
                }
                else
                {
                    xmlGenerado3 = xmlGenerado3 == null ? wsse.getXml_generated() : xmlGenerado3;
                }

                int exito = updateResponseTable(id_number, wsse.getMessage(), "ER", metodo, xmlGenerado1, xmlGenerado2, xmlGenerado3);
                if (exito == 1) {
                    LOGGER.info("Datos actualizados correctamente en la base de datos.");
                }
            }

            try
            {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try
            {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


    private int updateResponseTable(int id_number, String respuesta, String flag_status, String metodo, String xmlGenerado1, String xmlGenerado2, String xmlGenerado3){
        int exito = 0;
        try {

            LOGGER.info("Actualizando datos de respuesta del trabajor con id_number: "+id_number);
            String sqlUpdate = "update hcm_colaboradores set metodo_ws = ?, fecha_procesamiento = ?, respuesta_ws = ?, flag_status = ?, xml_enviado1 = ?, xml_enviado2 = ?, xml_enviado3 = ?, estado = 'CP' where id_number = ?";
            cn.setAutoCommit(false);
            ps = cn.prepareStatement(sqlUpdate);
            ps.setString(1, metodo);
            ps.setTimestamp(2, new Timestamp(new LocalDateTime().toDateTime(dateTimeZone).getMillis()));
            ps.setString(3, respuesta);
            ps.setString(4, flag_status);
            ps.setString(5, xmlGenerado1);
            ps.setString(6, xmlGenerado2);
            ps.setString(7, xmlGenerado3);
            ps.setInt(8, id_number);
            exito = ps.executeUpdate();
            cn.commit();

        } catch (Exception e) {
            LOGGER.error("Error :", e);
            if (cn != null) {
                try {
                    LOGGER.error("La transacciï¿½n se deshace.");
                    cn.rollback();
                } catch (SQLException excep) {
                    e.printStackTrace();
                }
            }
        }
        return exito;
    }


    private boolean initPropertyFile(){
        InputStream io = null;
        try
        {
            if(properties==null){
                properties = new Properties();
                io = new FileInputStream(System.getProperty("hcm.context")+"hcm.properties");
                properties.load(io);
            }
        }catch(IOException e){
            return false;
        }finally{
            try{
                if(io!=null){
                    io.close();
                }
            }catch(IOException e){
            }
        }
        return true;
    }

    private boolean isNotNullOrEmpty(String valor){
        return valor != null && !valor.trim().isEmpty();
    }

    private HttpHeaders createHeaders(){
        return new HttpHeaders() {{
            String auth = "SOIN" + ":" + "Admin1234";
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")) );
            String authHeader = "Basic " + new String( encodedAuth );
            set( "Authorization", authHeader );
        }};
    }

}