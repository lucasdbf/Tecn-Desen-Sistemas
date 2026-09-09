import models.Conta;
import models.Titular;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static void main() {

        ArrayList<Conta> listaContas = new ArrayList<>();
        Titular t1 = new Titular("José Luiz Paz", "536.583.091-48");
        int opcao = 0;

        Conta c1 = new Conta("Inter", 123456L, "JosePaz1234", t1, 300.0);
        Conta c2 = new Conta("Caixa", 234567L, "JoseLuiz4321", t1,100.0);
        Conta contaEncontrada = null;

        listaContas.add(c1);
        listaContas.add(c2);

        JOptionPane.showMessageDialog(null, "Bem-vindo ao aplicativo bancário");
        Long numeroConta = Long.parseLong(JOptionPane.showInputDialog("Por favor, digite o número da sua conta!"));

        for(Conta conta : listaContas){
            if(numeroConta.equals(conta.getNumero())) {
                contaEncontrada = conta;
            }
        }

        if (contaEncontrada != null) {
            String cpfDigitado = JOptionPane.showInputDialog("Digite o seu cpf");
            if(cpfDigitado.equals(contaEncontrada.getTitular().getCpf())) {
               String senhaDigitada = JOptionPane.showInputDialog("Digite sua senha, " + contaEncontrada.getTitular().getNome());
               if(senhaDigitada.equals(contaEncontrada.getSenha())){
                   do {
                       opcao = JOptionPane.showOptionDialog(null, "Bem-vindo " + contaEncontrada.getTitular().getNome() + "\nO que deseja fazer?", "Aplicativo bancário", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, new String[]{"Ver saldo", "Sacar", "Depositar", "Sair"}, "Ver saldo");
                       switch (opcao){
                           case 0: // Ver saldo
                               JOptionPane.showMessageDialog(null, "Seu saldo é " + contaEncontrada.getSaldo());
                               break;
                           case 1: // Sacar
                               int dinheiroSaque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que você deseja sacar"));
                               if(contaEncontrada.getSaldo() >= dinheiroSaque){
                                   contaEncontrada.setSaldo(contaEncontrada.getSaldo() - dinheiroSaque);
                                   JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                               } else {
                                   JOptionPane.showMessageDialog(null, "Ops, saldo insuficiente!");
                               }
                               break;
                           case 2: // Depositar
                               int dinheiroDeposito = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que você deseja depositar"));
                               contaEncontrada.setSaldo((contaEncontrada.getSaldo()) + dinheiroDeposito);
                               JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                               break;
                       }
                   }while(opcao != 3 && opcao != -1);
               } else {
                   JOptionPane.showMessageDialog(null, "Senha incorreta!");
               }
            } else {
                JOptionPane.showMessageDialog(null, "CPF incorreto!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conta não encontrada");
        }
    }
}
