package com.angelroquel.VentaAuto.controller;

import com.angelroquel.VentaAuto.model.Repuestos;
import com.angelroquel.VentaAuto.service.RepuestoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/repuestos")
public class RepuestosController {

    private final RepuestoService repuestoService;

    public RepuestosController(RepuestoService repuestoService) {
        this.repuestoService = repuestoService;
    }

    @GetMapping
    public List<Repuestos> getAllRepuestos() {
        return repuestoService.getAllRepuestos();
    }

    @GetMapping("/{idRepuesto}")
    public Repuestos getRepuestoById(@PathVariable Integer idRepuesto) {
        return repuestoService.getRepuestoById(idRepuesto);
    }

    @PostMapping
    public Repuestos createRepuesto(@RequestBody Repuestos repuesto) {
        return repuestoService.saveRepuesto(repuesto);
    }

    @PutMapping("/{idRepuesto}")
    public Repuestos updateRepuesto(@PathVariable Integer idRepuesto, @RequestBody Repuestos repuesto) {
        return repuestoService.updateRepuesto(idRepuesto, repuesto);
    }

    @DeleteMapping("/{idRepuesto}")
    public void deleteRepuesto(@PathVariable Integer idRepuesto) {
        repuestoService.deleteRepuesto(idRepuesto);
    }
}