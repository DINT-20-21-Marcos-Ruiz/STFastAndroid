package com.example.stfastdesktop.POJO;

public class Inscripcion {
    Integer id_inscripcion;
    Integer equipo_id;
    Integer compet_id;

    public Inscripcion(){

    }

    public Inscripcion(Integer id_inscripcion, Integer equipo_id, Integer compet_id) {
        this.id_inscripcion = id_inscripcion;
        this.equipo_id = equipo_id;
        this.compet_id = compet_id;
    }

    public Integer getId_inscripcion() {
        return id_inscripcion;
    }

    public void setId_inscripcion(Integer id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

    public Integer getEquipo_id() {
        return equipo_id;
    }

    public void setEquipo_id(Integer equipo_id) {
        this.equipo_id = equipo_id;
    }

    public Integer getCompet_id() {
        return compet_id;
    }

    public void setCompet_id(Integer compet_id) {
        this.compet_id = compet_id;
    }
}
