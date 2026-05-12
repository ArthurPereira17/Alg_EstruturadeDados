import Aulas.Aula_06_05.Aluno;

public class App {
    public static void main(String[] args) {
        Aluno umAluno;
        Aluno outrAluno;

        umAluno = new Aluno(1, "Ana");
        outrAluno = (new Aluno(2, "Pedro"));
        umAluno.setProximo(outrAluno);

        outrAluno = new Aluno(2, "Juan");
        outrAluno.setProximo(umAluno);

        outrAluno = umAluno;
        while (outrAluno != null) {
            System.out.println(outrAluno);
            outrAluno = outrAluno.getProximo();
        }
    }
}
