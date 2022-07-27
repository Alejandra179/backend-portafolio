package com.personal.miportafolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.miportafolio.model.ExperienciaLaboral;
import com.personal.miportafolio.repository.ExperienciaLaboralRepository;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {

	@Autowired
	private ExperienciaLaboralRepository expLaboralRepository;
	@Override
	public List<ExperienciaLaboral> getExperienciaLaborales() {
		List<ExperienciaLaboral> listaExperienciasLaborales = expLaboralRepository.findAll();
		return listaExperienciasLaborales;
	}

	@Override
	public void saveExperienciaLaboral(ExperienciaLaboral exp_laboral) {
		expLaboralRepository.save(exp_laboral);
		
	}

	@Override
	public void deleteExperienciaLaboral(Long id) {
		expLaboralRepository.deleteById(id);
		
		
	}

	@Override
	public ExperienciaLaboral findExperienciaLaboral(Long id) {
		ExperienciaLaboral expLaboral = expLaboralRepository.findById(id).orElse(null);
		return expLaboral;
	}

	@Override
	public void update(ExperienciaLaboral request, Long id) {
		Optional<ExperienciaLaboral> expLaborales = this.expLaboralRepository.findById(id);
		ExperienciaLaboral expLab = expLaborales.get();
		expLab.setCargo(request.getCargo());
		expLab.setDescripcion(request.getDescripcion());
		expLab.setFecha_desde(request.getFecha_desde());
		expLab.setFecha_hasta(request.getFecha_hasta());
		expLab.setLogo(request.getLogo());
		expLab.setLugar(request.getLugar());
		expLab.setPersona(request.getPersona());
		this.expLaboralRepository.save(expLab);
		
		
		
		
	}


	

}
