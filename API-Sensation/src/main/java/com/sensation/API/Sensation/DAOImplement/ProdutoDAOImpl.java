package com.sensation.API.Sensation.DAOImplement;

import com.sensation.API.Sensation.DAO.ProdutoDAO;
import com.sensation.API.Sensation.Model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdutoDAOImpl implements ProdutoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        try {
            return jdbcTemplate.queryForObject("select count(*) from tb_produto_venda", Integer.class);
        } catch (NullPointerException e) {
            System.out.println(e);
            return 0;
        }
    }

    @Override
    public int save(Produto produto) {
        return jdbcTemplate.update("insert into tb_produto_venda (prv_nome,prv_descricao,prv_valor,prv_estoque) values(?,?,?,?)", produto.getNome(), produto.getDescricao(), produto.getValor_produto(), produto.getEstoque());
    }

    @Override
    public int update(Produto produto, int id) {
        return jdbcTemplate.update("UPDATE tb_produto_venda SET prv_nome=?, prv_descricao=?, prv_valor=?, prv_estoque=? WHERE prv_id=?", produto.getNome(), produto.getDescricao(), produto.getValor_produto(), produto.getEstoque(), id);
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM tb_produto_venda WHERE prv_id=?", id);
    }

    @Override
    public List<Produto> getAll() {
        return jdbcTemplate.query("SELECT prv_id as id, prv_nome as nome, prv_descricao as descricao, prv_valor as valor_produto, prv_estoque as estoque FROM tb_produto_venda", new BeanPropertyRowMapper<Produto>(Produto.class));
    }

    @Override
    public Produto getById(int id) {
        return jdbcTemplate.queryForObject("SELECT prv_id as id, prv_nome as nome, prv_descricao as descricao, prv_valor as valor_produto, prv_estoque as estoque FROM tb_produto_venda WHERE prv_id=?", new BeanPropertyRowMapper<Produto>(Produto.class), id);
    }
}
