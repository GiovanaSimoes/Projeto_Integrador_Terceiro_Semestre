package com.sensation.API.Sensation.Controller;

import com.sensation.API.Sensation.DAO.ClienteDAO;
import com.sensation.API.Sensation.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class ClienteController {

    @Autowired
    ClienteDAO cDAO;

    @GetMapping("/cliente/qtd")
    public int getCount() {
        return cDAO.count();
    }

    @GetMapping("/cliente/todos")
    public List<Cliente> getClientes() {
        return cDAO.getAll();
    }

    @GetMapping("/cliente/id={id}")
    public Cliente getClienteById(@PathVariable int id) {
        return cDAO.getById(id);
    }

    @PostMapping("/cliente")
    public String saveCliente(@RequestBody Cliente cliente) {
        return cDAO.save(cliente) + " registro adicionado!";
    }

    @PutMapping("/cliente/{id}")
    public String updateCliente(@RequestBody Cliente cliente, @PathVariable int id) {
        return cDAO.update(cliente, id) + " registro atualizado!";
    }

    @DeleteMapping("/cliente/{id}")
    public String deleteClienteById(@PathVariable int id) {
        return cDAO.delete(id) + " registro deletado!";
    }

    @GetMapping("/cliente/cpf={cpf}")
    public Cliente getClienteByCPF(@PathVariable String cpf) {
        return cDAO.getByCPF(cpf);
    }

    @RequestMapping("cliente/email={email}&senha={senha}")
    public int validaLoginCliente(@PathVariable String email, @PathVariable String senha) {
        return cDAO.validaLogin(email, senha);
    }

}
