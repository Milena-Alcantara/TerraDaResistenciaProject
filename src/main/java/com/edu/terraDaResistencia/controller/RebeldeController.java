package com.edu.terraDaResistencia.controller;

import com.edu.terraDaResistencia.model.RebeldeModel;
import com.edu.terraDaResistencia.service.RebeldeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/rebelde")
public class RebeldeController {
    @Autowired
    RebeldeService rebeldeService;

    @PostMapping
    public RebeldeModel registerNewRebelde(@RequestBody @Valid CreateRebeldeRequest createRebeldeRequest){
        return rebeldeService.registerNewRebelde(createRebeldeRequest);
    }

    @PutMapping("/updateLocation/{id}")
    public ResponseEntity<RebeldeModel> update(@PathVariable long id, @RequestBody RebeldeModel rebeldeModel ){
       return rebeldeService.update(id, rebeldeModel);
    }
    @PutMapping("/upadateStatus/{id}")
    public ResponseEntity<RebeldeModel> upadateRebelde(@PathVariable long id){
        return rebeldeService.upadateRebelde(id);
    }

}
