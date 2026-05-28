package UNI5.Aulas.Aula_27_05;

public class BuscaLinear<T> extends BuscaAbstract<T> {

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
        }
        return -1;
    }

}
