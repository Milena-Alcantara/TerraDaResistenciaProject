package com.edu.terraDaResistencia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbInventario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item")
    private String item;

    @ManyToOne
    @JoinColumn(name = "id_rebelde")
    private RebeldeModel idRebelde;
}