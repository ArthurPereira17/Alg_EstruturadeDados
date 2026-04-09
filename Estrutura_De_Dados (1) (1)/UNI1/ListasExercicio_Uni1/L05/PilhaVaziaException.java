package L05;

public class PilhaVaziaException extends RuntimeException {
    
    public PilhaVaziaException() {
        super("A pilha está vazia! Não é possível remover ou acessar elementos.");
    }
    
    public PilhaVaziaException(String mensagem) {
        super(mensagem);
    }
    
    public PilhaVaziaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

