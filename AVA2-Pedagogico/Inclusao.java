import java.util.ArrayList;
import java.util.List;

public class Inclusao {
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Inclusao() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarAtividadeAluno(Aluno aluno, Atividade atividade) {
        aluno.adicionarAtividade(atividade);
    }

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void lancarNota(Aluno aluno, String tituloAtividade, double nota){
        nota.add(nota);// Preciso usar um sistema de comparação que ainda não sei.
    }
}
