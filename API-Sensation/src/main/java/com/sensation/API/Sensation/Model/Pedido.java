package com.sensation.API.Sensation.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private int idPedido;
    private double valorPedido;
    private Date horaPedido;
    private int idCliente;
    private int idProduto;
    private int quantidadeProduto;

}
