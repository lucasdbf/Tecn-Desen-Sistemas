public class Principal {

	public static void main(String[] args) {
		
		System.out.println("== EXIBIÇÂO CARRO ==");
		Carri carro1 = new Carri("Porsche", "911 Turbo S", "Prateado", 2024, 1200000);
		carro1.exibirInfoCarro();
		
		System.out.println("== EXIBIÇÃO PRODUTO ==");
		Produto produto1 = new Produto("Celular", 4000);
		produto1.exibirInfoProduto();

	}

}
