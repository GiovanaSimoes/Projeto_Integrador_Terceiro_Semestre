package com.sensation.API.Sensation.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstrataPessoa {

    private int id;
    private String cpf;
    private String nome;
    private Date nascimento;
    private String telefone;
    private String email;
    private long cep;
    private String cidade;
    private String logradouro;
    private int numero;
    private String complemento;
    private String uf;
    private String bairro;
    private String senha;
    private String genero;

}
