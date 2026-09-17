package controller;

import models.Contato;
import views.ContatoView;

import java.util.ArrayList;

public class ContatoController {

    private final ContatoView contatoView = new ContatoView();
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void iniciar(){
        contatos.add(new Contato("Maria Cristina", "456"));
        contatos.add(new Contato("Lucas", "240"));
        int opcao = 0;

        do{
            opcao = contatoView.telaInicial();
            switch (opcao){
                case 0:
                // Listar
                    this.listar();
                    break;
                case 1:
                    this.cadastrar();
                    break;
                case 2:

                    break;
                case 3:
                    this.excluir();
                    break;

            }
        } while(opcao >= 0);
    }

    public void listar(){
        String lista = "Lista contatos \n";
        for (Contato contato : contatos) {
            lista += contato.getNome() + "\n";
        }
        contatoView.telaListagem(lista);
    }

    private void cadastrar(){
       Contato contato = contatoView.telaCadastro();
       contatos.add(contato);
    }

    private void excluir(){
        Long id = contatoView.telaExclusao();
        contatos.removeIf(contato -> contato.getId().equals(id));
    }
}
