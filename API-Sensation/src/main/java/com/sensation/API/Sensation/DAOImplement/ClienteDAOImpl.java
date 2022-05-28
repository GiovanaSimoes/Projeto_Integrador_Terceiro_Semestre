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
        return jdbcTemplate.update("insert into tb_cliente (`cli_cpf`, `cli_nome`, `cli_nascimento`, `cli_genero`," + " `cli_telefone`,`cli_email`, `cli_cep`, `cli_cidade`, `cli_logradouro`, `cli_numero`, `cli_complemento`, `cli_uf`, " + "`cli_bairro`, `cli_senha`)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)", cliente.getCpf(), cliente.getNome(), cliente.getNascimento(), cliente.getGenero(), cliente.getTelefone(), cliente.getEmail(), cliente.getCep(), cliente.getCidade(), cliente.getLogradouro(), cliente.getNumero(), cliente.getComplemento(), cliente.getUf(), cliente.getBairro(), cliente.getSenha());
    }

    @Override
    public int update(Cliente cliente, int id) {
        return jdbcTemplate.update("UPDATE tb_cliente SET `cli_cpf` = ?, `cli_nome` = ?, `cli_nascimento` = ?, `cli_genero` = ?," + "`cli_telefone` = ?,`cli_email` = ?, `cli_cep` = ?, `cli_cidade` = ?, `cli_logradouro` = ?, `cli_numero` = ?," + "`cli_complemento` = ?, `cli_uf` = ?, " + "`cli_bairro` = ?, `cli_senha` = ? WHERE cli_id = ?", cliente.getCpf(), cliente.getNome(), cliente.getNascimento(), cliente.getGenero(), cliente.getTelefone(), cliente.getEmail(), cliente.getCep(), cliente.getCidade(), cliente.getLogradouro(), cliente.getNumero(), cliente.getComplemento(), cliente.getUf(), cliente.getBairro(), cliente.getSenha(), id);
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM tb_cliente WHERE cli_id = ?", id);
    }

    @Override
    public List<Cliente> getAll() {
        return jdbcTemplate.query("SELECT cli_id as  id, cli_cpf as cpf, cli_nome as nome, cli_nascimento as nascimento,  cli_telefone as telefone," + "cli_genero as genero, cli_email as email, cli_cep as cep, cli_cidade as cidade, cli_logradouro as logradouro,cli_numero as numero, " + " cli_complemento as complemento,cli_uf as uf, cli_bairro as bairro, cli_senha as senha FROM TB_CLIENTE", new BeanPropertyRowMapper<Cliente>(Cliente.class));
    }

    @Override
    public Cliente getById(int id) {
        return jdbcTemplate.queryForObject("SELECT cli_id as  id, cli_cpf as cpf, cli_nome as nome, cli_nascimento as nascimento," + "  cli_telefone as telefone,cli_genero as genero, cli_email as email, cli_cep as cep, cli_cidade as cidade, cli_logradouro as logradouro," + "cli_numero as numero,cli_complemento as complemento,cli_uf as uf, cli_bairro as bairro, cli_senha as senha FROM tb_cliente WHERE cli_id = ?", new BeanPropertyRowMapper<Cliente>(Cliente.class), id);
    }

    @Override
    public Cliente getByCPF(String cpf) {
        return jdbcTemplate.queryForObject("SELECT cli_id as  id, cli_cpf as cpf, cli_nome as nome, cli_nascimento as nascimento," + "  cli_telefone as telefone,cli_genero as genero, cli_email as email, cli_cep as cep, cli_cidade as cidade, cli_logradouro as logradouro," + "cli_numero as numero,cli_complemento as complemento,cli_uf as uf, cli_bairro as bairro, cli_senha as senha FROM tb_cliente WHERE cli_cpf = ?", new BeanPropertyRowMapper<Cliente>(Cliente.class), cpf);
    }

    @Override
    public int validaLogin(String email, String senha) {
        if (jdbcTemplate.queryForObject("SELECT COUNT(*) FROM TB_CLIENTE WHERE cli_email = ? and cli_senha = ?", Integer.class, email, senha) == 1) {
            return 2;
        } else if (jdbcTemplate.queryForObject("SELECT COUNT(*) FROM TB_CLIENTE WHERE cli_email = ? ", Integer.class, email) == 1) {
            return 1;
        }
        return 0;

    }


}
