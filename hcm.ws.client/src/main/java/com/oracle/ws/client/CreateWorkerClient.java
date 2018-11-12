package com.oracle.ws.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.ws.client.DTOs.*;
import com.oracle.ws.client.DTOs.CommonFeaturesOracle.BlockUserRequest;
import com.oracle.ws.client.DTOs.CommonFeaturesOracle.UserOracleResponse;
import com.oracle.ws.client.ids.HashMaps;
import com.oracle.ws.handlers.WSSESOAPHandler;
import com.oracle.ws.handlers.WSSESOAPHandlerResolver;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.CreateWorkRelationshipResponse;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.GetWorkerInformationByPersonNumberResponse;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.MergePersonResponse;
import com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.types.UpdateAssignmentResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.xml.ws.WebServiceException;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.HttpClientErrorException;
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

    private HashMap<String,String> PositionIds = HashMaps.positionIds;

    private HashMap<String,String> DepartmentId = HashMaps.departmentIds;
    
    
    private HashMap<String,String> JobId = HashMaps.jobIds;
    

    private HashMap<String,String> LocationId = new HashMap<String, String>()
    {{
        put("Purdy Carrocería y Pintura", "300000001543539");
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
        MergePersonResponse mergeResponse = null;
        GetWorkerInformationByPersonNumberResponse informationResponse = null;
        UpdateAssignmentResponse updateAssignmentResponse = null;

        int id_number = 0;
        String respuesta = "";
        String metodo = "";
        String xmlGenerado1 = null;String xmlGenerado2 = null;String xmlGenerado3 = null;


        try
        {
            Class.forName(properties.getProperty("db.driver"));
            cn = DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.user"), properties.getProperty("db.password"));

            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd") ;
            String fechadehoy = formatofecha.format(new Date());

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
                    + " FROM hcm_colaboradores where estado <> ? and accion <> 'LOCK' and estado not in('AJU','CAC','TRA') or (estado <> 'CP' and fecha_vencimiento='"+fechadehoy+"')";


            ps = cn.prepareStatement(sql);
            ps.setString(1, "CP");
            rs = ps.executeQuery();

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

                    LOGGER.info("Version: 02-oct-2018");
                    LOGGER.info("### Ejecutando el metodo: getWorkerInformationByPersonNumber");

                    RequestEmployee newEmp = new RequestEmployee();


                    boolean existe = restTemplate.exchange(getEmpEndpoint, HttpMethod.GET, authenticationHeaders, ResponseListEmployee.class).getBody().getItems().size()!=0;
                    
                    String fechainicio = rs.getString("fecha_contratacion");
                    httpHeaders.set("Effective-Of","RangeStartDate="+fechainicio);

                    if(!existe)
                    {

                        LOGGER.info("Proceso de creacion de un trabajador");
                        LOGGER.info("Obteniendo datos del trabajador: " + rs.getString("nombre")+" "+rs.getString("apellido_paterno"));

                        RequestEmployee emp = new RequestEmployee();
                        
                        String reasoncode = rs.getString("estado").trim();

                        emp.setFirstName(rs.getString("nombre"));
                        emp.setMiddleName(rs.getString("segundo_nombre"));
                        emp.setLastName(rs.getString("apellido_paterno"));
                        emp.setPreviousLastName(rs.getString("apellido_materno"));
                        emp.setDisplayName(rs.getString("nombre")+" "+rs.getString("apellido_paterno"));
                        emp.setCitizenshipLegislationCode(rs.getString("codigo_legislacion"));
                        emp.setCitizenshipStatus("A");
                        
                        if (isNotNullOrEmpty(rs.getString("correo_empresa")))
                        {
                        	emp.setWorkEmail(rs.getString("correo_empresa"));
                        }
                        else
                        {
                        	emp.setWorkEmail(null);
                        }
                        
                        emp.setHomePhoneNumber(rs.getString("telefono_particular1") + "/" + rs.getString("movil_particular1") );
                        //emp.setWorkMobilePhoneNumber(rs.getString("movil_particular1"));
                        emp.setDriverLicenseExpirationDate(rs.getString("fecha_licencia1"));

                        emp.setPersonNumber(rs.getString("no_persona"));
                        emp.setAddressLine1(rs.getString("direccion"));
                        emp.setCountry(rs.getString("pais"));
                        emp.setDateOfBirth(rs.getString("fecha_nacimiento"));
                        emp.setLegalEntityId(LegalEntitiesIds.get(rs.getString("entidad_legal")));
                        emp.setGender(rs.getString("sexo"));
                        emp.setMaritalStatus(rs.getString("estado_civil"));
                        emp.setNationalIdType(rs.getString("tipo_identificador1"));
                        emp.setNationalId(rs.getString("numero_identificador1"));
                        emp.setNationalIdCountry(rs.getString("pais"));
                        emp.setUserName(rs.getString("usuario"));

                        RequestAssignment assignment = new RequestAssignment();

                        String bussinesUnit = rs.getString("unidad_negocio");

                        assignment.setPositionId(PositionIds.get(rs.getString("codigo_posicion")));
                        String codPos = rs.getString("codigo_posicion").trim();
                        String nomAssign = rs.getString("nombre_asignacion").trim();
                        String department = rs.getString("departamento").trim();

                        assignment.setJobId(JobId.get(codPos+"-"+nomAssign+"-"+department));
                        assignment.setDepartmentId(DepartmentId.get(rs.getString("departamento")));
                        assignment.setAssignmentNumber(rs.getString("NumeroAsignacion"));
                        assignment.setPrimaryAssignmentFlag("Y");

                        assignment.setAssignmentName(rs.getString("nombre_asignacion"));
                        assignment.setBusinessUnitId(BussinesUnitCodes.get(bussinesUnit));
                        assignment.setWorkerCategory("WC");
                        assignment.setWorkingAtHome("N");
                        assignment.setWorkingAsManager("N");
                        assignment.setSalaryCode("H");
                        assignment.setWorkingHours("48");
                        assignment.setFrequency("W");
                        assignment.setSalaryBasisId("300000005782807");
                        assignment.setSalaryAmount(rs.getString("salario"));
                        assignment.setActionCode(rs.getString("accion"));
                        assignment.setActionReasonCode(rs.getString("estado").trim());
                        assignment.setAssignmentStatus("ACTIVE");


                        RequestAssignmentDFF extraInfo = new RequestAssignmentDFF();

                        extraInfo.setBanco(rs.getString("nombre_banco"));
                        extraInfo.setCuenta(rs.getString("cuenta_bco"));
                        extraInfo.setTipoCuenta(rs.getString("tipo_cuenta_bco"));
                        extraInfo.setCuentaCliente(rs.getString("cuenta_cliente_bco").trim());
                        extraInfo.setCentroFuncionalDepartamento(rs.getString("centro_funcional_dep"));
                        extraInfo.setCentroFuncionalContable(rs.getString("centro_funcional_cont"));

                        if (reasoncode.equals("NOT"))  // Nombramiento temporal.
                        {
                        	/* Fecha_Final */
                        	assignment.setEffectiveEndDate(rs.getString("fecha_vencimiento"));
                        	assignment.setAssignmentCategory("FT");
                        	assignment.setAssignmentProjectedEndDate(rs.getString("fecha_vencimiento"));
                        	assignment.setRegularTemporary("T");
                        }
                        else
                        {
                        	 assignment.setAssignmentCategory("FR");
                        	 assignment.setRegularTemporary("R");
                        }
                        	 
                        List<RequestAssignmentDFF> assignmentsDFF = new ArrayList<RequestAssignmentDFF>();
                        assignmentsDFF.add(extraInfo);
                        assignment.setAssignmentDFF(assignmentsDFF);

                        List<RequestAssignment> assignments = new ArrayList<RequestAssignment>();
                        assignments.add(assignment);
                        emp.setAssignments(assignments);
                        

                        try
                        {
                            String json = new ObjectMapper().writeValueAsString(emp);
                            System.out.println(json);
                            LOGGER.info("Insertando colaborador con el siguiente objeto: " + json);
                        } 
                        catch (JsonProcessingException e)
                        {
                            e.printStackTrace();
                        }
                        
                        
                        LOGGER.info("Creando el Request");
                        //String fechainicio = rs.getString("fecha_contratacion");
                        //httpHeaders.set("Effective-Of","RangeStartDate="+fechainicio);
                        HttpEntity<RequestEmployee> request = new HttpEntity<RequestEmployee>(emp,httpHeaders);
                        LOGGER.info("Request info:" + request.toString());

                        try
                        {
                            ResponseEntity<ResponseEmployee> postEmpResponse = restTemplate.exchange(url, HttpMethod.POST, request, ResponseEmployee.class);
                            System.out.println(postEmpResponse.toString());
                            LOGGER.info("Respuesta HCM: " + postEmpResponse.toString());

                            LOGGER.info("Enviando datos al web service.");
                            LOGGER.info("### Ejecutando el metodo: createWorker");
                            metodo = "createWorker";

                            if (postEmpResponse.getStatusCode().equals(HttpStatus.CREATED))
                            {
                                LOGGER.info("Obteniendo respuesta exitosa.");
                                LOGGER.info("PersonId: " + (postEmpResponse.getBody().getPersonId()));

//                              cambia el estado en HCM_colaboradores a "CP"
                                int exito = updateResponseTable(id_number, "PersonId: " + postEmpResponse.getBody().getPersonId(), "OK", metodo, postEmpResponse.getBody().toString(), xmlGenerado2, xmlGenerado3);
                                if (exito == 1) 
                                {
                                    LOGGER.info("Datos actualizados correctamente en la base de datos.");
                                }
                            }
                        }
                        catch (HttpClientErrorException e)
                        {
                            LOGGER.info("Error en el servidor: "+ e.getResponseBodyAsString());
                        }

                    }
                    else   /* cuando el colaborador ya esta registrado (NuevaRelacion = false) */
                    {
                    	  RequestAssignment assignment = new RequestAssignment();

                          String bussinesUnit = rs.getString("unidad_negocio");
                          String reasoncode = rs.getString("estado").trim();

                          String codPos = rs.getString("codigo_posicion").trim();
                          String nomAssign = rs.getString("nombre_asignacion").trim();
                          String department = rs.getString("departamento").trim();
                          String entidad = rs.getString("entidad_legal");

                          assignment.setPositionId(PositionIds.get(codPos));
                          assignment.setJobId(JobId.get(codPos+"-"+nomAssign+"-"+department));
                          assignment.setDepartmentId(DepartmentId.get(rs.getString("departamento")));
                          assignment.setPrimaryAssignmentFlag("Y");

                          assignment.setAssignmentName(rs.getString("nombre_asignacion"));
                          assignment.setBusinessUnitId(BussinesUnitCodes.get(bussinesUnit));
                          assignment.setLegalEntityId(LegalEntitiesIds.get(entidad));
                          assignment.setWorkerCategory("WC");
                          assignment.setWorkingAtHome("N");
                          assignment.setWorkingAsManager("N");
                          assignment.setSalaryCode("H");
                          assignment.setWorkingHours("8");
                          assignment.setFrequency("D");
                          assignment.setSalaryBasisId("300000005782807");
                          assignment.setSalaryAmount(rs.getString("salario"));
                          assignment.setActionCode(rs.getString("accion"));
                          assignment.setActionReasonCode(rs.getString("estado").trim());
                          assignment.setAssignmentStatus("ACTIVE");
                          


                          RequestAssignmentDFF extraInfo = new RequestAssignmentDFF();

                          extraInfo.setBanco(rs.getString("nombre_banco"));
                          extraInfo.setCuenta(rs.getString("cuenta_bco"));
                          extraInfo.setTipoCuenta(rs.getString("tipo_cuenta_bco"));
                          extraInfo.setCuentaCliente(rs.getString("cuenta_cliente_bco").trim());
                          extraInfo.setCentroFuncionalDepartamento(rs.getString("centro_funcional_dep"));
                          extraInfo.setCentroFuncionalContable(rs.getString("centro_funcional_cont"));

                          if (reasoncode.equals("NOT"))  // Nombramiento temporal.
                          {
                          	/* Fecha_Final */
                          	assignment.setEffectiveEndDate(rs.getString("fecha_vencimiento"));
                          	assignment.setAssignmentCategory("FT");
                          	assignment.setAssignmentProjectedEndDate(rs.getString("fecha_vencimiento"));
                          	assignment.setRegularTemporary("T");
                          }
                          else
                          {
                          	 assignment.setAssignmentCategory("FR");
                          	 assignment.setRegularTemporary("R");
                          }
                          	 

                         
                          List<RequestAssignmentDFF> assignmentsDFF = new ArrayList<RequestAssignmentDFF>();
                          assignmentsDFF.add(extraInfo);
                          assignment.setAssignmentDFF(assignmentsDFF);

                          List<RequestAssignment> assignments = new ArrayList<RequestAssignment>();
                          assignments.add(assignment);


                          try
                          {
                              String json = new ObjectMapper().writeValueAsString(assignments);
                              System.out.println(json);
                              LOGGER.info("Insertando colaborador con el siguiente objeto: " + json);
                          } 
                          catch (JsonProcessingException e)
                          {
                              e.printStackTrace();
                          }
                          
                          
                          LOGGER.info("Creando el Request");
                          HttpEntity<RequestAssignment> request = new HttpEntity<RequestAssignment>(assignment,httpHeaders);
                          LOGGER.info("Request info:" + request.toString());

                        url = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/"+getUserHCMIdByEmpNumber(rs.getString("no_persona"));
                      try
                          {
                              url = url+"/child/assignments";
                              ResponseEntity<String> postEmpResponse = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
                              System.out.println(postEmpResponse.toString());
                              LOGGER.info("Respuesta HCM: " + postEmpResponse.toString());

                              LOGGER.info("Enviando datos al web service.");
                              LOGGER.info("### Ejecutando el metodo: createWorker");
                              metodo = "createWorker";

                              if (postEmpResponse.getStatusCode().equals(HttpStatus.CREATED))
                              {
                                  LOGGER.info("Obteniendo respuesta exitosa.");
                                  LOGGER.info("PersonId: " + rs.getString("no_persona"));

									// cambia el estado en HCM_colaboradores a "CP"
                                  int exito = updateResponseTable(id_number, "PersonId: " + rs.getString("no_persona"), "OK", metodo, postEmpResponse.getBody().toString(), xmlGenerado2, xmlGenerado3);
                                  if (exito == 1)
                                  {
                                      LOGGER.info("Datos actualizados correctamente en la base de datos.");
                                  }
                              }
                          }
                          catch (HttpClientErrorException e)
                          {
                              LOGGER.info("Error en el servidor: "+ e.getResponseBodyAsString());
                          }


                    /*Fin de Contratación HIRE */
                  }
                }
                  //  Inicio de if de actualización
                else if((rs.getString("accion").equals("ASG_CHANGE"))) /* Procesa Cambios */
                {

                    respuesta = "";
                    id_number = rs.getInt("id_number");

                    LOGGER.info("Obteniendo datos del trabajador: " + rs.getString("nombre"));

                    String userId = getUserHCMIdByEmpNumber(rs.getString("no_persona"));

                    if (rs.getString("estado").equals("U"))  /* actualiza datos personales */
                    {

                        LOGGER.info("Version: 26-oct-2018");
                        LOGGER.info("Proceso de actualizacion de un trabajador");

                        PatchEmployee emp = new PatchEmployee();

                        emp.setMiddleName(rs.getString("segundo_nombre"));

                        if (isNotNullOrEmpty(rs.getString("correo_empresa")))
                        {
                            emp.setWorkEmail(rs.getString("correo_empresa"));
                        }
                        else
                            emp.setWorkEmail(" ");

                        if (isNotNullOrEmpty(rs.getString("telefono_particular1"))) 
                        {
                            emp.setHomePhoneNumber(rs.getString("telefono_particular1") + "/" + rs.getString("movil_particular1") );
                        }
                        else
                            emp.setHomePhoneNumber(" ");

                        emp.setDriverLicenseExpirationDate(rs.getString("fecha_licencia1"));

                        emp.setFirstName(rs.getString("nombre"));
                        emp.setLastName(rs.getString("apellido_paterno"));
                        emp.setPreviousLastName(rs.getString("apellido_materno"));
                        emp.setDisplayName(rs.getString("nombre")+" "+rs.getString("apellido_paterno")); 
                        emp.setAddressLine1(rs.getString("direccion"));
                        emp.setCountry(rs.getString("pais"));
                        emp.setDateOfBirth(rs.getString("fecha_nacimiento"));
                        emp.setLegalEntityId(LegalEntitiesIds.get(rs.getString("entidad_legal")));
                        emp.setGender(rs.getString("sexo"));
                        emp.setMaritalStatus(rs.getString("estado_civil"));
                        emp.setNationalId(rs.getString("numero_identificador1"));
                        emp.setNationalIdCountry(rs.getString("pais"));
                        emp.setUserName(rs.getString("usuario"));

                        try
                        {
                            String json = new ObjectMapper().writeValueAsString(emp);
                            System.out.println(json);
                            LOGGER.info("Datos a actualizar:"+json);
                        }
                        catch (JsonProcessingException e)
                        {
                            e.printStackTrace();
                        }


                        try 
                        {

                            if (userId!=null) 
                            {
                                String patchUrl = ClientConfig.endpoint + "/hcmRestApi/resources/latest/emps/" + userId;

                                LOGGER.info("Endpoint para actualizar informacion de una persona: " + patchUrl);

                                HttpHeaders headers = createCleanPatchHeaders();

                                headers.set("Effective-Of","RangeMode = UPDATE;RangeStartDate = "+rs.getString("fecha_inicio"));

                                HttpEntity<PatchEmployee> request = new HttpEntity<PatchEmployee>(emp, headers);

                                HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

                                restTemplate.setRequestFactory(requestFactory);

                                HttpEntity<ResponseEmployee> patchResponse = restTemplate.exchange(patchUrl, HttpMethod.PATCH, request, ResponseEmployee.class);
                                System.out.println(patchResponse);

                                LOGGER.info("Enviando datos al web service.");
                                LOGGER.info("### Ejecutando el metodo: mergePerson");


                                if (((ResponseEntity<ResponseEmployee>) patchResponse).getStatusCode().equals(HttpStatus.OK)) 
                                {
                                    LOGGER.info("Se ejecuto con exito el metodo");
                                    LOGGER.info("Obteniendo respuesta exitosa.");
                                    LOGGER.info("PersonId: " + patchResponse.getBody().getPersonId());
                                }

                            } 
                            else
                            {
                                System.out.println("No se pudo realizar el patch, usuario no encontrado");
                                LOGGER.info("No se pudo realizar el patch, usuario no encontrado");

                            }

                        }
                        catch (HttpClientErrorException e)
                        {
                            LOGGER.info("Error en el servidor: "+ e.getResponseBodyAsString());
                        }


                    }
                    	LOGGER.info("Versión: 02-oct-2018");
                        LOGGER.info("### Ejecutando el metodo: getWorkerInformationByPersonNumber");

                        HttpHeaders headers = new HttpHeaders();
                        String userPrimaryAssignment = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/"+userId+"/child/assignments?q=PrimaryAssignmentFlag=true";
                        HttpEntity<ResponseLinkListUser> assignmentIdRequest = restTemplate.exchange(userPrimaryAssignment,HttpMethod.GET,authenticationHeaders,ResponseLinkListUser.class);
                        String[] links = assignmentIdRequest.getBody().getItems().get(0).getLinks().get(0).getHref().split("/");
                        String assignmentId = links[10];

                        String assignmentPatch = ClientConfig.endpoint + "/hcmRestApi/resources/latest/emps/"+userId+"/child/assignments/"+assignmentId;

                        RestTemplate restPatch = new RestTemplate(new HttpComponentsClientHttpRequestFactory());

                        LOGGER.info("### Ejecutando el metodo: updateAssignment");

//                      PrimaryAssignmentFlag: boolean -> true

                        PatchAssignment assignment = new PatchAssignment();
                        
                        String codPos = rs.getString("codigo_posicion").trim();
                        String nomAssign = rs.getString("nombre_asignacion").trim();
                        String department = rs.getString("departamento").trim();
                        
                        assignment.setAssignmentName(nomAssign);
                        assignment.setDepartmentId(DepartmentId.get(department));
                        assignment.setActionCode(rs.getString("accion"));
                        assignment.setActionReasonCode(rs.getString("estado").trim());
                        assignment.setBusinessUnitId(BussinesUnitCodes.get(rs.getString("unidad_negocio")));

                        assignment.setJobId(JobId.get(codPos+"-"+nomAssign+"-"+department));
                        assignment.setSalaryAmount(rs.getString("salario"));
                        assignment.setPositionId(PositionIds.get(codPos));
                        assignment.setSalaryBasisId("300000005782807");

                        RequestAssignmentDFF extraInfo = new RequestAssignmentDFF();

                        extraInfo.setBanco(rs.getString("nombre_banco"));
                      
                        if (isNotNullOrEmpty(rs.getString("cuenta_bco")))
                        {
                        	 extraInfo.setCuenta(rs.getString("cuenta_bco").trim());
                        }
                        else
                        {
                        	 extraInfo.setCuenta(rs.getString("cuenta_bco"));
                        }
                       
                        extraInfo.setTipoCuenta(rs.getString("tipo_cuenta_bco"));
                        if (isNotNullOrEmpty(rs.getString("cuenta_cliente_bco")))
                        {
                        	extraInfo.setCuentaCliente(rs.getString("cuenta_cliente_bco").trim());
                        }
                        else
                        {
                        	extraInfo.setCuentaCliente(rs.getString("cuenta_cliente_bco"));	
                        }
                        
                        
                        extraInfo.setCentroFuncionalDepartamento(rs.getString("centro_funcional_dep"));
                        extraInfo.setCentroFuncionalContable(rs.getString("centro_funcional_cont"));

                        List<RequestAssignmentDFF> assignmentsDFF = new ArrayList<RequestAssignmentDFF>();
                        assignmentsDFF.add(extraInfo);
                        assignment.setAssignmentDFF(assignmentsDFF);

                        String estadoCode = rs.getString("estado").trim();
                        if (estadoCode.equals("AJT") || estadoCode.equals("CCT") || estadoCode.equals("TR1"))
                        {
                         // configurar Fecha_final.
                            headers = createCleanPatchHeaders();
                            headers.set("Effective-Of","RangeMode = UPDATE;RangeStartDate = " + rs.getString("fecha_inicio") + ";RangeEndDate = " + rs.getString("fecha_vencimiento"));
                        }
                        else
                        {
                         // en los permanentes no se configura fecha final. 
                            headers = createCleanPatchHeaders();
                            headers.set("Effective-Of","RangeMode = UPDATE;RangeStartDate = " + rs.getString("fecha_inicio"));	
                        }
                        

                        try
                        {
                            String json = new ObjectMapper().writeValueAsString(assignment);
                            System.out.println(json);
                            LOGGER.info("Datos a actualizar:"+json);
                            LOGGER.info("URL:"+assignmentPatch);
                        }
                        catch (JsonProcessingException e)
                        {
                            e.printStackTrace();
                        }
                        
                        HttpEntity<PatchAssignment> request = new HttpEntity<PatchAssignment>(assignment,headers);

                        try{
                   
                        	HttpEntity<RequestAssignment> assignmentResponse = restPatch.exchange(assignmentPatch,HttpMethod.PATCH,request,RequestAssignment.class);
                            if (((ResponseEntity<RequestAssignment>) assignmentResponse).getStatusCode().equals(HttpStatus.OK)) {
                                LOGGER.info("Se ejecuto con exito el metodo");
                                LOGGER.info("Obteniendo respuesta exitosa.");
                                LOGGER.info("Mensaje: Actualizacion de datos exitoso");
                                respuesta = respuesta + " / Mensaje: Actualizacion de datos exitoso";

                                // cambia el estado a "CP"
                                int exito = updateResponseTable(id_number, respuesta, "OK", "updateAssignment", assignmentResponse.getBody().toString(), null, null);
                                if (exito == 1) {
                                    LOGGER.info("Datos actualizados correctamente en la base de datos.");
                                }

                            }
                        }catch (HttpClientErrorException e){
                            System.out.println(e.getResponseBodyAsString());
                            LOGGER.info(e.getResponseBodyAsString());
                        }
                    }
                
                else if (rs.getString("accion").equals("TERMINATION"))
                {

                    LOGGER.info("Proceso de cese de un trabajador");

                    respuesta = "";
                    id_number = rs.getInt("id_number");

                    String assignmentPatchEndpoint = getPrimaryAssignmentEndpoint(rs.getString("no_persona"));
                    LOGGER.info("Obteniendo datos del trabajador: " + rs.getString("nombre") + '-'  + rs.getString("no_persona"));
                    
                    PatchTerminationAssignment terminationAssignment = new PatchTerminationAssignment();
                    terminationAssignment.setActionCode(rs.getString("accion").trim());
                    terminationAssignment.setActionReasonCode(rs.getString("estado").trim());
                    terminationAssignment.setAssignmentStatus("INACTIVE");

                    if(terminationAssignment.getActionReasonCode().equals("CE5"))
                    {
                        terminationAssignment.setPrimaryAssignmentFlag("N");
                        terminationAssignment.setPrimaryWorkRelationFlag("N");
                    }

                    try
                    {
                        String json = new ObjectMapper().writeValueAsString(terminationAssignment);
                        System.out.println(json);
                        LOGGER.info("Datos a actualizar:"+json);
                        LOGGER.info("URL:"+assignmentPatchEndpoint);
                    }
                    catch (JsonProcessingException e)
                    {
                        e.printStackTrace();
                    }

                    HttpHeaders headers = createCleanPatchHeaders();   //createPatchHeaders();
                    headers.set("Effective-Of","RangeMode = UPDATE;RangeStartDate = "+rs.getString("fecha_inicio"));
                    HttpEntity<PatchTerminationAssignment> request = new HttpEntity<PatchTerminationAssignment>(terminationAssignment,headers);

                    RestTemplate restPatch = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
                    int exito = 0;

                    try
                    {

                        HttpEntity<RequestAssignment> assignmentResponse = restPatch.exchange(assignmentPatchEndpoint,HttpMethod.PATCH,request,RequestAssignment.class);
                        if (((ResponseEntity<RequestAssignment>) assignmentResponse).getStatusCode().equals(HttpStatus.OK)) 
                        {
                            LOGGER.info("Se ejecuto con exito el metodo");
                            LOGGER.info("Obteniendo respuesta exitosa.");
                            LOGGER.info("Mensaje: Actualizacion de datos exitoso");
                            respuesta = respuesta + " / Mensaje: Actualizacion de datos exitoso";
 
                           // cambia el estado a "CP"
                            exito = updateResponseTable(id_number, respuesta, "OK", "updateAssignment", assignmentResponse.getBody().toString(), null, null);
                                if (exito == 1) 
                                {
                                    LOGGER.info("Datos actualizados correctamente en la base de datos.");
                                }
                            //}

                        }
                    }
                    catch (HttpClientErrorException e){
                        System.out.println(e.getResponseBodyAsString());
                        LOGGER.info(e.getResponseBodyAsString());
                    }

                    if(exito == 1)
                    {
                        if (!(rs.getString("estado").contains("CE5")))
                        {
                            LOGGER.info("Proceso de Bloqueo de Usuario para las acciones temporales");

                            String username = rs.getString("usuario");
                            String oracleUserId = ClientConfig.endpoint + "/hcmRestApi/scim/Users/?filter=username eq \"" + username + "\"";

                            System.out.println(oracleUserId);

                            HttpEntity<UserOracleResponse> response = restTemplate.exchange(oracleUserId, HttpMethod.GET, authenticationHeaders, UserOracleResponse.class);

                            if (response.getBody() != null) 
                            {

                                oracleUserId = ClientConfig.endpoint + "/hcmRestApi/scim/Users/" + response.getBody().getResourses().get(0).getId();

                                HttpHeaders headerslock = createPatchHeaders();

                                BlockUserRequest blockUser = new BlockUserRequest() {{ setActive(false); }};

                                HttpEntity<BlockUserRequest> requestlock = new HttpEntity<BlockUserRequest>(blockUser, headerslock);

                                HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

                                RestTemplate restTemplatelock = new RestTemplate(requestFactory);

                                HttpEntity<String> patchResponse = restTemplatelock.exchange(oracleUserId, HttpMethod.PATCH, requestlock, String.class);

                                System.out.println(patchResponse);


                            }
                        }
                        else
                        {
                            //post de nueva relacion laboral
                            RequestAssignment assignment = new RequestAssignment();

                            String bussinesUnit = rs.getString("unidad_negocio");
                            String codPos = rs.getString("codigo_posicion").trim();
                            String nomAssign = rs.getString("nombre_asignacion").trim();
                            String department = rs.getString("departamento").trim();
                            String entidad = rs.getString("entidad_legal");

                            assignment.setPositionId(PositionIds.get(codPos));
                            assignment.setJobId(JobId.get(codPos+"-"+nomAssign+"-"+department));
                            assignment.setDepartmentId(DepartmentId.get(rs.getString("departamento")));
                            assignment.setPrimaryAssignmentFlag("Y");

                            assignment.setAssignmentName(rs.getString("nombre_asignacion"));
                            assignment.setBusinessUnitId(BussinesUnitCodes.get(bussinesUnit));
                            assignment.setLegalEntityId(LegalEntitiesIds.get(entidad));
                            assignment.setWorkerCategory("WC");
                            assignment.setWorkingAtHome("N");
                            assignment.setWorkingAsManager("N");
                            assignment.setSalaryCode("H");
                            assignment.setWorkingHours("8");
                            assignment.setFrequency("D");
                            assignment.setSalaryBasisId("300000005782807");
                            assignment.setSalaryAmount(rs.getString("salario"));
                            assignment.setActionCode("HIRE");
                            assignment.setActionReasonCode("NOM");
                            assignment.setAssignmentStatus("ACTIVE");
                            assignment.setAssignmentCategory("FR");
                            assignment.setRegularTemporary("R");

                            RequestAssignmentDFF extraInfo = new RequestAssignmentDFF();

                            extraInfo.setBanco(rs.getString("nombre_banco"));
                            extraInfo.setCuenta(rs.getString("cuenta_bco"));
                            extraInfo.setTipoCuenta(rs.getString("tipo_cuenta_bco"));
                            extraInfo.setCuentaCliente(rs.getString("cuenta_cliente_bco").trim());
                            extraInfo.setCentroFuncionalDepartamento(rs.getString("centro_funcional_dep"));
                            extraInfo.setCentroFuncionalContable(rs.getString("centro_funcional_cont"));

                            List<RequestAssignmentDFF> assignmentsDFF = new ArrayList<RequestAssignmentDFF>();
                            assignmentsDFF.add(extraInfo);
                            assignment.setAssignmentDFF(assignmentsDFF);

                            List<RequestAssignment> assignments = new ArrayList<RequestAssignment>();
                            assignments.add(assignment);


                            try
                            {
                                String json = new ObjectMapper().writeValueAsString(assignments);
                                System.out.println(json);
                                LOGGER.info("Insertando assignment con el siguiente objeto: " + json);
                            }
                            catch (JsonProcessingException e)
                            {
                                e.printStackTrace();
                            }


                            LOGGER.info("Creando el Request");
                            HttpEntity<RequestAssignment> requestas = new HttpEntity<RequestAssignment>(assignment,httpHeaders);
                            LOGGER.info("Request info:" + requestas.toString());

                            url = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/"+getUserHCMIdByEmpNumber(rs.getString("no_persona"));
                            try
                            {
                                url = url+"/child/assignments";
                                ResponseEntity<String> postEmpResponse = restTemplate.exchange(url, HttpMethod.POST, requestas, String.class);
                                System.out.println(postEmpResponse.toString());
                                LOGGER.info("Respuesta HCM: " + postEmpResponse.toString());

                                LOGGER.info("Enviando datos al web service.");
                                LOGGER.info("### Ejecutando el metodo: createWorker");
                                metodo = "createWorker";

                                if (postEmpResponse.getStatusCode().equals(HttpStatus.CREATED))
                                {
                                    LOGGER.info("Obteniendo respuesta exitosa.");
                                    LOGGER.info("PersonId: " + rs.getString("no_persona"));

                                    // cambia el estado en HCM_colaboradores a "CP"
                                    int exit = updateResponseTable(id_number, "PersonId: " + rs.getString("no_persona"), "OK", metodo, postEmpResponse.getBody().toString(), xmlGenerado2, xmlGenerado3);
                                    if (exit == 1)
                                    {
                                        LOGGER.info("Datos actualizados correctamente en la base de datos.");
                                    }
                                }
                            }
                            catch (HttpClientErrorException e)
                            {
                                LOGGER.info("Error en el servidor: "+ e.getResponseBodyAsString());
                            }

                        }
                    }

                    LOGGER.info("Enviando datos al web service.");
                    LOGGER.info("### Ejecutando el metodo: terminateWorkRelationship");


                  /*  metodo = "terminateWorkRelationship";

                    xmlGenerado1 = wsse.getXml_generated();

                    if (wsse.getXml_generated() != null) {
                        LOGGER.info("Se ejecuto con exito el metodo");
                        LOGGER.info("Obteniendo respuesta exitosa.");

                        respuesta = respuesta + "debug";

                        int exito = updateResponseTable(id_number, respuesta, "OK", metodo, xmlGenerado1, xmlGenerado2, xmlGenerado3);
                        if (exito == 1) {
                            LOGGER.info("Datos actualizados correctamente en la base de datos.");
                        }
                    } */
                    
                    LOGGER.info("Fin del proceso de CESE de un trabajador");
                }
                else if (rs.getString("estado").equals("HI"))
                {
                    LOGGER.info("Proceso de historial de accion");

                    LOGGER.info("Fin del proceso de historial de accion");
                }
                /* esta parte procesa ausencias (Absence) */
                else if ((rs.getString("accion").equals("INABILITY")) || (rs.getString("accion").equals("PERMISSION")) || (rs.getString("accion").equals("VACATION")))    
                {
                	
                	 String PostAbsenceEndpoint = ClientConfig.endpoint+"/hcmRestApi/resources/latest/absences";

                     LOGGER.info("Version: 02-Oct-2018");
                     LOGGER.info("### Ejecutando el metodo: POST Absences");
                     
                     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                     String incap = rs.getString("estado").trim();
                     Date fi = formatter.parse(rs.getString("fecha_inicio"));       
                     Date ff =  formatter.parse(rs.getString("fecha_vencimiento"));
                     int dias=(int) ((ff.getTime()-fi.getTime())/86400000) + 1;
                     int mitad = (int) (dias/8);
                     

                     RequestAbsence Ausencias = new RequestAbsence();
                     Ausencias.setPersonNumber(rs.getString("no_persona"));
                     Ausencias.setEmployer(rs.getString("entidad_legal"));
                     Ausencias.setAbsenceType(rs.getString("Recomendacion").toUpperCase());
                     Ausencias.setStartDate(rs.getString("fecha_inicio"));
                     Ausencias.setEndDate(rs.getString("fecha_vencimiento"));
                     Ausencias.setAbsenceStatusCd("SUBMITTED");
                     Ausencias.setComments(rs.getString("DescripcionAccion"));
                     Ausencias.setStartTime("08:00");
                     Ausencias.setEndTime("17:30");
                     //Ausencias.setFrequency("daily");
                     if (incap.equals("ICC") || incap.equals("INS"))
                     {
                       Ausencias.setAbsenceReason("Ausencia por Incapacidad");
                       //Ausencias.setDuration(Integer.toString(dias + 1));
                       Ausencias.setStartDateDuration(Integer.toString(2));
                       Ausencias.setEndDateDuration(Integer.toString(0));
                     }
                     else if (incap.equals("LIM") || incap.equals("LCP") || incap.equals("LMA") || incap.equals("LIN") || incap.equals("LDU") )
                     {
                         Ausencias.setAbsenceReason("Ausencia por Licencia");
                         //Ausencias.setDuration(Integer.toString(1));
                         Ausencias.setStartDateDuration(Integer.toString(2));
                         Ausencias.setEndDateDuration(Integer.toString(0));
                         Ausencias.setPlannedEndDate(rs.getString("fecha_vencimiento"));
                         Ausencias.setConfirmedDate(rs.getString("fecha_inicio"));
                         Ausencias.setEstablishmentDate(rs.getString("fecha_inicio"));
                     }
                     else if (incap.equals("PCO") || incap.equals("PSI") || incap.equals("PSG") ||  incap.equals("SUS"))
                     {
                         Ausencias.setAbsenceReason("Ausencia por Permiso");
                         Ausencias.setDuration(Integer.toString(dias + 1));
                     }
                     else if (incap.equals("VAC") || incap.equals("VAU"))
                     {
                    	 Ausencias.setAbsenceReason("Vacaciones");
                    	 Ausencias.setDuration(Integer.toString(dias + 1));
                     }
                     
                    
                     
                     try
                     {
                         String json = new ObjectMapper().writeValueAsString(Ausencias);
                         System.out.println(json);
                         LOGGER.info("Insertando colaborador con el siguiente objeto: " + json);
                     } 
                     catch (JsonProcessingException e) 
                     {
                         e.printStackTrace();
                     }
                	
                     LOGGER.info("Creando el Request");
                     HttpEntity<RequestAbsence> request = new HttpEntity<RequestAbsence>(Ausencias,httpHeaders);
                     LOGGER.info("Request info:" + request.toString());

                     try
                     {
                         ResponseEntity<ResponseAbsence> postAbsenceResponse = restTemplate.exchange(PostAbsenceEndpoint, HttpMethod.POST, request, ResponseAbsence.class);
                         System.out.println(postAbsenceResponse.toString());
                         LOGGER.info("Respuesta HCM: " + postAbsenceResponse.toString());

                         LOGGER.info("Enviando datos al web service.");
                         LOGGER.info("### Ejecutando el metodo: createWorker");
                         metodo = "POSTAbsence";


                         if (postAbsenceResponse.getStatusCode().equals(HttpStatus.CREATED))
                         {
                             LOGGER.info("Obteniendo respuesta exitosa.");
                             LOGGER.info("Person: " + (postAbsenceResponse.getBody().getPersonId()));

//          cambia el estado en HCM_colaboradores a "CP"
                             int exito = updateResponseTable(id_number, "PersonId: " + postAbsenceResponse.getBody().getPersonId(), "OK", metodo, postAbsenceResponse.getBody().toString(), xmlGenerado2, xmlGenerado3);
                             if (exito == 1) 
                             {
                                 LOGGER.info("Datos actualizados correctamente en la base de datos.");
                             }
                         }
                     }
                     catch (HttpClientErrorException e)
                     {
                         LOGGER.info("Error en el servidor: "+ e.getResponseBodyAsString());
                     }
                	
                }
                
                else if (rs.getString("accion").equals("LOCK"))
                {
                    LOGGER.info("Proceso de Bloqueo de Usuario para las acciones temporales");

                    String username = rs.getString("usuario");
                    String oracleUserId = ClientConfig.endpoint+"/hcmRestApi/scim/Users/?filter=username eq \""+username+"\"";

                    System.out.println(oracleUserId);

                    HttpEntity<UserOracleResponse> response = restTemplate.exchange(oracleUserId,HttpMethod.GET,authenticationHeaders,UserOracleResponse.class);

                    if(response.getBody()!=null) {

                        oracleUserId = ClientConfig.endpoint+"/hcmRestApi/scim/Users/"+response.getBody().getResourses().get(0).getId();

                        HttpHeaders headers = createPatchHeaders();

                        BlockUserRequest blockUser = new BlockUserRequest(){{setActive(false);}};

                        HttpEntity<BlockUserRequest> request = new HttpEntity<BlockUserRequest>(blockUser, headers);

                        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

                        restTemplate.setRequestFactory(requestFactory);

                        LOGGER.info("Enviando datos al web service.");
                        LOGGER.info("### Ejecutando el metodo: blockPerson");

                        HttpEntity<String> patchResponse = restTemplate.exchange(oracleUserId, HttpMethod.PATCH, request, String.class);

                        System.out.println(patchResponse);


                        if (((ResponseEntity<String>) patchResponse).getStatusCode().equals(HttpStatus.OK))
                        {
                            LOGGER.info("Se ejecuto con exito el metodo");
                            LOGGER.info("Obteniendo respuesta exitosa.");
                            LOGGER.info("PersonId: "+ rs.getString("no_persona"));
                            int exito = updateResponseTable(id_number, "PersonId: " + rs.getString("no_persona"), "OK", metodo, patchResponse.getBody(), xmlGenerado2, xmlGenerado3);
                            if (exito == 1)
                            {
                                LOGGER.info("Datos actualizados correctamente en la base de datos.");
                            }

                        }

                        LOGGER.info("Fin del Proceso de Bloqueo de Usuario para las acciones temporales");
                    }  
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
            LOGGER.info("error:"+ e.toString());

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
            LOGGER.info("Consulta a la para actualizar: " + sqlUpdate);
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
            set("Effective-Of","RangeStartDate=4712-12-31");
        }};
    }

    private HttpHeaders createPatchHeaders(){
        HttpHeaders headers = createHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Effective-Of","RangeMode=UPDATE");
        headers.set("RangeStartDate","2000-01-01");
        return headers;
    }

    private HttpHeaders createCleanPatchHeaders(){
        HttpHeaders headers = createHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    private String getUserHCMIdByEmpNumber(String nUsuario){
        RestTemplate restTemplate = new RestTemplate();
        String findUserLink = "https://hdes-test.fa.us2.oraclecloud.com/hcmRestApi/resources/latest/emps?q=PersonNumber="+nUsuario;
        HttpEntity getHeaders = new HttpEntity(createHeaders());
        HttpEntity<ResponseLinkListUser> response = restTemplate.exchange(findUserLink,HttpMethod.GET,getHeaders,ResponseLinkListUser.class);
        String userId = null;
        if(response.getBody().getItems().size()!=0){
            LOGGER.info("Obteniendo el id del empleado");
            userId = response.getBody().getItems().get(0).getLinks().get(0).getHref().split("/")[7];
        }else {
            System.out.println("usuario no encontrado");
            LOGGER.info("No se pudo realizar el patch, usuario no encontrado");
        }

        return userId;
    }

    private String getPrimaryAssignmentEndpoint(String nUsuario){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity getHeaders = new HttpEntity(createHeaders());

        String endpoint = null;
        String userId = getUserHCMIdByEmpNumber(nUsuario);
        if (userId!=null) {
            String userPrimaryAssignment = ClientConfig.endpoint+"/hcmRestApi/resources/latest/emps/"+userId+"/child/assignments?q=PrimaryAssignmentFlag=true";
            HttpEntity<ResponseLinkListUser> assignmentIdRequest = restTemplate.exchange(userPrimaryAssignment,HttpMethod.GET,getHeaders,ResponseLinkListUser.class);
            String[] links = assignmentIdRequest.getBody().getItems().get(0).getLinks().get(0).getHref().split("/");
            String assignmentId = links[10];

            endpoint = ClientConfig.endpoint + "/hcmRestApi/resources/latest/emps/"+userId+"/child/assignments/"+assignmentId;
            LOGGER.info("Endpoint del assignment: "+endpoint);

        }else{
            LOGGER.info("No se pudo obtener el endpoint del assignment, usuario no encontrado");
        }
        return endpoint;
    }

}