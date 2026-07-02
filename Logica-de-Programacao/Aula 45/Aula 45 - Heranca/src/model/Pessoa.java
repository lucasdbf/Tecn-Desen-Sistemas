package model;
// Classe abstrata não permite criar objetos que são diretamente Pessoa, apenas permite criar objetos que herdam essa classe

public abstract class Pessoa {
	private String dataNascimento;
	private String nome;

	public Pessoa() {}

	public Pessoa(String dataNascimento, String nome) {
		super();
		this.dataNascimento = dataNascimento;
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [dataNascimento=" + dataNascimento + ", nome=" + nome + "]";
	}
	
	

}
