package UNI5.ListaExercicios.L12;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

    public void inserir(T info) {
        NoArvoreBinaria<T> novoNo = new NoArvoreBinaria<>(info);
        if (estaVazia()) {
            setRaiz(novoNo);
        } else {
            inserirRecursivo(getRaiz(), novoNo);
        }
    }

    private void inserirRecursivo(NoArvoreBinaria<T> atual, NoArvoreBinaria<T> novo) {
        if (novo.getInfo().compareTo(atual.getInfo()) < 0) {
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(novo);
            } else {
                inserirRecursivo(atual.getEsquerda(), novo);
            }
        } else {
            if (atual.getDireita() == null) {
                atual.setDireita(novo);
            } else {
                inserirRecursivo(atual.getDireita(), novo);
            }
        }
    }

    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscarRecursivo(getRaiz(), info);
    }

    private NoArvoreBinaria<T> buscarRecursivo(NoArvoreBinaria<T> no, T info) {
        if (no == null) return null;

        int comparacao = info.compareTo(no.getInfo());
        if (comparacao == 0) return no;
        else if (comparacao < 0) return buscarRecursivo(no.getEsquerda(), info);
        else return buscarRecursivo(no.getDireita(), info);
    }

public void retirar(T valor) {
        if (estaVazia()) return;

        NoArvoreBinaria<T> p = getRaiz();
        NoArvoreBinaria<T> pai = null;
        boolean filhoEsquerda = false;

        while (p != null && !p.getInfo().equals(valor)) {
            pai = p;
            if (valor.compareTo(p.getInfo()) < 0) {
                filhoEsquerda = true;
                p = p.getEsquerda();
            } else {
                filhoEsquerda = false;
                p = p.getDireita();
            }
        }

        if (p == null) return;

        if (p.getEsquerda() == null && p.getDireita() == null) {
            if (p == getRaiz()) {
                setRaiz(null);
            } else if (filhoEsquerda) {
                pai.setEsquerda(null);
            } else {
                pai.setDireita(null);
            }
        } 
        else if (p.getEsquerda() == null || p.getDireita() == null) {
            NoArvoreBinaria<T> filho = (p.getEsquerda() != null) ? p.getEsquerda() : p.getDireita();

            if (p == getRaiz()) {
                setRaiz(filho);
            } else if (filhoEsquerda) {
                pai.setEsquerda(filho);
            } else {
                pai.setDireita(filho);
            }
        } 
        else {
            NoArvoreBinaria<T> sucessor = extrairSucessor(p);

            if (p == getRaiz()) {
                setRaiz(sucessor);
            } else if (filhoEsquerda) {
                pai.setEsquerda(sucessor);
            } else {
                pai.setDireita(sucessor);
            }

            sucessor.setEsquerda(p.getEsquerda());
        }
    }

    private NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> p) {
        NoArvoreBinaria<T> paiSucessor = p;
        NoArvoreBinaria<T> sucessor = p.getDireita();
        NoArvoreBinaria<T> atual = p.getDireita();

        while (atual != null) {
            paiSucessor = sucessor;
            sucessor = atual;
            atual = atual.getEsquerda();
        }

        if (sucessor != p.getDireita()) {
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(p.getDireita());
        }

        return sucessor;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}