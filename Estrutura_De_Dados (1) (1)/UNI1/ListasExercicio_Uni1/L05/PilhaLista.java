package L05;

public class PilhaLista<T> implements Pilha {
    
    private ListaEncadeada<T> lista;
    private NoLista<T> topo;

    public PilhaLista(ListaEncadeada<T> lista) {
        this.lista = lista;
    }
    
    @Override
    public void push(Object info){
        lista.inserir((T)info);
    }

    @Override
    public Object peek(){
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        return lista.obterNo(0);
    }

    public Object pop(){
        if(lista.estaVazia()){
            throw new PilhaVaziaException();
        }
        Object valor;
        valor = peek();
        lista.retirar((T)valor);
        return valor;
    }

    public boolean estaVazia(){
        return lista.estaVazia();
    }

    public void liberar(){
        while (!estaVazia()) {
            pop();
        }
    }

}
