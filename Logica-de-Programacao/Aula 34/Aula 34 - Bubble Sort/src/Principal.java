public class Principal {
	public static void main(String[] args) {
		// Organiza elementos em ordem crescente ou decrescente
		// Pode ser lento em listas grandes, pois testa 1 elemento com todos -> O(n²)
		
		int[] numerosDesordenados = {5, 3, 8, 1};
		int[] numerosOrdenados = bubbleSort(numerosDesordenados);
		for(int i = 0; i  < numerosOrdenados.length; i++) {
			System.out.print(numerosOrdenados[i] + " ");
		}
	}
	public static int[] bubbleSort(int [] vetor) {
		for(int i = 0; i < vetor.length - 1; i++) {
			for(int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp; 
				}
			}
		}
		return vetor;
	}
}
