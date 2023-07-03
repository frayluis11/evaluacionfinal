package com.examen.proyecto.service;

import java.util.List;


import com.examen.proyecto.entity.Cliente;

public interface ClienteService {
	
	public Cliente registrar(Cliente cliente);
	public Cliente actualizar(Cliente cliente);
	public void eliminar(Cliente cliente);
	public List<Cliente>ver();

}
