CREATE DATABASE gestao_estoque;
USE gestao_estoque;

-- Tabela Categoria
CREATE TABLE tb_categoria (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nome_categoria VARCHAR(100) NOT NULL,
    tamanho VARCHAR(100) NOT NULL,
    embalagem VARCHAR(100) NOT NULL
);

-- Tabela Produto
CREATE TABLE tb_produto (
	id_produto INT PRIMARY KEY AUTO_INCREMENT,
    nome_produto VARCHAR(100) NOT NULL,
    preco DOUBLE NOT NULL,
    unidade VARCHAR(100) NOT NULL,
    quantidade_produto INT NOT NULL,
    quantidadeMax INT NOT NULL,
    quantidadeMin INT NOT NULL,
    id_categoria INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria) ON DELETE CASCADE
);

-- Tabela Movimentação
CREATE TABLE tb_movimentacao (
	id_movimentacao INT PRIMARY KEY AUTO_INCREMENT,
    data DATE NOT NULL,
    quantidade_movimentacao INT NOT NULL,
    tipo varchar(100) NOT NULL,
    id_produto INT NOT NULL,
    FOREIGN KEY (id_produto) REFERENCES tb_produto(id_produto) ON DELETE CASCADE
);

show tables;
