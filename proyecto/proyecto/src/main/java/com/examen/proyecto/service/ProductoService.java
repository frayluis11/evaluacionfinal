package com.examen.proyecto.service;

import java.util.List;

import com.examen.proyecto.entity.Producto;

public interface ProductoService {

	public Producto registrar(Producto producto);
	public Producto actualizar(Producto producto);
	public void elimanar(Producto producto);
	public List<Producto>ver();
	
}
