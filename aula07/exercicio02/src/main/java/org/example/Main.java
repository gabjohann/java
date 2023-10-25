package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Produto> productsList = new ArrayList<>();

        productsList.add(new Produto("Echo Show 5", 494.10, 1));
        productsList.add(new Produto("Echo Dot 3", 394.92, 2));
        productsList.add(new Produto("Lâmpada Inteligente", 42.90, 1));
        productsList.add(new Produto("Interruptor Inteligente", 44.90, 1));

        //  a) Encontre o produto mais caro na lista.
        Optional<Produto> mostExpensiveProduct = productsList.stream().max(Comparator.comparingDouble(Produto::getPrice)); // Optional → lida com possíveis valores nulos
        mostExpensiveProduct.ifPresent(produto -> System.out.println("O produto mais caro da lista é: " + produto.getName()));

        // b) Calcule o preço total de todos os produtos na lista.
        double total = productsList.stream().mapToDouble(Produto::getPrice).sum(); // :: → operador de referência de método, está referenciando o getPrice() da classe Produto

        System.out.println("\nO valor total dos produtos desta lista é igual a: R$" + total);

        // Filtre os produtos com quantidade superior a 10 e crie uma lista com eles.
        List<Produto> productsGreaterQuantity = productsList.stream().filter(produto -> produto.getAmount() > 10).toList();

        if (productsGreaterQuantity.isEmpty()) {
            System.out.println("\nNão há nenhum produto em grande quantidade!");
        } else {
            System.out.println("\nLista de protudos em maior quantidade: ");
            productsGreaterQuantity.forEach(produto -> System.out.println(produto.getName()));
        }
    }
}