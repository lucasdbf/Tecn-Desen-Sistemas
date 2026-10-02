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
                   this.alterar();
                    break;
                // Excluir
                case 3:
                   this.excluir();
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
            Tarefa tarefa = tarefaView.informarDados("CADASTRO DE TAREFA", new Tarefa());
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

    private void excluir() {
        try{
            Integer id = tarefaView.informarId("EXCLUSÃO DE TAREFA", tarefaService.listar());
            if(id == null) return;

            Tarefa tarefaExclusao = tarefaService.buscarPorId(id);
            if(tarefaExclusao == null){
                tarefaView.alertaErro("EXCLUSÃO DE TAREFA", "Ops! Tarefa inexistente.");
                return;
            }

            int confirma = tarefaView.alertaConfirmacao(
                    "EXCLUSÃO DE TAREFA",
                    "Deseja realmente excluir a tarefa "
                            + tarefaExclusao.getTitulo()
                            + " (Id: "  + tarefaExclusao.getId() + ")?"
            );

            if(confirma == 0){
                if(tarefaService.excluir(id)){
                    tarefaView.alertaSucesso("EXCLUSÃO DE TAREFA", "Tarefa excluida com sucesso!");
                } else{
                    tarefaView.alertaErro("EXCLUSÃO DE TAREFA", "Ops! Erro ao excluir tarefa.");
                }
            }

        }catch(Exception e){
            tarefaView.alertaErro("EXCLUSÃO DE TAREFA", e.getMessage());
        }
    }

    private void alterar(){
        try {
            Integer id = tarefaView.informarId("ALTERAÇÃO DE TAREFA", tarefaService.listar());
            if(id == null) return;

            Tarefa tarefaOriginal = tarefaService.buscarPorId(id);
            if(tarefaOriginal == null){
                tarefaView.alertaErro("ALTERAÇÃO DE TAREFA", "Ops! Tarefa inexistente.");
                return;
            }

            // Edita uma cópia para não alterar o objeto da lista antes da validação
            Tarefa tarefaAlteracao = tarefaView.informarDados(
                    "ALTERAÇÃO DE CONTATO",
                    new Tarefa(
                            tarefaOriginal.getId(),
                            tarefaOriginal.getTitulo(),
                            tarefaOriginal.getDescricao()
                    )
            );
            if(tarefaAlteracao == null) return;

            if(tarefaService.alterar(tarefaAlteracao)) {
                tarefaView.alertaSucesso("ALTERAÇÃO DE TAREFA",  "Tarefa alterada com sucesso!");
            } else {
                tarefaView.alertaErro("ALTERAÇÃO DE TAREFA", "Ops! Erro ao alterar tarefa.");
            }


        } catch (Exception e) {
            tarefaView.alertaErro("ALTERAÇÃO DE TAREFA", e.getMessage());
        }
    }
}
