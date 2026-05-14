package ListasExercicio.L09;

import java.time.LocalDate;

import Aulas.Aula_06_05.Aluno;
import Aulas.Aula_06_05.ListaEncadeada;
import Aulas.Aula_06_05.MapaDispersao;
import Aulas.Aula_06_05.NoLista;
import Aulas.Aula_06_05.NoMapa;

public class MapaDispersaoTest {

    static MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
    static Aluno obj1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
    static Aluno obj2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
    static Aluno obj3 = new Aluno(12500, "Marta", LocalDate.of(2001, 2, 18));
    static Aluno obj4 = new Aluno(13000, "Lucas", LocalDate.of(1998, 11, 25));

    public static void main(String[] args) {

        System.out.println("Teste 1: Inserção e busca de um elemento");
        mapa.inserir(12000, obj1);
        Aluno resultado = mapa.buscar(12000);
        System.out.println("Resultado da busca: " + resultado);

        System.out.println("Teste 2: Inserção e busca de múltiplos elementos");
        mapa.inserir(12000, obj1);
        mapa.inserir(14000, obj2);
        mapa.inserir(12500, obj3);
        mapa.inserir(13000, obj4);

        Aluno resultado1 = mapa.buscar(12000);
        Aluno resultado2 = mapa.buscar(14000);
        Aluno resultado3 = mapa.buscar(12500);
        Aluno resultado4 = mapa.buscar(13000);

        System.out.println("Resultados da busca:");
        System.out.println("Aluno 1: " + resultado1);
        System.out.println("Aluno 2: " + resultado2);
        System.out.println("Aluno 3: " + resultado3);
        System.out.println("Aluno 4: " + resultado4);

        System.out.println("Teste 3: Inserção de elementos com chaves que colidem");
        mapa.inserir(12000, obj1);
        mapa.inserir(14000, obj2);
        mapa.inserir(14226, obj3);
        mapa.inserir(17180, obj4);

        Aluno resultado5 = mapa.buscar(12000);
        Aluno resultado6 = mapa.buscar(14000);
        Aluno resultado7 = mapa.buscar(14226);
        Aluno resultado8 = mapa.buscar(17180);
        System.out.println("Resultados da busca:");
        System.out.println("Aluno 5: " + resultado5);
        System.out.println("Aluno 6: " + resultado6);
        System.out.println("Aluno 7: " + resultado7);
        System.out.println("Aluno 8: " + resultado8);
    }
}
