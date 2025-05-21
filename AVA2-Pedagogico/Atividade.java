public class Atividade {
private String titulo;
    private String descricao;
    private double nota;

    public Atividade(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nota = 0.0; 
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getNota() {
        return nota;
    }

    public String getDescricao() {
        return descricao;
    }
}