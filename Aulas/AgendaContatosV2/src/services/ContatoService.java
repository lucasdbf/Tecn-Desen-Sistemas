package services;

import models.Contato;

import javax.swing.*;
import java.util.ArrayList;

public class ContatoService {

    private static ArrayList<Contato> contatos = new ArrayList<>();
    private static Integer incremento = 0;

    public String listar() {
        String lista = "";
        if(contatos.size() > 0) {
            for(Contato contato : contatos) {
                lista += contato + "\n";
            }
        } else {
            lista = "Nenhum contato encontrado.";
        }
        return lista;
    }

    public boolean cadastrar(Contato contato) {
        return contatos.add(contato);
    }

}
