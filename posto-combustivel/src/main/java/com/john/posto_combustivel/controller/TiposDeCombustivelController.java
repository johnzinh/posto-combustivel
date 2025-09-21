package com.john.posto_combustivel.controller;


import com.john.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import com.john.posto_combustivel.services.TiposDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("tiposDeCombustivel")
public class TiposDeCombustivelController {

    private final TiposDeCombustivelService tipoDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody TiposDeCombustivel tipoCombustivel) {
        tipoDeCombustivelService.criar(tipoCombustivel);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<TiposDeCombustivel>> buscarTiposDeCombustivel() {
        return ResponseEntity.ok(tipoDeCombustivelService.buscarTipoDeCombustivel());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TiposDeCombustivel> buscarTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(tipoDeCombustivelService.buscarTipoDeCombustivelPorID(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        tipoDeCombustivelService.deletarTipoDeCombustivel(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarTipoDeCombustivel(@RequestParam(name = "id") Integer id,
                                                         @RequestBody TiposDeCombustivel tiposDeCombustivel){
        tipoDeCombustivelService.alterarTipoDeCombustivel(tiposDeCombustivel, id);
        return ResponseEntity.ok().build();
    }



}
