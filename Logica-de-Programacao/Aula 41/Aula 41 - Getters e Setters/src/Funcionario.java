
public class Funcionario {

	private String nome;
	private String cargo;
	private Double salario;
	private Boolean ferias;
	private static Integer qtdFuncionarios = 0; // Pertence a classe devido ao static.
	
	
	
	public Funcionario(String nome, String cargo, Double salario, Boolean ferias) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.ferias = ferias;
		qtdFuncionarios++;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public Double getSalario() {
		return salario;
	}



	public void setSalario(Double salario) {
		this.salario = salario;
	}



	public Boolean getFerias() {
		return ferias;
	}



	public void setFerias(Boolean ferias) {
		this.ferias = ferias;
	}



	public static Integer getQtdFuncionarios() {
		return qtdFuncionarios;
	}



	public static void setQtdFuncionarios(Integer qtdFuncionarios) {
		Funcionario.qtdFuncionarios = qtdFuncionarios;
	}
	
	
	
	
	
	
	
}
