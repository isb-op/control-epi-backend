package com.projetoEPI.controle_epi.dto;

import java.time.LocalDate;

//dados que saem da API
public record EPIResponseDTO( String codigo, String nome, String categoria, String tamanho, String fabricante, String numeroCa, LocalDate validadeCa, Integer quantidadeEstoque, Integer estoqueMinimo, Boolean ativo) {

}
