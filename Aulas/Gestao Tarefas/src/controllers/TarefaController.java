package controllers;

import exceptions.TarefaException;
import services.TarefaService;
import views.TarefaView;

public class TarefaController {

    private final TarefaView tarefaView = new TarefaView();
    private final TarefaService tarefaService = new TarefaService();

    public void iniciar() throws TarefaException {
        int opcao;
        do {
            opcao = tarefaView.menu();
            switch (opcao) {
                // Listar
                case 0:
                   this.listar();
                    break;
                // Cadastrar
                case 1:
                   // this.cadastrar();
                    break;
                // Alterar
                case 2:
                   // this.alterar();
                    break;
                // Excluir
                case 3:
                   // this.excluir();
                    break;
            }
        } while(opcao >= 0);
    }
    private void listar() {
        String lista = tarefaService.listar();
        tarefaView.exibir("LISTAGEM DE TAREFAS", lista);
    }



}
