package com.john.posto_combustivel.services;


import com.john.posto_combustivel.infrastructure.entities.TipoCombustivel;
import com.john.posto_combustivel.infrastructure.repositories.TipoDeCombustivelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoDeCombustivelService {
    private final TipoDeCombustivelRepository tipoDeCombustivelRepository;

    //metodos CRUD
    private void criar(TipoCombustivel tipoCombustivel){
        tipoDeCombustivelRepository.save(tipoCombustivel);
    }

    private TipoCombustivel buscarTipoDeCombustivelPorID(Integer id) {
        return tipoDeCombustivelRepository.findById(id).orElseThrow(() ->
                new NullPointerException("Tipo de combustivel não encontrado!"));
    }
    private List<TipoCombustivel> buscarTipoDeCombustivel(){
        return tipoDeCombustivelRepository.findAll();
    }

    public void deletarTipoDeCombustivel(Integer id){
        tipoDeCombustivelRepository.deleteById(id);
    }

    public void alterarTipoDeCombustivel(TipoCombustivel tipoCombustivel, Integer id){
        TipoCombustivel tipo = buscarTipoDeCombustivelPorID(id);
        tipoCombustivel.setId(tipo.getId());

        tipoDeCombustivelRepository.save(tipoCombustivel);
    }







}
