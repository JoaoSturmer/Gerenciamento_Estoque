package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Produto;
import modelo.Categoria;

/**
 * Classe DAO responsável por gerenciar operações CRUD relacionadas à entidade
 * Produto, incluindo consultas, inserções, atualizações e exclusões.
 *
 * @author Ricardo Zimmer Junior
 */
public class ProdutoDAO {

    /**
     * Obtém uma lista com todos os produtos cadastrados no banco, incluindo os
     * dados da categoria relacionada.
     *
     * @return ArrayList<Produto> lista com todos os produtos e suas categorias.
     */
    public ArrayList<Produto> getListaProdutos() {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        String sql = "SELECT * FROM tb_produto p JOIN tb_categoria c ON p.id_categoria = c.id_categoria;";

        try (Connection conn = new Conexao().getConexao(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Categoria cat = new Categoria(
                        rs.getInt("id_categoria"),
                        rs.getString("nome_categoria")
                );

                Produto p = new Produto(
                        rs.getInt("id_produto"),
                        rs.getString("nome_produto"),
                        rs.getDouble("preco"),
                        rs.getString("unidade"),
                        rs.getInt("quantidade_produto"),
                        rs.getInt("quantidadeMax"),
                        rs.getInt("quantidadeMin"),
                        cat
                );
                listaProdutos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }

        return listaProdutos;
    }

    /**
     * Insere um novo produto no banco de dados.
     *
     * @param produto objeto Produto contendo os dados a serem inseridos.
     * @return boolean retorna true se inserção foi realizada com sucesso
     * (atenção: ideal melhorar validação).
     */
    public boolean inserirProduto(Produto produto) {
        // Comando SQL com parâmetros
        String sql = "INSERT INTO tb_produto (nome_produto, preco, unidade, quantidade_produto, "
                + "quantidadeMax, quantidadeMin, id_categoria) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = new Conexao().getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, produto.getQuantidade());
            stmt.setInt(5, produto.getQuantidadeMaxima());
            stmt.setInt(6, produto.getQuantidadeMinima());
            stmt.setInt(7, produto.getCategoria().getId_categoria());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Atualiza os dados de um produto existente no banco.
     *
     * @param produtoAtualizado objeto Produto com os dados atualizados.
     * @return boolean retorna true se atualização ocorreu com sucesso, false
     * caso contrário.
     */
    public boolean atualizarProduto(Produto produtoAtualizado) {
        String sql = "UPDATE tb_produto SET nome_produto = ?, preco = ?, unidade = ?, "
                + "quantidade_produto = ?, quantidadeMax = ?, quantidadeMin = ?, id_categoria = ? WHERE id_produto = ?";

        try (Connection conn = new Conexao().getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produtoAtualizado.getNome());
            stmt.setDouble(2, produtoAtualizado.getPreco());
            stmt.setString(3, produtoAtualizado.getUnidade());
            stmt.setInt(4, produtoAtualizado.getQuantidade());
            stmt.setInt(5, produtoAtualizado.getQuantidadeMaxima());
            stmt.setInt(6, produtoAtualizado.getQuantidadeMinima());
            stmt.setInt(7, produtoAtualizado.getCategoria().getId_categoria());
            stmt.setInt(8, produtoAtualizado.getId());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Remove um produto do banco de dados pelo seu ID.
     *
     * @param id identificador do produto a ser removido.
     * @return boolean retorna true se exclusão ocorreu com sucesso, false caso
     * contrário.
     */
    public boolean deletarProduto(int id) {
        String sql = "DELETE FROM tb_produto WHERE id_produto = ?";

        try (Connection conn = new Conexao().getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
