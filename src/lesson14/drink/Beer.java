package lesson14.drink;

import lesson14.Drink;

public class Beer implements Drink{

    private String name;
    private double size;
    private double price;

    public Beer(String name, double size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public void selectDrink() {
        System.out.println("Alus: " + getName() + ", " + getSize() + "l.");
        if(this.getSize()>1){
            System.out.println("1,5eu");
        }
        else if(this.getSize()>=2){
            System.out.println("2,5eu");
        }
        else if(this.getSize()>0 && this.getSize()<=1){

            System.out.println("1,0eu");
        }
        else{
            System.out.println("Jus nieko neuzsakete");
        }
    }



    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

}

