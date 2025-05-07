public class UsuarioSistema extends Pessoa {
    private String nivelAcesso;

    public UsuarioSistema(String nome, String cpf, String endereco, String nivelAcesso) {
        super(nome, cpf, endereco);
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(String nivelAcesso) { this.nivelAcesso = nivelAcesso; }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Nível de Acesso: " + nivelAcesso);
    }
}