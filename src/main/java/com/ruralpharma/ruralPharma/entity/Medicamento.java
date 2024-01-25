package com.ruralpharma.ruralPharma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String producto;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    @JsonFormat (pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime fechaEntrega;
    private String descripcion;
    private int cantidad;
    private String tipoReceta;
    private String lote;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat (pattern = "dd-MM-yyyy")
    private Date fechaVencimiento;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    @JsonFormat (pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime fechaCreacion;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    @JsonFormat (pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime fechaActualizacion;
    @ManyToOne
    @JoinColumn(name="rut")
    private Paciente paciente;

    public Medicamento() {
        this.fechaEntrega = LocalDateTime.now();
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
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

    public String getTipoReceta() {
        return tipoReceta;
    }

    public void setTipoReceta(String tipoReceta) {
        this.tipoReceta = tipoReceta;
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
                ", tipoReceta" + tipoReceta +
                ", lote=" + lote +
                ", fechaVencimiento=" + fechaVencimiento +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
