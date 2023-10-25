import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double result = Calculadora.calcMortgage(199999.88,  4.5, 30);

        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String formattedResult = decimalFormat.format(result);

        System.out.println("Pagamento mensal da hipoteca: R$" + formattedResult);


    }
}
