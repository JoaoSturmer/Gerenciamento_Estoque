package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import modelo.Movimentacao;
import modelo.Produto;
import java.util.ArrayList;

/**
 * Classe DAO responsável por gerenciar as operações relacionadas
 * à movimentação de produtos no estoque, incluindo consultas,
 * inserções e atualizações no banco de dados.
 * 
 *  @author Ricardo Zimmer Junior
 */
public class MovimentacaoDAO {

    /**
     * Retorna uma lista contendo todas as movimentações registradas no banco.
     *
     * @return ArrayList<Movimentacao> - lista com todas as movimentações.
     */
    public ArrayList<Movimentacao> getListaMovimentacao() {
        ArrayList<Movimentacao> listaMovimentacao = new ArrayList<>();
        String sql = "SELECT * FROM tb_movimentacao";

        try (Connection conn = new Conexao().getConexao();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Movimentacao movimentacao = new Movimentacao();
                movimentacao.setId_movimentacao(rs.getInt("id_movimentacao"));
                movimentacao.setQuantidade_movimentacao(rs.getInt("quantidade_movimentacao"));
                movimentacao.setTipo(rs.getString("tipo"));
                movimentacao.setData(rs.getTimestamp("data").toLocalDateTime());

                Produto produto = new Produto();
                produto.setId(rs.getInt("id_produto"));
                produto.setNome(rs.getString("nome_produto"));
                movimentacao.setProduto(produto);

                listaMovimentacao.add(movimentacao);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaMovimentacao;
    }

    /**
     * Realiza uma movimentação no estoque: atualiza a quantidade do produto
     * e registra a movimentação na tabela correspondente.
     *
     * @param movimentacao objeto Movimentacao contendo os dados da movimentação.
     * @return boolean - true se a movimentação foi registrada com sucesso, false caso contrário.
     */
    public boolean movimentarEstoque(Movimentacao movimentacao) {
        boolean estoqueAtualizado = atualizarEstoque(movimentacao.getProduto());

        if (!estoqueAtualizado) {
            System.out.println("Erro ao atualizar o estoque.");
            return false;
        }

        return insertEstoque(movimentacao);
    }

    /**
     * Atualiza a quantidade de um produto no banco de dados.
     *
     * @param produtoAtualizado objeto Produto contendo o ID e a nova quantidade.
     * @return boolean - true se a atualização foi bem-sucedida, false caso contrário.
     */
    public static boolean atualizarEstoque(Produto produtoAtualizado) {
        String sql = "UPDATE tb_produto SET quantidade_produto = ? WHERE id_produto = ?";

        try (Connection conn = new Conexao().getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, produtoAtualizado.getQuantidade());
            stmt.setInt(2, produtoAtualizado.getId());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Insere um registro de movimentação na tabela de movimentações.
     *
     * @param movimentacao objeto Movimentacao contendo os dados a serem inseridos.
     * @return boolean - true se a inserção foi bem-sucedida, false caso contrário.
     */
    public static boolean insertEstoque(Movimentacao movimentacao) {
        String sql = "INSERT INTO tb_movimentacao (data, quantidade_movimentacao, tipo, id_produto)"
                + " VALUES (?, ?, ?, ?)";

        try (Connection conn = new Conexao().getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setTimestamp(1, Timestamp.valueOf(movimentacao.getData()));
            stmt.setInt(2, movimentacao.getQuantidade_movimentacao());
            stmt.setString(3, movimentacao.getTipo());
            stmt.setInt(4, movimentacao.getProduto().getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}