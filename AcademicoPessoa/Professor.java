import java.util.Date;

/**
 * Classe que representa um professor no sistema acadêmico.
 * Herda da classe abstrata Pessoa e implementa atributos e métodos específicos para professores.
 * 
 * @author Sistema Acadêmico
 * @version 1.0
 */
public class Professor extends Pessoa {
    
    private String titularidade;
    private NivelEscolar nivelEscolaridade;

    public Professor() {
        super();
    }

    public Professor(String cpfPessoa, String nomePessoa, String logradouroEndereco,
                     String nroEndereco, String complementoEndereco, String bairroEndereco,
                     String cidadeEndereco, UfBrasil ufEndereco, String cepEndereco,
                     Date dataNascimento, String titularidade, NivelEscolar nivelEscolaridade) {
        super(cpfPessoa, nomePessoa, logradouroEndereco, nroEndereco, complementoEndereco,
              bairroEndereco, cidadeEndereco, ufEndereco, cepEndereco, dataNascimento);
        this.titularidade = titularidade;
        this.nivelEscolaridade = nivelEscolaridade;
    }

    @Override
    public void manterPessoa() {
        System.out.println("Mantendo dados da pessoa (Professor): " + getNomePessoa());
    }

    public void manterProfessor() {
        System.out.println("Mantendo dados específicos do professor: " + getNomePessoa() +
                           " (" + titularidade + ")");
        manterPessoa();
    }

    public boolean possuiTitulacaoMinima(NivelEscolar nivelMinimo) {
        if (nivelEscolaridade == null || nivelMinimo == null) {
            return false;
        }
        return nivelEscolaridade.ordinal() >= nivelMinimo.ordinal();
    }

    public boolean podeOrientarDoutorado() {
        return possuiTitulacaoMinima(NivelEscolar.DOUTORADO);
    }

    public boolean podeOrientarMestrado() {
        return possuiTitulacaoMinima(NivelEscolar.MESTRADO);
    }

    public String getTitularidade() {
        return titularidade;
    }

    public void setTitularidade(String titularidade) {
        this.titularidade = titularidade;
    }

    public NivelEscolar getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(NivelEscolar nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    @Override
    public String toString() {
        return String.format(
            "Professor [CPF: %s, Nome: %s, Titularidade: %s, Nível de Escolaridade: %s]",
            getCpfPessoa(), getNomePessoa(), titularidade,
            (nivelEscolaridade != null ? nivelEscolaridade.name() : "N/A")
        );
    }
}
