public class Principal {
	public static void main(String[] args) {
		// Funciona com listas desordenadas
		// Verifica os elementos de uma lista 1 a 1 -> Pode ser lenta em listas grandes
		
		int[] numero = {15, 22, 8, 40, 31};
		int valorProcurado = 40;
		int resultado = buscaLinear(numero, valorProcurado);
		if(resultado != -1) {
			System.out.println("Posição encontrada: " + resultado);
		} else {
			System.out.println("Valor não encontrado!");
		}

	}
	public static int buscaLinear(int[] vetor, int valor) {
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == valor) { // Compara o valor procurado com cada indice do vetor, quando for igual, retorna tal valor.
				return i;
			}
		}
		return -1; 
	}
}
