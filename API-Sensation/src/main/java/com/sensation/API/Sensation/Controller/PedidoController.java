package com.sensation.API.Sensation.Controller;

import com.sensation.API.Sensation.DAO.PedidoDAO;
import com.sensation.API.Sensation.Model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class PedidoController {

    @Autowired
    private PedidoDAO pDAO;

    @GetMapping("/pedido/qtd")
    public int getCount() {
        return pDAO.count();
    }

    @GetMapping("/pedido/todos")
    public List<Pedido> getPedidos() {
        return pDAO.getAll();
    }

    @GetMapping("/pedido/idcliente={id}")
    public List<Pedido> getPedidoByClienteId(@PathVariable int id) {
        return pDAO.getByIdCliente(id);
    }

    @GetMapping("/pedido/idpedido={id}")
    public Pedido getPedidoById(@PathVariable int id) {
        return pDAO.getById(id);
    }

    @PostMapping("/pedido")
    public String savePedido(@RequestBody Pedido pedido) {
        return pDAO.save(pedido) + " registro salvo no banco";
    }

}
