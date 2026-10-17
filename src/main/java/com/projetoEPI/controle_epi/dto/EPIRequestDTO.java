package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

import com.projetoEPI.controle_epi.model.EPI;

public record EPIRequestDTO(
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

    public EPI toEntity() {

        EPI epi = new EPI();

        epi.setCodigo(this.codigo);
        epi.setNome(this.nome);
        epi.setCategoria(this.categoria);
        epi.setTamanho(this.tamanho);
        epi.setFabricante(this.fabricante);
        epi.setNumeroCa(this.numeroCa);
        epi.setValidadeCa(this.validadeCa);

        if (this.quantidadeEstoque != null) {
            epi.setQuantidadeEstoque(this.quantidadeEstoque);
        }

        if (this.estoqueMinimo != null) {
            epi.setEstoqueMinimo(this.estoqueMinimo);
        }

        if (this.ativo != null) {
            epi.setAtivo(this.ativo);
        }

        return epi;
    }
}