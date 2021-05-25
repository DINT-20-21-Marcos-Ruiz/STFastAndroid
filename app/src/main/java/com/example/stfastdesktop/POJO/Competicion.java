package com.example.stfastdesktop.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Competicion {
    @SerializedName("id_competicion")
    @Expose
    Integer id_competicion;
    @SerializedName("cnombre")
    @Expose
    String cnombre;
    @SerializedName("capacidad")
    @Expose
    Integer capacidad;
    @SerializedName("fecha")
    @Expose
    Date fecha;
    @SerializedName("premio")
    @Expose
    String premio;

    public Competicion(){

    }

    public Competicion(Integer id_competicion, String cnombre, Integer capacidad, Date fecha, String premio) {
        this.id_competicion = id_competicion;
        this.cnombre = cnombre;
        this.capacidad = capacidad;
        this.fecha = fecha;
        this.premio = premio;
    }

    public Competicion(Integer id_competicion, String cnombre, Date fecha) {
        this.id_competicion = id_competicion;
        this.cnombre = cnombre;
        this.capacidad = 2;
        this.fecha = fecha;
    }

    public Integer getId_competicion() {
        return id_competicion;
    }

    public void setId_competicion(Integer id_competicion) {
        this.id_competicion = id_competicion;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
}
