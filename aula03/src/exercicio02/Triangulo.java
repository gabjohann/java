package exercicio02;

public class Triangulo extends FormaGeometrica {
    double base;
    double altura;
    double areaTriangulo;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        areaTriangulo = (base * altura) / 2;

        System.out.println("A área do triângulo é igual a: " + areaTriangulo);
    }
}
