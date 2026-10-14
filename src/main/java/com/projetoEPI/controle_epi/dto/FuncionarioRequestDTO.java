package com.projetoEPI.controle_epi.dto;

import com.projetoEPI.controle_epi.model.Funcionario;

public record FuncionarioRequestDTO(Long id, String matricula, String nome, String setor, String funcao, String tamanhoCamisa, 
		String tamanhoCalca, String tamanhoCalcado, Boolean ativo ) {
	public Funcionario toEntity() {
		Funcionario funcionario = new Funcionario();
		funcionario.setId(this.id);
		funcionario.setMatricula(this.matricula);
		funcionario.setNome(this.nome);
		funcionario.setSetor(this.setor);
		funcionario.setFuncao(this.funcao);
		funcionario.setTamanhoCamisa(this.tamanhoCamisa);
		funcionario.setTamanhoCalca(this.tamanhoCalca);
		funcionario.setTamanhoCalcado(this.tamanhoCalcado);
		funcionario.setAtivo(this.ativo);
		return funcionario;
	}
	public static FuncionarioRequestDTO toDto(Funcionario funcionario) {
		return new FuncionarioRequestDTO(funcionario.getId(), funcionario.getMatricula(), funcionario.getNome(), funcionario.getSetor(), funcionario.getFuncao(), funcionario.getTamanhoCamisa(), funcionario.getTamanhoCalca(), funcionario.getTamanhoCalcado(), funcionario.getAtivo());
	}
}
