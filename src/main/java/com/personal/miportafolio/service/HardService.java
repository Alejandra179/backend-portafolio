package com.personal.miportafolio.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.miportafolio.model.Hard;
import com.personal.miportafolio.repository.HardRepository;


@Service
public class HardService implements IHardService {

	@Autowired
	private HardRepository hardRepository;
	@Override
	public List<Hard> getHards() {
		List<Hard> listaHards = hardRepository.findAll();
		return listaHards;
	}

	@Override
	public void saveHard(Hard hard) {
		hardRepository.save(hard);
		
	}

	@Override
	public void deleteHard(Long id) {
		hardRepository.deleteById(id);
		
	}

	@Override
	public Hard findHard(Long id) {
		Hard har = hardRepository.findById(id).orElse(null);
		return har;
	}

	@Override
	public void update(Hard request, Long id) {
		Optional<Hard> hars = this.hardRepository.findById(id);
		Hard har = hars.get();
		har.setDescripcion(request.getDescripcion());
		har.setNivel_dominio(request.getNivel_dominio());
		har.setPersona(request.getPersona());
		this.hardRepository.save(har);
		
	}

	

}
