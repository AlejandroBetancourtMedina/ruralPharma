package com.ruralpharma.ruralPharma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime fechaCreacion;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    @JsonFormat (pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime fechaActualizacion;

    public Login() {
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
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
