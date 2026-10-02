package models;

import java.util.Objects;

public class Tarefa {

    private Integer id;
    private String titulo;
    private String descricao;

    public Tarefa(Integer id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Tarefa() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Id: " + id
                + " | Título: " + titulo
                + " | Descrição: " + descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(id, tarefa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
