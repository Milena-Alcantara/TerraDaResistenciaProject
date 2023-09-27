package com.edu.terraDaResistencia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbRebelde")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RebeldeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private boolean statusTraitor = false;

}
