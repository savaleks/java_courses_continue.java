package oopChallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Base",5.78,"white","pork");
        hamburger.setLettuce("lettuce",0.45);
        hamburger.setCarrot("carrot", 0.77);
        System.out.println("total price " + hamburger.finalPrice());
        System.out.println("-----------------");
        HealthyHamburger burger = new HealthyHamburger(3.65, "glutanatNa+");
        burger.setCarrot("carrot",0.88);
        burger.setCucumber("cucumber", 1.34);
        System.out.println("total price with add " + burger.finalPrice());
        System.out.println("-------------------");
        DoubleHamburger doubleH = new DoubleHamburger();
        doubleH.setTomato("tomato",0.99);
        System.out.println("total " + doubleH.finalPrice());
    }
}
