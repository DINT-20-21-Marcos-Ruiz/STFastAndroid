package com.example.stfastdesktop.POJO;

public class Juego {
    Integer id_juego;
    String jnombre;
    String logo;

    public Juego(){

    }

    public Juego(Integer id_juego, String jnombre, String logo) {
        this.id_juego = id_juego;
        this.jnombre = jnombre;
        this.logo = logo;
    }

    public Integer getId_juego() {
        return id_juego;
    }

    public void setId_juego(Integer id_juego) {
        this.id_juego = id_juego;
    }

    public String getJnombre() {
        return jnombre;
    }

    public void setJnombre(String jnombre) {
        this.jnombre = jnombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
