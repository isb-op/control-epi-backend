package com.projetoEPI.controle_epi.model;
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
@Table(name = "funcionario")
@Getter
@Setter
@NoArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String matricula;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(length = 100)
    private String setor;

    @Column(length = 100)
    private String funcao;

    @Column(name = "tamanho_camisa", length = 10)
    private String tamanhoCamisa;

    @Column(name = "tamanho_calca", length = 10)
    private String tamanhoCalca;

    @Column(name = "tamanho_calcado", length = 10)
    private String tamanhoCalcado;

    @Column(nullable = false)
    private Boolean ativo = true;
    
    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm = LocalDateTime.now();
}