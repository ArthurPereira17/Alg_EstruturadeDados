package UNI5.Aulas.Aula_27_05;

public class BuscaBinaria<T extends Comparable<T>> extends BuscaAbstract<T> {

    @Override
    public int buscar(T valor) {
        T[] vetor = getInfo();

        if (vetor == null || vetor.length == 0) {
            return -1;
        }

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio].equals(valor)) {
                return meio;
            }
            if (vetor[meio].compareTo(valor) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

}
