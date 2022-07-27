package com.personal.miportafolio.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.miportafolio.model.Hard;

@Repository

public interface HardRepository extends JpaRepository<Hard,Long> {



}
