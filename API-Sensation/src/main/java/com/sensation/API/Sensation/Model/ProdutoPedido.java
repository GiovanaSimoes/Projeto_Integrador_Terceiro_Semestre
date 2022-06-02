package com.sensation.API.Sensation.Model;

public class ProdutoPedido extends AbstrataProduto {

    private final Pedido idPedido;
    private float estrelas;
    private String avaliacao;

    public ProdutoPedido(Pedido idPedido, float estrelas, String avaliacao, int quantidade, Produto idProduto) {
        super(quantidade, idProduto);
        this.idPedido = idPedido;
        this.estrelas = estrelas;
        this.avaliacao = avaliacao;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public float getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(float estrelas) {
        this.estrelas = estrelas;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

}
