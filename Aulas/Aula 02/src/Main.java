import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static void main() {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Olá");
        Double nota = 0.0;
        ArrayList<String> dadosInvalidos = new ArrayList<>();
        do {
            try {
                // Tenta fazer
                nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota:"));

                if (!(nota >= 0 && nota <= 10)) {
                    dadosInvalidos.add(nota.toString());
                    JOptionPane.showMessageDialog(null, "Nota inválida");
                }

            } catch (Exception e) {
                // Caso dê erro no try, faz isso
                dadosInvalidos.add(nota.toString());
                JOptionPane.showMessageDialog(null, "Entrada incorreta!");
            }
        } while (!(nota >= 0 && nota <= 10));

        JOptionPane.showMessageDialog(null, "Sua nota é " + nota);
        if(dadosInvalidos.size() > 0){
            String textoDadosInvalidos = "Dados+ inválidos:\n";
            for(int i = 0; i < dadosInvalidos.size(); i++){
                textoDadosInvalidos += dadosInvalidos.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, textoDadosInvalidos);
        }
    }
}
