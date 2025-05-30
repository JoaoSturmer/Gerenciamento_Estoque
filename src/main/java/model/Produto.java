package model;

import java.util.ArrayList;
import dao.ProdutoDAO;

public class Produto extends Categoria {

    private int quantidade;
    private String nome;
    private double preco;

    public Produto(int quantidade, String nome, double preco, String categoria, int id_categoria) {
        super(categoria, id_categoria);
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto() {
        this(0, "", 0, "", 0);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
// Retorna a Lista de Alunos(objetos)
    public ArrayList<Produto> getMinhaLista() {
        return ProdutoDAO.getMinhaLista();
    }
    
    public ArrayList<Categoria> getMinhaListac() {
        return ProdutoDAO.getMinhaListac();
    }
// Cadastra novo aluno

    public boolean insertCategoriaBD(String categoria) {
        int id = this.maiorID() + 1;
        Categoria objeto = new Categoria(categoria, id);
        getMinhaListac().add(objeto);
        return true;
    }
    
    public boolean insertProdutoBD(int quantidade, String nome, double preco, String categoria) {
        int id = this.maiorID() + 1;
        Produto objeto = new Produto(quantidade, nome, preco, categoria, id);
        getMinhaLista().add(objeto);
        return true;
    }
// Deleta um aluno específico pelo seu campo ID

    public boolean deleteProdutoBD(int id) {
        int indice = this.procuraIndice(id);
        getMinhaLista().remove(indice);
        return true;
    }
// Edita um aluno específico pelo seu campo ID

    public boolean updateProdutoBD(int quantidade, String nome, double preco, String categoria, int id_categoria) {
        Produto objeto = new Produto(quantidade, nome, preco, categoria, id_categoria);
        int indice = this.procuraIndice(id_categoria);
        getMinhaLista().set(indice, objeto);
        return true;
    }
// procura o INDICE de objeto da minhaLista que
// contem o ID enviado.

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < getMinhaLista().size(); i++) {
            if (getMinhaLista().get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }

// retorna o maior ID da nossa base de dados

    public int maiorID() {
        return ProdutoDAO.maiorID();
    }
    
    public int Adicionar(){
        return (quantidade + getQuantidade());
    }
}