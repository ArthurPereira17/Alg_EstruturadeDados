package Aulas.Aula01_04;

public class FilaVetor<T> implements Fila<T> {

    private T info[];
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite){
        info =  (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    public void inserir(T valor){
        if(tamanho == limite){
            throw new RuntimeException("Fila está cheia");
        }

        int posicaoInserir;

        posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;
    }

    public T peek(){
            if (estaVazia()) {
                throw new RuntimeException("Fila está vazia");
            }
            return info[inicio];
    }

    public T retirar(){
        T valor = peek();

        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public void liberar(){
        while (!estaVazia()) {
            retirar();
        }
    }

    public int getLimite() {
        return limite;
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
        FilaVetor<T> novaFila = new FilaVetor<>(limite);
        for (int i = 0; i < tamanho; i++){
            int posicao = (inicio + i) % limite;
            novaFila.inserir(info[posicao]);
        }
        return novaFila;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(",");
        for (int i = 0; i < tamanho; i++){
            int posicao = (inicio + i) % limite;
            sb.append(info[posicao]);
            if (i < tamanho - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
