package models;

import java.util.Objects;

public class Contato {

    // Atributos
    private Integer id;
    private String nome;
    private Long telefone;
    private String email;

    // Construtores

    public Contato() {}

    public Contato(String nome, Long telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato(Integer id, String nome, Long telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Sobrescritos

    @Override
    public String toString() {
        return "Id: " + id
                + " | Nome: " + nome
                + " | Telefone: " + telefone
                + " | E-mail: " + email;
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
