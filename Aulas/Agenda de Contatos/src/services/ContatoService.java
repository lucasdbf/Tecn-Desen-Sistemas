package services;

import models.Contato;

import javax.swing.*;
import java.util.ArrayList;

public class ContatoService {
    private static final ArrayList<Contato> contatos = new ArrayList<>();

    public String listar(){
        StringBuilder lista = new StringBuilder("Lista contatos \n");
        for (Contato contato : contatos) {
            lista.append(contato).append("\n");
        }
        return lista.toString();
    }

    public void cadastrar(String nome, String telefone) {
        Contato contato =  new Contato(nome, telefone);
        contatos.add(contato);
    }

    public void alterar(Long id, String nome, String telefone){
        Contato contatoAlteracao =  new Contato(id, nome, telefone);
        if(contatos.contains(contatoAlteracao)){
            for(int i = 0; i < contatos.size(); i++){
                if(contatos.get(i).getId().equals(contatoAlteracao.getId())){
                    contatos.set(i, contatoAlteracao);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esse id não existe, tente novamente!");
        }
    }

    public void excluir(Long id){

        boolean existeId = false;

        for (Contato contato : contatos) {
            if (contato.getId().equals(id)) {
                existeId = true;
            } else {
                existeId = false;
            }
        }
        if(existeId){
            contatos.removeIf(contato -> contato.getId().equals(id));
        } else{
            JOptionPane.showMessageDialog(null, "Esse id não existe, tente novamente!");
        }

    }
}
