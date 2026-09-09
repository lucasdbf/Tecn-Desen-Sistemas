
public class Paciente {

	String nome;
	Integer idade;
	Boolean comorbidades;
	Integer risco;
	
	public Paciente(String nome, Integer idade, Boolean comorbidades, Integer risco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.comorbidades = comorbidades;
		this.risco = risco;
	}
	
	public void infoPaciente() {
		System.out.println("Nome: " + nome + " | Idade: " + idade + " | Tem comorbidades? " + ((comorbidades) ? "Sim" : "Não") + " | Nível de Risco: " + risco);
	}
	
	
}
