package com.john.posto_combustivel.services;

import com.john.posto_combustivel.infrastructure.entities.BombaDeCombustivel;
import com.john.posto_combustivel.infrastructure.repositories.BombaDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BombaDeCombustivelService {

    private final BombaDeCombustivelRepository bombaDeCombustivelRepository;

    //metodos CRUD

    public void criar(BombaDeCombustivel bombaDeCombustivel) {
        bombaDeCombustivelRepository.save(bombaDeCombustivel);
    }

    public BombaDeCombustivel buscarBombaDeCombustivelPorID(Integer id) {
       return bombaDeCombustivelRepository.findById(id).orElseThrow(() ->
               new NullPointerException("Bomba de combustível não encontrada!"));
    }

    public List<BombaDeCombustivel> buscarBombaDeCombustivel(){
        return bombaDeCombustivelRepository.findAll();
    }


    @Transactional
    public void deletarBombaCombustivel(Integer id){
        bombaDeCombustivelRepository.deleteById(id);
    }

    public void alterarBombaDeCombustivel(Integer id, BombaDeCombustivel bombaDeCombustivel){
        BombaDeCombustivel bomba = buscarBombaDeCombustivelPorID(id);
        bombaDeCombustivel.setId(bomba.getId());
        bombaDeCombustivelRepository.save(bombaDeCombustivel);
    }






}
