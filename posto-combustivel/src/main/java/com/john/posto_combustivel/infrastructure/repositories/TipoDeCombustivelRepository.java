package com.john.posto_combustivel.infrastructure.repositories;

import com.john.posto_combustivel.infrastructure.entities.TipoCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeCombustivelRepository extends JpaRepository<TipoCombustivel, Integer> {

}
