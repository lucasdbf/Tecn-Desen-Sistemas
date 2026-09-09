import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static void main() {
        String[] movimentações = {"Frente", "Trás", "Esquerda", "Direita", "Pousar"};
        ArrayList<String> listaMovimentos = new ArrayList<>();
        int eixoX = 0;
        int eixoY = 0;
        String ultimoMovimento = null;
        int decolar = (int) JOptionPane.showConfirmDialog(null, "Deseja decolar?", "Decolagem", JOptionPane.YES_NO_OPTION);
        boolean deveDecolar;

        if(decolar == 0) {
            do{
                ultimoMovimento = (String) JOptionPane.showInputDialog(null, "Qual deve ser o próximo movimento do drone?",
                        "Tipos de Papel", JOptionPane.PLAIN_MESSAGE, null, movimentações, movimentações[0]);

                if(ultimoMovimento.equals("Frente")) eixoY += 1;
                if(ultimoMovimento.equals("Trás")) eixoY -= 1;
                if(ultimoMovimento.equals("Direita")) eixoX += 1;
                if(ultimoMovimento.equals("Esquerda")) eixoX -= 1;

                listaMovimentos.add(ultimoMovimento);

            }while(!ultimoMovimento.equals("Pousar"));

            String todosMov = "LISTA DE MOVIMENTOS" + "\n" + "Decolar" + "\n";

            for(int i = 0; i < listaMovimentos.size(); i++){
                todosMov += listaMovimentos.get(i) + "\n";
            }

            JOptionPane.showMessageDialog(null, todosMov);
            JOptionPane.showMessageDialog(null, "Suas coordenadas são: (X: " + eixoX + " Y: " + eixoY + ")");
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu não decolar o drone!");
        }

    }
}
