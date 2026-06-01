package UNI5.ListaExercicios.L12;
public abstract class ArvoreBinariaAbstract<T> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinariaAbstract() {
        this.raiz = null;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    protected void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean pertence(T info) {
        return buscar(info) != null;
    }

    public abstract NoArvoreBinaria<T> buscar(T info);

    public String toString() {
        return arvorePre(raiz);
    }

    private String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        }
        String resultado = "<" + no.getInfo();
        resultado += arvorePre(no.getEsquerda());
        resultado += arvorePre(no.getDireita());
        resultado += ">";
        return resultado;
    }

    public int contarNos() {
        return contarNosPriv(raiz);
    }

    private int contarNosPriv(NoArvoreBinaria<T> no) {
        if (no == null) return 0;
        return 1 + contarNosPriv(no.getEsquerda()) + contarNosPriv(no.getDireita());
    }
}