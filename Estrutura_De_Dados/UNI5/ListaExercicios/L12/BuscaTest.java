package UNI5.ListaExercicios.L12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuscaTest {

    private Integer[] vetor;

    @BeforeEach
    public void setUp() {
        vetor = new Integer[] { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    }

    @Test
    @DisplayName("Caso 1 - Busca Linear: buscar(20) = 2")
    public void testBuscaLinear() {
        BuscaLinear<Integer> busca = new BuscaLinear<>();
        busca.setInfo(vetor);
        assertEquals(2, busca.buscar(20));
    }

    @Test
    @DisplayName("Caso 2 - Busca Linear Ordenado: buscar(40) = 4")
    public void testBuscaLinearOrdenado() {
        BuscaLinearVetorOrdenado<Integer> busca = new BuscaLinearVetorOrdenado<>();
        busca.setInfo(vetor);
        assertEquals(4, busca.buscar(40));
    }

    @Test
    @DisplayName("Caso 3 - Busca Binaria: buscar(70) = 7")
    public void testBuscaBinaria() {
        BuscaBinaria<Integer> busca = new BuscaBinaria<>();
        busca.setInfo(vetor);
        assertEquals(7, busca.buscar(70));
    }

    @Test
    @DisplayName("Caso 4 - Busca Binaria: buscar(75) = -1")
    public void testBuscaBinariaNaoEncontrado() {
        BuscaBinaria<Integer> busca = new BuscaBinaria<>();
        busca.setInfo(vetor);
        assertEquals(-1, busca.buscar(75));
    }

    @Test
    @DisplayName("Caso 5 - Inserir e verificar toString")
    public void testInserir() {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(40);
        arvore.inserir(25);
        arvore.inserir(75);
        arvore.inserir(65);
        arvore.inserir(35);
        arvore.inserir(60);

        String esperado = "<50<30<25<><>><40<35<><>><>>><70<65<60<><>><>><75<><>>>>";
        assertEquals(esperado, arvore.toString());
    }

    @Test
    @DisplayName("Caso 6 - Remover nó folha (40)")
    public void testRemoverFolha() {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(25);
        arvore.inserir(40);

        arvore.remover(40);

        assertEquals("<50<30<25<><>><>><>>", arvore.toString());
    }

    @Test
    @DisplayName("Caso 7 - Remover nó com um filho (71)")
    public void testRemoverComUmFilho() {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.inserir(80);
        arvore.inserir(52);
        arvore.inserir(90);
        arvore.inserir(48);
        arvore.inserir(71);
        arvore.inserir(63);
        arvore.inserir(67);

        arvore.remover(71);

        assertEquals("<80<52<48<><>><63<><67<><>>>><90<><>>>", arvore.toString());
    }
}
