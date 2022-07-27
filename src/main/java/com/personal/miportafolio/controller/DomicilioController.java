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

import com.personal.miportafolio.model.Domicilio;
import com.personal.miportafolio.service.IDomicilioService;


@RestController
@CrossOrigin(origins = "https://my-first-portafolio.web.app")
public class DomicilioController {
@Autowired
	
	private IDomicilioService interDomicilio;
	@GetMapping("/domicilios/traer")
	@ResponseBody
	public List<Domicilio> getDomicilios(){
		return interDomicilio.getDomicilios();
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/domicilios/guardar")
	@ResponseBody
	public ResponseEntity<Object> guardarDomicilio(@RequestBody Domicilio domi) {
		interDomicilio.saveDomicilio(domi);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	
	@GetMapping("/domicilios/traer/{id}")
	@ResponseBody
	public Domicilio obtenerDomicilio(@PathVariable Long id) {
		Domicilio domi = interDomicilio.findDomicilio(id);
		return domi;
	}
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/domicilios/borrar/{id}")
	@ResponseBody
	public ResponseEntity<Object>deleteDomicilio(@PathVariable Long id) {
		interDomicilio.deleteDomicilio(id);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/domicilios/editar/{id}")
	@ResponseBody
	public ResponseEntity<Object> updateDomicilio(@RequestBody Domicilio res,
			@PathVariable Long id) {
		
		this.interDomicilio.update(res, id);
		return ResponseEntity.ok(Boolean.TRUE);
	}

	
	
}
