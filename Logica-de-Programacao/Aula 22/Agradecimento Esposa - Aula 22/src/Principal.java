import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String compGel = "n";

		System.out.println("O marido arrumou a geladeira? (s/n)");
		String arrumarGel = input.nextLine();
		if (arrumarGel.equalsIgnoreCase("n")) {
			System.out.println("O marido comprou geladeira? (s/n)");
			compGel = input.nextLine();
		}

		boolean verifGel = compGel.equalsIgnoreCase("s") || arrumarGel.equalsIgnoreCase("s");

		if (verifGel) {
			System.out.println("O marido varreu a casa? (s/n)");
			String varrerCasa = input.nextLine();
			if (varrerCasa.equalsIgnoreCase("s")) {
				System.out.println("Marido recebeu obrigado");
			} else {
				System.out.println("O marido lavou a louça? (s/n)");
				String lavarLouca = input.nextLine();
				if (lavarLouca.equalsIgnoreCase("s")) {
					System.out.println("Marido recebe obrigado");
				} else {
					System.out.println("Marido dormiu no sofá");
				}
			}
		}
	}

}
