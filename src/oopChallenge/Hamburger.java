package oopChallenge;

public class Hamburger {

    private String name;
    private double price;
    private String bread;
    private String meat;

// adds for hamburger
    private String lettuce;
    private double lettucePrice;

    private String carrot;
    private double carrotPrice;

    private String tomato;
    private double tomatoPrice;

    private String cucumber;
    private double cucumberPrice;

    // constructor
    public Hamburger(String name, double price, String bread, String meat) {
        this.name = name;
        this.price = price;
        this.bread = bread;
        this.meat = meat;
    }


    public void setLettuce(String name, double price) {
        this.lettuce = name;
        this.lettucePrice = price;
    }

    public void setCarrot(String name, double price) {
        this.carrot = name;
        this.carrotPrice = price;
    }

    public void setTomato(String name, double price) {
        this.tomato = name;
        this.tomatoPrice = price;
    }

    public void setCucumber(String name, double price) {
        this.cucumber = name;
        this.cucumberPrice = price;
    }


    public double finalPrice(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger costs " + this.price);
        if (this.lettuce != null){
            hamburgerPrice += lettucePrice;
            System.out.println("you add " + this.lettuce + " in price " + this.lettucePrice);
        }
        if (this.carrot != null){
            hamburgerPrice += carrotPrice;
            System.out.println("you add " + this.carrot + " in price " + this.carrotPrice);
        }
        if (this.tomato != null){
            hamburgerPrice += tomatoPrice;
            System.out.println("you add " + this.tomato + " in price " + this.tomatoPrice);
        }
        if (this.cucumber != null){
            hamburgerPrice += cucumberPrice;
            System.out.println("you add " + this.cucumber + " in price " + this.cucumberPrice);
        }
        return hamburgerPrice; //final price with adds
    }

}
