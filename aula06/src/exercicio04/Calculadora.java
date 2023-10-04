package exercicio04;

public class Calculadora implements Calculavel {
    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Infinito ( ∞ )");
        }

        return a / b;
    }
}
