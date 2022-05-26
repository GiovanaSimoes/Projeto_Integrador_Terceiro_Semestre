package com.example.API.Sensation.Entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_produto_reciclagem")
public class TbProdutoReciclagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prc_id", nullable = false)
    private Integer id;

    @Column(name = "prc_produto", length = 100)
    private String prcProduto;

    @Column(name = "prc_quantidade")
    private Integer prcQuantidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prc_rec_id")
    private TbReciclagem prcRec;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrcProduto() {
        return prcProduto;
    }

    public void setPrcProduto(String prcProduto) {
        this.prcProduto = prcProduto;
    }

    public Integer getPrcQuantidade() {
        return prcQuantidade;
    }

    public void setPrcQuantidade(Integer prcQuantidade) {
        this.prcQuantidade = prcQuantidade;
    }

    public TbReciclagem getPrcRec() {
        return prcRec;
    }

    public void setPrcRec(TbReciclagem prcRec) {
        this.prcRec = prcRec;
    }

}