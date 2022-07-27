package com.personal.miportafolio.service;

import java.util.List;

import com.personal.miportafolio.model.ExperienciaLaboral;

public interface IExperienciaLaboralService {
	public List<ExperienciaLaboral> getExperienciaLaborales();
	public void saveExperienciaLaboral(ExperienciaLaboral exp_laboral);
	public void deleteExperienciaLaboral(Long id);
	public ExperienciaLaboral findExperienciaLaboral(Long id);
	public void update(ExperienciaLaboral expLaboral, Long id);

}