package Aulas.Aula_20_05;

public class MergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    @Override
    public void ordenar(){
        int n = getInfo().length - 1;
        mergeSort(0, n);
    }

    private void mergeSort(int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, fim, meio);
        }
    }

    private void merge(int inicio, int fim, int meio){
        int tamEsquerda = meio - inicio + 1;
        T[] esquerda = (T[]) new Comparable[tamEsquerda];
        for(int i = 0; i < tamEsquerda; i++){
            esquerda[i] = getInfo()[inicio + i];
        }

        int tamDireita = fim - meio;
        T[] direita = (T[]) new Comparable[tamDireita];
        for(int i = 0; i < tamDireita; i++){
            direita[i] = getInfo()[meio + 1 + i];
        }

        int cEsq = 0;
        int cDir = 0;
        int i = inicio;

        while(cEsq < tamEsquerda && cDir < tamDireita){
            if (esquerda[cEsq].compareTo(direita[cDir]) <= 0){
                getInfo()[i++] = esquerda[cEsq++];
            } else{
                getInfo()[i++] = direita[cDir++];
            }
        }

            while (cEsq < tamEsquerda){
                getInfo()[i++] = esquerda[cEsq++];
            }
            while (cDir < tamDireita){
                getInfo()[i++] = direita[cDir++];
            }
        }
}
