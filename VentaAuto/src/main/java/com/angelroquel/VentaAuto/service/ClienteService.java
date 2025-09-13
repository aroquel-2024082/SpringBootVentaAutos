package com.angelroquel.VentaAuto.service;

import com.angelroquel.VentaAuto.model.Clientes;
import java.util.List;

public interface ClienteService {
    List<Clientes> getAllClientes();
    Clientes getClienteById(Integer idCliente);
    Clientes saveCliente(Clientes cliente);
    Clientes updateCliente(Integer idCliente, Clientes cliente);
    void deleteCliente(Integer idCliente);
}