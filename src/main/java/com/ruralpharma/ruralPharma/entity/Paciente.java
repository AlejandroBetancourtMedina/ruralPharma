package com.ruralpharma.ruralPharma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Paciente {
    @Id
    private String rut;
    private String nombre;
    private String fNacimiento;

    private int telefono;
    private String domicilio;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    @JsonFormat (pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime fechaCreacion;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    @JsonFormat (pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime fechaActualizacion;
    @OneToMany(mappedBy="paciente", cascade = CascadeType.ALL)
    private List<Medicamento> medicamentos;

    public Paciente() {
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
    }


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

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
        return "Paciente{" +
                "rut=" + rut +
                ", nombre ='" + nombre + '\'' +
                ", fNacimiento=" + fNacimiento + '\'' +
                ", telefono=" + telefono + '\'' +
                ", domicilio=" + domicilio + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
