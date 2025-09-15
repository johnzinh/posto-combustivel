package com.john.posto_combustivel.infrastructure.repositories;

import com.john.posto_combustivel.infrastructure.entities.BombaDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombaDeCombustivelRepository extends JpaRepository<BombaDeCombustivel, Integer> {
}
