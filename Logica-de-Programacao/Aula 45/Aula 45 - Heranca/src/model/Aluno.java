package model;

public class Aluno extends Pessoa {
	
	private Integer numMatricula;
	
	public Aluno() {}

	public Aluno(String dataNascimento, String nome, Integer numMatricula) {
		super(dataNascimento, nome);
		this.numMatricula = numMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [numMatricula=" + numMatricula + super.toString() +  "]";
	}
	
	
	
}
