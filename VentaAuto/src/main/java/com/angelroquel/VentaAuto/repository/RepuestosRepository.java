package com.angelroquel.VentaAuto.repository;

import com.angelroquel.VentaAuto.model.Repuestos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepuestosRepository extends JpaRepository<Repuestos, Integer> {
}