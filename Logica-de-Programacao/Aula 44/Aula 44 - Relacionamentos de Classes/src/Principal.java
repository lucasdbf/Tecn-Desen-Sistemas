public class Principal {
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Volkswagen", "Fusca", 1969);
		Endereco e1 = new Endereco("88704-250", "Dehon", "Avenida Expedicionário José Pedro Coelho", 245);
		System.out.println(c1);
		
		Pessoa p1 = new Pessoa("Lucas", "141532", 17, c1, e1);
		System.out.println(p1);
		
	}

}
