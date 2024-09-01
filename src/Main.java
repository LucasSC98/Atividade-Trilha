public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia();

        Alunos aluno = new Alunos("Lucas", 26, 80, 1.79);
        Alunos aluno2 = new Alunos("Maria", 17, 60, 1.65);
        Alunos aluno3 = new Alunos("João", 30, 90, 1.75);
        Alunos aluno4 = new Alunos("Ana", 24, 55, 1.70);
        Alunos aluno5 = new Alunos("Pedro", 28, 135, 1.85);
        Alunos aluno6 = new Alunos("Carla", 27, 70, 1.68);
        Alunos aluno7 = new Alunos("Luana", 17, 50, 1.65);


        academia.adicionarAluno(aluno);
        academia.adicionarAluno(aluno2);
        academia.adicionarAluno(aluno3);
        academia.adicionarAluno(aluno4);
        academia.adicionarAluno(aluno5);
        academia.adicionarAluno(aluno6);
        academia.adicionarAluno(aluno7);


        academia.exibirListaAlunos();


    }
}
