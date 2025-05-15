/**
 * Enumeração que representa os tipos de telefone que uma pessoa pode ter.
 * Cada constante contém uma descrição do tipo de telefone.
 * 
 * @author Sistema Acadêmico
 * @version 1.0
 */
public enum TipoFone {
    RESIDENCIAL("Telefone Residencial"),
    COMERCIAL("Telefone Comercial"),
    CELULAR("Telefone Celular"),
    RECADO("Telefone para Recados");

    private final String descricao;

    /**
     * Construtor do enum TipoFone.
     * 
     * @param descricao Descrição do tipo de telefone
     */
    TipoFone(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a descrição do tipo de telefone.
     * 
     * @return Descrição do tipo de telefone
     */
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}