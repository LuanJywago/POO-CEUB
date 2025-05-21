public class Professor extends Usuario {
    private String matricula;

    public Professor(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }
}
