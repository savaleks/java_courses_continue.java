package lesson14.food;

import lesson14.Food;

public class Tortilla implements Food {

    private String name;
    private double price;

    public Tortilla(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void selectFood() {
        System.out.println("Tortilla");
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
