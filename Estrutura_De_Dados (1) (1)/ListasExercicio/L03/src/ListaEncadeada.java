public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
    
    public ListaEncadeada() {
        this.primeiro = null;
    }
    
    public NoLista<T> getPrimeiro() {
        return primeiro;
    }
    
    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<>(valor);
        novo.setProximo(primeiro);
        primeiro = novo;
    }
    
    public boolean estaVazia() {
        return primeiro == null;
    }
    
    public NoLista<T> buscar(T valor) {
        NoLista<T> atual = primeiro;
        
        while (atual != null) {
            if (atual.getInfo().equals(valor)) {
                return atual;
            }
            atual = atual.getProximo();
        }
        
        return null;
    }
    
    public void retirar(T valor) {
        NoLista<T> anterior = null;
        NoLista<T> atual = primeiro;
        
        while (atual != null && !atual.getInfo().equals(valor)) {
            anterior = atual;
            atual = atual.getProximo();
        }
        
        if (atual != null) {
            if (anterior == null) {
                primeiro = atual.getProximo();
            } else {
                anterior.setProximo(atual.getProximo());
            }
        }
    }
    
    public int obterComprimento() {
        int comprimento = 0;
        NoLista<T> atual = primeiro;
        
        while (atual != null) {
            comprimento++;
            atual = atual.getProximo();
        }
        
        return comprimento;
    }
    
    public NoLista<T> obterNo(int posicao) {
        if (posicao < 0) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        
        NoLista<T> atual = primeiro;
        int contador = 0;
        
        while (atual != null && contador < posicao) {
            atual = atual.getProximo();
            contador++;
        }
        
        if (atual == null) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        
        return atual;
    }
    
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        NoLista<T> atual = primeiro;
        
        while (atual != null) {
            resultado.append(atual.getInfo());
            if (atual.getProximo() != null) {
                resultado.append(",");
            }
            atual = atual.getProximo();
        }
        
        return resultado.toString();
    }
}