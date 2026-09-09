import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Desafio {
    static void main() {

        ArrayList<String> listaNomes = new ArrayList<>();
        boolean candidatoAprovado = false;
        int numReprovados = 0;

        do {
            listaNomes.add(JOptionPane.showInputDialog("Insira seu nome"));
            int respExp = JOptionPane.showConfirmDialog(null, "Você possui experiência");
            boolean experiencia = false;

            if (respExp == 0) {
                experiencia = true;
            } else {
                experiencia = false;
            }

            int respCart = JOptionPane.showConfirmDialog(null, "Você possui carteira de motorista?");
            boolean carteira = false;

            if (respCart == 0) {
                carteira = true;
            } else {
                carteira = false;
            }

            int respEsf = JOptionPane.showConfirmDialog(null, "Você pode trabalhar com esforço físico?");
            boolean fisico = false;

            if (respEsf == 0) {
                fisico = true;
            } else {
                fisico = false;
            }

            if(experiencia && (carteira || fisico)){
                candidatoAprovado = true;
            } else {
                candidatoAprovado = false;
                numReprovados++;
            }
        } while (!candidatoAprovado);

        JOptionPane.showMessageDialog(null, "Parabéns " + listaNomes.getLast() + ", você foi aprovado no processo seletivo!");
        JOptionPane.showMessageDialog(null, "Número de candidatos reprovados: " + numReprovados);
        String listaReprovados = "Lista dos reprovados: \n";
        if(numReprovados > 0){
            for(int i = 0; i < numReprovados; i++){
                listaReprovados += listaNomes.get(i) + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, listaReprovados);
    }
}
