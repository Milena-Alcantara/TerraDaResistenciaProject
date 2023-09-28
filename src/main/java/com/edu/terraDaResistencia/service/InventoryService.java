package com.edu.terraDaResistencia.service;

import com.edu.terraDaResistencia.model.InventoryModel;
import com.edu.terraDaResistencia.repository.InvetoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InventoryService {
    @Autowired
    InvetoryRepository invetoryRepository;

    public InventoryModel registerInvetory(InventoryModel inventoryModel) {
        return invetoryRepository.saveAndFlush(inventoryModel);
    }

    public List<InventoryModel> searchInventoryAndRebels() {
        return invetoryRepository.searchInventoryAndRebels();
    }
}