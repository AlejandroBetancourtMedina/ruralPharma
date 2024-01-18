package com.ruralpharma.ruralPharma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Login {
    @Id
    private String rut;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private String profesion;
    private String establecimiento;
    private LocalDateTime fechaCreacion;// LocaDateTime almacenara fecha y hora
    private LocalDateTime fechaActualizacion;

    public Login() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


    public String getEstablecimiento(){return establecimiento;}
    public void setEstablecimiento(String establecimiento) {this.establecimiento = establecimiento;}
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "Login{" +
                    "rut=" + rut +
                    ", usuario='" + usuario + '\'' +
                    ", contraseña=" + contraseña + '\'' +
                    ", nombre=" + nombre + '\'' +
                    ", apellido=" + apellido + '\'' +
                    ", profesion=" + profesion + '\'' +
                    ", establecimiento=" + establecimiento + '\'' +
                    ", fechaCreacion=" + fechaCreacion +
                    ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
