package com.angelroquel.VentaAuto.controller;

import com.angelroquel.VentaAuto.model.Ventas;
import com.angelroquel.VentaAuto.service.VentaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentasController {

    private final VentaService ventaService;

    public VentasController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping
    public List<Ventas> getAllVentas() {
        return ventaService.getAllVentas();
    }

    @GetMapping("/{idVenta}")
    public Ventas getVentaById(@PathVariable Integer idVenta) {
        return ventaService.getVentaById(idVenta);
    }

    @PostMapping
    public Ventas createVenta(@RequestBody Ventas venta) {
        return ventaService.saveVenta(venta);
    }

    @PutMapping("/{idVenta}")
    public Ventas updateVenta(@PathVariable Integer idVenta, @RequestBody Ventas venta) {
        return ventaService.updateVenta(idVenta, venta);
    }

    @DeleteMapping("/{idVenta}")
    public void deleteVenta(@PathVariable Integer idVenta) {
        ventaService.deleteVenta(idVenta);
    }
}