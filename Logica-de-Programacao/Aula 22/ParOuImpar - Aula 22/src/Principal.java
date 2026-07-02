import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número");
		String numeroTexto = input.nextLine();
		
		try {
			int numero = Integer.parseInt(numeroTexto);
			
			if(numero % 2 == 1 ) {
				System.out.println("Ímpar");
			}else {
				System.out.println("Par");
			}
			
		} catch (Exception e) {
			System.out.println("Número inválido");
		}

	}

}
