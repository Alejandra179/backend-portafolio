package com.personal.miportafolio.service;

import java.util.List;

import com.personal.miportafolio.model.Persona;

public interface IPersonaService {
		
	public List<Persona> getPersonas();
	public void savePersona(Persona perso);
	public Persona findPersona(Long id);
}
