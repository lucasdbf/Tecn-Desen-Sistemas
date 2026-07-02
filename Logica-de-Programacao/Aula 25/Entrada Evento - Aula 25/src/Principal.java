import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade = 0;
		String responsavel = "s";
		String ingresso = "s";
		
		while(ingresso.equalsIgnoreCase("s") && (responsavel.equalsIgnoreCase("s") || idade >= 18)) {
			System.out.println("Qual a sua idade?");
			idade = input.nextInt();
			input.nextLine();
			
			if(idade < 18) {
				System.out.println("Você tem acompanhante responsável?");
				responsavel = input.nextLine();
			}
			
			System.out.println("Você possui ingresso?");
			ingresso = input.nextLine();
			if(ingresso.equalsIgnoreCase("s") && (responsavel.equalsIgnoreCase("s") || idade >= 18)) {
				System.out.println("Você entrou no evento!");
			}
		}
		
		System.out.println("Você não entrou no evento!");
	}
}
