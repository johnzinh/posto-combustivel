package com.john.posto_combustivel.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bombas_de_combustivel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BombaDeCombustivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne//relacao muitos pra um - varias bombas pra um mesmo tipo de combsutivel
    @JoinColumn(name = "combustivel_id")
    private TiposDeCombustivel tiposCombustivel;





}
