import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Classe abstrata que representa uma pessoa no sistema acadêmico.
 * Serve como base para as classes Professor e Aluno.
 * Implementa os atributos e métodos comuns a todas as pessoas no sistema.
 * 
 * @author Sistema Acadêmico
 * @version 1.0
 */
public abstract class Pessoa {
    
    // Atributos de identificação pessoal
    private String cpfPessoa;
    private String nomePessoa;
    private Date dataNascimento;
    
    // Atributos de endereço
    private String logradouroEndereco;
    private String nroEndereco;
    private String complementoEndereco;
    private String bairroEndereco;
    private String cidadeEndereco;
    private UfBrasil ufEndereco;
    private String cepEndereco;
    
    // Lista de telefones associados à pessoa
    private List<TelefonePessoa> telefones;
    
    /**
     * Construtor padrão da classe Pessoa.
     * Inicializa a lista de telefones vazia.
     */
    protected Pessoa() {
        this.telefones = new ArrayList<>();
    }
    
    /**
     * Construtor completo da classe Pessoa.
     * 
     * @param cpfPessoa CPF da pessoa
     * @param nomePessoa Nome completo da pessoa
     * @param logradouroEndereco Logradouro (rua, avenida) do endereço
     * @param nroEndereco Número do endereço
     * @param complementoEndereco Complemento do endereço (opcional)
     * @param bairroEndereco Bairro do endereço
     * @param cidadeEndereco Cidade do endereço
     * @param ufEndereco Estado (UF) do endereço
     * @param cepEndereco CEP do endereço
     * @param dataNascimento Data de nascimento
     */
    protected Pessoa(String cpfPessoa, String nomePessoa, String logradouroEndereco,
                     String nroEndereco, String complementoEndereco, String bairroEndereco,
                     String cidadeEndereco, UfBrasil ufEndereco, String cepEndereco,
                     Date dataNascimento) {
        this();
        this.cpfPessoa = cpfPessoa;
        this.nomePessoa = nomePessoa;
        this.logradouroEndereco = logradouroEndereco;
        this.nroEndereco = nroEndereco;
        this.complementoEndereco = complementoEndereco;
        this.bairroEndereco = bairroEndereco;
        this.cidadeEndereco = cidadeEndereco;
        this.ufEndereco = ufEndereco;
        this.cepEndereco = cepEndereco;
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * Método para manter (inserir, alterar, excluir) os dados da pessoa.
     * Este é um método abstrato que deve ser implementado pelas classes filhas.
     */
    public abstract void manterPessoa();
    
    /**
     * Adiciona um telefone à lista de telefones da pessoa.
     * 
     * @param telefone Telefone a ser adicionado
     */
    public void adicionarTelefone(TelefonePessoa telefone) {
        if (telefone != null) {
            this.telefones.add(telefone);
        }
    }
    
    /**
     * Remove um telefone da lista de telefones da pessoa.
     * 
     * @param telefone Telefone a ser removido
     * @return true se o telefone foi removido, false caso contrário
     */
    public boolean removerTelefone(TelefonePessoa telefone) {
        return this.telefones.remove(telefone);
    }
    
    /**
     * Busca um telefone pelo número.
     * 
     * @param numero Número do telefone a ser buscado
     * @return O telefone encontrado ou null se não encontrar
     */
    public TelefonePessoa buscarTelefonePorNumero(String numero) {
        for (TelefonePessoa telefone : this.telefones) {
            if (telefone.getNumeroTelefone().equals(numero)) {
                return telefone;
            }
        }
        return null;
    }
    
    /**
     * Retorna uma cópia da lista de telefones.
     * 
     * @return Lista imutável de telefones
     */
    public List<TelefonePessoa> getTelefones() {
        return List.copyOf(this.telefones);
    }
    
    // Getters e Setters
    
    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        this.logradouroEndereco = logradouroEndereco;
    }

    public String getNroEndereco() {
        return nroEndereco;
    }

    public void setNroEndereco(String nroEndereco) {
        this.nroEndereco = nroEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public UfBrasil getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(UfBrasil ufEndereco) {
        this.ufEndereco = ufEndereco;
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * Retorna o endereço completo formatado.
     * 
     * @return String contendo o endereço completo
     */
    public String getEnderecoCompleto() {
        StringBuilder sb = new StringBuilder();
        sb.append(logradouroEndereco).append(", ").append(nroEndereco);
        
        if (complementoEndereco != null && !complementoEndereco.isBlank()) {
            sb.append(" - ").append(complementoEndereco);
        }
        
        sb.append(", ").append(bairroEndereco);
        sb.append(", ").append(cidadeEndereco);
        sb.append(" - ").append(ufEndereco.name());
        sb.append(", CEP: ").append(cepEndereco);
        
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpfPessoa, pessoa.cpfPessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfPessoa);
    }

    @Override
    public String toString() {
        return """
               Pessoa [
                 CPF: %s,
                 Nome: %s,
                 Data de Nascimento: %s,
                 Endereço: %s,
                 Telefones: %d
               ]
               """.formatted(cpfPessoa, nomePessoa, dataNascimento, getEnderecoCompleto(), telefones.size());
    }
}