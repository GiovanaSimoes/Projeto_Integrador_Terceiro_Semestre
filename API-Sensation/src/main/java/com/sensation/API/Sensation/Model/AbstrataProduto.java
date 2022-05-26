package com.sensation.API.Sensation.Model;

public abstract class AbstrataProduto {

    private int quantidade;
    private Produto idProduto;

    public AbstrataProduto(int quantidade, Produto idProduto) {
        this.quantidade = quantidade;
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

}
