package com.api.cadastro_produtos.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_produtos")
@Data //Criação dos getters e setters.
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    @Column(name = "nome_produto")
    @NotBlank(message = "O nome do produto é obrigatório.")
    private String nome;

    @Column(name = "preco_produto")
@PositiveOrZero(message = "Preço do produto é obrigatório.")
    private BigDecimal preco;

@Min(value = 0, message = "Quantidade é obrigatório.")
    private Integer quantidade;
@Column(length = 1000)
private String descricao;

private String categoria;

@Column(name = "data_criacao", updatable = false)
private LocalDateTime dataCriacao;

}
