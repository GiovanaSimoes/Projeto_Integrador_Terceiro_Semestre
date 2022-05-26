package com.sensation.API.Sensation.Controller;

import com.sensation.API.Sensation.DAO.ClienteDAO;
import com.sensation.API.Sensation.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
