package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

public record DevolucaoEPIRequestDTO(
        Long entregaId,
        Integer quantidade,
        LocalDate dataDevolucao,
        String condicao,
        String observacao
) {
}