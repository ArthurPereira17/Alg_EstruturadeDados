package Aulas.Aula25_03;

public class ListaEncadeada {
    private NoLista primeiro;
    

    public ListaEncadeada() {
        this.primeiro = null;
    }
    
    public boolean estaVazia() {
        return primeiro == null;
    }
    
    public void inserir(int valor) {
        NoLista novo = new NoLista(valor);
        
        novo.setProximo(primeiro);
        
        this.primeiro = novo;
    }

    public void exibir() {
        NoLista p = primeiro;
        
        while (p != null) {
            System.out.print(p.getInfo());
            if (p.getProximo() != null) {
                System.out.print(" ");
            }
            p = p.getProximo();
        }
        System.out.println();
    }
    
    public NoLista buscar(int valor) {
        NoLista p = primeiro;
        
        while (p != null) {
            if (p.getInfo() == valor) {
                return p; 
            }
            p = p.getProximo();
        }
        
        return null;
    }

    public void retirar(int valor) {
        NoLista anterior = null;
        NoLista p = primeiro;
        
        while (p != null && p.getInfo() != valor) {
            anterior = p;
            p = p.getProximo();
        }
        
        if (p != null) {
            if (p == primeiro) {
                primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }
    }

    public int obterComprimento() {
        int comprimento = 0;
        NoLista p = primeiro;
        
        while (p != null) {
            comprimento++;
            p = p.getProximo();
        }
        
        return comprimento;
    }
    

    public NoLista getPrimeiro() {
        return primeiro;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        NoLista p = primeiro;
        
        while (p != null) {
            resultado.append(p.getInfo());
            if (p.getProximo() != null) {
                resultado.append(",");
            }
            p = p.getProximo();
        }
        
        return resultado.toString();
    }
}