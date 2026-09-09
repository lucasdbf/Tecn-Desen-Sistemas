import javax.swing.*;

public class Main {
    static void main() {
        Integer numero = 10;
        Integer outroNumero = 10;
        JOptionPane.showMessageDialog(null, numero.equals(outroNumero));
        // se numero for null, estoura erro (não pode ser nulo)

        try {
            String text = null;
            JOptionPane.showMessageDialog(null, text.length());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ops, tente mais tarde!");
        }
    }
}
