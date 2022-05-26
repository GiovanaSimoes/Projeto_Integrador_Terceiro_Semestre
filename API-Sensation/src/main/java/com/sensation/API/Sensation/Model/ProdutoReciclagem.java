package com.sensation.API.Sensation.Model;

public class ProdutoReciclagem extends AbstrataProduto {
    
    private Reciclagem idReciclagem;

    public ProdutoReciclagem(Reciclagem idReciclagem, int quantidade, Produto idProduto) {
        super(quantidade, idProduto);
        this.idReciclagem = idReciclagem;
    }
    
    public Reciclagem getIdReciclagem() {
        return idReciclagem;
    }
    
}
