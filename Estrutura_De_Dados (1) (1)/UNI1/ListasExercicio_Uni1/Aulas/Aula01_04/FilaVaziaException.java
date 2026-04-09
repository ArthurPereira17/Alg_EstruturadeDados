package Aulas.Aula01_04;

public class FilaVaziaException extends RuntimeException {
    public FilaVaziaException() {
        super("A fila está vazia! Não é possível remover ou acessar elementos.");
    }

    public FilaVaziaException(String mensagem) {
        super(mensagem);
    }

    public FilaVaziaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
