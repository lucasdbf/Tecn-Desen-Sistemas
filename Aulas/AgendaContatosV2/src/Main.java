import controllers.ContatoController;
import exceptions.ContatoException;
import models.Contato;

import javax.swing.*;

public class Main {
    static void main() throws ContatoException {
        ContatoController contatoController = new ContatoController();
        contatoController.iniciar();

    }
}
