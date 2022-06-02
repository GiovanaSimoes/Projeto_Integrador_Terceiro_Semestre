
show databases;

create database sensations;

use sensations;

CREATE TABLE tb_cliente (
    cli_id int(11) PRIMARY KEY UNIQUE auto_increment,
    cli_cpf varchar(11),
    cli_nome varchar(100),
    cli_nascimento date,
    cli_genero varchar(20),
    cli_telefone varchar(20),
    cli_email varchar(100),
    cli_cep varchar(9),
    cli_cidade varchar(100),
    cli_logradouro varchar(100),
    cli_numero varchar(9),
    cli_complemento varchar(100),
    cli_uf varchar(2),
    cli_bairro varchar(100),
    cli_senha varchar(20)
);

CREATE TABLE tb_funcionario (
    fun_uf varchar(2),
    fun_nascimento date,
    fun_id int(11) PRIMARY KEY UNIQUE auto_increment,
    fun_nome varchar(100),
    fun_cidade varchar(100),
    fun_cep varchar(9),
    fun_email varchar(100),
    fun_telefone varchar(20),
    fun_logradouro varchar(100),
    fun_cpf varchar(11),
    fun_numero varchar(9),
    fun_complemento varchar(100),
    fun_bairro varchar(100),
    fun_genero varchar(20),
    fun_senha varchar(20)
);

CREATE TABLE tb_produto_venda (
    prv_id int(11) PRIMARY KEY UNIQUE auto_increment,
    prv_nome varchar(100),
    prv_descricao varchar(255),
    prv_valor decimal(9,2),
    prv_estoque int(11)
);

CREATE TABLE tb_reciclagem (
    rec_id int(11) PRIMARY KEY UNIQUE auto_increment,
    rec_cli_id int(11)
);

CREATE TABLE tb_produto_reciclagem (
    prc_id int(11) PRIMARY KEY UNIQUE auto_increment,
    prc_produto varchar(100),
    prc_quantidade int(11),
    prc_rec_id int(11)
);

CREATE TABLE tb_cupom (
    cp_id int(11) PRIMARY KEY UNIQUE auto_increment,
    cp_valor decimal(9,2),
    cp_fun_id int(11),
    cp_rec_id int(11)
);

CREATE TABLE tb_pedido (
    pd_id int(11) PRIMARY KEY UNIQUE auto_increment,
    pd_valor decimal(9,2),
    pd_hora timestamp,
    pd_cli_id int(11)
);

CREATE TABLE tb_produto_pedido (
    pp_estrelas float(1),
    pp_avaliacao varchar(255),
    pp_pd_id int(11),
    pp_prv_id int(11),
    pp_quantidade int(11),
    pp_id int(11) PRIMARY KEY UNIQUE auto_increment
);

CREATE TABLE tb_carrinho (
    car_id int(11) PRIMARY KEY UNIQUE auto_increment,
    car_quantidade int(11),
    car_cli_id int(11),
    car_prv_id int(11)
);

CREATE TABLE tb_cupom_pedido (
    cpp_pd_id int(11),
    cpp_cp_id int(11),
    cpp_id int(11) PRIMARY KEY UNIQUE auto_increment
);
 
ALTER TABLE tb_reciclagem ADD CONSTRAINT FK_tb_reciclagem_2
    FOREIGN KEY (rec_cli_id)
    REFERENCES tb_cliente (cli_id)
    ON DELETE CASCADE;
 
ALTER TABLE tb_produto_reciclagem ADD CONSTRAINT FK_tb_produto_reciclagem_2
    FOREIGN KEY (prc_rec_id)
    REFERENCES tb_reciclagem (rec_id)
    ON DELETE CASCADE;
 
ALTER TABLE tb_cupom ADD CONSTRAINT FK_tb_cupom_2
    FOREIGN KEY (cp_fun_id)
    REFERENCES tb_funcionario (fun_id)
    ON DELETE CASCADE;
 
ALTER TABLE tb_cupom ADD CONSTRAINT FK_tb_cupom_3
    FOREIGN KEY (cp_rec_id)
    REFERENCES tb_reciclagem (rec_id)
    ON DELETE CASCADE;
 
ALTER TABLE tb_pedido ADD CONSTRAINT FK_tb_pedido_2
    FOREIGN KEY (pd_cli_id)
    REFERENCES tb_cliente (cli_id)
    ON DELETE CASCADE;
 
ALTER TABLE tb_produto_pedido ADD CONSTRAINT FK_tb_produto_pedido_1
    FOREIGN KEY (pp_pd_id)
    REFERENCES tb_pedido (pd_id)
    ON DELETE CASCADE;
 
ALTER TABLE tb_produto_pedido ADD CONSTRAINT FK_tb_produto_pedido_2
    FOREIGN KEY (pp_prv_id)
    REFERENCES tb_produto_venda (prv_id)
    ON DELETE CASCADE;
 
ALTER TABLE tb_cupom_pedido ADD CONSTRAINT FK_tb_cupom_pedido_1
    FOREIGN KEY (cpp_pd_id)
    REFERENCES tb_pedido (pd_id)
    ON DELETE SET NULL;
 
ALTER TABLE tb_cupom_pedido ADD CONSTRAINT FK_tb_cupom_pedido_2
    FOREIGN KEY (cpp_cp_id)
    REFERENCES tb_cupom (cp_id)
    ON DELETE SET NULL;
