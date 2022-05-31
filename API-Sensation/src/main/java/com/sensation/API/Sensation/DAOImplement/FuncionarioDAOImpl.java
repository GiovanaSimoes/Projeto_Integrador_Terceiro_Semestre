package com.sensation.API.Sensation.DAOImplement;

import com.sensation.API.Sensation.DAO.FuncionarioDAO;

import com.sensation.API.Sensation.Model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FuncionarioDAOImpl implements FuncionarioDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM TB_funcionario", Integer.class);
    }

    @Override
    public int save(Funcionario funcionario) {
        return jdbcTemplate.update("insert into tb_funcionario (`fun_cpf`, `fun_nome`, `fun_nascimento`, `fun_genero`," + " `fun_telefone`,`fun_email`, `fun_cep`, `fun_cidade`, `fun_logradouro`, `fun_numero`, `fun_complemento`, `fun_uf`, " + "`fun_bairro`, `fun_senha`)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)", funcionario.getCpf(), funcionario.getNome(), funcionario.getNascimento(), funcionario.getGenero(), funcionario.getTelefone(), funcionario.getEmail(), funcionario.getCep(), funcionario.getCidade(), funcionario.getLogradouro(), funcionario.getNumero(), funcionario.getComplemento(), funcionario.getUf(), funcionario.getBairro(), funcionario.getSenha());
    }

    @Override
    public int update(Funcionario funcionario, int id) {
        return jdbcTemplate.update("UPDATE tb_funcionario SET `fun_cpf` = ?, `fun_nome` = ?, `fun_nascimento` = ?, `fun_genero` = ?," + "`fun_telefone` = ?,`fun_email` = ?, `fun_cep` = ?, `fun_cidade` = ?, `fun_logradouro` = ?, `fun_numero` = ?," + "`fun_complemento` = ?, `fun_uf` = ?, " + "`fun_bairro` = ?, `fun_senha` = ? WHERE fun_id = ?", funcionario.getCpf(), funcionario.getNome(), funcionario.getNascimento(), funcionario.getGenero(), funcionario.getTelefone(), funcionario.getEmail(), funcionario.getCep(), funcionario.getCidade(), funcionario.getLogradouro(), funcionario.getNumero(), funcionario.getComplemento(), funcionario.getUf(), funcionario.getBairro(), funcionario.getSenha(), id);
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM tb_funcionario WHERE fun_id = ?", id);
    }

    @Override
    public List<Funcionario> getAll() {
        return jdbcTemplate.query("SELECT fun_id as  id, fun_cpf as cpf, fun_nome as nome, fun_nascimento as nascimento,  fun_telefone as telefone," + "fun_genero as genero, fun_email as email, fun_cep as cep, fun_cidade as cidade, fun_logradouro as logradouro,fun_numero as numero, " + " fun_complemento as complemento,fun_uf as uf, fun_bairro as bairro, fun_senha as senha FROM TB_funcionario", new BeanPropertyRowMapper<Funcionario>(Funcionario.class));
    }

    @Override
    public Funcionario getById(int id) {
        return jdbcTemplate.queryForObject("SELECT fun_id as  id, fun_cpf as cpf, fun_nome as nome, fun_nascimento as nascimento," + "  fun_telefone as telefone,fun_genero as genero, fun_email as email, fun_cep as cep, fun_cidade as cidade, fun_logradouro as logradouro," + "fun_numero as numero,fun_complemento as complemento,fun_uf as uf, fun_bairro as bairro, fun_senha as senha FROM tb_funcionario WHERE fun_id = ?", new BeanPropertyRowMapper<Funcionario>(Funcionario.class), id);
    }

    @Override
    public Funcionario getByCPF(String cpf) {
        return jdbcTemplate.queryForObject("SELECT fun_id as  id, fun_cpf as cpf, fun_nome as nome, fun_nascimento as nascimento," + "  fun_telefone as telefone,fun_genero as genero, fun_email as email, fun_cep as cep, fun_cidade as cidade, fun_logradouro as logradouro," + "fun_numero as numero,fun_complemento as complemento,fun_uf as uf, fun_bairro as bairro, fun_senha as senha FROM tb_funcionario WHERE fun_cpf = ?", new BeanPropertyRowMapper<Funcionario>(Funcionario.class), cpf);
    }

}
