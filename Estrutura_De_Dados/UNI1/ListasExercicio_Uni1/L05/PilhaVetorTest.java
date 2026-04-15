package L05;

public class PilhaVetorTest {
    public static void main(String[] args) {
        System.out.println("Caso 1:");
        PilhaVetor<Integer> pilha = new PilhaVetor<>(10);
        System.out.println(pilha.estaVazia());

        System.out.println("Caso 2:");
        PilhaVetor<Integer> pilha2 = new PilhaVetor<>(5);
        pilha2.push(10);
        System.out.println(pilha2.estaVazia());

        System.out.println("Caso 3:");
        PilhaVetor<Integer> pilha3 = new PilhaVetor<>(10);
        pilha3.push(10);
        pilha3.push(20);
        pilha3.push(30);

        System.out.println(pilha3.pop());
        System.out.println(pilha3.pop());
        System.out.println(pilha3.pop());

        System.out.println(pilha3.estaVazia());

        System.out.println("Caso 4:");
        PilhaVetor<Integer> pilha4 = new PilhaVetor<>(3);

        try {
        pilha4.push(10);
        pilha4.push(20);
        pilha4.push(30);
        pilha4.push(40);
        } catch (PilhaCheiaException e) {
            System.out.println("Exceção Lançada");
        }

        System.out.println("Caso 5:");
        PilhaVetor<Integer> pilha5 = new PilhaVetor<>(10);

        try{
            pilha5.pop();
        }catch(PilhaVaziaException e){
            System.out.println("Exceção Lançada");
        }

        System.out.println("Caso 6:" );
        PilhaVetor<Integer> pilha6 = new PilhaVetor<>(5);

        pilha6.push(10);
        pilha6.push(20);
        pilha6.push(30);

        System.out.println(pilha6.peek());

        System.out.println(pilha6.pop());

        System.out.println("Caso 7:");
        PilhaVetor<Integer> pilha7 = new PilhaVetor<>(5);

        pilha7.push(10);
        pilha7.push(20);
        pilha7.push(30);

        pilha7.liberar();
        System.out.println(pilha7.estaVazia());

        System.out.println("Caso 8:");

        PilhaVetor<Integer> pilha8 = new PilhaVetor<>(5);
        PilhaVetor<Integer> pilha9 = new PilhaVetor<>(5);

        pilha8.push(10);
        pilha8.push(20);
        pilha8.push(30);

        pilha9.push(40);
        pilha9.push(50);

        pilha8.concatenar(pilha9);

        System.out.println(pilha8.toString());
    }
}
