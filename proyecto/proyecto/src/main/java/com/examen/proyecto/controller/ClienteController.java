package com.examen.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.proyecto.entity.Cliente;
import com.examen.proyecto.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins ="http://localhost:4200/")
public class ClienteController {

	@Autowired
	ClienteService x;
	
	@GetMapping("/cliente")
	public List<Cliente>ver(){
		return x.ver();
	}
	
	@PostMapping("/cliente")
	public Cliente registrar(@RequestBody Cliente cliente) {
		return x.registrar(cliente);	
	}
	
	@PutMapping("/cliente")
	public Cliente actulizar(@RequestBody Cliente cliente) {
		return x.actualizar(cliente);
	}
	
	@DeleteMapping("/cliente")
	public void eliminar(@RequestBody Cliente cliente) {
		x.eliminar(cliente);
	}
}