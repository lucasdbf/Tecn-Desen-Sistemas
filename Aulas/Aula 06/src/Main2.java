import entidades.Usuario;

import javax.swing.*;

public class Main2 {
    static void main() {
        Usuario u1 = new Usuario("Vitor", "123", "20000");

        Usuario u2 = new Usuario("Vitor", "123", "20000");
        JOptionPane.showMessageDialog(null, u1.equals(u2));

    }
}
