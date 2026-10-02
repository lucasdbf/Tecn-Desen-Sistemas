package views;

import models.Tarefa;

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

    public String ler(String titulo, String texto, Object campo) {
        return (String)JOptionPane.showInputDialog(
                null,
                texto,
                titulo,
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                campo
        );
    }

    public Tarefa informarDados(String titulo, Tarefa tarefa) {
        String tituloTarefa = ler(titulo, "Título da Tarefa:", tarefa.getTitulo());
        if(tituloTarefa == null) return null;
        String descricao = ler(titulo, "Descrição:", tarefa.getDescricao());
        if(descricao == null) return null;

        tarefa.setDescricao(descricao);
        tarefa.setTitulo(tituloTarefa);

        return tarefa;
    }

    public void alertaSucesso(String titulo, String mensagem) {
        JOptionPane.showMessageDialog(
                null,
                mensagem,
                titulo,
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void alertaErro(String titulo, String mensagem) {
        JOptionPane.showMessageDialog(
                null,
                mensagem,
                titulo,
                JOptionPane.ERROR_MESSAGE
        );
    }


}
