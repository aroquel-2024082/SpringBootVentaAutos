package com.angelroquel.VentaAuto.service;

import com.angelroquel.VentaAuto.model.Repuestos;
import java.util.List;

public interface RepuestoService {
    List<Repuestos> getAllRepuestos();
    Repuestos getRepuestoById(Integer idRepuesto);
    Repuestos saveRepuesto(Repuestos repuesto);
    Repuestos updateRepuesto(Integer idRepuesto, Repuestos repuesto);
    void deleteRepuesto(Integer idRepuesto);
}