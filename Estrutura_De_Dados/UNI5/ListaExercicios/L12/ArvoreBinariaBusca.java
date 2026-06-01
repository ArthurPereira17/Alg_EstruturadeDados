package UNI5.ListaExercicios.L12;

public class ArvoreBinariaBusca<T extends Comparable<T>>
        extends ArvoreBinariaAbstract<T> {

    public void inserir(T info) {
        setRaiz(inserir(getRaiz(), info));
    }

    private NoArvoreBinaria<T> inserir(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return new NoArvoreBinaria<>(info);
        }

        int comparacao = info.compareTo(no.getInfo());

        if (comparacao < 0) {
            no.setEsquerda(inserir(no.getEsquerda(), info));
        } else if (comparacao > 0) {
            no.setDireita(inserir(no.getDireita(), info));
        }

        return no;
    }

    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(getRaiz(), info);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null) return null;

        int comparacao = info.compareTo(no.getInfo());

        if (comparacao == 0) return no;
        if (comparacao < 0) return buscar(no.getEsquerda(), info);
        return buscar(no.getDireita(), info);
    }

    public void remover(T info) {
        setRaiz(remover(getRaiz(), info));
    }

    private NoArvoreBinaria<T> remover(NoArvoreBinaria<T> no, T info) {
        if (no == null) return null;

        int comparacao = info.compareTo(no.getInfo());

        if (comparacao < 0) {
            no.setEsquerda(remover(no.getEsquerda(), info));
        } else if (comparacao > 0) {
            no.setDireita(remover(no.getDireita(), info));
        } else {
            if (no.getEsquerda() == null) return no.getDireita();

            if (no.getDireita() == null) return no.getEsquerda();


            NoArvoreBinaria<T> sucessor = menorNo(no.getDireita());
            no.setInfo(sucessor.getInfo());
            no.setDireita(remover(no.getDireita(), sucessor.getInfo()));
        }

        return no;
    }

    private NoArvoreBinaria<T> menorNo(NoArvoreBinaria<T> no) {
        while (no.getEsquerda() != null) {
            no = no.getEsquerda();
        }
        return no;
    }
}