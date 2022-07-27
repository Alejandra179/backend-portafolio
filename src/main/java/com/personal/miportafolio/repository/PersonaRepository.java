package com.personal.miportafolio.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.miportafolio.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    
}
