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
@Table(name = "devolucao_epi")
@Getter
@Setter
@NoArgsConstructor
public class DevolucaoEPI {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   
	   @ManyToOne
	   @JoinColumn(name = "entrega_id", nullable = false)
	   private EntregaEPI entrega;
	   
	   @Column(nullable = false)
	   private Integer quantidade = 1;
	   
	   @Column(name = "data_devolucao", nullable = false)
	   private LocalDate dataEntrega;
	   
	   @Column(length = 50)
	   private String condicao;
	   
	   @Column(length = 200)
	   private String observacao; 
	
	   @Column(name = "criado_em", nullable = false)
	   private LocalDateTime criadoEm = LocalDateTime.now();

}
