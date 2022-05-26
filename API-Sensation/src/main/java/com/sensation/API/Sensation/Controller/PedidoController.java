package com.sensation.API.Sensation.Controller;

import com.sensation.API.Sensation.DAO.PedidoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    private PedidoDAO pDAO;

    @GetMapping("/pedido/qtd")
    public int getCount() {
        return pDAO.count();
    }


}
