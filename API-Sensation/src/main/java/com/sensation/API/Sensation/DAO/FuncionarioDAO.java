package com.sensation.API.Sensation.DAO;

import com.sensation.API.Sensation.Model.Funcionario;

import java.util.List;

public interface FuncionarioDAO {

    int count();

    int save(Funcionario funcionario);

    int update(Funcionario funcionario, int id);

    int delete(int id);

    List<Funcionario> getAll();

    Funcionario getById(int id);

    Funcionario getByCPF(String cpf);

}
