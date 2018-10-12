package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestAssignmentDFF {
	
    @JsonProperty("banco")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object banco;
	
    @JsonProperty("cuenta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cuenta;
    
    @JsonProperty("tipoCuenta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tipoCuenta;
    
    @JsonProperty("cuentaCliente")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cuentaCliente;
    
    @JsonProperty("centroFuncionalDepartamento")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String centroFuncionalDepartamento;
    
	
    @JsonProperty("centroFuncionalContable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String centroFuncionalContable;

    public Object getBanco() {
        return banco;
    }

    public void setBanco(Object banco) {
        this.banco = banco;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getCuentaCliente() {
        return cuentaCliente;
    }

    public void setCuentaCliente(String cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }

    public String getCentroFuncionalDepartamento() {
        return centroFuncionalDepartamento;
    }

    public void setCentroFuncionalDepartamento(String centroFuncionalDepartamento) {
        this.centroFuncionalDepartamento = centroFuncionalDepartamento;
    }

    public String getCentroFuncionalContable() {
        return centroFuncionalContable;
    }

    public void setCentroFuncionalContable(String centroFuncionalContable) {
        this.centroFuncionalContable = centroFuncionalContable;
    }
}
