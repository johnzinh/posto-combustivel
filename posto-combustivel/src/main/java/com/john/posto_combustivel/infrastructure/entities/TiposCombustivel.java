package com.john.posto_combustivel.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tipos_de_combustivel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TiposCombustivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera automaticamnte os id
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco_por_litro")
    private BigDecimal precoPorLitro;






}
