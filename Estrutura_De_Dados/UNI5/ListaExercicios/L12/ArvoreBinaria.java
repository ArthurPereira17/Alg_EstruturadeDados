package UNI5.ListaExercicios.L12;
public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {

    @Override
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        super.setRaiz(raiz);
    }

    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(getRaiz(), info);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null) return null;
        if (no.getInfo().equals(info)) return no;

        NoArvoreBinaria<T> encontrado = buscar(no.getEsquerda(), info);
        if (encontrado != null) return encontrado;

        return buscar(no.getDireita(), info);
    }
}