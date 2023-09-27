package com.edu.terraDaResistencia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbBasedeCompra")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchasingBaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBase;

    @Column(nullable = false)
    private String item;

    @Column(nullable = false)
    private Double value;
}
