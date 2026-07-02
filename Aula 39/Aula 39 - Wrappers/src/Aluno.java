
public class Aluno {
	
	// Atributos pra classe sempre devem ser Wrappers
	String nome;
	Integer idade;
	Double media;
	Boolean aprovado;
	
	public Aluno(String nome, Integer idade, Double media, Boolean aprovado) {
		this.nome = nome;
		this.idade = idade;
		this.media = media;
		this.aprovado = aprovado;
	}
	
	public String exibirInfo() {
		String info = "Nome: " + nome + " | Idade: " + idade + " | Média: " + media + " | Aprovado: " + ((aprovado != null && aprovado) ? "Sim" : "Nao");
		return info;
	}
	
	
	
}
