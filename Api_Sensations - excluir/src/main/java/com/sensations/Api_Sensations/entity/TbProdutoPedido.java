package com.sensations.Api_Sensations.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_produto_pedido")
public class TbProdutoPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pp_id", nullable = false)
    private Integer id;

    @Column(name = "pp_estrelas")
    private Double ppEstrelas;

    @Column(name = "pp_avaliacao")
    private String ppAvaliacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pp_pd_id")
    private TbPedido ppPd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pp_prv_id")
    private TbProdutoVenda ppPrv;

    @Column(name = "pp_quantidade")
    private Integer ppQuantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPpEstrelas() {
        return ppEstrelas;
    }

    public void setPpEstrelas(Double ppEstrelas) {
        this.ppEstrelas = ppEstrelas;
    }

    public String getPpAvaliacao() {
        return ppAvaliacao;
    }

    public void setPpAvaliacao(String ppAvaliacao) {
        this.ppAvaliacao = ppAvaliacao;
    }

    public TbPedido getPpPd() {
        return ppPd;
    }

    public void setPpPd(TbPedido ppPd) {
        this.ppPd = ppPd;
    }

    public TbProdutoVenda getPpPrv() {
        return ppPrv;
    }

    public void setPpPrv(TbProdutoVenda ppPrv) {
        this.ppPrv = ppPrv;
    }

    public Integer getPpQuantidade() {
        return ppQuantidade;
    }

    public void setPpQuantidade(Integer ppQuantidade) {
        this.ppQuantidade = ppQuantidade;
    }

}