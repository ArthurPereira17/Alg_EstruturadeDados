package UNI4.ListasExercicios.L11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import UNI4.Aula_20_05.*;

public class OrdenacaoTest {
    // Vetor esperado após ordenação
    private final Integer[] esperado = {2, 15, 30, 70, 88, 90};

    // Cria um novo vetor desordenado a cada teste
    private Integer[] criarVetor() {
        return new Integer[]{70, 2, 88, 15, 90, 30};
    }

    @Test
    @DisplayName("Caso 1 - Ordenação Bolha")
    public void testBolha() {
        BubbleSort<Integer> ordenacao = new BubbleSort<>();
        ordenacao.setInfo(criarVetor());
        ordenacao.ordenar();
        assertArrayEquals(esperado, ordenacao.getInfo());
    }

    @Test
    @DisplayName("Caso 2 - Ordenação Bolha Otimizada")
    public void testBolhaOtimizada() {
        BubbleSortOtimizado<Integer> ordenacao = new BubbleSortOtimizado<>();
        ordenacao.setInfo(criarVetor());
        ordenacao.ordenar();
        assertArrayEquals(esperado, ordenacao.getInfo());
    }

    @Test
    @DisplayName("Caso 3 - Ordenação QuickSort")
    public void testQuickSort() {
        QuickSort<Integer> ordenacao = new QuickSort<>();
        ordenacao.setInfo(criarVetor());
        ordenacao.ordenar();
        assertArrayEquals(esperado, ordenacao.getInfo());
    }

    @Test
    @DisplayName("Caso 4 - Ordenação MergeSort")
    public void testMergeSort() {
        MergeSort<Integer> ordenacao = new MergeSort<>();
        ordenacao.setInfo(criarVetor());
        ordenacao.ordenar();
        assertArrayEquals(esperado, ordenacao.getInfo());
    }
}
