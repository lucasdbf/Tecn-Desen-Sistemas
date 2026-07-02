
public class Curso {
	
	private String nome;
	private String tipo;
	
	public Curso() {}
	
	public Curso(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", tipo=" + tipo + "]";
	}
	
}
