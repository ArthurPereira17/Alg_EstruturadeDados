package Aulas.Aula01_04;

public class FilaCheiaException extends RuntimeException {
    public FilaCheiaException() {
        super("A fila está cheia! Não é possível inserir elementos.");
    }

    public FilaCheiaException(String mensagem) {
        super(mensagem);
    }

    public FilaCheiaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
