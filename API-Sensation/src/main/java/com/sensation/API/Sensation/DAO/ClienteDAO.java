package com.sensation.API.Sensation.DAO;

import com.sensation.API.Sensation.Model.Cliente;

import java.util.List;

public interface ClienteDAO {

    int count();

    int save(Cliente cliente);

    int update(Cliente cliente, int id);

    int delete(int id);

    List<Cliente> getAll();

    Cliente getById(int id);

    Cliente getByCPF(String cpf);

    int validaLogin(String email, String senha);
}
