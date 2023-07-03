package com.examen.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.proyecto.entity.Venta;
import com.examen.proyecto.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	VentaRepository x;
	
	@Override
	public Venta registrar(Venta venta) {
		// TODO Auto-generated method stub
		return x.save(venta);
	}

	@Override
	public Venta actulizar(Venta venta) {
		// TODO Auto-generated method stub
		return x.save(venta);
	}

	@Override
	public void eliminar(Venta venta) {
		// TODO Auto-generated method stub
		x.delete(venta);
	}

	@Override
	public List<Venta> ver() {
		// TODO Auto-generated method stub
		return null;
	}
}	
