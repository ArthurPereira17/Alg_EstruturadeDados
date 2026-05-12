package Aulas.Aula25_03;

public class PilhaLista implements Pilha {
    private ListaEncadeada lista;
    private NoLista topo;

    public PilhaLista() {
        this.lista = new ListaEncadeada();
        this.topo = null;
    }

    public void push(int info){
        lista.inserir(info);
    }

    public int peek(){
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        return lista.getPrimeiro().getInfo();
    }

    public int pop(){
        int valor;
        valor = peek();
        lista.retirar(valor);
        
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
