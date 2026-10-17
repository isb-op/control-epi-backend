package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

import com.projetoEPI.controle_epi.model.DevolucaoEPI;

public record DevolucaoEPIResponseDTO(
        Long id,
        EntregaEPIResponseDTO entrega,
        Integer quantidade,
        LocalDate dataDevolucao,
        String condicao,
        String observacao
) {

    public static DevolucaoEPIResponseDTO fromEntity(
            DevolucaoEPI devolucao) {

        return new DevolucaoEPIResponseDTO(
                devolucao.getId(),
                EntregaEPIResponseDTO.fromEntity(
                        devolucao.getEntrega()
                ),
                devolucao.getQuantidade(),
                devolucao.getDataEntrega(),
                devolucao.getCondicao(),
                devolucao.getObservacao()
        );
    }
}