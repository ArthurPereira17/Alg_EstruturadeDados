package L05;

public class PilhaListaTest{
    public static void main(String[] args) {
        
        System.out.println("Caso 1:");
        PilhaLista<Integer> pl1 = new PilhaLista<>(new ListaEncadeada<>());
        System.out.println(pl1.estaVazia());
        
        
        System.out.println("Caso 2:");
        PilhaLista<Integer> pl2 = new PilhaLista<>(new ListaEncadeada<>());
        pl2.push(10);
        
        System.out.println(pl2.estaVazia());
        
        
        System.out.println("Caso 3:");
        PilhaLista<Integer> pl3 = new PilhaLista<>(new ListaEncadeada<>());
        pl3.push(10);
        pl3.push(20);
        pl3.push(30);
        
        System.out.println(pl3.pop());
        System.out.println(pl3.pop());
        System.out.println(pl3.pop());
        
        System.out.println(pl3.estaVazia());
        
        
        System.out.println("Caso 4: ");
        PilhaLista<Integer> pl4 = new PilhaLista<>(new ListaEncadeada<>());
        
        pl4.push(10);
        pl4.push(20);
        pl4.push(30);
        
        System.out.println(pl4.peek());
        
        System.out.println(pl4.pop());
        
        
        System.out.println("Caso 5:");
        PilhaLista<Integer> pl5 = new PilhaLista<>(new ListaEncadeada<>());
        
        pl5.push(10);
        pl5.push(20);
        pl5.push(30);
        
        pl5.liberar();
        
        System.out.println(pl5.estaVazia());

    }
}