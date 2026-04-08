public class ListaEstaticaL02<T>{

    private Object[] info;
    private int tamanho;

    public ListaEstaticaL02(int tamanho){
        this.tamanho = tamanho;
    }

    public ListaEstaticaL02() {
        info = new Object[10];
        tamanho = 0;
    }

    private void redimensionar() {
        Object[] novoInfo = new Object[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novoInfo[i] = info[i];
        }
        info = novoInfo;
    }

    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(info[i]);
            if (i < tamanho - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public int buscar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor) {
        int posicao = buscar(valor);
        if (posicao != -1) {
            for (int i = posicao; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            info[tamanho - 1] = null;
            tamanho--;
        }
    }

    public void liberar() {
        info = new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return (T) info[posicao];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            resultado.append(info[i]);
            if (i < tamanho - 1) {
                resultado.append(",");
            }
        }
        return resultado.toString();
    }

public void inverter() {
    int inicio = 0;
    int fim = tamanho - 1;
    
    while (inicio < fim) {
        Object temp = info[inicio];
        info[inicio] = info[fim];
        info[fim] = temp;
        
        inicio++;
        fim--;
    }
}
}