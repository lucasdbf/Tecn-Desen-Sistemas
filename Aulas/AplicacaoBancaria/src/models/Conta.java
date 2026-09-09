package models;

import java.util.Objects;

public class Conta {

    private String banco;
    private Long numero;
    private String senha;
    private Titular titular;
    private Double saldo;

    public Conta(String banco, Long numero, String senha, Titular titular, Double saldo) {
        this.banco = banco;
        this.numero = numero;
        this.senha = senha;
        this.titular = titular;
        this.saldo = saldo;

    }

    public Conta() {}

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "banco='" + banco + '\'' +
                ", numero=" + numero +
                ", senha='" + senha + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(banco, conta.banco) && Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(banco, numero);
    }


}
