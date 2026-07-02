import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String nome = "";
		double mediaAluno = 7;
		int frequenciaAluno = 75;
		int numeroAprovados = 0;
		
		
		while(mediaAluno >= 7 && frequenciaAluno >= 75) {
			System.out.println("Qual o nome do aluno?");
			nome = input.nextLine();
			
			System.out.println("Qual a média do aluno?");
			mediaAluno = input.nextDouble();
			input.nextLine();
			
			System.out.println("Qual a frequência do aluno?");
			frequenciaAluno = input.nextInt();
			input.nextLine();
			
			if(mediaAluno >= 7 && frequenciaAluno >= 75) {
				System.out.println("O aluno " + nome + " está aprovado!");
				numeroAprovados++;
			}
		}
		
		System.out.println("O aluno " + nome + " está reprovado!");
		System.out.println("Foram aprovados: " + numeroAprovados + " de alunos!");
		
	}
}
