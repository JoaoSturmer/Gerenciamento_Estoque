package dao;

import java.util.ArrayList;
import model.Produto;
import model.Categoria;

public class ProdutoDAO {

    private static ArrayList<Produto> listaProdutos = new ArrayList<>();

    // Retorna a lista atual de produtos
    public static ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    // Retorna o maior ID atualmente usado
    public static int maiorID() {
        int maior = 0;
        for (Produto p : listaProdutos) {
            if (p.getId() > maior) {
                maior = p.getId();
            }
        }
        return maior;
    }

    // Insere um novo produto na lista
    public static boolean inserirProduto(String nome, double preco, String unidade,
                                         int quantidade, int quantidadeMinima,
                                         int quantidadeMaxima, Categoria categoria) {
        int novoId = maiorID() + 1;
        Produto novoProduto = new Produto(novoId, nome, preco, unidade, quantidade,
                                          quantidadeMinima, quantidadeMaxima, categoria);
        return listaProdutos.add(novoProduto);
    }

    // Buscar produto por ID
    public static Produto buscarPorId(int id) {
        for (Produto p : listaProdutos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // Atualizar um produto existente
    public static boolean atualizarProduto(Produto produtoAtualizado) {
        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).getId() == produtoAtualizado.getId()) {
                listaProdutos.set(i, produtoAtualizado);
                return true;
            }
        }
        return false;
    }

    // Remover produto por ID
    public static boolean removerProduto(int id) {
        Produto produto = buscarPorId(id);
        if (produto != null) {
            return listaProdutos.remove(produto);
        }
        return false;
    }
}