import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculoIdade {
    static void main() {
        String dataNascimentoInput = JOptionPane.showInputDialog("Digite sua data de nascimento");

        DateTimeFormatter formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNascimento = LocalDate.parse(dataNascimentoInput, formatoBrasil);

        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);

        JOptionPane.showMessageDialog(null, "Você tem " + idade.getYears() + " anos, " + idade.getMonths() + " meses e " + idade.getDays() + " dias.");

        LocalDate aniversario = dataNascimento.withYear(dataAtual.getYear());
        Period tempoParaAniversario = Period.between(dataAtual, aniversario);
        if(aniversario.isBefore(dataAtual)){
            JOptionPane.showMessageDialog(null, "Seu aniversário já passou!");

        } else if(aniversario.isAfter(dataAtual)) {
            JOptionPane.showMessageDialog(null, "Seu aniversário ainda acontecerá em " + tempoParaAniversario.getMonths() + " meses e " + tempoParaAniversario.getDays() + " dias.");
        } else {
            JOptionPane.showMessageDialog(null ,"Seu aniversário é hoje parabéns!");
        }



    }

}
