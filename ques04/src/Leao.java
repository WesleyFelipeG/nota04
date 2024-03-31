public class Leao extends Animal {
    private String pelo;

    public Leao (String subclasse, String locomocao, String pelo) {
        super(subclasse, locomocao);
        this.pelo = pelo;
    }
    public String getPelo() {
        return pelo;
    }
    public void exibirInformacoes() {
        System.out.println("Subclasse: " + getSubClasse() +
                "\n" + "Locomoção: " + getLocomocao() +
                "\n" + "Pelo: " + getPelo());
    }
}
