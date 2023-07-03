package com.examen.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.proyecto.entity.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, String>{

}
