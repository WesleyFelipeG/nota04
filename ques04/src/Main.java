public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara("Ave", "Asas", 4);
        System.out.println("------------------");
        leao.exibirInformacoes();

        System.out.println("------------------" +
                "\nSubclasse: " + arara.getSubClasse() +
                "\n" + "Locomoção: " + arara.getLocomocao() +
                "\n" + "Quantidade de ovos: " + arara.getQtdeOvos() +
                "\n------------------");
    }
}