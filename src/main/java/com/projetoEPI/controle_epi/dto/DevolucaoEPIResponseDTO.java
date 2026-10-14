package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

import com.projetoEPI.controle_epi.model.EntregaEPI;

// dados que saem da API
public record DevolucaoEPIResponseDTO(EntregaEPI entrega, Integer quantidade, LocalDate dataEntrega, String condicao, String observacao) {
	
}
