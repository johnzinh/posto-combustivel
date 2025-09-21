package com.john.posto_combustivel.controller;


import com.john.posto_combustivel.infrastructure.entities.Abastecimento;
import com.john.posto_combustivel.services.AbastecimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/abastecimento")
public class AbastecimentoController {

    private final AbastecimentoService abastecimentoService;

    @PostMapping
    public ResponseEntity<Void> abastecer(@RequestParam("quantidadaEmlitros") Long litros,
                                          @RequestParam("idBomba") Integer idBomba) {
        abastecimentoService.abastecer(idBomba, litros);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<Abastecimento>> buscarAbastecimentos(){
        return ResponseEntity.ok(abastecimentoService.buscarAbastecimentos());
    }
}
