package L06;

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
            throw new FilaCheiaException();
        }

        int posicaoInserir;

        posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;
    }

    public T peek(){
            if (estaVazia()) {
                throw new FilaVaziaException("Fila está vazia");
            }
            return (T) info[inicio];
    }

    public T retirar(){
        T valor = peek();
        info[inicio] = null;

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
        FilaVetor<T> resultado = new FilaVetor<>(this.limite + f2.limite);
        
        int posicao = this.inicio;
        for (int i = 0; i < this.tamanho; i++) {
            resultado.inserir((T) this.info[posicao]);
            posicao = (posicao + 1) % this.limite;
        }
        
        posicao = f2.inicio;
        for (int i = 0; i < f2.tamanho; i++) {
            resultado.inserir((T) f2.info[posicao]);
            posicao = (posicao + 1) % f2.limite;
        }
        
        return resultado;
    }

    @Override
    public String toString() {
        String concatenacao = "";

        for (int i = 0; i < tamanho; i++) {
            int pos = (inicio + i) % limite;
            concatenacao += info[pos];

            if (i != tamanho - 1) {
                concatenacao += ",";
            }
        }

        return concatenacao;
    }
}
