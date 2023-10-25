import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    OperacaoNumero operacaoNumero = new OperacaoNumero();

    @Test
    public void testFibonacciForZero() {
        int result = operacaoNumero.calcularFibonacci(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibonacciForOne() {
        int result = operacaoNumero.calcularFibonacci(1);
        assertEquals(1, result);
    }

    @Test
    public void testFibonacciForPositiveNumber() {
        int result = operacaoNumero.calcularFibonacci(10);
        assertEquals(55, result);
    }

    @Test
    public void testCalculateFibonacciForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> operacaoNumero.calcularFibonacci(-12));
    }
}
