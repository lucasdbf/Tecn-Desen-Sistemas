public class Principal{
	public static void main(String[] args) {
		
		System.out.println("Início");
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Lucas";
		pessoa1.idade = 17;
		
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Idade: " + pessoa1.idade);
		
		pessoa1.fazerAniversario();
		
		System.out.println("Idade: " + pessoa1.idade);
		
		
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Juca";
		p2.idade = 60;
		
		System.out.println("\nDados pessoa 2");
		System.out.println("Nome: " + p2.nome);
		System.out.println("Idade: " + p2.idade);
		
		Pessoa p3 = new Pessoa();
		
		p3.nome = "Joao";
		p3.idade = 43;
		
		System.out.println("\nDados pessoa 3");
		System.out.println("Nome: " + p3.nome);
		System.out.println("Idade: " + p3.idade);
		
		Carro carro1 = new Carro();
		carro1.marca = "Fiat";
		carro1.modelo = "Uninho de Firma";
		carro1.cor = "Branco";
		carro1.ano = 2010;
		carro1.valor = 19999.90;
		
		System.out.println("\nCarro 1");
		System.out.println(carro1.marca);
		System.out.println(carro1.modelo);
		System.out.println(carro1.cor);
		System.out.println(carro1.ano);
		System.out.println(carro1.valor);
		
		Turma t1 = new Turma(
				"Desenvolvimento de Sistemas",
				1,
				"Noturno");
		
		t1.exibirInfo();
	} 
}