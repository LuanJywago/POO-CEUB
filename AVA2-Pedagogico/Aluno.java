import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private String turma;
    private List<Atividade> atividades;

    public Aluno(String nome, String turma) {
        super(nome);
        this.turma = turma;
        this.atividades = new ArrayList<>();
    }
    
 public void adicionarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public String getTurma() {
        return turma;
    }
}

