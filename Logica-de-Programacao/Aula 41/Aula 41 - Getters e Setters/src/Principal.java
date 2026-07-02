
public class Principal {
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(null, null, null, null);
		funcionario1.setNome("José");
		System.out.println(funcionario1);
		System.out.println(Funcionario.getQtdFuncionarios());

	}

}
