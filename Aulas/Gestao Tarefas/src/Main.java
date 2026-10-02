import exceptions.TarefaException;
import controllers.TarefaController;

public class Main {
    static void main() throws TarefaException {
        TarefaController tarefaController = new TarefaController();
        tarefaController.iniciar();
    }
}