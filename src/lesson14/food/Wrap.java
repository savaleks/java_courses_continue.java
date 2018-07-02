package lesson14.food;

import lesson14.Food;

public class Wrap implements Food {

    private String name;
    private double price;

    public Wrap(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void selectFood() {
        System.out.println("Wrap");
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
