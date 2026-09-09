
public class Produto {

	String nome;
	int valor;
	
	public Produto(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public void exibirInfoProduto() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Valor: " + this.valor);
	}
}
