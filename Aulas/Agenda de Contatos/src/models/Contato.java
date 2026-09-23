package models;

import java.util.Objects;

public class Contato {

    // Especial para geração de id
    private static Long incremento = 0L;

    // Atributos
    private Long id;
    private String nome;
    private String telefone;

    // Construtores

    public Contato() {}

    public Contato(String nome, String telefone) {
        this.id = ++incremento;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato(Long id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Sobrescritos

    @Override
    public String toString() {
        return "Id: " + id
                + " | Nome: " + nome
                + " | Telefone: " + telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(id, contato.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
