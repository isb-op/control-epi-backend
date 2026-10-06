package com.projetoEPI.controle_epi.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name = "epi")
@Getter
@Setter
@NoArgsConstructor
public class EPI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 15)
    private String codigo; 
    
    @Column(nullable = false, length = 150)
    private String nome;
    
    @Column(nullable = false, length = 150)
    private String categoria;
    
    @Column(length = 30)
    private String tamanho;
    
    @Column(length = 150)
    private String fabricante;
    
    @Column(name = "numero_ca", length = 50)
    private String numeroCa;
    
    @Column(name = "validade_ca")
    private LocalDate validadeCa;
    
    @Column(name = "quantidade_estoque", nullable = false)
    private Integer quantidadeEstoque = 0;
    
    @Column(name = "estoque_minimo", nullable = false)
    private Integer estoqueMinimo = 0;
    
    @Column(nullable = false)
    private Boolean ativo = true;
    
    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm = LocalDateTime.now();

}
