public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Professor", 32, 2000.0);
        Aluno a = new Aluno("Aluno", 18, "202403");

        System.out.println("------------------" +
                "\nProfessor: " + p.getNome() +
                "\nIdade: " + p.getIdade() +
                "\nSalário: R$" + p.getSalario());
        System.out.println("------------------" +
                "\nAluno: " + a.getNome() +
                "\nIdade: " + a.getIdade() +
                "\nMatrícula: " + a.getMatricula() +
                "\n------------------");
    }
}