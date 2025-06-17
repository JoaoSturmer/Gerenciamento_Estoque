package conexao;

// Importações necessárias para trabalhar com banco de dados
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por estabelecer a conexão com o banco de dados MySQL.
 * Utiliza o driver JDBC para conectar à base de dados "db_produto".
 * 
 * @author Ricardo Zimmer Junior
 */
public class Conexao {
    
    /**
     * URL de conexão com o banco de dados, incluindo o nome da base.
     */
    private static final String URL = "jdbc:mysql://localhost:3306/gestao_estoque";
    
    /**
     * Nome do usuário do banco de dados.
     */
    private static final String USER = "root";
    
    /**
     * Senha do usuário do banco de dados.
     */
    private static final String PASS = "sua_senha";

    /**
     * Método responsável por retornar uma conexão ativa com o banco de dados.
     *
     * @return {@link Connection} objeto de conexão com o banco.
     * @throws RuntimeException se ocorrer um erro ao tentar conectar.
     */
    public Connection getConexao() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco: " + e);
        }
    }
}
