package com.edu.terraDaResistencia.repository;

import com.edu.terraDaResistencia.model.PurchasingBaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchasingBaseRepository extends JpaRepository<PurchasingBaseModel,Long> {
}
