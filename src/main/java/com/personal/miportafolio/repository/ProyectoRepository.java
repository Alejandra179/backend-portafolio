package com.personal.miportafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.personal.miportafolio.model.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long> {

}
