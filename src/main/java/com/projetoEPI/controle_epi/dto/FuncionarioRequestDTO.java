package com.projetoEPI.controle_epi.dto;

import com.projetoEPI.controle_epi.model.Funcionario;

public record FuncionarioRequestDTO(
        String matricula,
        String nome,
        String setor,
        String funcao,
        String tamanhoCamisa,
        String tamanhoCalca,
        String tamanhoCalcado,
        Boolean ativo
) {

    public Funcionario toEntity() {

        Funcionario funcionario = new Funcionario();

        funcionario.setMatricula(this.matricula);
        funcionario.setNome(this.nome);
        funcionario.setSetor(this.setor);
        funcionario.setFuncao(this.funcao);
        funcionario.setTamanhoCamisa(this.tamanhoCamisa);
        funcionario.setTamanhoCalca(this.tamanhoCalca);
        funcionario.setTamanhoCalcado(this.tamanhoCalcado);

        if (this.ativo != null) {
            funcionario.setAtivo(this.ativo);
        }

        return funcionario;
    }
}