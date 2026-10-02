package services;

import exceptions.TarefaException;
import models.Tarefa;

import java.util.ArrayList;

public class TarefaService {

    private static Integer incremento = 0;
    private static ArrayList<Tarefa> tarefas = new ArrayList<>();

    public String listar() {
        String lista = "";
        if(tarefas.size() > 0) {
            for(Tarefa tarefa : tarefas) {
                lista += tarefa + "\n";
            }
        } else {
            lista = "Nenhuma tarefa encontrada.";
        }
        return lista;
    }

    // adicionei isso para nao abrir a aba alterar e excluir se nao existir nenhuma tarefa, nao é necessario colocar
    public Boolean estaVazia() {
        return tarefas.isEmpty();
    }
    // ------------

    public Boolean cadastrar(Tarefa tarefa) throws TarefaException {
        if(validarDados(tarefa.getTitulo(), tarefa.getDescricao())) {
            tarefa.setId(gerarId());
            return tarefas.add(tarefa);
        } else {
            return false;
        }
    }

    private Integer gerarId() {
        return ++incremento;
    }

    private Boolean validarDados(String tituloTarefa, String descricao) throws TarefaException {
        String erros = "";
        if(tituloTarefa.trim().isEmpty()) erros += "\n- Título é um campo obrigatório";
        if(descricao.trim().isEmpty()) erros += "\n- Descrição é um campo obrigatório";

        if(!erros.isEmpty()) {
            throw new TarefaException("Ops! Erros encontrados:" + erros);
        }

        return true;
    }

    public Tarefa buscarPorId(Integer id){
        for(Tarefa tarefa : tarefas) {
            if(tarefa.getId().equals(id)) {
                return tarefa;
            }
        }
        return null;
    }

    public Boolean excluir(Integer id){
        for(int i = 0; i < tarefas.size(); i++) {
            if(tarefas.get(i).getId().equals(id)) {
                tarefas.remove(i);
                return true;
            }
        }
        return false;
    }

    public Boolean alterar(Tarefa tarefa) throws TarefaException {
        if(validarDados(tarefa.getTitulo(), tarefa.getDescricao())) {
            for(int i = 0; i < tarefas.size(); i++) {
                if(tarefas.get(i).getId().equals(tarefa.getId())) {
                    tarefas.set(i, tarefa);
                    return true;
                }
            }
        }
        return false;
    }



}
