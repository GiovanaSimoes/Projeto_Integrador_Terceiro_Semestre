package com.sensation.API.Sensation.Controller;

import com.sensation.API.Sensation.DAO.FuncionarioDAO;
import com.sensation.API.Sensation.Model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FuncionarioController {

    @Autowired
    FuncionarioDAO cDAO;

    @GetMapping("/funcionario/qtd")
    public int getCount() {
        return cDAO.count();
    }

    @GetMapping("/funcionario/todos")
    public List<Funcionario> getfuncionarios() {
        return cDAO.getAll();
    }

    @GetMapping("/funcionario/id={id}")
    public Funcionario getfuncionarioById(@PathVariable int id) {
        return cDAO.getById(id);
    }

    @PostMapping("/funcionario")
    public String savefuncionario(@RequestBody Funcionario funcionario) {
        return cDAO.save(funcionario) + " registro adicionado!";
    }

    @PutMapping("/funcionario/{id}")
    public String updatefuncionario(@RequestBody Funcionario funcionario, @PathVariable int id) {
        return cDAO.update(funcionario, id) + " registro atualizado!";
    }

    @DeleteMapping("/funcionario/{id}")
    public String deletefuncionarioById(@PathVariable int id) {
        return cDAO.delete(id) + " registro deletado!";
    }

    @GetMapping("/funcionario/cpf={cpf}")
    public Funcionario getfuncionarioByCPF(@PathVariable String cpf) {
        return cDAO.getByCPF(cpf);
    }


}
