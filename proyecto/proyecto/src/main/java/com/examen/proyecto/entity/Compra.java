package com.examen.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "Compra")
@Table(name = "compra")
public class Compra {
    
	@Id
     String idCompra;
     String fechaCompra;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

    public Compra() {
		super();
	}

	public Compra(String idCompra, String fechaCompra, Cliente cliente, Producto producto) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.cliente = cliente;
        this.producto = producto;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public String getFecha() {
        return fechaCompra;
    }

    public void setFecha(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}