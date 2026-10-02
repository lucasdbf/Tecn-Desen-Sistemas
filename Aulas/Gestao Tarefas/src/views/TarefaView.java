package views;

import javax.swing.*;

public class TarefaView {

    public int menu() {
        String[] menu = {"Listar", "Cadastrar", "Alterar", "Excluir"};
        int opcao = JOptionPane.showOptionDialog(
                null,
                "Menu:",
                "GESTÃO DE TAREFAS",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                menu[0]
        );
        return opcao;
    }

    public void exibir(String titulo, String texto) {
        JOptionPane.showMessageDialog(
                null,
                texto,
                titulo,
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
