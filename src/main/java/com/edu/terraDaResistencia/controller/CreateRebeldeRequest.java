package com.edu.terraDaResistencia.controller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRebeldeRequest {

    private Long id;
    private String name;
    private String location;
    private int age;
    private boolean statusTraitor = false;
}
