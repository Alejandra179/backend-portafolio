package com.personal.miportafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.miportafolio.model.Educacion;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Long> {

}
