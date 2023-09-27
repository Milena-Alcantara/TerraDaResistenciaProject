package com.edu.terraDaResistencia.controller;

import com.edu.terraDaResistencia.model.PurchasingBaseModel;
import com.edu.terraDaResistencia.service.PurchasingBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/purchasingBase")
public class PurchasingBaseController {
    @Autowired
    PurchasingBaseService purchasingBaseService;

    @PostMapping
    public PurchasingBaseModel registerNewProduct(@RequestBody PurchasingBaseModel purchasingBaseModel){
        return purchasingBaseService.registerProduct(purchasingBaseModel);
    }

    @GetMapping
    public List<PurchasingBaseModel> showProducts(){
        return purchasingBaseService.showProducts();
    }
}
