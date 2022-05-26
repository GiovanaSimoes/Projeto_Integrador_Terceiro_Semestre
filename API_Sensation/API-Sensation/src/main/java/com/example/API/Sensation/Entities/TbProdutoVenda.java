package com.example.API.Sensation.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "tb_produto_venda")
public class TbProdutoVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prv_id", nullable = false)
    private Integer id;

    @Column(name = "prv_nome", length = 100)
    private String prvNome;

    @Column(name = "prv_descricao")
    private String prvDescricao;

    @Column(name = "prv_valor", precision = 9, scale = 2)
    private BigDecimal prvValor;

    @Column(name = "prv_estoque")
    private Integer prvEstoque;

    @OneToMany(mappedBy = "tb_produto_venda")
     Set<TbProdutoPedido> pedidosDoProduto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrvNome() {
        return prvNome;
    }

    public void setPrvNome(String prvNome) {
        this.prvNome = prvNome;
    }

    public String getPrvDescricao() {
        return prvDescricao;
    }

    public void setPrvDescricao(String prvDescricao) {
        this.prvDescricao = prvDescricao;
    }

    public BigDecimal getPrvValor() {
        return prvValor;
    }

    public void setPrvValor(BigDecimal prvValor) {
        this.prvValor = prvValor;
    }

    public Integer getPrvEstoque() {
        return prvEstoque;
    }

    public void setPrvEstoque(Integer prvEstoque) {
        this.prvEstoque = prvEstoque;
    }

}