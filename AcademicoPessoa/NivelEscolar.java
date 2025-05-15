/**
 * Enumeração que representa os níveis de escolaridade oficiais do Brasil.
 * Cada constante contém o nome do nível escolar e sua descrição.
 * 
 * @author Sistema Acadêmico
 * @version 1.0
 */
public enum NivelEscolar {
    FUNDAMENTAL_INCOMPLETO("Ensino Fundamental Incompleto"),
    FUNDAMENTAL_COMPLETO("Ensino Fundamental Completo"),
    MEDIO_INCOMPLETO("Ensino Médio Incompleto"),
    MEDIO_COMPLETO("Ensino Médio Completo"),
    SUPERIOR_INCOMPLETO("Ensino Superior Incompleto"),
    SUPERIOR_COMPLETO("Ensino Superior Completo"),
    ESPECIALIZACAO("Especialização"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado"),
    POS_DOUTORADO("Pós-Doutorado");

    private final String DESCRICAO;

    /**
     * Construtor do enum NivelEscolar.
     * 
     * @param descricao Descrição do nível escolar
     */
    NivelEscolar(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    /**
     * Retorna a descrição do nível escolar.
     * 
     * @return Descrição do nível escolar
     */
    public String getDescricao() {
        return DESCRICAO;
    }

    @Override
    public String toString() {
        return DESCRICAO;
    }
}