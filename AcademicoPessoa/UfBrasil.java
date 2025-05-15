/**
 * Enumeração que representa as Unidades Federativas do Brasil.
 * Cada constante contém a sigla e o nome completo do estado.
 * 
 * @author Sistema Acadêmico
 * @version 1.0
 */
public enum UfBrasil {
    AC("Acre"),
    AL("Alagoas"),
    AP("Amapá"),
    AM("Amazonas"),
    BA("Bahia"),
    CE("Ceará"),
    DF("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    MG("Minas Gerais"),
    PA("Pará"),
    PB("Paraíba"),
    PR("Paraná"),
    PE("Pernambuco"),
    PI("Piauí"),
    RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    RO("Rondônia"),
    RR("Roraima"),
    SC("Santa Catarina"),
    SP("São Paulo"),
    SE("Sergipe"),
    TO("Tocantins");

    private final String nome;

    /**
     * Construtor do enum UfBrasil.
     * 
     * @param nome Nome completo da UF
     */
    UfBrasil(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o nome completo da UF.
     * 
     * @return Nome completo da UF
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a sigla da UF.
     * 
     * @return Sigla da UF (ex: SP, RJ)
     */
    public String getSigla() {
        return this.name();
    }

    @Override
    public String toString() {
        return this.name() + " - " + nome;
    }
}