package views;

import models.Contato;
import services.ContatoService;

import javax.swing.*;

public class ContatoView {

    private final ContatoService contatoService = new ContatoService();

    public int telaInicial(){
        String[] menu = {"Listas", "Cadastrar", "Alterar", "Excluir"};
        int opcao = JOptionPane.showOptionDialog(
                null,
                "Menu",
                "AGENDA DE CONTATOS",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                menu[0]
        );
        return opcao; // Devolvido para o Controller
    }
    public void telaListagem(String lista){
        JOptionPane.showMessageDialog(
                null,
                lista,
                "LISTAGEM DE CONTATOS",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void telaCadastro(){
        String nome = JOptionPane.showInputDialog("CADASTRO DE CONTATO\n\nNome:");
        String telefone = JOptionPane.showInputDialog("CADASTRO DE CONTATO\n\nTelefone:");
        contatoService.cadastrar(nome, telefone);
    }

    public void telaAlterar(){
        Long id = Long.parseLong(JOptionPane.showInputDialog("ALTERAÇÃO DE CONTATO\nId:"));
        String nome = JOptionPane.showInputDialog("Nome:");
        String telefone = JOptionPane.showInputDialog("Telefone:");

        contatoService.alterar(id, nome, telefone);
    }

    public void telaExclusao(){
       Long id = Long.parseLong(JOptionPane.showInputDialog("EXCLUSÃO DE CONTATO\nId:"));
       contatoService.excluir(id);
    }
}
