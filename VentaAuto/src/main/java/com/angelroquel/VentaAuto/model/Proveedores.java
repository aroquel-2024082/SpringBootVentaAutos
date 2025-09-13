package com.angelroquel.VentaAuto.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "proveedores"
)
public class Proveedores {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "id_proveedor")
    private Integer idProveedor;

    @Column(
            name = "nombre_proveedor"
    )
    private String nombreProveedor;

    @Column(
            name = "contacto_proveedor"
    )
    private String contactoProveedor;

    public Proveedores() {
    }

    public Proveedores(Integer idProveedor, String nombreProveedor, String contactoProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.contactoProveedor = contactoProveedor;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getContactoProveedor() {
        return contactoProveedor;
    }

    public void setContactoProveedor(String contactoProveedor) {
        this.contactoProveedor = contactoProveedor;
    }
}
