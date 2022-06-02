package com.sensation.API.Sensation.DAOImplement;

import com.sensation.API.Sensation.DAO.PedidoDAO;
import com.sensation.API.Sensation.Model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PedidoDAOImpl implements PedidoDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        try {
            return jdbcTemplate.queryForObject("select count(*) from tb_pedido", Integer.class);
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    @Override
    public int save(Pedido pedido) {
        return jdbcTemplate.update("insert into tb_pedido (`pd_valor`, `pd_hora`, `pd_cli_id`,pd_prv_id, pd_prv_qtd) values(?,?,?,?,?)", pedido.getValorPedido(), pedido.getHoraPedido(), pedido.getIdCliente(), pedido.getIdProduto(), pedido.getQuantidadeProduto());
    }

    @Override
    public int update(Pedido pedido, int id) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Pedido> getAll() {
        return jdbcTemplate.query("SELECT pd_id as idPedido, pd_valor as valorPedido, pd_hora as horaPedido, pd_cli_id as idCliente, pd_prv_id as idProduto, pd_prv_qtd as quantidadeProduto FROM tb_pedido", new BeanPropertyRowMapper<Pedido>(Pedido.class));
    }

    @Override
    public List<Pedido> getByIdCliente(int idCliente) {
        return jdbcTemplate.query("SELECT pd_id as idPedido, pd_valor as valorPedido, pd_hora as horaPedido, pd_cli_id as idCliente, pd_prv_id as idProduto, pd_prv_qtd as quantidadeProduto FROM tb_pedido WHERE pd_cli_id = ? ", new BeanPropertyRowMapper<Pedido>(Pedido.class), idCliente);
    }

    @Override
    public Pedido getById(int id) {
        return jdbcTemplate.queryForObject("SELECT pd_id as idPedido, pd_valor as valorPedido, pd_hora as horaPedido, pd_cli_id as idCliente, pd_prv_id as idProduto, pd_prv_qtd as quantidadeProduto FROM tb_pedido WHERE pd_id = ? ", new BeanPropertyRowMapper<Pedido>(Pedido.class), id);
    }
}
