package tests;

import exceptions.ContatoException;
import models.Contato;
import services.ContatoService;

public class ContatoTest {
    private final ContatoService contatoService = new ContatoService();

    public void iniciar() throws ContatoException {
        System.out.println("=== TESTES ===");
        listar();
        cadastrar();
        alterar();
        excluir();
    }

    // Teste automatizado da funcionalidade de listagem
    public void listar() throws ContatoException {
        try {
            String lista = contatoService.listar();
            if(!lista.isEmpty()){
                System.out.println("Listar: Passou");
            } else {
                System.err.println("Listar: Falhou");
            }
        } catch (Exception e) {
            System.err.println("Listar: Falhou");
        }
    }

    public void cadastrar() throws ContatoException {
        try {
            Contato contato = new Contato("Teste", 123L, "teste@teste");
            Boolean cadastrou = contatoService.cadastrar(contato);
            if(cadastrou){
                System.out.println("Cadastrar: Passou");
            } else  {
                System.err.println("Cadastrar: Falhou");
            }
        } catch (Exception e) {
            System.err.println("Cadastrar: Falhou");
        }
    }

    public void alterar() throws ContatoException {
        try {
            Contato contato = new Contato("Teste", 123L, "teste@teste");
            Boolean alterou = contatoService.alterar(contato);
            if (alterou) {
                System.out.println("Alterar: Passou");
            } else {
                System.err.println("Alterar: Falhou");
            }
        } catch (Exception e) {
        System.err.println("Alterar: Falhou");}
    }

    public void excluir() throws ContatoException {
        try {
            Boolean excluiu = contatoService.excluir(1);
            if (excluiu) {
                System.out.println("Excluir: Passou");
            } else {
                System.err.println("Excluir: Falhou");
            }
        } catch (Exception e) {
            System.err.println("Excluir: Falhou");
        }
    }

}
