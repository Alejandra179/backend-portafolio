package com.personal.miportafolio.service;

import java.util.List;
import com.personal.miportafolio.model.Educacion;

public interface IEducacionService {


	public List<Educacion> getEducaciones();
	public void saveEducacion(Educacion edu);
	public void deleteEducacion(Long id);
	public Educacion findEducacion(Long id);
	public void update(Educacion edu, Long id);
}
