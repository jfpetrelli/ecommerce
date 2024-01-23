package com.ecommerce.ecommerce.model;

import java.util.Date;

public class Orden {

    private int id;
    private String numbero;
    private Date fechaCreacion;
    private double total;
    private Date fechaRecibida;
    public Orden() {
    }
    public Orden(int id, String numbero, Date fechaCreacion, double total, Date fechaRecibida) {
        this.id = id;
        this.numbero = numbero;
        this.fechaCreacion = fechaCreacion;
        this.total = total;
        this.fechaRecibida = fechaRecibida;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumbero() {
        return numbero;
    }
    public void setNumbero(String numbero) {
        this.numbero = numbero;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public Date getFechaRecibida() {
        return fechaRecibida;
    }
    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }
    @Override
    public String toString() {
        return "Orden [id=" + id + ", numbero=" + numbero + ", fechaCreacion=" + fechaCreacion + ", total=" + total
                + ", fechaRecibida=" + fechaRecibida + "]";
    }
}
