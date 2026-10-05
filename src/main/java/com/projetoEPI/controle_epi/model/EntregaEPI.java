package com.projetoEPI.controle_epi.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "entrega_epi")
@Getter
@Setter
@NoArgsConstructor
public class EntregaEPI {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private Funcionario funcionario;
	 private EPI epi;
	 @Column(nullable = false)
	 private int quantidade;
	 private Date dataEntrega;
	 @Column(length = 100)
	 private String responsavelEntrega;
	 @Column(length = 100)
	 private String observacao;
	 @Column(name = "criado_em", nullable = false)
	 private LocalDateTime criadoEm = LocalDateTime.now();

}
