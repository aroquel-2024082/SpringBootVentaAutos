package com.angelroquel.VentaAuto.service;

import com.angelroquel.VentaAuto.model.Clientes;
import com.angelroquel.VentaAuto.repository.ClientesRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesImplements implements ClienteService {

    private final ClientesRepository clientesRepository;
    private final Validation validation;

    public ClientesImplements(ClientesRepository clientesRepository, Validation validation) {
        this.clientesRepository = clientesRepository;
        this.validation = validation;
    }

    @Override
    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll();
    }

    @Override
    public Clientes getClienteById(Integer id) {
        Optional<Clientes> cliente = clientesRepository.findById(id);
        return cliente.orElse(null);
    }

    @Override
    public Clientes saveCliente(Clientes cliente) {
        String mensaje = validation.validarCliente(cliente);
        if (mensaje != null) {
            throw new DataIntegrityViolationException(mensaje);
        }
        return clientesRepository.save(cliente);
    }

    @Override
    public Clientes updateCliente(Integer id, Clientes cliente) {
        Clientes existinCliente = clientesRepository.findById(id).orElse(null);
        if (existinCliente != null) {
            if (!existinCliente.getEmailCliente().equals(cliente.getEmailCliente())) {
                String mensaje = validation.validarCliente(cliente);
                if (mensaje != null) {
                    throw new DataIntegrityViolationException(mensaje);
                }
            }
            existinCliente.setNombreCliente(cliente.getNombreCliente());
            existinCliente.setApellidoCliente(cliente.getApellidoCliente());
            existinCliente.setEmailCliente(cliente.getEmailCliente());
            existinCliente.setTelefonoCliente(cliente.getTelefonoCliente());
            return clientesRepository.save(existinCliente);
        }
        return null;
    }

    @Override
    public void deleteCliente(Integer id) {
        clientesRepository.deleteById(id);
    }
}
