package com.example.stfastdesktop.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Equipo {
    @SerializedName("id_equipo")
    @Expose
    Integer id_equipo;
    @SerializedName("juego")
    @Expose
    Integer juego;
    @SerializedName("enombre")
    @Expose
    String enombre;
    @SerializedName("logo")
    @Expose
    String logo;
    @SerializedName("abreviacion")
    @Expose
    String abreviacion;

    public Equipo(){

    }

    public Equipo(Integer id_equipo, Integer juego, String enombre, String logo, String abreviacion) {
        this.id_equipo = id_equipo;
        this.juego = juego;
        this.enombre = enombre;
        this.logo = logo;
        this.abreviacion = abreviacion;
    }

    public Integer getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(Integer id_equipo) {
        this.id_equipo = id_equipo;
    }

    public Integer getJuego() {
        return juego;
    }

    public void setJuego(Integer juego) {
        this.juego = juego;
    }

    public String getEnombre() {
        return enombre;
    }

    public void setEnombre(String enombre) {
        this.enombre = enombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }
}
