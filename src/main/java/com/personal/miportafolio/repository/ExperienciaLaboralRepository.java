package com.personal.miportafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.miportafolio.model.ExperienciaLaboral;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral,Long> {

}