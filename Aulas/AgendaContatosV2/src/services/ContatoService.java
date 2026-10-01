package services;

import exceptions.ContatoException;
import models.Contato;

import java.util.ArrayList;

public class ContatoService {

    private static Integer incremento = 0;
    private static ArrayList<Contato> contatos = new ArrayList<>();

    // Métodos públicos

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

    public Boolean cadastrar(Contato contato) throws ContatoException {
        if(validarDados(contato.getNome(), contato.getTelefone(), contato.getEmail())) {
            contato.setId(gerarId());
            return contatos.add(contato);
        } else {
            return false;
        }
    }

    public Boolean alterar(Contato contato) throws ContatoException {
        if(validarDados(contato.getNome(), contato.getTelefone(), contato.getEmail())) {
            for(int i = 0; i < contatos.size(); i++) {
                if(contatos.get(i).getId().equals(contato.getId())) {
                    contatos.set(i, contato);
                    return true;
                }
            }
        }
        return false;
    }

    private Integer gerarId() {
        return ++incremento;
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

    public Contato buscarPorId(Integer id){
        for(Contato contato : contatos) {
            if(contato.getId().equals(id)) {
                return contato;
            }
        }
        return null;
    }

    public Boolean excluir(Integer id){
        for(int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getId().equals(id)) {
                contatos.remove(i);
                return true;
            }
        }
        return false;
    }
}
