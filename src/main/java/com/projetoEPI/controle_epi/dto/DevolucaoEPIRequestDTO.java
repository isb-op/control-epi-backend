package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

import com.projetoEPI.controle_epi.model.DevolucaoEPI;
import com.projetoEPI.controle_epi.model.EntregaEPI;

//dados que entram na API
public record DevolucaoEPIRequestDTO(Long id, EntregaEPI entrega, Integer quantidade, LocalDate dataEntrega, String condicao, String observacao) {
	public DevolucaoEPI toEntity() {
		DevolucaoEPI devolucaoEPI = new DevolucaoEPI();
		
		return devolucaoEPI;
	}
	public DevolucaoEPIRequestDTO toDto(DevolucaoEPI devolucaoEPI) {
		return new DevolucaoEPIRequestDTO();
	}
	

}
