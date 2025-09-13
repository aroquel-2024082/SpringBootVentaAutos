package com.angelroquel.VentaAuto.service;

import com.angelroquel.VentaAuto.model.Proveedores;
import java.util.List;

public interface ProveedorService {
    List<Proveedores> getAllProveedores();
    Proveedores getProveedorById(Integer idProveedor);
    Proveedores saveProveedor(Proveedores proveedor);
    Proveedores updateProveedor(Integer idProveedor, Proveedores proveedor);
    void deleteProveedor(Integer idProveedor);
}

