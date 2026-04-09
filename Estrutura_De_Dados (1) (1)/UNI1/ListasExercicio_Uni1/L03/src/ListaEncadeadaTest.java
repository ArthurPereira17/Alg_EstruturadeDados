import org.junit.Test;
import static org.junit.Assert.*;

public class ListaEncadeadaTest {

    @Test
    public void test1ListaVazia() {
        System.out.println("Teste 1 - Verificar lista vazia");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        assertTrue("Lista deveria estar vazia", lista.estaVazia());
        assertNull("Primeiro deveria ser null", lista.getPrimeiro());
        assertEquals("Comprimento deveria ser 0", 0, lista.obterComprimento());
    }

    @Test
    public void test2ListaNaoVazia() {
        System.out.println("Teste 2 - Verificar lista não vazia");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);

        assertFalse("Lista não deveria estar vazia", lista.estaVazia());
        assertNotNull("Primeiro não deveria ser null", lista.getPrimeiro());
    }

    @Test
    public void test3IncluirUmNumero() {
        System.out.println("Teste 3 - Incluir um número");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);

        NoLista<Integer> primeiro = lista.getPrimeiro();
        assertNotNull("Primeiro não deveria ser null", primeiro);
        assertEquals("Valor do primeiro nó deveria ser 5", Integer.valueOf(5), primeiro.getInfo());
        assertNull("Próximo do primeiro deveria ser null", primeiro.getProximo());
        assertEquals("Comprimento deveria ser 1", 1, lista.obterComprimento());
    }

    @Test
    public void test4IncluirTresNumeros() {
        System.out.println("Teste 4 - Incluir três números (5, 10, 15)");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);


        assertEquals("Comprimento deveria ser 3", 3, lista.obterComprimento());
        assertEquals("toString deveria ser 15,10,5", "15,10,5", lista.toString());

        NoLista<Integer> atual = lista.getPrimeiro();
        assertEquals("Primeiro nó deveria ser 15", Integer.valueOf(15), atual.getInfo());

        atual = atual.getProximo();
        assertEquals("Segundo nó deveria ser 10", Integer.valueOf(10), atual.getInfo());

        atual = atual.getProximo();
        assertEquals("Terceiro nó deveria ser 5", Integer.valueOf(5), atual.getInfo());

        atual = atual.getProximo();
        assertNull("Não deveria haver quarto nó", atual);
    }

    @Test
    public void test5BuscarPrimeiraPosicao() {
        System.out.println("Teste 5 - Buscar número na primeira posição");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoLista<Integer> encontrado = lista.buscar(20);
        assertNotNull("Deveria encontrar o número 20", encontrado);
        assertEquals("Nó encontrado deveria conter 20", Integer.valueOf(20), encontrado.getInfo());
    }

    @Test
    public void test6BuscarMeio() {
        System.out.println("Teste 6 - Buscar número no meio da lista");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoLista<Integer> encontrado = lista.buscar(15);
        assertNotNull("Deveria encontrar o número 15", encontrado);
        assertEquals("Nó encontrado deveria conter 15", Integer.valueOf(15), encontrado.getInfo());
    }

    @Test
    public void test7BuscarInexistente() {
        System.out.println("Teste 7 - Buscar número inexistente");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoLista<Integer> encontrado = lista.buscar(50);
        assertNull("Não deveria encontrar o número 50", encontrado);
    }

    @Test
    public void test8ExcluirPrimeiro() {
        System.out.println("Teste 8 - Excluir primeiro elemento");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(20);

        assertEquals("Comprimento deveria ser 3", 3, lista.obterComprimento());
        assertEquals("Lista deveria conter 15,10,5", "15,10,5", lista.toString());
        assertNull("20 não deveria mais estar na lista", lista.buscar(20));
    }

    @Test
    public void test9ExcluirMeio() {
        System.out.println("Teste 9 - Excluir elemento do meio");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(15);

        assertEquals("Comprimento deveria ser 3", 3, lista.obterComprimento());
        assertEquals("Lista deveria conter 20,10,5", "20,10,5", lista.toString());

        assertNull("15 não deveria mais estar na lista", lista.buscar(15));
    }

    @Test
    public void test10ObterNoPosicao0() {
        System.out.println("Teste 10 - obterNo(0)");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoLista<Integer> no = lista.obterNo(0);
        assertNotNull("Nó na posição 0 não deveria ser null", no);
        assertEquals("Nó na posição 0 deveria conter 20", Integer.valueOf(20), no.getInfo());
    }

    @Test
    public void test11ObterNoUltimaPosicao() {
        System.out.println("Teste 11 - obterNo(3) - última posição");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoLista<Integer> no = lista.obterNo(3);
        assertNotNull("Nó na posição 3 não deveria ser null", no);
        assertEquals("Nó na posição 3 deveria conter 5", Integer.valueOf(5), no.getInfo());
    }

    @Test
    public void test12ObterNoPosicaoInvalida() {
        System.out.println("Teste 12 - obterNo(10) - posição inválida");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.obterNo(10);
    }

    @Test
    public void test13ObterComprimentoListaVazia() {
        System.out.println("Teste 13 - obterComprimento() para lista vazia");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        assertEquals("Comprimento de lista vazia deveria ser 0", 0, lista.obterComprimento());
    }

    @Test
    public void test14ObterComprimentoListaNaoVazia() {
        System.out.println("Teste 14 - obterComprimento() para lista não vazia");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals("Comprimento deveria ser 4", 4, lista.obterComprimento());
    }

    @Test
    public void testExcluirUltimo() {
        System.out.println("Teste adicional - Excluir último elemento");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(5);

        assertEquals("Comprimento deveria ser 3", 3, lista.obterComprimento());
        assertEquals("Lista deveria conter 20,15,10", "20,15,10", lista.toString());
    }

    @Test
    public void testExcluirElementoUnico() {
        System.out.println("Teste adicional - Excluir elemento único");
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);

        lista.retirar(5);

        assertTrue("Lista deveria estar vazia", lista.estaVazia());
        assertEquals("Comprimento deveria ser 0", 0, lista.obterComprimento());
        assertNull("Primeiro deveria ser null", lista.getPrimeiro());
    }
}