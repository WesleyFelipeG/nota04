public class Animal {
    protected String subClasse;
    protected String locomocao;

    public Animal() {
    }

    public Animal(String subClasse, String locomocao) {
        this.subClasse = subClasse;
        this.locomocao = locomocao;
    }

    public String getSubClasse() {
        return subClasse;
    }

    public String getLocomocao() {
        return locomocao;
    }
}