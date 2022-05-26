package com.sensations.Api_Sensations.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_cliente")
public class TbCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id", nullable = false)
    private Integer id;

    @Column(name = "cli_cpf", length = 11)
    private String cliCpf;

    @Column(name = "cli_nome", length = 100)
    private String cliNome;

    @Column(name = "cli_nascimento")
    private LocalDate cliNascimento;

    @Column(name = "cli_genero", length = 20)
    private String cliGenero;

    @Column(name = "cli_telefone", length = 20)
    private String cliTelefone;

    @Column(name = "cli_email", length = 100)
    private String cliEmail;

    @Column(name = "cli_cep", length = 9)
    private String cliCep;

    @Column(name = "cli_cidade", length = 100)
    private String cliCidade;

    @Column(name = "cli_logradouro", length = 100)
    private String cliLogradouro;

    @Column(name = "cli_numero", length = 9)
    private String cliNumero;

    @Column(name = "cli_complemento", length = 100)
    private String cliComplemento;

    @Column(name = "cli_uf", length = 2)
    private String cliUf;

    @Column(name = "cli_bairro", length = 100)
    private String cliBairro;

    @Column(name = "cli_senha", length = 20)
    private String cliSenha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(String cliCpf) {
        this.cliCpf = cliCpf;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public LocalDate getCliNascimento() {
        return cliNascimento;
    }

    public void setCliNascimento(LocalDate cliNascimento) {
        this.cliNascimento = cliNascimento;
    }

    public String getCliGenero() {
        return cliGenero;
    }

    public void setCliGenero(String cliGenero) {
        this.cliGenero = cliGenero;
    }

    public String getCliTelefone() {
        return cliTelefone;
    }

    public void setCliTelefone(String cliTelefone) {
        this.cliTelefone = cliTelefone;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliCep() {
        return cliCep;
    }

    public void setCliCep(String cliCep) {
        this.cliCep = cliCep;
    }

    public String getCliCidade() {
        return cliCidade;
    }

    public void setCliCidade(String cliCidade) {
        this.cliCidade = cliCidade;
    }

    public String getCliLogradouro() {
        return cliLogradouro;
    }

    public void setCliLogradouro(String cliLogradouro) {
        this.cliLogradouro = cliLogradouro;
    }

    public String getCliNumero() {
        return cliNumero;
    }

    public void setCliNumero(String cliNumero) {
        this.cliNumero = cliNumero;
    }

    public String getCliComplemento() {
        return cliComplemento;
    }

    public void setCliComplemento(String cliComplemento) {
        this.cliComplemento = cliComplemento;
    }

    public String getCliUf() {
        return cliUf;
    }

    public void setCliUf(String cliUf) {
        this.cliUf = cliUf;
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        this.cliBairro = cliBairro;
    }

    public String getCliSenha() {
        return cliSenha;
    }

    public void setCliSenha(String cliSenha) {
        this.cliSenha = cliSenha;
    }

}