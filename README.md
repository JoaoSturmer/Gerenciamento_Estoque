# Sistema de Controle de Estoque

## Descrição

Projeto desenvolvido para a disciplina de Programação, baseado no modelo de cadastro de alunos utilizando Java, MySQL e DAO.  
O sistema permite o controle de produtos em estoque, movimentações (entrada e saída), reajuste de preços, e geração de relatórios úteis para gestão de um pequeno comércio.

## Alunos

| **Nome**                         | **GitHub**                                         | **RA**|                                         
|----------------------------------|---------|---------------------------------------------------
| Ricardo Zimmer Junior / Ricar | [@Ricardo](https://github.com/Ricardozj1) | 10724257987 |
| João Gabriel Missio Stürmer | [@João](https://github.com/JoaoSturmer) | 1072518425|

##  Objetivos

- Aplicar os conceitos de orientação a objetos, DAO e conexão com banco de dados.
- Desenvolver um sistema completo com interface gráfica e funcionalidades práticas.
- Trabalhar de forma colaborativa utilizando Git e GitHub.

## Tecnologias Utilizadas

| **Ferramenta / Tecnologia**                         | **Finalidade**                                         
|-------------------------------------------|---------------------------------------------------
| JDK 17 | Ambiente de desenvolvimento (Java 17)     
| Swing (faz parte do JDK) | Criação da interface gráfica (GUI)
| MySQL Server 8.0 | Banco de dados relacional      
| JDBC - MySQL Connector 8.3.0 | Comunicação entre Java e MySQL       
| Apache NetBeans 26 | Ambiente de desenvolvimento (IDE)      
| Git 2.44.0 | Controle de versão local
| GitHub (Interface web) | Repositório remoto e colaboração em equipe

## Estrutura do Banco de Dados

O projeto utiliza três tabelas principais:

- `produto`: armazena informações dos produtos
- `categoria`: define o tipo e características dos produtos
- `movimentacao`: registra entradas e saídas no estoque

## Funcionalidades

- Cadastro, edição, remoção e consulta de **produtos**
- Cadastro, edição, remoção e consulta de **categorias**
- Registro de **entrada e saída** de produtos
- **Validação de estoque mínimo e máximo**
- Reajuste de preços por percentual
- Geração de **relatórios**:
  - Lista de preços
  - Balanço físico/financeiro
  - Produtos abaixo do estoque mínimo
  - Produtos acima do estoque máximo
  - Quantidade de produtos por categoria
