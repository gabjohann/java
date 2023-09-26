package exercicio02;

public class Retangulo extends FormaGeometrica {
    double base;
    double altura;
    double areaRetangulo;

    public Retangulo(double base, double altura, double areaRetangulo) {
        this.base = base;
        this.altura = altura;
        this.areaRetangulo = areaRetangulo;
    }

    @Override
    public void calcularArea() {
        areaRetangulo = base * altura;

        System.out.println("A área do retângulo é igual a: " + areaRetangulo);
    }
}
