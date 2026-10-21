package dao;

import connections.ConexaoSQL;
import models.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContatoDao {

    public ArrayList<Contato> listar() throws SQLException {
        String sql = "SELECT id, nome, telefone, email FROM tbcontato ORDER BY id";
        ArrayList<Contato> contatos = new ArrayList<>();
        try (Connection conexao = ConexaoSQL.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                contatos.add(mapear(rs));
            }
        }
        return contatos;
    }

    public Contato buscarPorId(Integer id) throws SQLException {
        String sql = "SELECT id, nome, telefone, email FROM tbcontato WHERE id = ?";
        try (Connection conexao = ConexaoSQL.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? mapear(rs) : null;
            }
        }
    }

    public Boolean inserir(Contato contato) throws SQLException {
        String sql = "INSERT INTO tbcontato (nome, telefone, email) VALUES (?, ?, ?)";
        try (Connection conexao = ConexaoSQL.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, contato.getNome());
            ps.setString(2, String.valueOf(contato.getTelefone()));
            ps.setString(3, contato.getEmail());
            return ps.executeUpdate() > 0;
        }
    }

    public Boolean alterar(Contato contato) throws SQLException {
        String sql = "UPDATE tbcontato SET nome = ?, telefone = ?, email = ? WHERE id = ?";
        try (Connection conexao = ConexaoSQL.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, contato.getNome());
            ps.setString(2, String.valueOf(contato.getTelefone()));
            ps.setString(3, contato.getEmail());
            ps.setInt(4, contato.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public Boolean excluir(Integer id) throws SQLException {
        String sql = "DELETE FROM tbcontato WHERE id = ?";
        try (Connection conexao = ConexaoSQL.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    private Contato mapear(ResultSet rs) throws SQLException {
        return new Contato(
                rs.getInt("id"),
                rs.getString("nome"),
                Long.parseLong(rs.getString("telefone")),
                rs.getString("email")
        );
    }
}
