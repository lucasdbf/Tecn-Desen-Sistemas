package entidades;

import enums.StatusVenda;

import javax.swing.*;
import java.util.Objects;

public class Venda {

    private static Long incremento = 0L;
    private static Double totalVendido = 0.0;

    private Long id;
    private Produto produto;
    private Integer quantidade;
    private Double valorTotal;
    private StatusVenda status;

    public Venda() {}

    public Venda(Long id, Produto produto, Integer quantidade, Double valorTotal, StatusVenda status) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public Venda(Produto produto, Integer quantidade) {
        this.id = ++incremento;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = produto.getPreco() * quantidade;
        produto.setQtdEstoque(produto.getQtdEstoque() - quantidade);
        totalVendido += valorTotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusVenda getStatus() {
        return status;
    }

    public void setStatus(StatusVenda status) {
        this.status = status;
    }

    public static void getTotalVendido() {
        JOptionPane.showMessageDialog(null, "Total vendido: " + totalVendido);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", valorTotal=" + valorTotal +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Objects.equals(id, venda.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
