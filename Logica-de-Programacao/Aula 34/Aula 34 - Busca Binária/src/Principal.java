

public class Principal {
	public static void main(String[] args) {
		// Funciona somente em listas ordenadas
		// Busca mais rápida e perfomática
		
		int[] numeros = {10, 20, 30, 40, 50, 60, 70};
		int valorProcurado = 50;
		int resultado = buscar(numeros, valorProcurado);
		System.out.println(resultado);
		
	}
	public static int buscar(int[] vetor, int valor) {
		// Variáveis de controle
		int inicio = 0;
		int fim = vetor.length - 1;
		
		// Busca
		while(inicio <= fim) {
			int meio = (inicio + fim) / 2;
			
			// Valor encontrado
			if(vetor[meio] == valor) {
				return meio;
			}
			
			if(valor > vetor[meio]) {
				// Verifica metade da direita
				inicio = meio + 1;
				
			} else {
				// Verifica metade da esquerda
				fim = meio - 1;
			}
			
		}
		
		// Saída para número não encontrado
		return -1; 
	}
}
