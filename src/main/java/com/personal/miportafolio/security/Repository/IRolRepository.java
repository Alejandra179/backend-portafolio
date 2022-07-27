package com.personal.miportafolio.security.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.miportafolio.security.Enums.RolNombre;
import com.personal.miportafolio.security.entity.Rol;

@Repository
public interface IRolRepository  extends JpaRepository<Rol,Integer>{
	Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
