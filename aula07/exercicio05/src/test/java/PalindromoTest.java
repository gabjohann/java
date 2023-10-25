import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {
    OperacaoNumero operacaoNumero = new OperacaoNumero();

    @Test
    public void testPalindromeWord() {
        assertTrue(operacaoNumero.ehPalindromo("arara"));
    }

    @Test
    public void testNotPalindromeWord() {
        assertFalse(operacaoNumero.ehPalindromo("batata"));
    }

    @Test
    public void testPalindromePhrase() {
        assertTrue(operacaoNumero.ehPalindromo("a torre da derrota"));
    }

    @Test
    public void testNotPalindromePhrase() {
        assertFalse(operacaoNumero.ehPalindromo("fui mal na prova"));
    }
}
