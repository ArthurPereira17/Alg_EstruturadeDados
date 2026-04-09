package L04;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiro;
    private NoDuplo<T> ultimo;
    
    public ListaDuplamenteEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }
    
    public void inserir(T valor) {
        NoDuplo<T> novo = new NoDuplo<>(valor);
        
        if (estaVazia()) {
            ultimo = novo;
        } else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        
        primeiro = novo;
    }
    
    public boolean estaVazia() {
        return primeiro == null;
    }
    
    public NoDuplo<T> buscar(T valor) {
        NoDuplo<T> atual = primeiro;
        
        while (atual != null) {
            if (atual.getInfo().equals(valor)) {
                return atual;
            }
            atual = atual.getProximo();
        }
        
        return null;
    }
    
    public void retirar(T valor) {
        NoDuplo<T> noRemover = buscar(valor);
        
        if (noRemover != null) {
            if (noRemover.getAnterior() != null) {
                noRemover.getAnterior().setProximo(noRemover.getProximo());
            } else {
                primeiro = noRemover.getProximo();
            }
            
            if (noRemover.getProximo() != null) {
                noRemover.getProximo().setAnterior(noRemover.getAnterior());
            } else {
                ultimo = noRemover.getAnterior();
            }
        }
    }
    
    public void liberar() {
        NoDuplo<T> atual = primeiro;
        
        while (atual != null) {
            NoDuplo<T> proximo = atual.getProximo();
            atual.setAnterior(null);
            atual.setProximo(null);
            atual = proximo;
        }
        
        primeiro = null;
        ultimo = null;
    }
    
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        NoDuplo<T> atual = primeiro;
        
        while (atual != null) {
            resultado.append(atual.getInfo());
            if (atual.getProximo() != null) {
                resultado.append(",");
            }
            atual = atual.getProximo();
        }
        
        return resultado.toString();
    }
    
    public String toStringInvertido() {
        StringBuilder resultado = new StringBuilder();
        NoDuplo<T> atual = ultimo;
        
        while (atual != null) {
            resultado.append(atual.getInfo());
            if (atual.getAnterior() != null) {
                resultado.append(",");
            }
            atual = atual.getAnterior();
        }
        
        return resultado.toString();
    }
    
    public NoDuplo<T> getPrimeiro() {
        return primeiro;
    }
    
    public NoDuplo<T> getUltimo() {
        return ultimo;
    }
}