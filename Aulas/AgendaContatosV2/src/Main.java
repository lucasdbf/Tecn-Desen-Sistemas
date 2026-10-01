import controllers.ContatoController;
import exceptions.ContatoException;

public class Main {
    static void main() throws ContatoException {
        ContatoController contatoController = new ContatoController();
        contatoController.iniciar();
    }
}
