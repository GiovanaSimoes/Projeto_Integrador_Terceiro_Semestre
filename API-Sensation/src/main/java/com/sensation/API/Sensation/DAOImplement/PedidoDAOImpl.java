package com.sensation.API.Sensation.DAOImplement;

import com.sensation.API.Sensation.Model.Pedido;
import com.sensation.API.Sensation.DAO.PedidoDAO;
import org.springframework.beans.factory.annotation.Autowired;
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
        return 0;
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
        return null;
    }

    @Override
    public Pedido getById(int id) {
        return null;
    }
}
