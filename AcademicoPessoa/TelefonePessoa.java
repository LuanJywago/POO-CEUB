

/**
 * Classe que representa um telefone associado a uma pessoa no sistema acadêmico.
 * Cada pessoa pode ter um ou mais telefones de diferentes tipos.
 * 
 * @author Sistema Acadêmico
 * @version 1.0
 */
public class TelefonePessoa {
    
    // Atributos da classe
    private String numeroTelefone;
    private TipoFone tipoTelefone;
    
    /**
     * Construtor padrão da classe TelefonePessoa.
     */
    public TelefonePessoa() {
    }
    
    /**
     * Construtor completo da classe TelefonePessoa.
     * 
     * @param numeroTelefone Número do telefone (formato livre)
     * @param tipoTelefone Tipo do telefone (RESIDENCIAL, COMERCIAL, CELULAR, RECADO)
     */
    public TelefonePessoa(String numeroTelefone, TipoFone tipoTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.tipoTelefone = tipoTelefone;
    }
    
    /**
     * Método para adicionar um novo telefone.
     * Na prática, isso seria feito através de um serviço ou repositório.
     */
    public void adicionarTelefone() {
        System.out.println("Adicionando telefone: " + this);
        // Lógica para adicionar o telefone ao banco de dados ou outra fonte de dados
    }
    
    /**
     * Método para remover um telefone existente.
     * Na prática, isso seria feito através de um serviço ou repositório.
     */
    public void removerTelefone() {
        System.out.println("Removendo telefone: " + this);
        // Lógica para remover o telefone do banco de dados ou outra fonte de dados
    }
    
    /**
     * Método para alterar um telefone existente.
     * Na prática, isso seria feito através de um serviço ou repositório.
     * 
     * @param novoNumero Novo número de telefone
     * @param novoTipo Novo tipo de telefone
     */
    public void alterarTelefone(String novoNumero, TipoFone novoTipo) {
        System.out.println("Alterando telefone de: " + this);
        this.numeroTelefone = novoNumero;
        this.tipoTelefone = novoTipo;
        System.out.println("Para: " + this);
        // Lógica para alterar o telefone no banco de dados ou outra fonte de dados
    }
    
    /**
     * Método de sobrecarga para alterar apenas o número do telefone.
     * 
     * @param novoNumero Novo número de telefone
     */
    public void alterarTelefone(String novoNumero) {
        alterarTelefone(novoNumero, this.tipoTelefone);
    }
    
    /**
     * Método de sobrecarga para alterar apenas o tipo do telefone.
     * 
     * @param novoTipo Novo tipo de telefone
     */
    public void alterarTelefone(TipoFone novoTipo) {
        alterarTelefone(this.numeroTelefone, novoTipo);
    }
    
    // Getters e Setters
    
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public TipoFone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoFone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }
    

}