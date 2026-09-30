package views;

import models.Contato;
import utils.Utilidade;

import javax.swing.*;

public class ContatoView {

    public int menu() {
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

    public Contato informarDados(String titulo, Contato contato) {
        String nome = ler(titulo, "Nome:", contato.getNome());
        if(nome == null) return null;
        String telefone = ler(titulo, "Telefone:", contato.getTelefone());
        if(telefone == null) return null;
        String email = ler(titulo, "E-mail:", contato.getEmail());
        if(email == null) return null;

        contato.setNome(nome);
        contato.setTelefone(Utilidade.converterLong(telefone));
        contato.setEmail(email);

        return contato;
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

    public int alertaConfirmacao(String titulo, String mensagem) {
        return JOptionPane.showConfirmDialog(
                null,
                mensagem,
                titulo,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
    }

    public Integer informarId(String titulo, String lista) {
        String inputId = ler(titulo, lista + "\nId:", null);
        if(inputId == null) return null;

        Integer id = Utilidade.converterInteger(inputId);
        if(id == null) alertaErro(titulo, "Ops! Id inválido.");

        return id;
    }

}
