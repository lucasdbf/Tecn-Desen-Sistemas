package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQL {
    private static final String URL = "jdbc:postgresql://localhost:5432/agenda_contatos";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "Saclu@1803";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
