package com.example.stfastdesktop.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Jugador {
    @SerializedName("id_jugador")
    @Expose
    Integer id_jugador;
    @SerializedName("imgPerfil")
    @Expose
    String imgPerfil;
    @SerializedName("equipo")
    @Expose
    Integer equipo;
    @SerializedName("apodo")
    @Expose
    String apodo;
    @SerializedName("passwd")
    @Expose
    String passwd;
    @SerializedName("sexo")
    @Expose
    String sexo;
    @SerializedName("fechaCreacion")
    @Expose
    Date fechaCreacion;

    public Jugador(){

    }

    public Jugador(Integer id_jugador, String imgPerfil, Integer equipo, String apodo, String passwd, String sexo, Date fechaCreacion) {
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
