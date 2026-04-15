package L05;

public class PilhaCheiaException extends RuntimeException {
    
    public PilhaCheiaException() {
        super("A pilha está cheia! Não é possível adicionar mais elementos.");
    }
    
    public PilhaCheiaException(String mensagem) {
        super(mensagem);
    }
    
    public PilhaCheiaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}