import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.println("Qual o seu nome?");
		String nome = input.next();

		System.out.println("Você possui ingresso? (s/n) ");
		String ingresso = input.next();

		if (ingresso.equals("s")) {
			System.out.println("Qual a sua idade?");
			int idade = input.nextInt();
			if (idade >= 18) {
				System.out.println(nome + " você pode entrar no evento");
			} else {
				System.out.println("Você possui acompanhante responsável?");
				String responsavelPresente = input.next();
				if(responsavelPresente.equals("s")) {
					System.out.println("Você pode entrar no evento");
				}else {
					System.out.println("Você não pode entrar no evento");
				}
			}

		}else {
			System.out.println("Você não pode entrar no evento");
		}

	}

}
