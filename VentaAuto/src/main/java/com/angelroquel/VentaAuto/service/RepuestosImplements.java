package com.angelroquel.VentaAuto.service;

import com.angelroquel.VentaAuto.model.Repuestos;
import com.angelroquel.VentaAuto.repository.RepuestosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepuestosImplements implements RepuestoService {

    private final RepuestosRepository repuestosRepository;

    public RepuestosImplements(RepuestosRepository repuestosRepository) {
        this.repuestosRepository = repuestosRepository;
    }

    @Override
    public List<Repuestos> getAllRepuestos() {
        return repuestosRepository.findAll();
    }

    @Override
    public Repuestos getRepuestoById(Integer idRepuesto) {
        return repuestosRepository.findById(idRepuesto).orElse(null);
    }

    @Override
    public Repuestos saveRepuesto(Repuestos repuesto) {
        return repuestosRepository.save(repuesto);
    }

    @Override
    public Repuestos updateRepuesto(Integer idRepuesto, Repuestos repuesto) {
        Repuestos existinRepuesto = repuestosRepository.findById(idRepuesto).orElse(null);
        if (existinRepuesto != null) {
            existinRepuesto.setNombreRepuesto(repuesto.getNombreRepuesto());
            existinRepuesto.setAnioRepuesto(repuesto.getAnioRepuesto());
            existinRepuesto.setColorRepuesto(repuesto.getColorRepuesto());
            existinRepuesto.setPrecioRepuesto(repuesto.getPrecioRepuesto());
            existinRepuesto.setEstadoRepuesto(repuesto.getEstadoRepuesto());
            return repuestosRepository.save(existinRepuesto);
        }
        return null;
    }

    @Override
    public void deleteRepuesto(Integer idRepuesto) {
        repuestosRepository.deleteById(idRepuesto);
    }
}