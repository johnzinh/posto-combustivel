package com.john.posto_combustivel.controller;


import com.john.posto_combustivel.infrastructure.entities.BombaDeCombustivel;
import com.john.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import com.john.posto_combustivel.services.BombaDeCombustivelService;
import com.john.posto_combustivel.services.TiposDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("bombaDeCombustivel")
public class BombaDeCombustivelController {

    private final BombaDeCombustivelService bombaDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody BombaDeCombustivel bombaDeCombustivel) {
        bombaDeCombustivelService.criar(bombaDeCombustivel);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<BombaDeCombustivel>> buscarBombaDeCombustivel() {
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombaDeCombustivel());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BombaDeCombustivel> buscarBombasDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombaDeCombustivelPorID(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarBombaDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        bombaDeCombustivelService.deletarBombaCombustivel(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarBombaDeCombustivel(@RequestParam(name = "id") Integer id,
                                                         @RequestBody BombaDeCombustivel BombaDeCombustivel){
        bombaDeCombustivelService.alterarBombaDeCombustivel(id, BombaDeCombustivel);
        return ResponseEntity.ok().build();
    }



}
