package controllers;

import exceptions.ContatoException;
import models.Contato;
import services.ContatoService;
import views.ContatoView;

public class ContatoController {

    private final ContatoView contatoView = new ContatoView();
    private final ContatoService contatoService = new ContatoService();

    public void iniciar() throws ContatoException {
        int opcao;
        do {
            opcao = contatoView.menu();
            switch (opcao) {
                // Listar
                case 0:
                    this.listar();
                    break;
                // Cadastrar
                case 1:
                    this.cadastrar();
                    break;
                // Alterar
                case 2:
//                    this.alterar();
                    break;
                // Excluir
                case 3:
//                    this.excluir();
                    break;
            }
        } while(opcao >= 0);
    }

    private void listar() {
        String lista = contatoService.listar();
        contatoView.exibir("LISTAGEM DE CONTATOS", lista);
    }

    private void cadastrar() throws ContatoException {
        try {
            Contato contato = contatoView.informarDados("CADASTRO DE CONTATO", new Contato());
            if(contato == null) return;

            if(contatoService.cadastrar(contato)) {
                contatoView.alertaSucesso("CADASTRO DE CONTATO", "Contato cadastrado com sucesso!");
            } else {
                contatoView.alertaErro("CADASTRO DE CONTATO", "Ops! Erro ao cadastrar contato.");
            }
        } catch (Exception e) {
            contatoView.alertaErro("CADASTRO DE CONTATO", e.getMessage());
        }
    }
}
