import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("== TRIAGEM DE PACIENTES ==\n");
		
		// Interrogation
		System.out.println("Digite o seu nome");
		String nomePaciente = input.nextLine();
		
		System.out.println("Digite seu CPF");
		String cpf = input.nextLine();
		
		System.out.println("Digite sua Data de Nascimento");
		String ddn = input.nextLine();
		
		System.out.println("Você tem febre?");
		String febre = input.nextLine();
		
		System.out.println("Você tem dor de cabeça?");
		String dorCabeca = input.nextLine();

		System.out.println("Você tem secreção nasal ou espirros?");
		String secrecaoEspirro = input.nextLine();
		
		System.out.println("Você tem dor/irritação na garganta?");
		String dorGarganta = input.nextLine();
		
		System.out.println("Você tem tosse seca?");
		String tosseSeca = input.nextLine();

		System.out.println("Você tem dificuldade respiratória?");
		String diffResp = input.nextLine();
		
		System.out.println("Você tem dores no corpo?");
		String dorCorpo = input.nextLine();
		
		System.out.println("Você tem diarreia?");
		String diarreia = input.nextLine();

		System.out.println("Você esteve em contato com um caso de COVID-19 nos últimos 14 dias?");
		String contatoDoenca = input.nextLine();
		
		System.out.println("Você esteve em locais com grande aglomeração?");
		String localAglomerado = input.nextLine();
		
		// Patient Points
		int pontuacaoPaciente = 0;
		
		if(febre.equalsIgnoreCase("s")) pontuacaoPaciente += 5;
		if (dorCabeca.equalsIgnoreCase("s")) pontuacaoPaciente += 1;
		if (secrecaoEspirro.equalsIgnoreCase("s")) pontuacaoPaciente += 1;
		if (dorGarganta.equalsIgnoreCase("s")) pontuacaoPaciente += 1;
		if (tosseSeca.equalsIgnoreCase("s")) pontuacaoPaciente += 3;
		if (diffResp.equalsIgnoreCase("s")) pontuacaoPaciente += 10;
		if (dorCorpo.equalsIgnoreCase("s")) pontuacaoPaciente += 1;
		if (diarreia.equalsIgnoreCase("s")) pontuacaoPaciente += 1;
		if (contatoDoenca.equalsIgnoreCase("s")) pontuacaoPaciente += 10;
		if (localAglomerado.equalsIgnoreCase("s")) pontuacaoPaciente += 3;  
		
		// Output
		
		if(pontuacaoPaciente <= 9) System.out.printf("Por favor, senhor(a) %s, dirija-se a ala de risco baixo", nomePaciente);
		else if(pontuacaoPaciente <= 19) System.out.printf("Por favor, senhor(a) %s, dirija-se a ala de risco médio", nomePaciente);
		else if(pontuacaoPaciente >= 20) System.out.printf("Por favor, senhor(a) %s, dirija-se a ala de risco alto", nomePaciente);
	}
}
