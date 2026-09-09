package classes;

public class Aluno extends Pessoa{

    private Integer numMatricula;

    public Aluno(String nome, Integer idade, Integer numMatricula) {
        super(nome, idade);
        this.numMatricula = numMatricula;
    }

    public Aluno() {}

    @Override
    public String toString() {
        return "Aluno{" +
                "numMatricula=" + numMatricula +
                "} " + super.toString();
    }
}
