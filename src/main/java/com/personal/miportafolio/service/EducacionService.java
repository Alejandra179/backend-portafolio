package com.personal.miportafolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.miportafolio.model.Educacion;
import com.personal.miportafolio.repository.EducacionRepository;

@Service

public class EducacionService implements IEducacionService{

	@Autowired
	private EducacionRepository eduRepository;
	@Override
	public List<Educacion> getEducaciones() {
		List<Educacion> listaEducaciones = eduRepository.findAll();
		return listaEducaciones;
	}

	@Override
	public void saveEducacion(Educacion edu) {
		eduRepository.save(edu);
		
	}

	@Override
	public void deleteEducacion(Long id) {
		eduRepository.deleteById(id);
		
	}

	@Override
	public Educacion findEducacion(Long id) {
		Educacion edu = eduRepository.findById(id).orElse(null);
		return edu;
	}

	@Override
	public void update(Educacion request, Long id) {
		Optional<Educacion> educaciones = this.eduRepository.findById(id);
		Educacion edu = educaciones.get();
		edu.setNombre_establecimiento(request.getNombre_establecimiento());
		edu.setLugar(request.getLugar());
		edu.setFecha_desde(request.getFecha_desde());
		edu.setFecha_hasta(request.getFecha_hasta());
		edu.setNumero(request.getNumero());
		edu.setTitulo(request.getTitulo());
		edu.setNivel(request.getNivel());
		this.eduRepository.save(edu);
		
	}

}
