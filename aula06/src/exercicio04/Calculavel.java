package exercicio04;

public interface Calculavel {
    int addition(int a, int b);
    int subtraction(int a, int b);
    int multiplication(int a, int b);
    int division(int a, int b) throws ArithmeticException; // trata erro de divisão por zero
}
