package L05;

public class PilhaVetor<T> implements Pilha<T> {

    private int limite;
    private int tamanho;
    private T[] info;

    public PilhaVetor(int limite) {
        if (limite <= 0) {
            throw new IllegalArgumentException("A capacidade da pilha deve ser maior que zero.");
        }
        this.limite = limite;
        this.tamanho = 0;
        this.info = (T[]) new Object[limite];
    }

    @Override
    public void push(T valor) {
        if (tamanho == limite) {
            throw new PilhaCheiaException("Capacidade máxima atingida: " + limite);
        }
        info[tamanho] = valor;
        tamanho++;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException("Não é possível consultar o topo de uma pilha vazia.");
        }
        return info[tamanho - 1];
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException("Não é possível remover elemento de uma pilha vazia.");
        }
        T valor = info[tamanho - 1];
        tamanho--;
        return valor;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        for (int i = 0; i < tamanho; i++) {
            info[i] = null;
        }
        tamanho = 0;
    }
    
    public boolean estaCheia() {
        return tamanho == limite;
    }
    
    public int getLimite() {
        return limite;
    }

    public void concatenar(PilhaVetor<T> p){
        
        if(this.tamanho + p.tamanho > this.limite){
            throw new PilhaCheiaException("Sem capacidade");
        }

        PilhaVetor<T> aux = new PilhaVetor<>(p.limite);

        while(!p.estaVazia()){
            aux.push((T) p.pop());
        }

        while(!aux.estaVazia()){
            T valor = (T) aux.pop();
            p.push(valor);
            this.push(valor);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (int i = tamanho - 1; i >= 0; i--) {
            resultado.append(info[i]);
            if (i > 0) {
                resultado.append(",");
            }
        }
        return resultado.toString();
    }
}