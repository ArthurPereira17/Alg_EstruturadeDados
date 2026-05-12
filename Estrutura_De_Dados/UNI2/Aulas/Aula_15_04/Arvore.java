package UNI2.Aulas.Aula_15_04;

public class Arvore<T> {
    private NoArvore<T> raiz;

    public Arvore(){
        this.raiz = null;
    }
    
    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }
    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public boolean pertence(T info){
        if (raiz == null) {
            return false;
        }else {
            return pertence(this.raiz, info);
        }
    }
    private boolean pertence(NoArvore<T> no, T info){
        if (no.getInfo().equals(info)) {
            return true;
        }
        else if (no.getPrimeiro() != null){
            NoArvore<T> p = no.getPrimeiro();
            while(p != null){
                if (pertence(p, info)){
                    return true;
                }
                p = p.getProximo();
            }
            return false;
        }
        return false;
    }

    public String toString(){
        if (raiz == null) {
            return "";
        }else {
            return obterRepTextual(this.raiz);
        }   
    }

    private String obterRepTextual(NoArvore<T> no){
        String s = "<";
        
        s = s + no.getInfo();

        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            s = s + obterRepTextual(p);
            p = p.getProximo();
        }
        s = s + ">";
        return s;
    }

    public int contarNos(){
        if (raiz == null){
            return 0;
        }else {
        return contarNos(this.raiz);
    }
    }

    private int contarNos(NoArvore<T> no){
        int total = 1;

        NoArvore<T> p = no.getPrimeiro();

        while (p != null) {
            total += contarNos(p);
            p = p.getProximo();
        }
        return total;
    }


}