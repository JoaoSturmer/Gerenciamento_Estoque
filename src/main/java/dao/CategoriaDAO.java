package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Categoria;
import java.util.ArrayList;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Classe responsável por realizar operações de acesso a dados (DAO)
 * relacionadas à entidade Categoria.
 *
 * @author Ricardo Zimmer Junior
 */
public class CategoriaDAO {

    /**
     * Recupera uma lista com todas as categorias cadastradas no banco de dados.
     *
     * @return ArrayList<Categoria> - lista com todas as categorias encontradas.
     */
    public ArrayList<Categoria> getListarCategoria() {
        ArrayList<Categoria> listarCategoria = new ArrayList<>();
        String sql = "SELECT * FROM tb_categoria";

        try (Connection conn = new Conexao().getConexao(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setNome_categoria(rs.getString("nome_categoria"));
                categoria.setTamanho(rs.getString("tamanho"));
                categoria.setEmbalagem(rs.getString("embalagem"));

                listarCategoria.add(categoria);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listarCategoria;
    }

    /**
     * Insere uma nova categoria no banco de dados.
     *
     * @param categoria objeto Categoria contendo os dados a serem inseridos.
     * @return boolean - true se inserção foi bem-sucedida, false caso
     * contrário.
     */
    public boolean inserirCategoria(Categoria categoria) {
        String sql = "INSERT INTO tb_categoria (nome_categoria, tamanho, embalagem) VALUES (?, ?, ?)";

        try (Connection conn = new Conexao().getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, categoria.getNome_categoria());
            stmt.setString(2, categoria.getTamanho());
            stmt.setString(3, categoria.getEmbalagem());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * Atualiza os dados de uma categoria existente no banco de dados.
     *
     * @param categoriaAtualizada objeto Categoria contendo os novos dados e o
     * ID.
     * @return boolean - true se a atualização foi realizada com sucesso, false
     * caso contrário.
     */
    public boolean atualizarCategoria(Categoria categoriaAtualizada) {
        String sql = "UPDATE tb_categoria SET nome_categoria = ?, tamanho = ?, embalagem = ? WHERE id_categoria = ?";

        try (Connection conn = new Conexao().getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, categoriaAtualizada.getNome_categoria());
            stmt.setString(2, categoriaAtualizada.getTamanho());
            stmt.setString(3, categoriaAtualizada.getEmbalagem());
            stmt.setInt(4, categoriaAtualizada.getId_categoria());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Deleta uma categoria do banco de dados pelo seu ID.
     *
     * @param id_categoria o identificador da categoria a ser deletada.
     * @return boolean - true se a exclusão foi realizada com sucesso, false
     * caso contrário.
     */
    public boolean deletarCategoria(int id_categoria) {
        String sql = "DELETE FROM tb_categoria WHERE id_categoria = ?";

        try (Connection conn = new Conexao().getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_categoria);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
