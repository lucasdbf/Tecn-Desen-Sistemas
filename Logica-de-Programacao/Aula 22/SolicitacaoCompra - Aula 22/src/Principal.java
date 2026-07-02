import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Quem fez a solicitação da compra?");
		String solicitador = input.next();

		if (solicitador.equalsIgnoreCase("gerente")) {
			System.out.println("O financeiro aprovou esta compra? (s/n)");
			String aprovacao = input.next();
			input.nextLine();
			if (aprovacao.equalsIgnoreCase("s")) {
				System.out.println("Compra aprovada");
			} else {
				System.out.println("Qual foi o motivo da reprovação da compra?");
				String motivo = input.nextLine();
				
				System.out.println("O motivo da recusação foi " + motivo);
				
			}

		} else if (solicitador.equalsIgnoreCase("diretor")) {
			System.out.println("Compra aprovada");
		}

	}

}
