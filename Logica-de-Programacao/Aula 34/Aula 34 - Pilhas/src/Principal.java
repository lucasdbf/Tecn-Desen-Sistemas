import java.util.Stack;
public class Principal {
	public static void main(String[] args) {
		// Comportamento LIFO -> Last in, first out.
		
		Stack<String> pilha = new Stack<>(); // Cria uma pilha nova
		pilha.push("Abriu o sistema"); // Adiciona um elemento novo na pilha - push();
		pilha.push("Clicou em cadastro");
		pilha.push("Salvou o cliente");
		
		System.out.println(pilha);  // Exibe pilha na tela - [elem 1, elem 2, elem n...]
		
		System.out.println(pilha.peek()); // Exibe elemento do topo (O último a entrar) - peek();
		
		pilha.pop(); // Remove elemento do topo da pilha - pop();
		
		pilha.clear(); // Remove todos os elementos da pilha - clear();
		
		System.out.println(pilha.empty()); // Verifica se a pilha esta vazia e entrega um valor booleano - empty();
		
		System.out.println(pilha.search("gsiifema")); // Pesquisa um elemento na pilha e retorna a posição do elemento na pilha - search();
		// Obs: Quando o valor não é encontrado, retorna -1. A posição começa em 1 e ela pertence sempre ao elemento do topo, o maior número pertence ao primeiro valor a ser colocado na pilha
	}

}
 