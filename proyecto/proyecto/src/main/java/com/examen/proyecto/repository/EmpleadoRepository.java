package com.examen.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.proyecto.entity.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String> {

}
