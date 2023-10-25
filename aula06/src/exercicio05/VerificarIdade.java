package exercicio05;

public class VerificarIdade {
    public static void verificarIdade(int age) {
        if (age < 0 || age > 150) {
            throw new IdadeInvalidaException("Idade inválida. A idade deve estar no entervalo de 0 e 150 anos.");
        }
    }
}
