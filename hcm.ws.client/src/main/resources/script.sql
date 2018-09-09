
/**
 SCRIPT SQL-SERVER
 ***/
 

create database hcm_intermedia;
go
use hcm_intermedia
go

create table hcm_colaboradores(
	id_number int IDENTITY(1,1) NOT NULL,
	no_persona varchar(30),	
	fecha_contratacion varchar(10),
	fecha_inicio varchar(10),
	fecha_nacimiento varchar(10),
	tipo_sangre varchar(30),
	accion varchar(30),
	codigo_legislacion varchar(150),
	sexo varchar(30),
	estado_civil varchar(30),
	apellido_paterno varchar(150),
	apellido_materno varchar(150),
	nombre varchar(150),
	segundo_nombre varchar(80),
	correo_empresa varchar(240),	
	correo_personal varchar(240),	
	tipo_direccion varchar(30),
	pais varchar(60),
	direccion varchar(240),
	telefono_particular1 varchar(60),
	telefono_particular2 varchar(60),
	telefono_particular3 varchar(60),	
	movil_particular1 varchar(60),	
	movil_particular2 varchar(60),	
	movil_particular3 varchar(60),	
	tipo_identificador1 varchar(30),	
	numero_identificador1 varchar(30),
	tipo_identificador2 varchar(30),	
	numero_identificador2 varchar(30),
	fecha_licencia1 varchar(10),
	categoria_licencia1  varchar(10),
	fecha_licencia2 varchar(10),	
	categoria_licencia2 varchar(10),
	fecha_licencia3 varchar(10),	
	categoria_licencia3 varchar(10),	
	entidad_legal varchar(100),	
	tipo_trabajador varchar(30),	
	nombre_asignacion varchar(80),
	departamento varchar(240),
	codigo_posicion varchar(30),	
	unidad_negocio varchar(100),	
	nombre_banco varchar(100),
	cuenta_bco varchar(50),	
	tipo_cuenta_bco varchar(50),	
	cuenta_cliente_bco varchar(100),	
	centro_funcional_dep varchar(100),	
	centro_funcional_cont varchar(100),	
	usuario varchar(100),	
	envia_credenciales varchar(30),	
	estado varchar(2),	
	metodo_ws varchar(100),	
	fecha_registro datetime,	
	fecha_procesamiento datetime,
	respuesta_ws  varchar(2000),
	flag_status varchar(2),
	xml_enviado1 text,
	xml_enviado2 text,
	xml_enviado3 text
	primary key(id_number)
);






/**
 SCRIPT SQL-POSTGRESQL
 ***/



create database hcm_intermedia;
create table hcm_colaboradores(
	id_number serial, -- nuevo campo
	no_persona character varying(30),	
	fecha_contratacion character varying(10),-- Fecha considerado para create un trabajdor
	fecha_inicio character varying(10),-- Fecha considerado para update de un trabajdor
	fecha_nacimiento character varying(10),
	tipo_sangre character varying(30),
	accion character varying(30),
	codigo_legislacion character varying(150),
	sexo character varying(30),
	estado_civil character varying(30),
	apellido_paterno character varying(150),
	apellido_materno character varying(150),
	nombre character varying(150),
	segundo_nombre character varying(80),
	correo_empresa character varying(240),	
	correo_personal character varying(240),	
	tipo_direccion character varying(30),
	pais character varying(60),
	direccion character varying(240),
	telefono_particular1 character varying(60),
	telefono_particular2 character varying(60),
	telefono_particular3 character varying(60),	
	movil_particular1 character varying(60),	
	movil_particular2 character varying(60),	
	movil_particular3 character varying(60),	
	tipo_identificador1 character varying(30), -- cambio nombre del campo
	numero_identificador1 character varying(30), -- cambio nombre del campo
	tipo_identificador2 character varying(30), -- nuevo campo	
	numero_identificador2 character varying(30),-- nuevo campo
	fecha_licencia1 character varying(10),
	categoria_licencia1  character varying(10),
	fecha_licencia2 character varying(10),	
	categoria_licencia2 character varying(10),
	fecha_licencia3 character varying(10),	
	categoria_licencia3 character varying(10),	
	entidad_legal character varying(100),	
	tipo_trabajador character varying(30),	
	nombre_asignacion character varying(80),
	departamento character varying(240),
	codigo_posicion character varying(30),	
	unidad_negocio character varying(100),	
	nombre_banco character varying(100),
	cuenta_bco character varying(50),	
	tipo_cuenta_bco character varying(50),	
	cuenta_cliente_bco character varying(100),	
	centro_funcional_dep character varying(100),	
	centro_funcional_cont character varying(100),	
	usuario character varying(100),	
	envia_credenciales character varying(30),	
	estado character varying(2),	
	metodo_ws character varying(100),		
	fecha_registro timestamp without time zone,	
	fecha_procesamiento timestamp without time zone,
	respuesta_ws  character varying(2000),
	flag_status varchar(2),
	xml_enviado1 text,-- guardamos el xml de create / update
	xml_enviado2 text,-- guardamos el xml de update
	xml_enviado3 text-- guardamos el xml de update
	
)WITH (
  OIDS=FALSE
);
ALTER TABLE hcm_colaboradores
  ADD CONSTRAINT hcm_colaboradores_pk PRIMARY KEY (id_number);
ALTER TABLE hcm_colaboradores
  OWNER TO postgres;

  
  -- insert para crear un trabajador
insert into hcm_colaboradores values(1,'100033', '2002-10-01', null, '1960-08-08', 'O+', 'HIRE', 'CR', 'F', 'BR_6', '100033ApePaterno', '100033ApemMaterno', '100033Nombre1', '100033Nombre2', '100033@invalid.com', '100033@invalid_particular.com', 'HOME', 'CR', 'San Jos� - San Rafael de Montes de Oca, Urbanizaci�n Maruz','2273-3042', '1234-1234', '2131-3342', '2164-3442', '2125-3352', '2141-3542', 'C', '100033', 'P', '45454545', '2017-01-01', 'A1', '2017-01-01', 'B1', '2017-01-01', 'C1', 'Purdy Motor S.A.', 'E', 'Nombre Asignaci�n100033', 'Tecnolog�a', 'CON-SRI', 'Purdy Motor S.A. BU', 'BAC SAN JOSE', '901452573', 'Ahorro', '10200009014525731', 'PM - Direcccion General PMCR', '01-1-3-0 Gerencia_General', 'USER100033', 'true', 'C', null, current_date, null, null,null,null, null, null);

-- insert para modificar datos
insert into hcm_colaboradores values(2,'100010', '2002-10-01', '2017-08-14', '1960-08-08', 'A+', 'ASG_CHANGE', 'CR', 'F', 'BR_6', '100010ApePaterno', '100010ApemMaterno', '100010Nombre1', '100010Nombre2', '100010_1@invalid.com', '100010@invalid_particular.com', 'HOME', 'CR', 'San Jos� - San Rafael de Montes de Oca, Urbanizaci�n Maruz','2273-3042', '1234-1234', '2131-3342', '2164-3442', '2125-3352', '2141-3542', 'C', '100010', 'P', '45454545', '2017-01-01', 'A1', '2017-01-01', 'B1', '2017-01-01', 'C1', 'Purdy Motor S.A.', 'E', 'Nombre Asignaci�n100010', 'Tecnolog�a', 'CON-SRI', 'Purdy Motor S.A. BU', 'BAC SAN JOSE', '901452573', 'Ahorro', '10200009014525731', 'PM - Direcccion General PMCR', '01-1-3-0 Gerencia_General', 'USER100010', 'true', 'U', null, current_date, null, null,null,null, null, null);


