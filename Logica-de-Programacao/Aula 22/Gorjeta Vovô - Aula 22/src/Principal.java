import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual(is) neto(s) foi(ram) ao mercado?");
		String neto = input.nextLine();
		
		if(neto.equalsIgnoreCase("neto velho") || neto.equalsIgnoreCase("ambos")) {
			System.out.println("O neto velho comprou carne?");
			String carne = input.nextLine();
			if(carne.equalsIgnoreCase("s")) {
				System.out.println("O neto velho comprou cerveja?");
				String cerveja = input.nextLine();
				if(cerveja.equalsIgnoreCase("s")) {
					System.out.println("O neto velho ganhou gorjeta");
				} else {
					System.out.println("O neto velho não ganhou gorjeta");
				}
			}else {
				System.out.println("O neto velho não ganhou gorjeta");
			}
		}
		
		if(neto.equalsIgnoreCase("neto novo") || neto.equalsIgnoreCase("ambos")) {
			System.out.println("O neto novo comprou chocolate?");
			String chocolate = input.nextLine();
			if(chocolate.equalsIgnoreCase("s")) {
				System.out.println("O neto novo comprou refrigerante?");
				String refri = input.nextLine();
				if(refri.equalsIgnoreCase("s")) {
					System.out.println("O neto novo ganhou gorjeta");
				} else {
					System.out.println("O neto novo não ganhou gorjeta");
				}
			}else {
				System.out.println("O neto novo não ganhou gorjeta");
			}
		}

	}

}
