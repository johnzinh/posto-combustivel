package com.john.posto_combustivel.services;


import com.john.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import com.john.posto_combustivel.infrastructure.repositories.TiposDeCombustivelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TiposDeCombustivelService {
    private final TiposDeCombustivelRepository tipoDeCombustivelRepository;

    //metodos CRUD
    public void criar(TiposDeCombustivel tipoCombustivel){
        tipoDeCombustivelRepository.save(tipoCombustivel);
    }

    public TiposDeCombustivel buscarTipoDeCombustivelPorID(Integer id) {
        return tipoDeCombustivelRepository.findById(id).orElseThrow(() ->
                new NullPointerException("Tipo de combustivel não encontrado!"));
    }
    public List<TiposDeCombustivel> buscarTipoDeCombustivel(){
        return tipoDeCombustivelRepository.findAll();
    }

    public void deletarTipoDeCombustivel(Integer id){
        tipoDeCombustivelRepository.deleteById(id);
    }

    public void alterarTipoDeCombustivel(TiposDeCombustivel tipoCombustivel, Integer id){
        TiposDeCombustivel tipo = buscarTipoDeCombustivelPorID(id);
        tipoCombustivel.setId(tipo.getId());

        tipoDeCombustivelRepository.save(tipoCombustivel);
    }







}
