import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Aluno[] alunos = new Aluno[3];
		long numeroMatricula = 1111111;
		int idade = 0;
		String nome = "";
		
		System.out.println("Teste");
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Nome :");
			nome = input.nextLine();
			
			System.out.println("Idade: ");
			idade = input.nextInt();
			input.nextLine();
			
			System.out.println("Número da matrícula: ");
			numeroMatricula = input.nextLong(); 
			input.nextLine();
		}
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new Aluno(nome, idade, numeroMatricula);
		}
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i].info();
		}
	} 
}
 