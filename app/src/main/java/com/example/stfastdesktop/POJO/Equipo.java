package com.example.stfastdesktop.POJO;

public class Equipo {
    Integer id_equipo;
    Integer juego;
    String enombre;
    String logo;
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
