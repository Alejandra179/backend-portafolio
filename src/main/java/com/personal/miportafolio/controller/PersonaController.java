package com.personal.miportafolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.miportafolio.model.Persona;
import com.personal.miportafolio.service.IPersonaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
	
	@Autowired
	private IPersonaService interPersona;
	
	
	@GetMapping("/personas/traer")
	@ResponseBody
	public List<Persona> getPersonas(){
		return interPersona.getPersonas();
	}

	
	@GetMapping("/personas/traer/{id}")
	@ResponseBody
	public Persona obtenerPersona(@PathVariable Long id) {
		Persona perso = interPersona.findPersona(id);
		return perso;
	}
	
	@PostMapping("/personas/crear")
	public String createPersona(@RequestBody Persona perso) {
		interPersona.savePersona(perso);
		return "La persona fue creada correctamente";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/personas/editar/{id}")
	public Persona editPersona(@PathVariable Long id,
			@RequestParam ("edad")  int nuevaEdad) {
		Persona perso = interPersona.findPersona(id);
		perso.setEdad(nuevaEdad);
		interPersona.savePersona(perso);
		return perso;
	}
	
}