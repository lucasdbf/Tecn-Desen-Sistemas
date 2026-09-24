package views;

import models.Contato;
import services.ContatoService;

import javax.swing.*;

public class ContatoView {

    private final ContatoService contatoService = new ContatoService();

    public int telaInicial() {
        String[] menu = {"Listar", "Cadastrar", "Alterar", "Excluir"};
        int opcao = JOptionPane.showOptionDialog(
                null,
                "Menu:",
                "AGENDA DE CONTATOS",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                menu[0]
        );
        return opcao;
    }

    public void telaListagem(String lista) {
        JOptionPane.showMessageDialog(
                null,
                lista,
                "LISTAGEM DE CONTATOS",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void telaCadastro() {
        String nome = JOptionPane.showInputDialog("CADASTRO DE CONTATO\nNome:");
        if(nome == null) return;
        String telefone = JOptionPane.showInputDialog("CADASTRO DE CONTATO\nTelefone:");
        if(telefone == null) return;
        String email = JOptionPane.showInputDialog("CADASTRO DE CONTATO\nEmail:");
        if(email == null) return;

        try {
            String mensagem = contatoService.cadastrar(nome, telefone, email);
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Erro desconhecido!");
        }
    }

    public void telaExclusao() {
        String lista = contatoService.listar();
        String inputId = JOptionPane.showInputDialog(
                "EXCLUSÃO DE CONTATO\n\n" + lista + "\nId:"
        );
        if(inputId == null) return;

        try {
            Long id = Long.parseLong(inputId);
            Contato contatoExclusao = contatoService.buscarPorId(id);
            int confirma = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente excluir?(" + "Id: " + contatoExclusao.getId() + ")",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );
            if(confirma == 0) {
                String mensagem = contatoService.excluir(id);
                JOptionPane.showMessageDialog(null, mensagem);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Id inválido.");
        }
    }

    public void telaAlteracao() {
        String lista = contatoService.listar();
        String inputId = JOptionPane.showInputDialog(
                "ALTERAÇÃO DE CONTATO\n\n" + lista +"\nId:"
        );
        if(inputId == null) return;

        try {
            Long id = Long.parseLong(inputId);
            Contato contatoEncontrado = contatoService.buscarPorId(id);
            if(contatoEncontrado == null) {
                JOptionPane.showMessageDialog(null, "Ops! Contato não encontrado!");
                return;
            }

            String nome = JOptionPane.showInputDialog("ALTERAÇÃO DE CONTATO\nNome:", contatoEncontrado.getNome());
            if(nome == null) return;
            String telefone = JOptionPane.showInputDialog("ALTERAÇÃO DE CONTATO\nTelefone:",  contatoEncontrado.getTelefone());
            if(telefone == null) return;
            String email = JOptionPane.showInputDialog("ALTERAÇÃO DE CONTATO\nEmail:", contatoEncontrado.getEmail());

            String mensagem = contatoService.alterar(id, nome, telefone, email);
            JOptionPane.showMessageDialog(null, mensagem);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Id inválido.");
        }
    }
}