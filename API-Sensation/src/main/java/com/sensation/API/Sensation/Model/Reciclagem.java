package com.sensation.API.Sensation.Model;

public class Reciclagem {

    private int idReciclagem;
    private final Cliente idCliente;

    public Reciclagem(int idReciclagem, Cliente idCliente) {
        this.idReciclagem = idReciclagem;
        this.idCliente = idCliente;
    }

    public int getIdReciclagem() {
        return idReciclagem;
    }

    public void setIdReciclagem(int idReciclagem) {
        this.idReciclagem = idReciclagem;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

}
