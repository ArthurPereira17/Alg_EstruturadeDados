package L04;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class ListaDuplamenteEncadeadaTest {
    
    @Test
    public void test1InserirInicio() {
        System.out.println("Teste 1 - Inserir no início");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals("Ordem início-fim deveria ser 20,15,10,5", 
                    "20,15,10,5", lista.toString());
        assertEquals("Ordem fim-início deveria ser 5,10,15,20", 
                    "5,10,15,20", lista.toStringInvertido());
        
        NoDuplo<Integer> atual = lista.getPrimeiro();
        assertEquals("Primeiro nó deveria ser 20", Integer.valueOf(20), atual.getInfo());
        assertNull("Anterior do primeiro deveria ser null", atual.getAnterior());
        
        atual = atual.getProximo();
        assertEquals("Segundo nó deveria ser 15", Integer.valueOf(15), atual.getInfo());
        assertEquals("Anterior do segundo deveria ser 20", 
                    Integer.valueOf(20), atual.getAnterior().getInfo());
        
        atual = atual.getProximo();
        assertEquals("Terceiro nó deveria ser 10", Integer.valueOf(10), atual.getInfo());
        assertEquals("Anterior do terceiro deveria ser 15", 
                    Integer.valueOf(15), atual.getAnterior().getInfo());
        
        atual = atual.getProximo();
        assertEquals("Quarto nó deveria ser 5", Integer.valueOf(5), atual.getInfo());
        assertEquals("Anterior do quarto deveria ser 10", 
                    Integer.valueOf(10), atual.getAnterior().getInfo());
        assertNull("Próximo do último deveria ser null", atual.getProximo());
        
        assertEquals("Último nó deveria ser 5", Integer.valueOf(5), lista.getUltimo().getInfo());
    }
    
    @Test
    public void test2BuscarPrimeiroElemento() {
        System.out.println("Teste 2 - Buscar primeiro elemento");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        NoDuplo<Integer> encontrado = lista.buscar(20);
        assertNotNull("Deveria encontrar o 20", encontrado);
        assertEquals("Nó encontrado deveria conter 20", Integer.valueOf(20), encontrado.getInfo());
        
        assertEquals("Próximo do 20 deveria ser 15", 
                    Integer.valueOf(15), encontrado.getProximo().getInfo());
        assertNull("Anterior do 20 deveria ser null", encontrado.getAnterior());
    }
    
    @Test
    public void test3BuscarElementoMeio() {
        System.out.println("Teste 3 - Buscar elemento no meio");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        NoDuplo<Integer> encontrado = lista.buscar(10);
        assertNotNull("Deveria encontrar o 10", encontrado);
        assertEquals("Nó encontrado deveria conter 10", Integer.valueOf(10), encontrado.getInfo());
        
        assertEquals("Anterior do 10 deveria ser 15", 
                    Integer.valueOf(15), encontrado.getAnterior().getInfo());
        assertEquals("Próximo do 10 deveria ser 5", 
                    Integer.valueOf(5), encontrado.getProximo().getInfo());
    }
    
    @Test
    public void test4RemoverInicio() {
        System.out.println("Teste 4 - Remover elemento no início");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(20); 

        assertEquals("Ordem início-fim deveria ser 15,10,5", 
                    "15,10,5", lista.toString());
        
        assertEquals("Ordem fim-início deveria ser 5,10,15", 
                    "5,10,15", lista.toStringInvertido());
        
        NoDuplo<Integer> primeiro = lista.getPrimeiro();
        assertEquals("Novo primeiro deveria ser 15", Integer.valueOf(15), primeiro.getInfo());
        assertNull("Anterior do novo primeiro deveria ser null", primeiro.getAnterior());
        
        NoDuplo<Integer> ultimo = lista.getUltimo();
        assertEquals("Último deveria ser 5", Integer.valueOf(5), ultimo.getInfo());
        assertNull("Próximo do último deveria ser null", ultimo.getProximo());
        
        assertNull("20 não deveria mais estar na lista", lista.buscar(20));
    }
    
    @Test
    public void test5RemoverMeio() {
        System.out.println("Teste 5 - Remover elemento no meio");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(10);
        
        assertEquals("Ordem início-fim deveria ser 20,15,5", 
                    "20,15,5", lista.toString());
        
        assertEquals("Ordem fim-início deveria ser 5,15,20", 
                    "5,15,20", lista.toStringInvertido());
        
        NoDuplo<Integer> no15 = lista.buscar(15);
        assertNotNull("15 deveria existir", no15);
        assertEquals("Próximo do 15 deveria ser 5", 
                    Integer.valueOf(5), no15.getProximo().getInfo());
        assertEquals("Anterior do 15 deveria ser 20", 
                    Integer.valueOf(20), no15.getAnterior().getInfo());
        
        assertNull("10 não deveria mais estar na lista", lista.buscar(10));
    }
    
    @Test
    public void test6RemoverFim() {
        System.out.println("Teste 6 - Remover elemento no fim");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(5);
        
        assertEquals("Ordem início-fim deveria ser 20,15,10", 
                    "20,15,10", lista.toString());
        
        assertEquals("Ordem fim-início deveria ser 10,15,20", 
                    "10,15,20", lista.toStringInvertido());
        
        NoDuplo<Integer> ultimo = lista.getUltimo();
        assertEquals("Novo último deveria ser 10", Integer.valueOf(10), ultimo.getInfo());
        assertNull("Próximo do novo último deveria ser null", ultimo.getProximo());
        
        NoDuplo<Integer> no15 = lista.buscar(15);
        assertNotNull("15 deveria existir", no15);
        assertEquals("Próximo do 15 deveria ser 10", 
                    Integer.valueOf(10), no15.getProximo().getInfo());
        
        assertNull("5 não deveria mais estar na lista", lista.buscar(5));
    }
    
    @Test
    public void test7Liberar() {
        System.out.println("Teste 7 - Liberar dados da lista");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        NoDuplo<Integer> no20 = lista.buscar(20);
        NoDuplo<Integer> no15 = lista.buscar(15);
        NoDuplo<Integer> no10 = lista.buscar(10);
        NoDuplo<Integer> no5 = lista.buscar(5);
        
        lista.liberar();
        
        assertNull("Anterior do 20 deveria ser null após liberar", no20.getAnterior());
        assertNull("Próximo do 20 deveria ser null após liberar", no20.getProximo());
        
        assertNull("Anterior do 15 deveria ser null após liberar", no15.getAnterior());
        assertNull("Próximo do 15 deveria ser null após liberar", no15.getProximo());
        
        assertNull("Anterior do 10 deveria ser null após liberar", no10.getAnterior());
        assertNull("Próximo do 10 deveria ser null após liberar", no10.getProximo());
        
        assertNull("Anterior do 5 deveria ser null após liberar", no5.getAnterior());
        assertNull("Próximo do 5 deveria ser null após liberar", no5.getProximo());
        
        assertTrue("Lista deveria estar vazia", lista.estaVazia());
        assertNull("Primeiro deveria ser null", lista.getPrimeiro());
        assertNull("Último deveria ser null", lista.getUltimo());
        assertEquals("toString deveria ser vazio", "", lista.toString());
    }
    
    @Test
    public void testRemoverElementoUnico() {
        System.out.println("Teste adicional - Remover elemento único");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserir(5);
        
        lista.retirar(5);
        
        assertTrue("Lista deveria estar vazia", lista.estaVazia());
        assertNull("Primeiro deveria ser null", lista.getPrimeiro());
        assertNull("Último deveria ser null", lista.getUltimo());
    }
    
    @Test
    public void testBuscarInexistente() {
        System.out.println("Teste adicional - Buscar elemento inexistente");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        NoDuplo<Integer> encontrado = lista.buscar(100);
        assertNull("Não deveria encontrar o 100", encontrado);
    }
    
    @Test
    public void testListaVazia() {
        System.out.println("Teste adicional - Lista vazia");
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        
        assertTrue("Lista deveria estar vazia", lista.estaVazia());
        assertNull("Primeiro deveria ser null", lista.getPrimeiro());
        assertNull("Último deveria ser null", lista.getUltimo());
        assertEquals("toString deveria ser vazio", "", lista.toString());
        assertEquals("toStringInvertido deveria ser vazio", "", lista.toStringInvertido());
    }
}