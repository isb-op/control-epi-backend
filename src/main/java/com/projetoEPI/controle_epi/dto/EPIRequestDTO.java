package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

import com.projetoEPI.controle_epi.model.EPI;

//dados que entram na API
public record EPIRequestDTO(Long id, String codigo, String nome, String categoria, String tamanho, String fabricante, String numeroCa, LocalDate validadeCa, Integer quantidadeEstoque, Integer estoqueMinimo, Boolean ativo ) {
	public EPI toEntity() {
		EPI epi = new EPI();
		epi.setId(this.id);
		epi.setCodigo(this.codigo);
		epi.setNome(this.nome);
		epi.setCategoria(this.categoria);
		epi.setTamanho(this.tamanho);
		epi.setFabricante(this.fabricante);
		epi.setNumeroCa(this.numeroCa);
		epi.setValidadeCa(this.validadeCa);
		epi.setQuantidadeEstoque(this.quantidadeEstoque);
		epi.setEstoqueMinimo(this.estoqueMinimo);
		epi.setAtivo(this.ativo);
		return epi;
	}
	public static EPIRequestDTO toDto(EPI epi) {
		return new EPIRequestDTO(epi.getId(), epi.getCodigo(), epi.getNome(), epi.getCategoria(), epi.getTamanho(), epi.getFabricante(), epi.getNumeroCa(), epi.getValidadeCa(), epi.getQuantidadeEstoque(), epi.getEstoqueMinimo(), epi.getAtivo());
	}

}
