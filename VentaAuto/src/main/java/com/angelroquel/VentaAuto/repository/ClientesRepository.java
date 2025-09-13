package com.angelroquel.VentaAuto.repository;

import com.angelroquel.VentaAuto.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
    boolean existsByEmailCliente(String emailCliente);
}