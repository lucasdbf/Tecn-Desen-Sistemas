
public class Aluno {
	
	private String nome;
	private Integer numMatricula;
	private Curso curso;
	
	public Aluno() {}
	
	public Aluno(String nome, Integer numMatricula, Curso curso) {
		this.nome = nome;
		this.numMatricula = numMatricula;
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(Integer numMatricula) {
		this.numMatricula = numMatricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numMatricula=" + numMatricula + ", curso=" + curso + "]";
	}
	
	
	
}
