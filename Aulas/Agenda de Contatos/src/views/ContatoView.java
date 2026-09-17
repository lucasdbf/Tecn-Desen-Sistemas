package views;

import models.Contato;

import javax.swing.*;

public class ContatoView {
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

    public Contato telaCadastro(){
        String nome = JOptionPane.showInputDialog("CADASTRO DE CONTATO\n\nNome:");
        if(nome == null) return null;
        String telefone = JOptionPane.showInputDialog("CADASTRO DE CONTATO\n\nTelefone:");
        if(telefone == null) return null;

        return new Contato(nome, telefone);
    }

    public Long telaExclusao(){

       Long id = Long.parseLong(JOptionPane.showInputDialog("EXCLUSÃO DE CONTATO\nId:"));

        return id;
    }
}
