package com.ruralpharma.ruralPharma.entity;

import jakarta.persistence.*;
import org.hibernate.id.IncrementGenerator;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Medicamento {
    @Id

    private int id;
    private String producto;
    private LocalDateTime fechaEntrega;
    private String descripcion;
    private int cantidad;
    private String lote;
    private Date fechaVencimiento;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    @ManyToOne
    @JoinColumn(name="rut")
    private Paciente paciente;

    public Medicamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "producto=" + producto + '\'' +
                ", id ='" + id +
                ", fechaEntrega=" + fechaEntrega + '\'' +
                ", descripcion=" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", lote=" + lote +
                ", fechaVencimiento=" + fechaVencimiento +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
