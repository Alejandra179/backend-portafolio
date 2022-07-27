package com.personal.miportafolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.personal.miportafolio.model.Proyecto;
import com.personal.miportafolio.service.IProyectoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
	@Autowired
	private IProyectoService interProyecto;
	@GetMapping("/proyectos/traer")
	@ResponseBody
	public List<Proyecto> getProyectos(){
		return interProyecto.getProyectos();
	}
	
	
	@GetMapping("/proyectos/traer/{id}")
	@ResponseBody
	public Proyecto obtenerProyecto(@PathVariable Long id) {
		Proyecto proye = interProyecto.findProyecto(id);
		return proye;
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/proyectos/guardar")
	@ResponseBody
	public ResponseEntity<Object>guardarProyecto(@RequestBody Proyecto proye) {
		interProyecto.saveProyecto(proye);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/proyectos/borrar/{id}")
	@ResponseBody
	public ResponseEntity<Object> deleteProyecto(@PathVariable Long id) {
		interProyecto.deleteProyecto(id);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/proyectos/editar/{id}")
	@ResponseBody
	public ResponseEntity<Object> updateProyecto(@RequestBody Proyecto res,
			@PathVariable Long id) {	
		this.interProyecto.update(res, id);
		return ResponseEntity.ok(Boolean.TRUE);
	}

	

}
