package controllers;

import views.ContatoView;

public class ContatoController {

    private final ContatoView contatoView = new ContatoView();

    public void iniciar() {
        int opcao;
        do {
            opcao = contatoView.telaInicial();
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
                    this.alterar();
                    break;
                // Excluir
                case 3:
                    this.excluir();
                    break;
            }
        } while (opcao >= 0);
    }

    private void listar() {

    }

    private void cadastrar() {}
    private void alterar() {}
    private void excluir() {}
}
