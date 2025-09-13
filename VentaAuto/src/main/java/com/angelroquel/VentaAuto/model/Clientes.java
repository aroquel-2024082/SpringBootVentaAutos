package com.angelroquel.VentaAuto.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "clientes"
)
public class Clientes {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(
            name = "nombre_cliente"
    )
    private String nombreCliente;

    @Column(
            name = "apellido_cliente"
    )
    private String apellidoCliente;

    @Column(
            name = "telefono_cliente"
    )
    private String telefonoCliente;

    @Column(
            name = "email_cliente"
    )
    private String emailCliente;

    public Clientes() {
    }

    public Clientes(Integer idCliente, String nombreCliente, String apellidoCliente, String telefonoCliente, String emailCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
