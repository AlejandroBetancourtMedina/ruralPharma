package com.ruralpharma.ruralPharma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Paciente {
    @Id
    private String rut;
    private String nombre;
    private LocalDate fNacimiento;

    private String domicilio;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    public Paciente() {
    }

    public String getRut() {return rut;}

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfNacimiento() {

        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        domicilio = domicilio;
    }

    public LocalDateTime getFechaCreacion() {
        fechaCreacion=LocalDateTime.now();// para invocar el AHORA  de fecha y hora conn el ".now"
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
        return "Paciente{" +
                "rut=" + rut +
                ", nombre ='" + nombre + '\'' +
                ", fNacimiento=" + fNacimiento + '\'' +
                ", domicilio=" + domicilio + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
