package com.oracle.ws.client.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestAssignmentDFF {

    @JsonProperty("banco")
    private Object banco;
    @JsonProperty("cuenta")
    private String cuenta;
    @JsonProperty("tipoCuenta")
    private String tipoCuenta;
    @JsonProperty("cuentaCliente")
    private String cuentaCliente;
    @JsonProperty("centroFuncionalDepartamento")
    private String centroFuncionalDepartamento;
    @JsonProperty("centroFuncionalContable")
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
