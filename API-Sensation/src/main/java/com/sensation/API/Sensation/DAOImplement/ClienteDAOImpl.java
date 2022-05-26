package com.sensation.API.Sensation.DAOImplement;

import com.sensation.API.Sensation.DAO.ClienteDAO;
import com.sensation.API.Sensation.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteDAOImpl implements ClienteDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM TB_CLIENTE", Integer.class);
    }

    @Override
    public int save(Cliente cliente) {
        return 0;
    }

    @Override
    public int update(Cliente cliente, int id) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Cliente> getAll() {
        return jdbcTemplate.query("SELECT cli_id as  id, cli_cpf as cpf, cli_nome as nome, cli_nascimento as nascimento,  cli_telefone as telefone," +
                "cli_genero as genero, cli_email as email, cli_cep as cep, cli_cidade as cidade, cli_logradouro as logradouro,cli_numero as numero, " +
                " cli_complemento as complemento,cli_uf as uf, cli_bairro as bairro, cli_senha as senha FROM TB_CLIENTE", new BeanPropertyRowMapper<Cliente>(Cliente.class));
    }

    @Override
    public Cliente getById(int id) {
        return null;
    }
}
