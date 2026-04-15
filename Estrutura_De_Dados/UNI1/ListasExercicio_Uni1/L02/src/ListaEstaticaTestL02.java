import org.junit.Test;
import static org.junit.Assert.*;

public class ListaEstaticaTestL02 {
    
    @Test
    public void testInclusao() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("5,10,15,20", lista.toString());
    }
    
    @Test
    public void testGetTamanho() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.getTamanho());
    }
    
    @Test
    public void testBuscarExistente() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(2, lista.buscar(15));
    }
    
    @Test
    public void testBuscarInexistente() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(-1, lista.buscar(30));
    }
    
    @Test
    public void testRetirar() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        assertEquals("5,15,20", lista.toString());
        assertEquals(3, lista.getTamanho());
    }
    
    @Test
    public void testRedimensionamento() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        for (int i = 1; i <= 15; i++) {
            lista.inserir(i);
        }
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", lista.toString());
        assertEquals(15, lista.getTamanho());
    }
    
    @Test
    public void testObterElemento() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(20, (int) lista.obterElemento(3));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testObterElementoExcecao() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.obterElemento(5);
    }
    
    @Test
    public void testLiberar() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.liberar();
        assertTrue(lista.estaVazia());
        assertEquals(0, lista.getTamanho());
    }
    
    @Test
    public void testInverterPar() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inverter();
        assertEquals("20,15,10,5", lista.toString());
    }
    
    @Test
    public void testInverterImpar() {
        ListaEstaticaL02<Integer> lista = new ListaEstaticaL02<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inserir(25);
        lista.inverter();
        assertEquals("25,20,15,10,5", lista.toString());
    }
}