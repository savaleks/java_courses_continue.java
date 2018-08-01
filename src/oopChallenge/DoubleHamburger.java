package oopChallenge;

public class DoubleHamburger extends Hamburger {
    public DoubleHamburger() {
        super("DoublePleasure", 5.99, "white dream", "bacon");
        super.setLettuce("E121", 0.99);
        super.setTomato("E244", 1.77);
    }

    @Override
    public void setLettuce(String name, double price) {
        System.out.println("no addition in double hamburger");
    }

    @Override
    public void setCarrot(String name, double price) {
        System.out.println("no addition in double hamburger");
    }

    @Override
    public void setTomato(String name, double price) {
        System.out.println("no addition in double hamburger");
    }

    @Override
    public void setCucumber(String name, double price) {
        System.out.println("no addition in double hamburger");
    }
}
