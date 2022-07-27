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

import com.personal.miportafolio.model.ExperienciaLaboral;
import com.personal.miportafolio.service.IExperienciaLaboralService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaLaboralController {
	@Autowired
	private IExperienciaLaboralService interExperienciaLaboral;
	
	@GetMapping("/experiencias-laborales/traer")
	@ResponseBody
	public List<ExperienciaLaboral>getExperienciasLaborales(){
		return interExperienciaLaboral.getExperienciaLaborales();
	}
	
	@GetMapping("/experiencias-laborales/traer/{id}")
	@ResponseBody
	public ExperienciaLaboral obtenerExpLaboral(@PathVariable Long id) {
		ExperienciaLaboral expLaboral = interExperienciaLaboral.findExperienciaLaboral(id);
		return expLaboral;
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/experiencias-laborales/guardar")
	@ResponseBody
	public ResponseEntity<Object> guardarExperienciaLaboral(@RequestBody ExperienciaLaboral exp_laboral) {
		interExperienciaLaboral.saveExperienciaLaboral(exp_laboral);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/experiencias-laborales/borrar/{id}")
	@ResponseBody
	public ResponseEntity<Object>deleteExperienciaLaboral(@PathVariable Long id) {
		interExperienciaLaboral.deleteExperienciaLaboral(id);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/experiencias-laborales/editar/{id}")
	@ResponseBody
	public ResponseEntity<Object> updateExperienciaLaboral(@RequestBody ExperienciaLaboral res,
			@PathVariable Long id) {
		
		this.interExperienciaLaboral.update(res, id);
		return ResponseEntity.ok(Boolean.TRUE);
	}


}
