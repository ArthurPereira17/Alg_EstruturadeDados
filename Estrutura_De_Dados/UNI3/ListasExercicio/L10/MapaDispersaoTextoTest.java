package ListasExercicio.L10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Aulas.Aula_13_05.*;

public class MapaDispersaoTextoTest {
    private MapaDispersao<String, Veiculo> mapa;

    private Veiculo v1;
    private Veiculo v2;
    private Veiculo v3;
    private Veiculo v4;

    @BeforeEach
    public void setUp() {
        mapa = new MapaDispersao<>(53);

        v1 = new Veiculo("AJQ-3041", "Ana");
        v2 = new Veiculo("MSE-7521", "Pedro");
        v3 = new Veiculo("ZAJ-5931", "Marta");
        v4 = new Veiculo("MQO-2241", "Lucas");

        mapa.inserir("AJQ-3041", v1);
        mapa.inserir("MSE-7521", v2);
        mapa.inserir("ZAJ-5931", v3);
        mapa.inserir("MQO-2241", v4);
    }

    @Test
    @DisplayName("Validar inserção e busca de múltiplos veículos por placa")
    public void testInserirEBuscarMultiplosVeiculos() {
        assertSame(v1, mapa.buscar("AJQ-3041"), "Ana não foi encontrada");
        assertSame(v2, mapa.buscar("MSE-7521"), "Pedro não foi encontrado");
        assertSame(v3, mapa.buscar("ZAJ-5931"), "Marta não foi encontrada");
        assertSame(v4, mapa.buscar("MQO-2241"), "Lucas não foi encontrado");
    }
}