import javax.swing.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public class Main {
    static void main() {

        int number = 10;
        long largeNumber = 1000000000;
        double decimal = 10.5;
        boolean logic = true;
        char letter = 'A';

        Integer anotherNumber = 10;
        Double anotherDecimal = 10.5;
        Boolean anotherLogic = true;
        Character anotherLetter = 'A';
        Long anotherLargeNumber = 1000000000L;

        String text = "Isto é um texto";
        Object test = 10;

        BigInteger bigNumber = new BigInteger("923049149934");
        BigDecimal bigNumDec = new BigDecimal("1431.24132");

        // ================ ARMAZENAMENTO DE DATA ================
        LocalDate dataNascimento;

        LocalDate data = LocalDate.of(2010, 11, 24);
        LocalDate dataAtual = LocalDate.now();

        JOptionPane.showMessageDialog(null, dataAtual);

        if(data.isBefore(dataAtual)){
            JOptionPane.showMessageDialog(null, "Essa data já ocorreu");
        } else if(data.isAfter(dataAtual)){
            JOptionPane.showMessageDialog(null, "Essa data irá ocorrer");
        } else {
            JOptionPane.showMessageDialog(null, "Essa data é hoje!");
        }
    }
}
