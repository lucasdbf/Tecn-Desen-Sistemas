package views;

import models.Contato;

import javax.swing.*;

public class ContatoView {

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

    public void exibir(String titulo, String texto) {
        JOptionPane.showMessageDialog(null, texto, titulo, JOptionPane.PLAIN_MESSAGE);
    }

    public String ler(String titulo, String texto, Object campo) {
        return (String) JOptionPane.showInputDialog(null, texto, titulo, JOptionPane.QUESTION_MESSAGE, null, null, campo);
    }

    public Contato informarDados(String titulo, Contato contato)    {
        String nome = ler(titulo, "Nome:", contato.getNome());
        if(nome == null || nome.equals("")) return null;
        String email = ler(titulo, "Email:", contato.getEmail());
        if(email == null || email.equals("")) return null;
        String telefone = ler(titulo, "Telefone:", contato.getTelefone());
        if(telefone == null || telefone.equals("")) return null;



        return contato;
    }
}
