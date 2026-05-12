import Aulas.Aula_06_05.Aluno;

public class Aluno {

    private int matricula;
    private String nome;
    private Aluno proximo;

    public Aluno (int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno getProximo() {
        return proximo;
    }
    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
