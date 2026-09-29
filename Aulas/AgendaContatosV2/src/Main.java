import controllers.ContatoController;
import models.Contato;

import javax.swing.*;

public class Main  {
    public static void main(String[] args) {
        ContatoController contatoController = new ContatoController();
        contatoController.iniciar();
    }
}