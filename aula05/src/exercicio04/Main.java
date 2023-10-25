package exercicio04;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String product;
        Double price;
        Map<String, Double> products = new LinkedHashMap<>();

        products.put("Tortuguita", 1.50);
        products.put("Fatia pizza", 5.50);
        products.put("Guaraná 600mL", 3.99);

        System.out.println("Lista de Produtos: ");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            product = entry.getKey();
            price = entry.getValue();
            System.out.println(product + ": R$" + price);
        }
    }
}
