package UNI2.Aulas.Aula04_08;

public class ArvoreBinaria<T> {

    private NoArvoreBinaria<T>  raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean pertence(T info){
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return false;
        }
        else if(no.getInfo() == info) {
            return true;
        }

        return pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
    }

    public String toString() {
        return arvorePre(raiz);
    }

    private String arvorePre(NoArvoreBinaria<T> no) {
        if(no == null){
            return "<>";
        }
        String resultado;

        resultado = "<" + no.getInfo();
        resultado = resultado + (arvorePre(no.getEsquerda()));
        resultado = resultado + (arvorePre(no.getDireita()));
        resultado = resultado + ">";

        return resultado;
    }

    public int contarNos() {
        return contarNosPriv(raiz);
    }

    private int contarNosPriv(NoArvoreBinaria<T> no){
        if (no == null) {
         return 0;   
        }
        else{
            return 1 + contarNosPriv(no.getEsquerda()) + contarNosPriv(no.getDireita());
        }
    }
}
