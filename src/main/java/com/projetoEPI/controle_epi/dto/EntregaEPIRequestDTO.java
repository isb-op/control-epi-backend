package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

import com.projetoEPI.controle_epi.model.EntregaEPI;

public record EntregaEPIRequestDTO(
        Long funcionarioId,
        Long epiId,
        Integer quantidade,
        LocalDate dataEntrega,
        String responsavelEntrega,
        String observacao
) {
}