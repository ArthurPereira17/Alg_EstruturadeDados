package Aulas.Aula25_03;

public class App {
    public static void main(String[] args) {
        
        PilhaLista p1 = new PilhaLista();
        PilhaVetor p2 = new PilhaVetor(10);

        p1.push(10);
        p1.push(20);
        p1.push(30);

        p2.push(25);
        p2.push(35);
        p2.push(40);

        System.out.println(p1.peek() + " " + p2.peek());
        System.out.println(p1.pop() + " " + p2.pop());
        System.out.println(p1.peek() + " " + p2.peek());
        System.out.println(p1.estaVazia() + " " + p2.estaVazia());
        System.out.println(p1.toString() + " " + p2.toString());
    }
}
