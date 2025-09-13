package com.angelroquel.VentaAuto.controller;

import com.angelroquel.VentaAuto.model.Proveedores;
import com.angelroquel.VentaAuto.service.ProveedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedoresController {

    private final ProveedorService proveedorService;

    public ProveedoresController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping
    public List<Proveedores> getAllProveedores() {
        return proveedorService.getAllProveedores();
    }

    @GetMapping("/{idProveedor}")
    public Proveedores getProveedorById(@PathVariable Integer idProveedor) {
        return proveedorService.getProveedorById(idProveedor);
    }

    @PostMapping
    public Proveedores createProveedor(@RequestBody Proveedores proveedor) {
        return proveedorService.saveProveedor(proveedor);
    }

    @PutMapping("/{idProveedor}")
    public Proveedores updateProveedor(@PathVariable Integer idProveedor, @RequestBody Proveedores proveedor) {
        return proveedorService.updateProveedor(idProveedor, proveedor);
    }

    @DeleteMapping("/{idProveedor}")
    public void deleteProveedor(@PathVariable Integer idProveedor) {
        proveedorService.deleteProveedor(idProveedor);
    }
}