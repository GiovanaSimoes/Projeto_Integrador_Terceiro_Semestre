package com.sensation.API.Sensation.Controller;

import com.sensation.API.Sensation.DAO.ClienteDAO;
import com.sensation.API.Sensation.Model.Cliente;
import com.sensation.API.Sensation.Model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    ClienteDAO cDAO;

    @GetMapping("/cliente/qtd")
    public int getCount() {
        return cDAO.count();
    }

    @GetMapping("/cliente/todos")
    public List<Cliente> getClientes()
    {
        return cDAO.getAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteById(@PathVariable int id) {
        return cDAO.getById(id);
    }

    @PostMapping("/cliente")
    public String saveCliente(@RequestBody Cliente cliente){
        return cDAO.save(cliente)+" registro adicionado!";
    }

    @PutMapping("/cliente/{id}")
    public String updateCliente(@RequestBody Cliente cliente, @PathVariable int id){
        return cDAO.update(cliente,id)+" registro atualizado!";
    }
    @DeleteMapping("/cliente/{id}")
    public String deleteClienteById(@PathVariable int id) {
        return cDAO.delete(id) + " registro deletado!";
    }

}
