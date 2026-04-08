

public class ListaEstaticaTestL01 {
    public static void main(String[] args) {

        // Teste 1 - Inserção e toString
        System.out.println("=== Teste 1 - Inserção ===");
        ListaEstaticaL01 lista1 = new ListaEstaticaL01();
        lista1.inserir(5);
        lista1.inserir(10);
        lista1.inserir(15);
        lista1.inserir(20);
        System.out.println("Resultado: " + lista1.toString());

        // Teste 2 - getTamanho
        System.out.println("=== Teste 2 - getTamanho ===");
        ListaEstaticaL01 lista2 = new ListaEstaticaL01();
        lista2.inserir(5);
        lista2.inserir(10);
        lista2.inserir(15);
        lista2.inserir(20);
        System.out.println("Resultado: " + lista2.getTamanho());

        // Teste 3 - buscar com elemento existente
        System.out.println("=== Teste 3 - buscar(15) ===");
        ListaEstaticaL01 lista3 = new ListaEstaticaL01();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        System.out.println("Resultado: " + lista3.buscar(15));

        // Teste 4 - buscar com elemento inexistente
        System.out.println("=== Teste 4 - buscar(30) ===");
        ListaEstaticaL01 lista4 = new ListaEstaticaL01();
        lista4.inserir(5);
        lista4.inserir(10);
        lista4.inserir(15);
        lista4.inserir(20);
        System.out.println("Resultado: " + lista4.buscar(30));

        // Teste 5 - retirar
        System.out.println("=== Teste 5 - retirar(10) ===");
        ListaEstaticaL01 lista5 = new ListaEstaticaL01();
        lista5.inserir(5);
        lista5.inserir(10);
        lista5.inserir(15);
        lista5.inserir(20);
        lista5.retirar(10);
        System.out.println("toString: " + lista5.toString());
        System.out.println("getTamanho: " + lista5.getTamanho());

        // Teste 6 - redimensionamento
        System.out.println("=== Teste 6 - Redimensionamento ===");
        ListaEstaticaL01 lista6 = new ListaEstaticaL01();
        for (int i = 1; i <= 15; i++) {
            lista6.inserir(i);
        }
        System.out.println("toString: " + lista6.toString());
        System.out.println("getTamanho: " + lista6.getTamanho());

        // Teste 7 - obterElemento
        System.out.println("=== Teste 7 - obterElemento(3) ===");
        ListaEstaticaL01 lista7 = new ListaEstaticaL01();
        lista7.inserir(5);
        lista7.inserir(10);
        lista7.inserir(15);
        lista7.inserir(20);
        System.out.println("Resultado: " + lista7.obterElemento(3));

        // Teste 8 - exceção no obterElemento
        System.out.println("=== Teste 8 - obterElemento(5) - Exceção ===");
        ListaEstaticaL01 lista8 = new ListaEstaticaL01();
        lista8.inserir(5);
        lista8.inserir(10);
        lista8.inserir(15);
        lista8.inserir(20);
        try {
            lista8.obterElemento(5);
            System.out.println("ERRO: Exceção não foi lançada!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
        System.out.println();

        // Teste 9 - liberar
        System.out.println("=== Teste 9 - liberar() ===");
        ListaEstaticaL01 lista9 = new ListaEstaticaL01();
        lista9.inserir(5);
        lista9.inserir(10);
        lista9.inserir(15);
        lista9.inserir(20);
        System.out.println("Antes de liberar - estaVazia: " + lista9.estaVazia());
        lista9.liberar();
        System.out.println("Depois de liberar - estaVazia: " + lista9.estaVazia());

    }
}