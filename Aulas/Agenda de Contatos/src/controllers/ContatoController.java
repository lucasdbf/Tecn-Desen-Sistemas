package controllers;

import models.Contato;
import services.ContatoService;
import views.ContatoView;

import java.util.ArrayList;

public class ContatoController {

    private final ContatoView contatoView = new ContatoView();
    private final ContatoService contatoService = new ContatoService();

    public void iniciar(){
      //  contatos.add(new Contato("Maria Cristina", "456"));
       // contatos.add(new Contato("Lucas", "240"));
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
                    this.alterar();
                    break;
                case 3:
                    this.excluir();
                    break;

            }
        } while(opcao >= 0);
    }

    public void listar(){
        String lista = contatoService.listar();
        contatoView.telaListagem(lista);
    }

    private void cadastrar(){
       contatoView.telaCadastro();
    }

    private void alterar(){
        contatoView.telaAlterar();
    }

    private void excluir(){
        contatoView.telaExclusao();
    }
}
