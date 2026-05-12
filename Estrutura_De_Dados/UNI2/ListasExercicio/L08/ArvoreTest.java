package UNI2.ListasExercicio.L08;

import UNI2.Aulas.Aula_15_04.Arvore;
import UNI2.Aulas.Aula_15_04.NoArvore;

public class ArvoreTest {
    
    private static Arvore<Integer> definirArvore(){
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);

        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilho(no7);
        no2.inserirFilho(no6);
        no2.inserirFilho(no5);

        NoArvore<Integer> no8 = new NoArvore<Integer>(8);
        NoArvore<Integer> no3 = new NoArvore<Integer>(3);
        no3.inserirFilho(no8);

        NoArvore<Integer> no9 = new NoArvore<Integer>(9);
        NoArvore<Integer> no10 = new NoArvore<Integer>(10);
        NoArvore<Integer> no4 = new NoArvore<Integer>(4);
        no4.inserirFilho(no10);
        no4.inserirFilho(no9);

        NoArvore<Integer> no1 = new NoArvore<Integer>(1);
        no1.inserirFilho(no4);
        no1.inserirFilho(no3);
        no1.inserirFilho(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);
        return arvore;
    }

    public static void main(String[] args) {

        System.out.println("Teste 1: Validar representação textual ");
        definirArvore();
        System.out.println(definirArvore().toString());

        System.out.println("Teste 2:Validar que o método buscar() true");
        System.out.println(definirArvore().pertence(7));

        System.out.println("Teste 3: Validar que o método buscar() false");
        System.out.println(definirArvore().pertence(55));

        System.out.println("Teste 4: Validar o método contarNos()");
        System.out.println(definirArvore().contarNos());
    }
}
