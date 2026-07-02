import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("== NÚMEROS DECRESCENTES ==");
		
		System.out.println("Digite um número:");
		int inicio = input.nextInt();
		input.nextLine();
		
		for(int i = 10; i > inicio; i--) {
			System.out.println(i); 
		}

		System.out.println("\nFim");
	}
}
