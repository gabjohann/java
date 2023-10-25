package org.example;

public class Produto {
    private String name;
    private Double price;
    private int amount;

    public Produto(String name, Double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
