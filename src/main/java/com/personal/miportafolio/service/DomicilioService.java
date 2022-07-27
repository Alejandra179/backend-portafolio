package com.personal.miportafolio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.miportafolio.model.Domicilio;
import com.personal.miportafolio.repository.DomicilioRepository;


@Service
public class DomicilioService implements IDomicilioService {

	@Autowired
	private DomicilioRepository domiRepository;
	
	@Override
	public List<Domicilio> getDomicilios() {
	List<Domicilio> domicilios = domiRepository.findAll();
		return domicilios;
	}

	@Override
	public void saveDomicilio(Domicilio domicilio) {
		domiRepository.save(domicilio);
		
	}

	@Override
	public void deleteDomicilio(Long id) {
		domiRepository.deleteById(id);
		
	}

	@Override
	public Domicilio findDomicilio(Long id) {
		Domicilio domi = domiRepository.findById(id).orElse(null);
		return domi;
	}

	@Override
	public void update(Domicilio request, Long id) {
		Optional<Domicilio> domicilios = this.domiRepository.findById(id);
		Domicilio domicilio = domicilios.get();
		domicilio.setDescripcion(request.getDescripcion());
		domicilio.setBarrio(request.getBarrio());
		domicilio.setCalle(request.getCalle());
		domicilio.setLocalidad(request.getLocalidad());
		domicilio.setNumero(request.getNumero());
		domicilio.setPersona(request.getPersona());
		
		this.domiRepository.save(domicilio);
		
	}

}
