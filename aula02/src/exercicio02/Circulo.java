package exercicio02;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Á área calculada é igual a: " + area);
    }

    public void calcularCircunferencia() {
        double circumference = 2 * Math.PI * raio;

        System.out.println("Á circunferência calculada é igual a: " + circumference);
    }

    // Extras:
    public void definirRaio(double novoRaio) {
        if (novoRaio >= 0) {
            setRaio(novoRaio);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    // 5 e 6 não entendi

    public void comparacaoCirculos(double raio1, double raio2) {
        if (raio1 == raio2) {
            System.out.println("Os círculos são iguais.");
        } else {
            System.out.println("Os círculos são diferentes.");
        }
    }

    public void diametroCirculo() {
        double diameter = 2 * raio;
    }

    public static double calcularArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public void calcularAreaSombreada(double raioMenor, double raioMaior) {

        double areaMenor = calcularArea(raioMenor);
        double areaMaior = calcularArea(raioMaior);

        double areaSomberada = areaMaior - areaMenor;

        System.out.println("O valor da área sombreada é igual a: " + areaSomberada);
    }

    public void criarCirculoPlanoCartesiano(double x, double y, double r) {
        double distancia = Math.sqrt(x * x + y * y);
        System.out.println(distancia + raio);
    }
    // coordenada X
    // coordenada Y
    // raio

}