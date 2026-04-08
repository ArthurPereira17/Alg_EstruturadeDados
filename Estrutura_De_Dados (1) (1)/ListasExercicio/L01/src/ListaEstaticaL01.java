public class ListaEstaticaL01 {
    private int[] info;
    private int tamanho;

    public ListaEstaticaL01() {
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar() {
        int[] novoInfo = new int[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novoInfo[i] = info[i];
        }
        info = novoInfo;
    }

    public void inserir(int valor) {
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

    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor) {
        int posicao = buscar(valor);
        if (posicao != -1) {
            for (int i = posicao; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return info[posicao];
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
}