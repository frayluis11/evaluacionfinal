package com.examen.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.proyecto.entity.Cliente;
import com.examen.proyecto.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	ClienteRepository x;
	
	@Override
	public Cliente registrar(Cliente cliente) {
		// TODO Auto-generated method stub
		return x.save(cliente);
	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		return x.save(cliente);
	}

	@Override
	public void eliminar(Cliente cliente) {
		// TODO Auto-generated method stub
		x.delete(cliente);
	}

	@Override
	public List<Cliente> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}