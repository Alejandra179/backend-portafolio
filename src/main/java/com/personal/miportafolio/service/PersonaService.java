package com.personal.miportafolio.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.miportafolio.model.Persona;
import com.personal.miportafolio.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private PersonaRepository persoRepository;

	@Override
	public List<Persona> getPersonas() {
		List<Persona> listaPersonas = persoRepository.findAll();
		return listaPersonas;
	}

	@Override
	public void savePersona(Persona perso) {
		persoRepository.save(perso);
		
	}

	@Override
	public Persona findPersona(Long id) {
		Persona perso = persoRepository.findById(id).orElse(null);
		return perso;
	}


	
    
    
}
