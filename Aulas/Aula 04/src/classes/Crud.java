package classes;

import java.util.ArrayList;

public interface Crud {

    public Boolean cadastrar();

    public Boolean alterar();

    public Boolean excluir();

    public ArrayList<String> listar();

}
