import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Teste{

    @Test
    void deveSomarDoisNumeros() {
        Teste teste = new Teste();
        int resultado = teste.somar(2, 3);
        assertEquals(5, resultado);
    }

}
