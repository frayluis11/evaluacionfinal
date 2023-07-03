package com.examen.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Empleado")
@Table(name = "empleado")
public class Empleado {
    
	@Id
     String idEmpleado;
     String nombre;
     String cargo;
     String direccion;
     
	public Empleado() {
		super();
	}

	public Empleado(String idEmpleado, String nombre, String cargo, String direccion) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.cargo = cargo;
		this.direccion = direccion;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
    
}
