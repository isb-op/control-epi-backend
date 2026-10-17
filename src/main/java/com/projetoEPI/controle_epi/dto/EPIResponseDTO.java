package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

import com.projetoEPI.controle_epi.model.EPI;

public record EPIResponseDTO(
        Long id,
        String codigo,
        String nome,
        String categoria,
        String tamanho,
        String fabricante,
        String numeroCa,
        LocalDate validadeCa,
        Integer quantidadeEstoque,
        Integer estoqueMinimo,
        Boolean ativo
) {

    public static EPIResponseDTO fromEntity(EPI epi) {

        return new EPIResponseDTO(
                epi.getId(),
                epi.getCodigo(),
                epi.getNome(),
                epi.getCategoria(),
                epi.getTamanho(),
                epi.getFabricante(),
                epi.getNumeroCa(),
                epi.getValidadeCa(),
                epi.getQuantidadeEstoque(),
                epi.getEstoqueMinimo(),
                epi.getAtivo()
        );
    }
}