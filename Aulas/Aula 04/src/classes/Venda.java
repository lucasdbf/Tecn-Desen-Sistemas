package classes;

import java.util.ArrayList;

public class Venda {

    public static Integer qtdTotal = 0;
    private String produto;
    private Double valor;

    public Venda() {}

    public Venda(String produto, Double valor) {
        qtdTotal++;
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "produto='" + produto + '\'' +
                ", valor=" + valor +
                '}';
    }
}
