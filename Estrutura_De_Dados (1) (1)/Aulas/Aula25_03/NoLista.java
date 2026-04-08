package Aulas.Aula25_03;


public class NoLista {
    private int info;
    private NoLista proximo; 
        public NoLista(int info) {
        this.info = info;
        this.proximo = null;
    }
    
    // Getters e Setters
    public int getInfo() {
        return info;
    }
    
    public void setInfo(int info) {
        this.info = info;
    }
    
    public NoLista getProximo() {
        return proximo;
    }
    
    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }
}