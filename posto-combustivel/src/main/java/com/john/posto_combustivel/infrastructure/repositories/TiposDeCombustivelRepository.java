package com.john.posto_combustivel.infrastructure.repositories;

import com.john.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiposDeCombustivelRepository extends JpaRepository<TiposDeCombustivel, Integer> {

}
