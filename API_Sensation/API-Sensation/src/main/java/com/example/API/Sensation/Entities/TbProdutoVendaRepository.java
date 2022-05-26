package com.example.API.Sensation.Entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TbProdutoVendaRepository extends JpaRepository<TbProdutoVenda, Integer> {
    TbProdutoVenda findByPedidosDoProduto(TbProdutoPedido pedidosDoProduto);
}