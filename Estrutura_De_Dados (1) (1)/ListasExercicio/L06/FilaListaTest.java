package L06;

public class FilaListaTest {
    public static void main(String[] args) {
        

        System.out.println("Caso 1: ");
        FilaLista<Integer> fl1 = new FilaLista<>();
        System.out.println(fl1.estaVazia());

        
        System.out.println("Caso 2: ");
        FilaLista<Integer> fl2 = new FilaLista<>();
        
        fl2.inserir(10);
        System.out.println(fl2.estaVazia());


        System.out.println("Caso 3: ");
        FilaLista<Integer> fl3 = new FilaLista<>();
        fl3.inserir(10);
        fl3.inserir(20);
        fl3.inserir(30);

        System.out.println(fl3.retirar());
        System.out.println(fl3.retirar());
        System.out.println(fl3.retirar());

        System.out.println(fl3.estaVazia());


        System.out.println("Caso 4: ");
        FilaLista<Integer> fl4 = new FilaLista<>();
        fl4.inserir(10);
        fl4.inserir(20);
        fl4.inserir(30);

        System.out.println(fl4.peek());
        System.out.println(fl4.retirar());


        System.out.println("Caso 5: ");
        FilaLista<Integer> fl5 = new FilaLista<>();
        fl5.inserir(10);
        fl5.inserir(20);
        fl5.inserir(30);

        fl5.liberar();

        System.out.println(fl5.estaVazia());
    }
}
