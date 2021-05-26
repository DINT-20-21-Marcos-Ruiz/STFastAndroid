package com.example.stfastdesktop.POJO;

public class Jugador {
    Integer id_jugador;
    String imgPerfil;
    Integer equipo;
    String apodo;
    String passwd;
    String sexo;
    String fechaCreacion;

    public Jugador(){

    }

    public Jugador(Integer id_jugador, String imgPerfil, Integer equipo, String apodo, String passwd, String sexo, String fechaCreacion) {
        this.id_jugador = id_jugador;
        this.imgPerfil = imgPerfil;
        this.equipo = equipo;
        this.apodo = apodo;
        this.passwd = passwd;
        this.sexo = sexo;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(Integer id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public Integer getEquipo() {
        return equipo;
    }

    public void setEquipo(Integer equipo) {
        this.equipo = equipo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
