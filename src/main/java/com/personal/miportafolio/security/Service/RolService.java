package com.personal.miportafolio.security.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.miportafolio.security.Enums.RolNombre;
import com.personal.miportafolio.security.Repository.IRolRepository;
import com.personal.miportafolio.security.entity.Rol;

@Service
@Transactional
public class RolService {
	@Autowired
	IRolRepository irolRepository;
	public Optional<Rol> getByRolNombre(RolNombre rolNombre){
		return irolRepository.findByRolNombre(rolNombre);
		
	}
	
	public void save(Rol rol) {
		irolRepository.save(rol);
	}

}
