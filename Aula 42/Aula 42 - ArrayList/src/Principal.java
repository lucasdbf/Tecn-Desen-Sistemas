import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<String> frutas = new ArrayList();
		frutas.add("maça");
		frutas.add("banana");
		frutas.add("Mamao");
		System.out.println(frutas);
		System.out.println(frutas.get(0));
		frutas.remove(2);
		System.out.println(frutas.size());
		frutas.contains("banana");
		
		
		ArrayList<Produto> listaProdutos = new ArrayList();
		Produto p1 = new Produto("Mouse", 30.0);
		listaProdutos.add(p1);
		Produto p2 = new Produto("TV 60 polegadas", 2049.90);
		listaProdutos.add(p2);
		Produto p3 = new Produto("Churrasqueira", 490.0);
		listaProdutos.add(p3);
		p3 = new Produto("Blah blah", 10.0);
		
		listaProdutos.add(new Produto("Ps4", 2000.0));
		
		System.out.println("\n Lista Produtos");
		for (int i = 0; i < listaProdutos.size(); i++) {
			System.out.println(listaProdutos.get(i));
		}
	}

}
