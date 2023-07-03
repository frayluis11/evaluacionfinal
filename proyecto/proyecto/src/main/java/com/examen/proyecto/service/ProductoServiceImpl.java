package com.examen.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.proyecto.entity.Producto;
import com.examen.proyecto.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoRepository x;
	
	
	@Override
	public Producto registrar(Producto producto) {
		// TODO Auto-generated method stub
		return x.save(producto);
	}

	@Override
	public Producto actualizar(Producto producto) {
		// TODO Auto-generated method stub
		return x.save(producto);
	}

	@Override
	public void elimanar(Producto producto) {
		// TODO Auto-generated method stub
		x.delete(producto);
	}

	@Override
	public List<Producto> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
