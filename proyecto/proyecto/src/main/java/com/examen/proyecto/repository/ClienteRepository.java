package com.examen.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.proyecto.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
