public class Circulo {
    private double raio;

    public Circulo(double raio) {
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
}
