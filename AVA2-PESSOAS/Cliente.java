public class Cliente extends Pessoa {
    private String historicoCompras;

    public Cliente(String nome, String cpf, String endereco, String historicoCompras) {
        super(nome, cpf, endereco);
        this.historicoCompras = historicoCompras;
    }

    public String getHistoricoCompras() { return historicoCompras; }
    public void setHistoricoCompras(String historicoCompras) { this.historicoCompras = historicoCompras; }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Histórico de Compras: " + historicoCompras);
    }
}
