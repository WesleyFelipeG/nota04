public class Aluno extends Pessoa{
    private String matricula;

    Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
}
