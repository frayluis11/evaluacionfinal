package com.examen.proyecto.service;

import java.util.List;

import com.examen.proyecto.entity.Empleado;

public interface EmpleadoService {

	public Empleado registrar(Empleado empleado);
	public Empleado actualizar(Empleado empleado);
	public void eliminar(Empleado empleado);
	public List<Empleado>ver();
}
