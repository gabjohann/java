import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomarNumerosTest {
    OperacaoNumero operacaoNumero = new OperacaoNumero();

    @Test
    public void testSumEmptyArray() {
        int[] numbers = {};
        int result = operacaoNumero.somarNumeros(numbers);
        assertEquals(0, result);
    }

    @Test
    public void testSum() {
        int[] num = {55, 55};
        int result = operacaoNumero.somarNumeros(num);
        assertEquals(110, result);
    }

    @Test
    public void testSumMultipleNumbers() {
        int[] numbers = {2, 4, 6, 8, 10};
        int result = operacaoNumero.somarNumeros(numbers);
        assertEquals(30, result);
    }
}
