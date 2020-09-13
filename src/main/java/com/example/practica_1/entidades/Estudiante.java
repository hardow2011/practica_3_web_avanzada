package com.example.practica_1.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estudiante implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String matricula;
    private String nombre;
    private String telefono;
    
    public Estudiante(String matricula, String nombre, String telefono) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public long getId() {
        return id;
    }

    // public void setId(int id) {
    //     this.id = id;
    // }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
