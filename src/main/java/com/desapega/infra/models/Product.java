package com.desapega.infra.models;

import com.desapega.domains.utils.enums.Condicao;
import com.desapega.domains.utils.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "produtos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id")
    private Long produtoId;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "imagem_url", length = 255)
    private String imagemUrl;

    @Column(name = "categoria", nullable = false, length = 100)
    private String categoria;

    @Column(name = "subcategoria", length = 100)
    private String subcategoria;

    @Column(name = "estado", nullable = false, length = 2)
    private String estado;

    @Column(name = "municipio", nullable = false, length = 100)
    private String municipio;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "condicao", nullable = false)
    private Condicao condicao;

    @Column(name = "favoritado", nullable = false)
    private Boolean favoritado;

    @Column(name = "data_postagem", nullable = false)
    private LocalDateTime dataPostagem;

    @Column(name = "proprietario_id", nullable = false)
    private Long proprietarioId;

    @Column(name = "mensagens", columnDefinition = "JSON")
    private String mensagens;
}
