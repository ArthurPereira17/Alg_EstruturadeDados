package UNI5.Aulas.Aula_27_05;

import UNI2.Aulas.Aula04_08.NoArvoreBinaria;

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

    public abstract NoArvoreBinaria<T> buscar(T info);

    public boolean pertence(T info) {
        return buscar(info) != null;
    }

    public String toString(){
        return arvorePre(raiz);
    }

    private String arvorePre(NoArvoreBinaria<T> no){
        if (no == null) {
            return "<>";
        }
        return "<" + no.getInfo() + 
        arvorePre(no.getEsquerda()) + 
        arvorePre(no.getDireita()) + ">";
    }

    public int contarNos(){
        return contarNosPriv(raiz);
    }

    private int contarNosPriv(NoArvoreBinaria<T> no){
        if (no == null) {
            return 0;
        }
        return 1 + contarNosPriv(no.getEsquerda()) + contarNosPriv(no.getDireita());
    }
}
