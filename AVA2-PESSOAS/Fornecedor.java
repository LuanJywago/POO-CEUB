public class Fornecedor extends Pessoa {
    private String produtoFornecido;

    public Fornecedor(String nome, String cpf, String endereco, String produtoFornecido) {
        super(nome, cpf, endereco);
        this.produtoFornecido = produtoFornecido;
    }

    public String getProdutoFornecido() { return produtoFornecido; }
    public void setProdutoFornecido(String produtoFornecido) { this.produtoFornecido = produtoFornecido; }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Produto Fornecido: " + produtoFornecido);
    }
}
