package com.angelroquel.VentaAuto.repository;

import com.angelroquel.VentaAuto.model.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedores, Integer> {
}

