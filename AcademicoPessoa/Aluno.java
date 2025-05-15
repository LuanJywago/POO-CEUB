import java.util.Date;

public class Aluno extends Pessoa {
    private int matricula;
    private boolean ativo;
    private float bolsaDesconto;

    public Aluno() {
        super();
        this.ativo = false;
        this.bolsaDesconto = 0.0f;
    }

    public Aluno(int matricula, boolean ativo, float bolsaDesconto,
                 String cpfPessoa, String nomePessoa, Date dataNascimento,
                 String logradouroEndereco, String nroEndereco, String complementoEndereco,
                 String bairroEndereco, String cidadeEndereco, UfBrasil ufEndereco, String cepEndereco) {

        super(cpfPessoa, nomePessoa, logradouroEndereco, nroEndereco, complementoEndereco,
              bairroEndereco, cidadeEndereco, ufEndereco, cepEndereco, dataNascimento);

        this.matricula = matricula;
        this.ativo = ativo;
        this.setBolsaDesconto(bolsaDesconto); // usar o setter para validação
    }

    @Override
    public void manterPessoa() {
        System.out.println("Mantendo dados do Aluno: " + getNomePessoa());
    }

    public void manterAluno() {
        System.out.println("Mantendo dados específicos do Aluno: " + getNomePessoa());
        manterPessoa();
    }

    private void ativar() {
        this.ativo = true;
        System.out.println("Aluno " + getNomePessoa() + " ativado com sucesso!");
    }

    public boolean desativar() {
        if (ativo) {
            ativo = false;
            System.out.println("Aluno " + getNomePessoa() + " desativado com sucesso!");
            return true;
        }
        System.out.println("Aluno já está desativado!");
        return false;
    }

    public int matricular() {
        System.out.println("Realizando matrícula para o aluno: " + getNomePessoa());
        ativar();
        return matricula;
    }

    public float calcularMensalidadeComDesconto(float valorMensalidade) {
        return valorMensalidade * (1 - (bolsaDesconto / 100.0f));
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public float getBolsaDesconto() {
        return bolsaDesconto;
    }

    public void setBolsaDesconto(float bolsaDesconto) {
        if (bolsaDesconto < 0 || bolsaDesconto > 100) {
            throw new IllegalArgumentException("O desconto deve estar entre 0% e 100%");
        }
        this.bolsaDesconto = bolsaDesconto;
    }

    @Override
    public String toString() {
        return String.format("Aluno [Matrícula: %d, Nome: %s, CPF: %s, Ativo: %s, Bolsa: %.2f%%]",
                matricula, getNomePessoa(), getCpfPessoa(), ativo ? "Sim" : "Não", bolsaDesconto);
    }
}
