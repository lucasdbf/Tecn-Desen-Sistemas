public class Aluno {
	
	String nome;
	int idade;
	long numMatricula;
	
	public Aluno(String nome, int idade, long numMatricula) {
		this.nome = nome;
		this.idade = idade;
		this.numMatricula = numMatricula;
	}
	
	public void info() {
		System.out.println(
				"Nome: " + nome
				+ " | Idade: " + idade
				+ " | Número matrícula: " + numMatricula
				);
		
	}
}
