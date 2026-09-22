package services;

import models.Contato;

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
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getId().equals(contatoAlteracao.getId())){
                contatos.set(i, contatoAlteracao);
                break;
            }
        }
    }

    public void excluir(Long id){

        contatos.removeIf(contato -> contato.getId().equals(id));
    }
}
