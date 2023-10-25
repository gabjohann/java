import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumParTest {
    OperacaoNumero operacaoNumero = new OperacaoNumero();

    @Test
    public void testOddNumber() {
        int number = 5;
        boolean result = operacaoNumero.ehPar(number);
        assertFalse(result);
    }

    @Test
    public void testEvenNumber() {
        int number = 12;
        boolean result = operacaoNumero.ehPar(number);
        assertTrue(result);
    }
}
