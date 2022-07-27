package com.personal.miportafolio.service;

import java.util.List;
import com.personal.miportafolio.model.Proyecto;

public interface IProyectoService {
	public List <Proyecto> getProyectos();
	public void saveProyecto(Proyecto proyecto);
	public void deleteProyecto(Long id);
	public Proyecto findProyecto(Long id);
	public void update(Proyecto proye,Long id);

}
