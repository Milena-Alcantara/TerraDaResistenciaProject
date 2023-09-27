package com.edu.terraDaResistencia.repository;

import com.edu.terraDaResistencia.model.RebeldeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RebeldeRepository  extends JpaRepository<RebeldeModel,Long> {
}
