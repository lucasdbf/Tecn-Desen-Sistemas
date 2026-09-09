import enums.DiaSemana;
import enums.TamanhoRoupa;

import javax.swing.*;

public class MainEnum {
    static void main() {
        DiaSemana dia = DiaSemana.SEGUNDA;
        if(dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO) {
            JOptionPane.showMessageDialog(null, "O dia escolhido é fim de semana");
        } else {
            JOptionPane.showMessageDialog(null, "O dia escolhido é um dia de semana");
        }

        TamanhoRoupa roupa = TamanhoRoupa.PEQUENO;
    }
}
