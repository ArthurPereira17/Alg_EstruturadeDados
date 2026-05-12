package UNI2.ListasExercicio.L07;

import UNI2.Aulas.Aula_08_04.ArvoreBinaria;
import UNI2.Aulas.Aula_08_04.NoArvoreBinaria;

public class ArvoreBinariaTest {
    public static void main(String[] args) {

        System.out.println("Caso 1: Teste estaVazia()");
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        System.out.println("Árvore está vazia: " + arvore.estaVazia());

        System.out.println("Caso 2: Teste estaVazia() false");
        ArvoreBinaria<Integer> arvore2 = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> no = new NoArvoreBinaria<>(5);
        arvore2.setRaiz(no);
        System.out.println("Árvore está vazia: " + arvore2.estaVazia());

        System.out.println("Caso 3: Representação textual da árvore");
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2,null, no1);

        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(3, no4, no3);

        NoArvoreBinaria<Integer> noRaiz = new NoArvoreBinaria<>(1, no2, no5);
        ArvoreBinaria<Integer> arvore3 = new ArvoreBinaria<>();
        arvore3.setRaiz(noRaiz);
        System.out.println(arvore3.toString());

        System.out.println("Caso 4: Teste pertence() true");
        System.out.println(arvore3.pertence(1));

        System.out.println("Caso 5: Teste pertence() true");
        System.out.println(arvore3.pertence(3));

        System.out.println("Caso 6: Teste pertence() true");
        System.out.println(arvore3.pertence(6));

        System.out.println("Caso 7: Teste pertence() false");
        System.out.println(arvore3.pertence(10));

        System.out.println("Caso 8: Teste contarNos();");
        System.out.println("Número de nós: " + arvore3.contarNos());
    }
}
