package lesson14.drink;

import lesson14.Drink;

public class Water implements Drink {

    private String name;
    private boolean isSparking;
    private double price;

    public Water(String name, boolean isSparking, double price) {
        this.name = name;
        this.isSparking = isSparking;
        this.price = price;
    }

    @Override
    public void selectDrink() {
        System.out.println("Vanduo");
    }

    public String getName() {
        return name;
    }

    public boolean isSparking() {
        return isSparking;
    }

    public Double getPrice() {
        return price;
    }
}
