import java.util.Scanner;

public class Principal {

	static Paciente[] pacientes = new Paciente[100];
	static int indicePaciente = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("== REGISTRO DE PACIENTES ==");

		int opcaoMenu = 0;

		do {
			System.out.println("1. Adicionar paciente");
			System.out.println("2. Gerar relatório");
			System.out.println("3. Sair");
			opcaoMenu = input.nextInt();

			switch (opcaoMenu) {
			case 1:
				adicionarPaciente();
				break;
			case 2:
				gerarRelatorio();
				break;
			}

		} while (opcaoMenu != 3);

	}

	public static void adicionarPaciente() {

		Scanner input = new Scanner(System.in);

		String nome = "";
		int idade = 0;
		boolean comorbidades = false;
		int risco = 0;
		String resposta = "";

		System.out.println("Insira o nome do paciente:");
		nome = input.nextLine();

		System.out.println("Insira a idade do paciente:");
		idade = input.nextInt();
		input.nextLine();

		System.out.println("O paciente possui comorbidades? (s/n)");
		resposta = input.nextLine();
		comorbidades = (resposta.equalsIgnoreCase("s")) ? true : false;

		System.out.println("Qual o nível de risco do paciente? (Escala 1 a 3)");
		risco = input.nextInt();

		pacientes[indicePaciente] = new Paciente(nome, idade, comorbidades, risco);

		indicePaciente++;
	}

	public static void gerarRelatorio() {
		
		for (int i = 0; i < indicePaciente; i++) {
			pacientes[i].infoPaciente();
		}
	}
}
