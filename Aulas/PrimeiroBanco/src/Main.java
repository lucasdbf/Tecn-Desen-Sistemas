import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    static void main() {
        String url = "jdbc:postgresql://localhost:5432/agenda_contatos";
        String username = "postgres";
        String password = "Saclu@1803";

        try{
            Connection conexao = DriverManager.getConnection(url, username, password);
            Statement declaracao = conexao.createStatement();
            ResultSet resultado = declaracao.executeQuery("SELECT id, nome, telefone, email FROM tbcontato");

            while(resultado.next()){
                System.out.print("Id: " + resultado.getString("id") + " ");
                System.out.print("Nome: " + resultado.getString("nome") + " ");
                System.out.print("Telefone: " + resultado.getLong("telefone") + " ");
                System.out.print("Email: " + resultado.getString("email") + " ");
                System.out.println();
            }
        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}