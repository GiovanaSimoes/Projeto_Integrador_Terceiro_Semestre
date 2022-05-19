package com.sensations.Api_Sensations.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_funcionario")
public class TbFuncionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fun_id", nullable = false)
    private Integer id;

    @Column(name = "fun_uf", length = 2)
    private String funUf;

    @Column(name = "fun_nascimento")
    private LocalDate funNascimento;

    @Column(name = "fun_nome", length = 100)
    private String funNome;

    @Column(name = "fun_cidade", length = 100)
    private String funCidade;

    @Column(name = "fun_cep", length = 9)
    private String funCep;

    @Column(name = "fun_email", length = 100)
    private String funEmail;

    @Column(name = "fun_telefone", length = 20)
    private String funTelefone;

    @Column(name = "fun_logradouro", length = 100)
    private String funLogradouro;

    @Column(name = "fun_cpf", length = 11)
    private String funCpf;

    @Column(name = "fun_numero", length = 9)
    private String funNumero;

    @Column(name = "fun_complemento", length = 100)
    private String funComplemento;

    @Column(name = "fun_bairro", length = 100)
    private String funBairro;

    @Column(name = "fun_genero", length = 20)
    private String funGenero;

    @Column(name = "fun_senha", length = 20)
    private String funSenha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunUf() {
        return funUf;
    }

    public void setFunUf(String funUf) {
        this.funUf = funUf;
    }

    public LocalDate getFunNascimento() {
        return funNascimento;
    }

    public void setFunNascimento(LocalDate funNascimento) {
        this.funNascimento = funNascimento;
    }

    public String getFunNome() {
        return funNome;
    }

    public void setFunNome(String funNome) {
        this.funNome = funNome;
    }

    public String getFunCidade() {
        return funCidade;
    }

    public void setFunCidade(String funCidade) {
        this.funCidade = funCidade;
    }

    public String getFunCep() {
        return funCep;
    }

    public void setFunCep(String funCep) {
        this.funCep = funCep;
    }

    public String getFunEmail() {
        return funEmail;
    }

    public void setFunEmail(String funEmail) {
        this.funEmail = funEmail;
    }

    public String getFunTelefone() {
        return funTelefone;
    }

    public void setFunTelefone(String funTelefone) {
        this.funTelefone = funTelefone;
    }

    public String getFunLogradouro() {
        return funLogradouro;
    }

    public void setFunLogradouro(String funLogradouro) {
        this.funLogradouro = funLogradouro;
    }

    public String getFunCpf() {
        return funCpf;
    }

    public void setFunCpf(String funCpf) {
        this.funCpf = funCpf;
    }

    public String getFunNumero() {
        return funNumero;
    }

    public void setFunNumero(String funNumero) {
        this.funNumero = funNumero;
    }

    public String getFunComplemento() {
        return funComplemento;
    }

    public void setFunComplemento(String funComplemento) {
        this.funComplemento = funComplemento;
    }

    public String getFunBairro() {
        return funBairro;
    }

    public void setFunBairro(String funBairro) {
        this.funBairro = funBairro;
    }

    public String getFunGenero() {
        return funGenero;
    }

    public void setFunGenero(String funGenero) {
        this.funGenero = funGenero;
    }

    public String getFunSenha() {
        return funSenha;
    }

    public void setFunSenha(String funSenha) {
        this.funSenha = funSenha;
    }

}