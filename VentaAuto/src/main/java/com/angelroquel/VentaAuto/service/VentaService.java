package com.angelroquel.VentaAuto.service;

import com.angelroquel.VentaAuto.model.Ventas;
import java.util.List;

public interface VentaService {
    List<Ventas> getAllVentas();
    Ventas getVentaById(Integer idVenta);
    Ventas saveVenta(Ventas venta);
    Ventas updateVenta(Integer idVenta, Ventas venta);
    void deleteVenta(Integer idVenta);
}
