package Aulas.Aula25_03;

public class PilhaVetor {

    private int limite;
    private int tamanho;
    private int[] info;

    public PilhaVetor(int limite){
        this.limite = limite;
        this.tamanho = 0;
        this.info = new int[limite];
    }

    public void push(int valor){
        if(limite == tamanho){
            throw new RuntimeException("Pilha cheia");
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public int peek(){
        if(estaVazia()){
            throw new RuntimeException("Pilha está Vazia");
        }

        return info[tamanho - 1];
    }

    public int pop(){
        int valor;
        valor = peek();

        tamanho = tamanho - 1;
        return valor;
    }

    public boolean estaVazia(){
        return tamanho == 0;  
    }

}