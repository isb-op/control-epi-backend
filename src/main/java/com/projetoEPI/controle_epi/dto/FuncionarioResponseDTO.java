package com.projetoEPI.controle_epi.dto;

import com.projetoEPI.controle_epi.model.Funcionario;

public record FuncionarioResponseDTO(
        Long id,
        String matricula,
        String nome,
        String setor,
        String funcao,
        String tamanhoCamisa,
        String tamanhoCalca,
        String tamanhoCalcado,
        Boolean ativo
) {

    public static FuncionarioResponseDTO fromEntity(Funcionario funcionario) {

        return new FuncionarioResponseDTO(
                funcionario.getId(),
                funcionario.getMatricula(),
                funcionario.getNome(),
                funcionario.getSetor(),
                funcionario.getFuncao(),
                funcionario.getTamanhoCamisa(),
                funcionario.getTamanhoCalca(),
                funcionario.getTamanhoCalcado(),
                funcionario.getAtivo()
        );
    }
}