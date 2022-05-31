package com.sensation.API.Sensation.DAO;

import com.sensation.API.Sensation.Model.Produto;

import java.util.List;

public interface ProdutoDAO {
    int count();

    int save(Produto produto);

    int update(Produto produto, int id);

    int delete(int id);

    List<Produto> getAll();

    Produto getById(int id);
}
