package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

import com.projetoEPI.controle_epi.model.EntregaEPI;

public record EntregaEPIResponseDTO(
        Long id,
        FuncionarioResponseDTO funcionario,
        EPIResponseDTO epi,
        Integer quantidade,
        LocalDate dataEntrega,
        String responsavelEntrega,
        String observacao
) {

    public static EntregaEPIResponseDTO fromEntity(EntregaEPI entrega) {

        return new EntregaEPIResponseDTO(
                entrega.getId(),
                FuncionarioResponseDTO.fromEntity(
                        entrega.getFuncionario()
                ),
                EPIResponseDTO.fromEntity(
                        entrega.getEpi()
                ),
                entrega.getQuantidade(),
                entrega.getDataEntrega(),
                entrega.getResponsavelEntrega(),
                entrega.getObservacao()
        );
    }
}