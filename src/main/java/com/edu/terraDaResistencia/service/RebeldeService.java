package com.edu.terraDaResistencia.service;

import com.edu.terraDaResistencia.model.RebeldeModel;
import com.edu.terraDaResistencia.repository.RebeldeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class RebeldeService {
    @Autowired
    RebeldeRepository rebeldeRepository;

    public RebeldeModel registerNewRebelde(RebeldeModel rebeldeModel){
        return rebeldeRepository.save(rebeldeModel);
    }

    public ResponseEntity<RebeldeModel> update(@PathVariable long id, @RequestBody RebeldeModel novoRebeldeModel) {
        Optional<RebeldeModel> rebeldeExistente = rebeldeRepository.findById(id);
        if (rebeldeExistente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        RebeldeModel rebeldeAtualizado = rebeldeExistente.get();
        rebeldeAtualizado.setLocation(novoRebeldeModel.getLocation());
        rebeldeRepository.save(rebeldeAtualizado);
        return ResponseEntity.ok(rebeldeAtualizado);
    }

    public int validator = 0;

    public boolean reportToValidate(){
        validator+=1;
        return validator>=3;
    }
    public ResponseEntity<RebeldeModel> upadateRebelde(@PathVariable long id){
        Optional<RebeldeModel> rebeldeExistente = rebeldeRepository.findById(id);
        if (rebeldeExistente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        RebeldeModel rebeldeAtualizado = rebeldeExistente.get();
        if (reportToValidate()){
            rebeldeAtualizado.setStatusTraitor(true);
            rebeldeRepository.save(rebeldeAtualizado);
        }
        return ResponseEntity.ok(rebeldeAtualizado);
    }



}
