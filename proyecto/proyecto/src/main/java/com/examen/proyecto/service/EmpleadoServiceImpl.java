package com.examen.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.proyecto.entity.Empleado;
import com.examen.proyecto.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoRepository x;
	
	@Override
	public Empleado registrar(Empleado empleado) {
		// TODO Auto-generated method stub
		return x.save(empleado);
	}

	@Override
	public Empleado actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		return x.save(empleado);
	}

	@Override
	public void eliminar(Empleado empleado) {
		// TODO Auto-generated method stub
		x.delete(empleado);
	}

	@Override
	public List<Empleado> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}