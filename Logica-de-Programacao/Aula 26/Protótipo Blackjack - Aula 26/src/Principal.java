import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Random aleatorio = new Random();

		Scanner input = new Scanner(System.in);

		int carta;
		String continuar = "";
		int pontosJogador1 = 0;
		int pontosJogador2 = 0;

		System.out.println("== JOGO 21 ==");

		System.out.println("Jogador 1");
		do {
			carta = aleatorio.nextInt(10) + 1;
			System.out.println("Carta: " + carta);

			pontosJogador1 += carta;
			System.out.println("Pontuação: " + pontosJogador1);

			if (pontosJogador1 > 21) {
				System.err.println("Jogador 1 perdeu, pois passou de 21.");
				continuar = "";
				System.out.println("Jogador 2 venceu.");
			}

			if (pontosJogador1 < 21) {
				System.out.println("Deseja continuar? (s/n)");
				continuar = input.nextLine();
			}

			if (pontosJogador1 == 21) {
				continuar = "";
			}

		} while (continuar.equalsIgnoreCase("s"));

		if (pontosJogador1 < 21) {
			System.out.println("\nJogador 2");
			do {
				carta = aleatorio.nextInt(10) + 1;
				System.out.println("Carta: " + carta);

				pontosJogador2 += carta;
				System.out.println("Pontuação: " + pontosJogador2);

				if (pontosJogador2 > 21) {
					System.err.println("Jogador 2 perdeu, pois passou de 21.");
					continuar = "";
					System.out.println("Jogador 1 venceu.");
				}

				if (pontosJogador2 < 21) {
					System.out.println("Deseja continuar? (s/n)");
					continuar = input.nextLine();
				}
				
				if(pontosJogador2 == 21) {
					continuar = "";
				}

			} while (continuar.equalsIgnoreCase("s")); 
		} else if(pontosJogador1 == 21) {
			System.out.println("Jogador 1 venceu.");
		}

		if (pontosJogador1 < 21 && pontosJogador1 > pontosJogador2) {
			System.out.println("Jogador 1 venceu.");
		} else if (pontosJogador2 <= 21 && pontosJogador2 > pontosJogador1) {
			System.out.println("Jogador 2 venceu.");
		} else if(pontosJogador1 == pontosJogador2) {
			System.out.println("Empate!");  
		}
	}
 
}
