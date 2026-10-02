package services;

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
            lista = "Nenhum contato encontrado.";
        }
        return lista;
    }


}
