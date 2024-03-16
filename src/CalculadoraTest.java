import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    void testRestar() {
        assertEquals(1, calculadora.restar(4, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(12, calculadora.multiplicar(4, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3));
    }

    @Test
    void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(1, 0));
    }
}
