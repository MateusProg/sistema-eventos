import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteSimples{

    @Test
    void deveSomarDoisNumeros() {
        Teste test = new Teste();
        int resultado = test.somar(2, 3);
        assertEquals(5, resultado);
    }

}
