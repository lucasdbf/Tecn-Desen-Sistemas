package services;

import dao.ContatoDao;
import exceptions.ContatoException;
import models.Contato;

import java.sql.SQLException;
import java.util.ArrayList;

public class ContatoService {

    private final ContatoDao contatoDao = new ContatoDao();

    // Métodos públicos

    public String listar() throws ContatoException {
        try {
            ArrayList<Contato> contatos = contatoDao.listar();
            String lista = "";
            if(contatos.size() > 0) {
                for(Contato contato : contatos) {
                    lista += contato + "\n";
                }
            } else {
                lista = "Nenhum contato encontrado.";
            }
            return lista;
        } catch (SQLException e) {
            throw erroBanco(e);
        }
    }

    public Boolean cadastrar(Contato contato) throws ContatoException {
        if(validarDados(contato.getNome(), contato.getTelefone(), contato.getEmail())) {
            try {
                return contatoDao.inserir(contato);
            } catch (SQLException e) {
                throw erroBanco(e);
            }
        } else {
            return false;
        }
    }

    public Boolean alterar(Contato contato) throws ContatoException {
        if(validarDados(contato.getNome(), contato.getTelefone(), contato.getEmail())) {
            try {
                return contatoDao.alterar(contato);
            } catch (SQLException e) {
                throw erroBanco(e);
            }
        }
        return false;
    }

    private Boolean validarDados(String nome, Long telefone, String email) throws ContatoException {
        String erros = "";
        if(nome.trim().isEmpty()) erros += "\n- Nome é um campo obrigatório";
        if(telefone == null) erros += "\n- Telefone é um campo obrigatório e deve ser numérico.";
        if(email.trim().isEmpty()) erros += "\n- E-mail é um campo obrigatório";

        if(!erros.isEmpty()) {
            throw new ContatoException("Ops! Erros encontrados:" + erros);
        }

        return true;
    }

    public Contato buscarPorId(Integer id) throws ContatoException {
        try {
            return contatoDao.buscarPorId(id);
        } catch (SQLException e) {
            throw erroBanco(e);
        }
    }

    public Boolean excluir(Integer id) throws ContatoException {
        try {
            return contatoDao.excluir(id);
        } catch (SQLException e) {
            throw erroBanco(e);
        }
    }

    private ContatoException erroBanco(SQLException e) {
        return new ContatoException("Ops! Erro ao acessar o banco de dados: " + e.getMessage());
    }
}
