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

import com.personal.miportafolio.model.Educacion;
import com.personal.miportafolio.service.IEducacionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EducacionController {
	@Autowired
	private IEducacionService interEdu;
	@GetMapping("/educaciones/traer")
	@ResponseBody
	public List<Educacion> getEducaciones(){
		return interEdu.getEducaciones();
	}
	
	
	@GetMapping("/educaciones/traer/{id}")
	@ResponseBody
	public Educacion obtenerEducaciones(@PathVariable Long id) {
		Educacion edu = interEdu.findEducacion(id);
		return edu;
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/educaciones/guardar")
	@ResponseBody
	public ResponseEntity<Object>guardarEducacion(@RequestBody Educacion edu) {
		interEdu.saveEducacion(edu);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/educaciones/borrar/{id}")
	@ResponseBody
	public ResponseEntity<Object> deleteEducacion(@PathVariable Long id) {
		interEdu.deleteEducacion(id);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/educaciones/editar/{id}")
	@ResponseBody
	public ResponseEntity<Object> updateEducaciones(@RequestBody Educacion res,
			@PathVariable Long id) {	
		this.interEdu.update(res, id);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	

}
