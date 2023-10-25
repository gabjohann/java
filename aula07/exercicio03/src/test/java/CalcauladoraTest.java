import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcauladoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testAddition() {
        assertEquals(4.2, calculadora.addition(2.1, 2.1));
    }

    @Test
    public void testSubstraction() {
        assertEquals(10.0, calculadora.substraction(50, 40));
    }

    @Test
    public void testMultiplication() {
        assertEquals(9, calculadora.multiplication(3, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculadora.division(5.0, 2.5));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.division(19, 0));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(6, calculadora.squareRoot(36));
    }

    @Test
    public void testSquareRootNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.squareRoot(-18));
    }

    @Test
    public void testPower() {
        assertEquals(8, calculadora.power(2, 3));
    }

    @Test
    public void testCalcMortgage() {
        assertEquals(33333293.33, calculadora.calcMortgage(199999.88, 4.5, 30));
    }
}
