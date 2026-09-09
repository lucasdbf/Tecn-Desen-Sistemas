import classes.Aluno;
import classes.Pessoa;
import classes.Venda;

import javax.swing.*;

public class Main {
    static void main() {

        Pessoa p1 = new Pessoa();
        JOptionPane.showMessageDialog(null, p1);

        Pessoa p2 = new Pessoa("Lucas", 17);
        JOptionPane.showMessageDialog(null, p2);

        Aluno a1 = new Aluno("Maria Cristina", 15, 123);
        JOptionPane.showMessageDialog(null, a1);

        Venda v1 = new Venda("Cimento", 44.90);
        JOptionPane.showMessageDialog(null, v1);

        Venda v2 = new Venda("Chocolate", 5.99);
        JOptionPane.showMessageDialog(null, v2);

        Venda v3 = new Venda("Paçoca", 0.99);
        JOptionPane.showMessageDialog(null, v3);

        JOptionPane.showMessageDialog(null, "Quantidade total vendida: " + Venda.qtdTotal);

        Pessoa a2 = new Aluno("Léo", 15, 456);

    }
}
