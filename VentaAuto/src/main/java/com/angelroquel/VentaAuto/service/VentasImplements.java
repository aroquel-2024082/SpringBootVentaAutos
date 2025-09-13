package com.angelroquel.VentaAuto.service;

import com.angelroquel.VentaAuto.model.Ventas;
import com.angelroquel.VentaAuto.repository.VentasRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VentasImplements implements VentaService {

    private final VentasRepository ventasRepository;

    public VentasImplements(VentasRepository ventasRepository) {
        this.ventasRepository = ventasRepository;
    }

    @Override
    public List<Ventas> getAllVentas() {
        return ventasRepository.findAll();
    }

    @Override
    public Ventas getVentaById(Integer idVenta) {
        return ventasRepository.findById(idVenta).orElse(null);
    }

    @Override
    public Ventas saveVenta(Ventas venta) {
        return ventasRepository.save(venta);
    }

    @Override
    public Ventas updateVenta(Integer idVenta, Ventas venta) {
        Ventas existinVenta = ventasRepository.findById(idVenta).orElse(null);
        if (existinVenta != null) {
            existinVenta.setCliente(venta.getCliente());
            existinVenta.setRepuesto(venta.getRepuesto());
            existinVenta.setFechaVenta(venta.getFechaVenta());
            existinVenta.setPrecioVenta(venta.getPrecioVenta());
            return ventasRepository.save(existinVenta);
        }
        return null;
    }

    @Override
    public void deleteVenta(Integer idVenta) {
        ventasRepository.deleteById(idVenta);
    }
}
