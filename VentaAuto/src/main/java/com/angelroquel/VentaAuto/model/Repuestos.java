package com.angelroquel.VentaAuto.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "repuestos"
)
public class Repuestos {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "id_repuesto")
    private Integer idRepuesto;

    @Column(
            name = "nombre_repuesto"
    )
    private String nombreRepuesto;

    @Column(
            name = "anio_repuesto"
    )
    private String anioRepuesto;

    @Column(
            name = "color_repuesto"
    )
    private String colorRepuesto;

    @Column(
            name = "precio_repuesto"
    )
    private String precioRepuesto;

    @Column(
            name = "estado_repuesto"
    )
    private String estadoRepuesto;

    public Repuestos() {
    }

    public Repuestos(Integer idRepuesto, String nombreRepuesto, String anioRepuesto, String colorRepuesto, String precioRepuesto, String estadoRepuesto) {
        this.idRepuesto = idRepuesto;
        this.nombreRepuesto = nombreRepuesto;
        this.anioRepuesto = anioRepuesto;
        this.colorRepuesto = colorRepuesto;
        this.precioRepuesto = precioRepuesto;
        this.estadoRepuesto = estadoRepuesto;
    }

    public Integer getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(Integer idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    public String getAnioRepuesto() {
        return anioRepuesto;
    }

    public void setAnioRepuesto(String anioRepuesto) {
        this.anioRepuesto = anioRepuesto;
    }

    public String getColorRepuesto() {
        return colorRepuesto;
    }

    public void setColorRepuesto(String colorRepuesto) {
        this.colorRepuesto = colorRepuesto;
    }

    public String getPrecioRepuesto() {
        return precioRepuesto;
    }

    public void setPrecioRepuesto(String precioRepuesto) {
        this.precioRepuesto = precioRepuesto;
    }

    public String getEstadoRepuesto() {
        return estadoRepuesto;
    }

    public void setEstadoRepuesto(String estadoRepuesto) {
        this.estadoRepuesto = estadoRepuesto;
    }
}
