package com.angelroquel.VentaAuto.service;

import com.angelroquel.VentaAuto.model.Clientes;
import com.angelroquel.VentaAuto.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class Validation {

    private final ClientesRepository clientesRepository;

    public Validation(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public String validarCliente(Clientes cliente) {
        if (clientesRepository.existsByEmailCliente(cliente.getEmailCliente())) {
            return "El correo electrónico " + cliente.getEmailCliente() + " ya está usado en la base de datos";
        }
        return null;
    }
}