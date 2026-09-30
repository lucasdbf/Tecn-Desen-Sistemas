package services;

import exceptions.ContatoException;
import models.Contato;

import javax.swing.*;
import java.util.ArrayList;

public class ContatoService {

    private static ArrayList<Contato> contatos = new ArrayList<>();
    private static Integer incremento = 0;

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

    public boolean cadastrar(Contato contato) {
        contato.setId(gerarId());
        return contatos.add(contato);
    }

    private Integer gerarId(){
        return ++incremento;
    }

    private Boolean validarDados(String nome, Long telefone, String email) throws ContatoException {
        String erros = "";
        if(nome.trim().isEmpty()) {erros += "Ops! Nome é um campo obrigatório";}
        if(telefone == null) erros += "Ops! Telefone é obrigatório e deve ser númerico";
        if(email.trim().isEmpty()) {erros += "Ops! Email é um campo obrigatório";}

        if(!erros.isEmpty()) {
            throw new ContatoException("Ops! Erros encontrados:" + erros);
        }
        return true;
    }

}
