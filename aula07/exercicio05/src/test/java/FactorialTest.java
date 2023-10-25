import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    OperacaoNumero operacaoNumero = new OperacaoNumero();

    @Test
    public void factorialPositiveInt() {
        int result = operacaoNumero.calcularFatorial(5);
        assertEquals(120, result);
    }

    @Test
    public void factorialNegativeInt() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> operacaoNumero.calcularFatorial(-15));
        assertFalse(runtimeException.getMessage().contains("Não é possível calcular fatorial de números negativos!"));
    }

    @Test
    public void factorialZero() {
        int result = operacaoNumero.calcularFatorial(0);
        assertEquals(1, result);
    }

    @Test
    public void factorialOne() {
        int result = operacaoNumero.calcularFatorial(1);
        assertEquals(1, result);
    }
}
