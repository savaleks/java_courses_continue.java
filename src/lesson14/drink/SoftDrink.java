package lesson14.drink;

import lesson14.Drink;

public class SoftDrink implements Drink {

    private String name;
    private double price;

    public SoftDrink(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public void selectDrink(){
        System.out.println(getName() + getPrice());
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
