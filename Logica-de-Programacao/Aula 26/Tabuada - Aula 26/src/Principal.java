import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("== TABUADA ==");
		
		System.out.println("Digite um número:");
		int numero = input.nextInt();
		input.nextLine();
		
		System.out.printf("Tabuada do %d%n", numero);
		for(int i = 1; i <= 10; i++) {
			int resultado = i * numero;
			System.out.printf("%dx%d = %d%n", i, numero, resultado);
			
		}
		
		System.out.println("\nFim");
	} 
}
