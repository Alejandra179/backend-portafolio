package com.personal.miportafolio.service;

import java.util.List;
import com.personal.miportafolio.model.Domicilio;

public interface IDomicilioService {
	public List <Domicilio> getDomicilios();
	public void saveDomicilio(Domicilio domicilio);
	public void deleteDomicilio(Long id);
	public Domicilio findDomicilio(Long id);
	public void update(Domicilio domi,Long id);

}