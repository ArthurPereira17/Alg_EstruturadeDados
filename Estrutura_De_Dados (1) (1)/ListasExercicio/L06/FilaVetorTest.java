package L06;

public class FilaVetorTest {
    public static void main(String[] args) {
        
        System.out.println("Caso 1:");
        FilaVetor<Integer> f1 = new FilaVetor<>(5);

        System.out.println(f1.estaVazia());


        System.out.println("Caso 2:");

        FilaVetor<Integer> f2 = new FilaVetor<>(5);
        f2.inserir(10);

        System.out.println(f2.estaVazia());


        System.out.println("Caso 3:");
        FilaVetor<Integer> f3 = new FilaVetor<>(10);
        
        f3.inserir(10);
        f3.inserir(20);
        f3.inserir(30);

        System.out.println(f3.retirar());
        System.out.println(f3.retirar());
        System.out.println(f3.retirar());
        System.out.println(f3.estaVazia());


        System.out.println("Caso 4:");
        FilaVetor<Integer> f4 = new FilaVetor<>(3);
        f4.inserir(10);
        f4.inserir(20);
        f4.inserir(30);
        try{
            f4.inserir(40);
        } catch (FilaCheiaException e){
            System.out.println(e.getMessage());
        }


        System.out.println("Caso 5:");
        FilaVetor<Integer> f5 = new FilaVetor<>(5);
        try{
            f5.retirar();
        } catch (FilaVaziaException e){
            System.out.println(e.getMessage());
        }


        System.out.println("Caso 6:");
        FilaVetor<Integer> f6 = new FilaVetor<>(5);
        f6.inserir(10);
        f6.inserir(20);
        f6.inserir(30);

        System.out.println(f6.peek());
        System.out.println(f6.retirar());


        System.out.println("Caso 7:");
        FilaVetor<Integer> f7 = new FilaVetor<>(5);
        f7.inserir(10);
        f7.inserir(20);
        f7.inserir(30);

        f7.liberar();
        System.out.println(f7.estaVazia());


        System.out.println("Caso 8:");
        FilaVetor<Integer> f8 = new FilaVetor<>(5);
        f8.inserir(10);
        f8.inserir(20);
        f8.inserir(30);

        FilaVetor<Integer> f9 = new FilaVetor<>(3);
        f9.inserir(40);
        f9.inserir(50);

        FilaVetor<Integer> f10 = f8.criarFilaConcatenada(f9);

        System.out.println(f10.toString());
        System.out.println(f10.getLimite());
    }
}
