package com.edu.terraDaResistencia.controller;

import com.edu.terraDaResistencia.model.RebeldeModel;
import com.edu.terraDaResistencia.service.RebeldeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api/rebelde")
public class RebeldeController {
    @Autowired
    RebeldeService rebeldeService;

    @PostMapping
    public RebeldeModel registerNewRebelde(@RequestBody RebeldeModel rebeldeModel){
        return rebeldeService.registerNewRebelde(rebeldeModel);
    }

    @PutMapping("/api/updateLocation/{id}")
    public ResponseEntity<RebeldeModel> update(@PathVariable long id, @RequestBody RebeldeModel rebeldeModel ){
       return rebeldeService.update(id, rebeldeModel);
    }
    @PutMapping("/api/upadateStatus{id}")
    public ResponseEntity<RebeldeModel> upadateRebelde(@PathVariable long id){
        return rebeldeService.upadateRebelde(id);
    }

}
