package lesson14.drink;

import lesson14.Drink;

public class Tea implements Drink {

    private String name;
    private double price;
    private boolean sugar;

    public Tea(String name, double price, boolean sugar) {
        this.name = name;
        this.price = price;
        this.sugar = sugar;
    }

    @Override
    public void selectDrink() {
        System.out.println("Arbata");
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isSugar() {
        return sugar;
    }
}
