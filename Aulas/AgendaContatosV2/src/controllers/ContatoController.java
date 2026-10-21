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
        try {
            String lista = contatoService.listar();
            contatoView.exibir("LISTAGEM DE CONTATOS", lista);
        } catch (Exception e) {
            contatoView.alertaErro("LISTAGEM DE CONTATOS", e.getMessage());
        }
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

    private void excluir() {
        try{
            Integer id = contatoView.informarId("EXCLUSÃO DE CONTATO", contatoService.listar());
            if(id == null) return;

            Contato contatoExclusao = contatoService.buscarPorId(id);
            if(contatoExclusao == null){
                contatoView.alertaErro("EXCLUSÃO DE CONTATO", "Ops! Contato inexistente.");
                return;
            }

            int confirma = contatoView.alertaConfirmacao(
                    "EXCLUSÃO DE CONTATO",
                    "Deseja realmente excluir o contato "
                    + contatoExclusao.getNome()
                    + " (Id: "  + contatoExclusao.getId() + ")?"
            );

            if(confirma == 0){
                if(contatoService.excluir(id)){
                    contatoView.alertaSucesso("EXCLUSÃO DE CONTATO", "Contato excluido com sucesso!");
                } else{
                    contatoView.alertaErro("EXCLUSÃO DE CONTATO", "Ops! Erro ao excluir contato.");
                }
            }

        }catch(Exception e){
            contatoView.alertaErro("EXCLUSÃO DE CONTATO", e.getMessage());
        }
    }

    private void alterar(){
        try {
            Integer id = contatoView.informarId("ALTERAÇÃO DE CONTATO", contatoService.listar());
            if(id == null) return;

            Contato contatoOriginal = contatoService.buscarPorId(id);
            if(contatoOriginal == null){
                contatoView.alertaErro("ALTERAÇÃO DE CONTATO", "Ops! Contato inexistente.");
                return;
            }

            // Edita uma cópia para não alterar o objeto da lista antes da validação
            Contato contatoAlteracao = contatoView.informarDados(
                    "ALTERAÇÃO DE CONTATO",
                    new Contato(
                            contatoOriginal.getId(),
                            contatoOriginal.getNome(),
                            contatoOriginal.getTelefone(),
                            contatoOriginal.getEmail()
                    )
            );
            if(contatoAlteracao == null) return;

            if(contatoService.alterar(contatoAlteracao)) {
                contatoView.alertaSucesso("ALTERAÇÃO DE CONTATO",  "Contato alterado com sucesso!");
            } else {
                contatoView.alertaErro("ALTERAÇÃO DE CONTATO", "Ops! Erro ao alterar contato.");
            }


        } catch (Exception e) {
            contatoView.alertaErro("ALTERAÇÃO DE CONTATO", e.getMessage());
        }
    }
}
