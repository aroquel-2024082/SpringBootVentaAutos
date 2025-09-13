package com.angelroquel.VentaAuto.controller;


import com.angelroquel.VentaAuto.model.Clientes;
import com.angelroquel.VentaAuto.service.ClienteService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/clientes"})
public class ClientesController {
    private final ClienteService clienteService;

    public ClientesController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Clientes> getAllUsers(){
        return clienteService.getAllClientes();
    }

    @GetMapping("/{idCliente}")
    public Clientes getClienteById(@PathVariable Integer idCliente){
        return clienteService.getClienteById(idCliente);
    }

    @PostMapping
    public ResponseEntity<Object> createCliente(@RequestBody Clientes cliente){
        try {
            Clientes createdCliente = clienteService.saveCliente(cliente);
            return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
        } catch (DataIntegrityViolationException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping ("/{idCliente}")
    public Clientes updateCliente(@PathVariable Integer idCliente, @RequestBody Clientes cliente){
        return clienteService.updateCliente(idCliente, cliente);
    }

    @DeleteMapping ("/{idCliente}")
    public void deleteCliente(@PathVariable Integer idCliente){
        clienteService.deleteCliente(idCliente);
    }

}
