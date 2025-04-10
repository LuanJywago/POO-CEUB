public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String cidade;
    private String estado;
    private String cep;
    private String bairro;

    
    public Cliente(String nome, String cpf, String endereco, String telefone, String cidade, String estado, String cep, String bairro) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.bairro = bairro;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEndereco() {
        return endereco;
    }
}
