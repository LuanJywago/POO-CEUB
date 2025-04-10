public class Item {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;

    // Construtor para inicializar os atributos
    public Item(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Construtor sem parâmetros (caso você queira criar o objeto e depois definir os valores)
    public Item() {
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Método para incrementar a quantidade
    public void incrementarQuantidade() {
        this.quantidade ++;
    }

    // Método para decrementar a quantidade
    public void decrementarQuantidade() {
        if (this.quantidade > 0) {
            this.quantidade -= 1;
        }
    }

    // Método corrigido para calcular o preço total
    public double calcularPreco() {
        return this.preco * this.quantidade;
    }
}
