import entidades.Produto;
import entidades.Venda;

public class Principal {
    static void main() {
        Produto p1 = new Produto("Vara de pesca", 49.50, 10);
        Produto p2 = new Produto("Molinete", 200.0, 20);
        Venda v1 = new Venda(p1, 3);
        Venda v2 = new Venda(p1, 5);

        System.out.println(v2);
    }
}
