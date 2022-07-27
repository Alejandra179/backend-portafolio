package com.personal.miportafolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.miportafolio.model.Proyecto;
import com.personal.miportafolio.repository.ProyectoRepository;

@Service
public class ProyectoService implements IProyectoService{

	@Autowired
	private ProyectoRepository proyeRepository;
	@Override
	public List<Proyecto> getProyectos() {
		List<Proyecto> listaProyectos = proyeRepository.findAll();
		return listaProyectos;
	}

	@Override
	public void saveProyecto(Proyecto proyecto) {
		proyeRepository.save(proyecto);
	}

	@Override
	public void deleteProyecto(Long id) {
		proyeRepository.deleteById(id);
		
	}

	@Override
	public Proyecto findProyecto(Long id) {
		Proyecto proye = proyeRepository.findById(id).orElse(null);
		return proye;
	}

	@Override
	public void update(Proyecto request, Long id) {
		Optional<Proyecto> proyectos = this.proyeRepository.findById(id);
		Proyecto proye = proyectos.get();
		proye.setDescripcion(request.getDescripcion());
		proye.setNombre(request.getNombre());
		proye.setFecha(request.getFecha());
		proye.setPersona(request.getPersona());
		this.proyeRepository.save(proye);
		
	}

}
