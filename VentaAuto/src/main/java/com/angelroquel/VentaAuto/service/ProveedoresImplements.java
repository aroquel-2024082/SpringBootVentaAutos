package com.angelroquel.VentaAuto.service;

import com.angelroquel.VentaAuto.model.Proveedores;
import com.angelroquel.VentaAuto.repository.ProveedoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresImplements implements ProveedorService {

    private final ProveedoresRepository proveedoresRepository;

    public ProveedoresImplements(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }

    @Override
    public List<Proveedores> getAllProveedores() {
        return proveedoresRepository.findAll();
    }

    @Override
    public Proveedores getProveedorById(Integer idProveedor) {
        return proveedoresRepository.findById(idProveedor).orElse(null);
    }

    @Override
    public Proveedores saveProveedor(Proveedores proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    @Override
    public Proveedores updateProveedor(Integer idProveedor, Proveedores proveedor) {
        Proveedores existinProveedor = proveedoresRepository.findById(idProveedor).orElse(null);
        if (existinProveedor != null) {
            existinProveedor.setNombreProveedor(proveedor.getNombreProveedor());
            existinProveedor.setContactoProveedor(proveedor.getContactoProveedor());
            return proveedoresRepository.save(existinProveedor);
        }
        return null;
    }

    @Override
    public void deleteProveedor(Integer idProveedor) {
        proveedoresRepository.deleteById(idProveedor);
    }
}