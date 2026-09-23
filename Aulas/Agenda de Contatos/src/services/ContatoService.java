package services;

import models.Contato;

import java.util.ArrayList;

public class ContatoService {

    private static ArrayList<Contato> contatos = new ArrayList<>();

    public String listar() {
        String lista = "";
        if(contatos.size() > 0) {
            for(Contato contato : contatos) {
                lista += contato + "\n";
            }
        } else {
            lista = "Nenhum contato encontrado.";
        }
        return lista;
    }

    public String cadastrar(String nome, String telefone) {
        String mensagem = "";
        if(!nome.equals("") && !telefone.equals("")) {
            Contato contato = new Contato(nome, telefone);
            contatos.add(contato);
            mensagem = "Contato cadastrado com sucesso!";
        } else {
            mensagem = "Ops! Erro ao cadastrar contato.";
        }
        return mensagem;
    }

    public String excluir(Long id) {
        String mensagem = "Ops! Erro ao excluir contato.";
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getId().equals(id)) {
                contatos.remove(i);
                mensagem = "Contato excluído com sucesso!";
                break;
            }
        }
        return mensagem;
    }

    public String alterar(Long id, String nome, String telefone) {
        String mensagem = "Ops! Erro ao alterar contato.";
        Contato contatoAlteracao = new Contato(id, nome, telefone);
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getId().equals(contatoAlteracao.getId())) {
                contatos.set(i, contatoAlteracao);
                mensagem = "Contato alterado com sucesso!";
                break;
            }
        }
        return mensagem;
    }

    public Contato buscarPorId(Long id) {
        Contato contatoEncontrado = null;
        for(Contato contato : contatos) {
            if(contato.getId().equals(id)) {
                contatoEncontrado = contato;
                break;
            }
        }
        return contatoEncontrado;
    }
}
