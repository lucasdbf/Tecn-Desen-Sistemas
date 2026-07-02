
public class Carri {

	String marca;
	String modelo;
	String cor;
	int ano;
	double valor;
	
	public Carri(String marca, String modelo, String cor, int ano, double valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
	};
	
	public void exibirInfoCarro() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Valor: " + this.valor);
		
	}
}
