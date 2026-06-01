package UNI5.ListaExercicios.L12;
public class BuscaLinearVetorOrdenado<T extends Comparable<T>> extends BuscaAbstract<T> {

    @Override
    public int buscar(T valor) {
        T[] vetor = getInfo();

        if (vetor == null) {
            return -1;
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(valor)) {
                return i;
            }
            if (vetor[i].compareTo(valor) > 0) {
                return -1;
            }
        }
        return -1;
    }

}
