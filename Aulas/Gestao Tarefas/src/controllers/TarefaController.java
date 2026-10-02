package controllers;

import exceptions.TarefaException;
import models.Tarefa;
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
                   this.cadastrar();
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

    private void cadastrar() throws TarefaException {
        try {
            Tarefa tarefa = tarefaView.informarDados("CADASTRO DE CONTATO", new Tarefa());
            if(tarefa == null) return;

            if(tarefaService.cadastrar(tarefa)) {
                tarefaView.alertaSucesso("CADASTRO DE TAREFA", "Tarefa cadastrada com sucesso!");
            } else {
                tarefaView.alertaErro("CADASTRO DE TAREFA", "Ops! Erro ao cadastrar tarefa.");
            }
        } catch (Exception e) {
            tarefaView.alertaErro("CADASTRO DE TAREFA", e.getMessage());
        }
    }


}
