import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Alunos> listaAlunos;
    public Academia() {
        this.listaAlunos = new ArrayList<>();
    }
    public void adicionarAluno(Alunos aluno) {
        this.listaAlunos.add(aluno);
    }
    public void exibirListaAlunos() {
        for (Alunos aluno : listaAlunos) {
            aluno.mostrarAluno();
        }
    }

}