package com.sensation.API.Sensation.DAO;

import com.sensation.API.Sensation.Model.Pedido;

import java.util.List;

public interface PedidoDAO {

    int count();

    int save(Pedido pedido);

    int update (Pedido pedido, int id);

    int delete (int id);

    List<Pedido> getAll();

    Pedido getById(int id);
}
