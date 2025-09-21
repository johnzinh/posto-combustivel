package com.john.posto_combustivel.services;

import com.john.posto_combustivel.infrastructure.entities.Abastecimento;
import com.john.posto_combustivel.infrastructure.entities.BombaDeCombustivel;
import com.john.posto_combustivel.infrastructure.repositories.AbastecimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AbastecimentoService {
    private final AbastecimentoRepository abastecimentoRepository;
    private final BombaDeCombustivelService bombaDeCombustivelService;

    public void abastecer(Integer idBomba, Long litros) {
        BombaDeCombustivel bomba = bombaDeCombustivelService.buscarBombaDeCombustivelPorID(idBomba);
        BigDecimal valorTotal = bomba.getTiposCombustivel().getPrecoPorLitro().multiply(BigDecimal.valueOf(litros));

        Abastecimento abastecimento = Abastecimento.builder()
                .dataAbastecimento(LocalDate.now())
                .bombaDeCombustivel(bomba)
                .valorTotal(valorTotal)
                .quantidadeDeLitros(litros)
                .build();

        abastecimentoRepository.save(abastecimento);

    }

    public List<Abastecimento> buscarAbastecimentos() {
        return abastecimentoRepository.findAll();
    }

}
