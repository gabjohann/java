package exercicio02;

public class Losango extends FormaGeometrica {
    double diagonalMaior;
    double diagonalMenor;
    double areaLosango;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public void calcularArea() {
        areaLosango = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losango é igual a: " + areaLosango);
    }
}
