public class exercicio02 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);

        circulo.calcularArea();
        circulo.calcularCircunferencia();
        circulo.definirRaio(10);
        circulo.comparacaoCirculos(5, 10);
        circulo.calcularAreaSombreada(5, 10);
    }
}