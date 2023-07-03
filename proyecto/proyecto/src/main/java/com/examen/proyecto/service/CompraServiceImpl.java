package com.examen.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.proyecto.entity.Compra;
import com.examen.proyecto.repository.CompraRepository;

@Service
public class CompraServiceImpl implements CompraService {

	@Autowired
	CompraRepository x;
	
	@Override
	public Compra registrar(Compra compra) {
		// TODO Auto-generated method stub
		return x.save(compra);
	}

	@Override
	public Compra actulizar(Compra compra) {
		// TODO Auto-generated method stub
		return x.save(compra);
	}

	@Override
	public void eliminar(Compra compra) {
		// TODO Auto-generated method stub
		x.delete(compra);
	}

	@Override
	public List<Compra> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}