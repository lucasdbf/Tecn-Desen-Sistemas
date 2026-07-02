import java.util.LinkedList;
import java.util.Queue;

public class Principal {
	public static void main(String[] args) {
		// Comportamento FIFO - First in, first out.
		
		Queue<String> fila = new LinkedList<>(); // Cria uma fila nova
		
		fila.add("José"); // Adiciona elementos na fila - add();
		fila.add("Maria");
		fila.add("Cleber");
		
		System.out.println(fila); // Exibe fila completa - [elem 1, elem 2, elem n ...]
		
		System.out.println(fila.peek()); // Pega o primeiro elemento da fila - peek();
		
		fila.poll(); // Remove da fila o primeiro elemento - poll();
		
		System.out.println(fila.isEmpty()); // Verifica se a fila está vazia e retorna um valor booleano
		
		System.out.println(fila.size()); // Exibe o número de elementos na fila 
	}
}
