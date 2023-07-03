package com.examen.proyecto.service;

import java.util.List;

import com.examen.proyecto.entity.Compra;

public interface CompraService {

	public Compra registrar(Compra compra);
	public Compra actulizar(Compra compra);
	public void eliminar(Compra compra);
	public List<Compra>ver();
}
