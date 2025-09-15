package com.john.posto_combustivel.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "abastecimento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Abastecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne //relacao um pra um - um abastecimento pra uma bomba
    @JoinColumn(name = "bomba_combustivel_id")
    private BombaDeCombustivel bombaDeCombustivel;

    @Column(name = "Data_abastecimento")
    private LocalDate dataAbastecimento;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Column(name = "quantidade_de_litros")
    private Long quantidadeDeLitros;




}
