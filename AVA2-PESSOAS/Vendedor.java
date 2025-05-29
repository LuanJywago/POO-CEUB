public class Vendedor extends Pessoa {
    private double comissao;

    public Vendedor(String nome, String cpf, String endereco, double comissao) {
        super(nome, cpf, endereco);
        this.comissao = comissao;
    }

    public double getComissao() { 
        return comissao;
    }
    
    public void setComissao(double comissao) { 
        this.comissao = comissao;
    }


    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Comissão: " + comissao);
    }
}
