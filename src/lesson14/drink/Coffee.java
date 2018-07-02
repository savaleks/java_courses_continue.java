package lesson14.drink;

import lesson14.Drink;

public class Coffee implements Drink  {

    @Override
    public void selectDrink() {

    };

    private String name;
    private double price;
    private boolean sugar;

    public Coffee(String name, double price, boolean sugar) {
        this.name = name;
        this.price = price;
        this.sugar = sugar;
    }

    //    @Override
////    public void selectDrink() {
////        System.out.println(getName() + getPrice() + isSugar());
////        if(this.getName() == "")
////    }

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
