package com.example.stfastdesktop.POJO;

public class Competicion {
    Integer id_competicion;
    String tipo;
    String cnombre;
    Integer capacidad;
    String fecha;
    String premio;

    public Competicion(){

    }

    public Competicion(Integer id_competicion, String tipo, String cnombre, Integer capacidad, String fecha, String premio) {
        this.id_competicion = id_competicion;
        this.tipo = tipo;
        this.cnombre = cnombre;
        this.capacidad = capacidad;
        this.fecha = fecha;
        this.premio = premio;
    }

    public Integer getId_competicion() {
        return id_competicion;
    }

    public void setId_competicion(Integer id_competicion) {
        this.id_competicion = id_competicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
}
