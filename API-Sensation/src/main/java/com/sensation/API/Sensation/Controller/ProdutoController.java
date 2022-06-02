package com.sensation.API.Sensation.Controller;

import com.sensation.API.Sensation.DAO.ProdutoDAO;
import com.sensation.API.Sensation.Model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoDAO pDAO;

    @GetMapping("/produto/todos")
    public List<Produto> getProdutos() {
        return pDAO.getAll();
    }

    @GetMapping("/produto/qtd")
    public int getCount() {
        return pDAO.count();
    }

    @GetMapping("/produto/{id}")
    public Produto getProdutoById(@PathVariable int id) {
        return pDAO.getById(id);
    }

    @PostMapping("/produto")
    public String saveProduto(@RequestBody Produto produto) {
        return pDAO.save(produto) + " registros alterados/salvos no banco de dados";
    }

    @PutMapping("/produto/{id}")
    public String updateProduto(@RequestBody Produto produto, @PathVariable int id) {
        return pDAO.update(produto, id) + " registros alterados no banco de dados";
    }

    @DeleteMapping("/produto/{id}")
    public String deleteProdutoById(@PathVariable int id) {
        return pDAO.delete(id) + " registros deletados no banco de dados";
    }


}
