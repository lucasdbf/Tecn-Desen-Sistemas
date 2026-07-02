
public class Pessoa {

	private String nome;
	private String cpf;
	private Integer idade;
	private Carro carro;
	private Endereco endereco;
	
	public Pessoa() {}

	public Pessoa(String nome, String cpf, Integer idade, Carro carro, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.carro = carro;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", carro=" + carro + ", endereco="
				+ endereco + "]";
	}
	
	
}
