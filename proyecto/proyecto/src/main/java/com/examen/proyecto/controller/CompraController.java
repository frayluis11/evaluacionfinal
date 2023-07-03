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

import com.examen.proyecto.entity.Compra;
import com.examen.proyecto.service.CompraService;

@RestController
@RequestMapping("/compras")
@CrossOrigin(origins ="http://localhost:4200/")
public class CompraController {

	
	

		@Autowired
		CompraService x;
		
		@GetMapping("/compra")
		public List<Compra>ver(){
			return x.ver();
		}
		
		@PostMapping("/compra")
		public Compra registrar(@RequestBody Compra compra) {
			return x.registrar(compra);	
		}
		
		@PutMapping("/compra")
		public Compra actulizar(@RequestBody Compra compra) {
			return x.actulizar(compra);
		}
		
		@DeleteMapping("/compra")
		public void eliminar(@RequestBody Compra compra) {
			x.eliminar(compra);
		}
	
	
}
