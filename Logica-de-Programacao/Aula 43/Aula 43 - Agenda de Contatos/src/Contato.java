public class Contato {

	private static int incremento = 0;
	
	// Atributos
	private String nome;
	private String telefone;
	private Integer id;
	
	// Construtores
	
	public Contato() {}

	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.id = incremento++;
	}

	// Getters e Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// Exibição de dados
	@Override
	public String toString() {
		return "Nome: " + nome + " | Telefone: " + telefone + " | ID: " + id;
	}

}
