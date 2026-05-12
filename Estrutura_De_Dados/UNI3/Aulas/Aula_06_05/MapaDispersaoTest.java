package Aulas.Aula_06_05;
import Aulas.Aula_06_05.Aluno;
import Aulas.Aula_06_05.MapaDispersao;
import Aulas.Aula_06_05.NoLista;
import Aulas.Aula_06_05.ListaEncadeada;
import Aulas.Aula_06_05.NoMapa;

import java.time.LocalDate;

public class MapaDispersaoTest {

    static MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);

    static Aluno a1 = new Aluno(12000, "Jean",  LocalDate.of(2000, 1,  1));
    static Aluno a2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
    static Aluno a3 = new Aluno(12500, "Marta", LocalDate.of(2001, 2, 18));
    static Aluno a4 = new Aluno(13000, "Lucas", LocalDate.of(1998, 11, 25));

    static {
        mapa.inserir(12000, a1);
        mapa.inserir(14000, a2);
        mapa.inserir(12500, a3);
        mapa.inserir(13000, a4);
    }

    public static void main(String[] args) {

        System.out.println("Teste 1: Inserção e busca de um elemento");
        Aluno resultado1 = mapa.buscar(12000);
        System.out.println("Resultado da busca: " + resultado1);

        System.out.println("\nTeste 2: Inserção e busca de múltiplos elementos");
        System.out.println("Resultados da busca:");
        System.out.println("Aluno 1: " + mapa.buscar(12000));
        System.out.println("Aluno 2: " + mapa.buscar(14000));
        System.out.println("Aluno 3: " + mapa.buscar(12500));
        System.out.println("Aluno 4: " + mapa.buscar(13000));

        System.out.println("\nTeste 3: Inserção de elementos com chaves que colidem");

        Aluno a5 = new Aluno(14226, "Marta", LocalDate.of(2001, 2, 18));
        Aluno a6 = new Aluno(17180, "Lucas", LocalDate.of(1998, 11, 25));

        mapa.inserir(14226, a5);
        mapa.inserir(17180, a6);

        System.out.println("Resultados da busca:");
        System.out.println("Aluno 5: " + mapa.buscar(12000));
        System.out.println("Aluno 6: " + mapa.buscar(14000));
        System.out.println("Aluno 7: " + mapa.buscar(12500));
        System.out.println("Aluno 8: " + mapa.buscar(13000));
    }
}
