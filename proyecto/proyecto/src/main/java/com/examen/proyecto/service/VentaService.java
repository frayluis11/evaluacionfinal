package com.examen.proyecto.service;

import java.util.List;

import com.examen.proyecto.entity.Venta;

public interface VentaService {

	public Venta registrar(Venta venta);
	public Venta actulizar(Venta venta);
	public void eliminar(Venta venta);
	public List<Venta> ver();
}
