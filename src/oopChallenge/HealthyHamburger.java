package oopChallenge;

public class HealthyHamburger extends  Hamburger {

    private String extraItem;
    private double extraPrice;

    private String extraItemOne;
    private double extraPriceOne;

    public HealthyHamburger(double price, String meat) {
        super("Health100", price, "Brown whole", meat);
    }

    public void setExtraItem(String name, double price) {
        this.extraItem = name;
        this.extraPrice = price;
    }

    public void setExtraItemOne(String name, double price) {
        this.extraItemOne = name;
        this.extraPriceOne = price;
    }

    @Override
    public double finalPrice() {
        double hamburgerPrice = super.finalPrice();
        if (this.extraItem != null) {
            hamburgerPrice += this.extraPrice;
            System.out.println("you add " + extraItem + " in price " + extraPrice);
        }
        if (this.extraItemOne != null) {
            hamburgerPrice += this.extraPriceOne;
            System.out.println("you add " + extraItemOne + " in price " + extraPriceOne);
        }
        return hamburgerPrice;
    }
}
