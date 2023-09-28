package com.edu.terraDaResistencia.repository;

import com.edu.terraDaResistencia.model.InventoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvetoryRepository extends JpaRepository<InventoryModel, Long> {
    @Query(value = "SELECT * FROM tb_inventario ", nativeQuery = true)
    List<InventoryModel> searchInventoryAndRebels();
}