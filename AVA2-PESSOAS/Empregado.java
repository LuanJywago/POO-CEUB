public class Empregado extends Pessoa {
    private String cargo;

    public Empregado(String nome, String cpf, String endereco, String cargo) {
        super(nome, cpf, endereco);
        this.cargo = cargo;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cargo: " + cargo);
    }
}
