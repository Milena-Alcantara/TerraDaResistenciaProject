package com.edu.terraDaResistencia.service;

import com.edu.terraDaResistencia.model.PurchasingBaseModel;
import com.edu.terraDaResistencia.repository.PurchasingBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchasingBaseService {
    @Autowired
    PurchasingBaseRepository purchasingBaseRepository;

    public PurchasingBaseModel registerProduct(PurchasingBaseModel purchasingBaseModel) {
        return purchasingBaseRepository.save(purchasingBaseModel);
    }

    public List<PurchasingBaseModel> showProducts() {
        return purchasingBaseRepository.findAll();
    }

}
