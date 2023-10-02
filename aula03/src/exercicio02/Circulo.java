package exercicio02;

public class Circulo extends FormaGeometrica {
    double raio;
    double areaCirculo;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do triângulo é igual a: " + areaCirculo);
    }
}
