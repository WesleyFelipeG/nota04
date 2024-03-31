public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 49.99, "Camisa polo azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça jeans preta");

        System.out.println("------------------" +
        "\nProduto 1" +
        "\n" + produto1.getNome() +
        "\n(" + produto1.getDesc() +
        ")\nPreço: R$" + produto1.getPreco());
        System.out.println("------------------" +
        "\nProduto 2" +
        "\n" + produto2.getNome() +
        "\n(" + produto2.getDesc() +
        ")\nPreço: R$" + produto2.getPreco() +
        "\n------------------");
    }
}