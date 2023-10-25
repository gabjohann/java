public class Calculadora {
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double substraction(double num1, double num2) {
        return num1 - num2;
    }
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Não é possível realizar divisão por 0.");
        }
        return num1 / num2;
    }

    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Não consigo calcular números irracionais.");
        }
        return Math.sqrt(num);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double calcMortgage(double loanAmount, double interestRate, int termInYears) {
        double monthlyInterests = (loanAmount / 100) / 12;
        int termInMonth = termInYears * 12;
        double result = (loanAmount * monthlyInterests) / (1 - Math.pow(1 + monthlyInterests, -termInMonth));
        result = Math.round(result * 100.0) / 100.0;

        return result;
    }
}
