package lesson14.food;

import lesson14.Food;

public class Pizza implements Food {

    private String name;
    private double price;
    private String size;

    public Pizza(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public void selectFood() {
        System.out.println("Piza: " + getName() + ", " + getSize());
        if(this.getSize()=="small"){
            System.out.println("2,0eu");
        }
        else if(this.getSize()=="medium"){
            System.out.println("3,5eu");
        }
        else if(this.getSize()=="large"){
            System.out.println("5,0eu");
        }
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}
