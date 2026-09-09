import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("== VAGA DE EMPREGO ==");
		
		String carteira = "s";
		String experiencia = "s";
		String nome = "";
		
		while(carteira.equalsIgnoreCase("s") && experiencia.equalsIgnoreCase("s")) {
			System.out.println("Qual o seu nome?");
			nome = input.nextLine();
			
			System.out.println("Você possui experiência?");
			experiencia = input.nextLine();
			
			System.out.println("Você tem carteira de motorista?");
			carteira = input.nextLine();
			
			if(carteira.equalsIgnoreCase("s") && experiencia.equalsIgnoreCase("s")) {
				System.out.printf("O candidato %s foi aprovado%n", nome);
			}
		}
		
		System.out.printf("O candidato %s foi reprovado%n", nome);

	} 

}
