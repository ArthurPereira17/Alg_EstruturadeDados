package L04;

public class NoDuplo<T> {
    private T info;
    private NoDuplo<T> anterior;
    private NoDuplo<T> proximo;
    
    // Construtor
    public NoDuplo(T info) {
        this.info = info;
        this.anterior = null;
        this.proximo = null;
    }
    
    // Getters e Setters
    public T getInfo() {
        return info;
    }
    
    public void setInfo(T info) {
        this.info = info;
    }
    
    public NoDuplo<T> getAnterior() {
        return anterior;
    }
    
    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }
    
    public NoDuplo<T> getProximo() {
        return proximo;
    }
    
    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }
}