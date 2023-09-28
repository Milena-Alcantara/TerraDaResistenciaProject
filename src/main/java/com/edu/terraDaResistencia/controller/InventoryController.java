package com.edu.terraDaResistencia.controller;

import com.edu.terraDaResistencia.model.InventoryModel;
import com.edu.terraDaResistencia.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @PostMapping
    public InventoryModel registerNewInventory(@RequestBody InventoryModel inventoryModel) {
        return inventoryService.registerInvetory(inventoryModel);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<InventoryModel>> searchInventoryAndRebels() {
        List<InventoryModel> inventories = inventoryService.searchInventoryAndRebels();
        return ResponseEntity.ok(inventories);
    }
}