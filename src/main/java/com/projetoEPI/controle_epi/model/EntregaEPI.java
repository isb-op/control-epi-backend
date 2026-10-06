package com.projetoEPI.controle_epi.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	 
	 @ManyToOne
	 @JoinColumn(name = "funcionario_id", nullable = false)
	 private Funcionario funcionario;
	 
	 @ManyToOne
	 @JoinColumn(name = "epi_id", nullable = false)
	 private EPI epi;
	 
	 @Column(nullable = false)
	 private Integer quantidade = 1;
	 
	 @Column(name = "data_entrega", nullable = false)
	 private LocalDate dataEntrega;
	 
	 @Column(name = "responsavel_entrega", length = 150)
	 private String responsavelEntrega;
	 
	 @Column(length = 100)
	 private String observacao;
	 
	 @Column(name = "criado_em", nullable = false)
	 private LocalDateTime criadoEm = LocalDateTime.now();

}
