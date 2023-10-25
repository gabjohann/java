package exercicio02;

public class Quadrado extends FormaGeometrica {
    double lado;
    double areaQuadrado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        areaQuadrado = Math.pow(lado, 2);

        System.out.println("A área do quadrado é igual a: " + areaQuadrado);
    }
}
