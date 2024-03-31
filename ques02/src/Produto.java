public class Produto {
    protected String nome;
    protected double preco;
    protected String desc;

    public Produto (String nome, double preco, String desc) {
        this.nome = nome;
        this.preco = preco;
        this.desc = desc;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getDesc() {
        return desc;
    }
}
