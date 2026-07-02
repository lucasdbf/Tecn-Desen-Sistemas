public class Principal {
	public static void main(String[] args) {
		contagemRegressiva(3);
	}
	public static void contagemRegressiva(int numero) {
		System.out.println(numero);
		if (numero > 0) { // Caso base - Condição de parada, garante que a função não fique em loop infinito
			contagemRegressiva(numero - 1); // Recursividade ou Caso Recursivo, chamada da função dentro da função
		}
	}
}
