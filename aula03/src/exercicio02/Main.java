package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Losango losango = new Losango(14, 10);
        Quadrado quadrado = new Quadrado(30);
        Triangulo triangulo = new Triangulo(10, 5);

        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(circulo);
        formas.add(losango);
        formas.add(quadrado);
        formas.add(triangulo);

        for (FormaGeometrica forma: formas) {
            forma.calcularArea(); // polimorfismo
        }
    }
}
