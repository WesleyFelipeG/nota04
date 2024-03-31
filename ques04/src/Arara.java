public class Arara extends Animal{
    protected int qtdeOvos;
    public Arara(String subClasse, String locomocao, int qtdeOvos){
        super(subClasse, locomocao);
        this.qtdeOvos = qtdeOvos;
    }

    public String getSubclasse() {
        return subClasse;
    }
    public String getLocomocao() {
        return locomocao;
    }
    public int getQtdeOvos() {
        return qtdeOvos;
    }
}
