package booksamples;

public class PrintArguments {
    public static void main(String[] args) {
       Coin obj1 = new Coin(2.50, 125);
       Coin obj2 = new Coin(2.30, 267);
       CompareCoin compareCoin = new CompareCoin();
       compareCoin.compareDiameter(obj1, obj2);
    }
}

class Coin {
    private double diameter;
    private double weight;

    public Coin(double diameter, double weight) {
        this.diameter = diameter;
        this.weight = weight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if (value>0){
            diameter = value;
        } else {
            System.out.println("Wrong diameter");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double value) {
        weight = value;
    }
}

class CompareCoin {
    public void compareDiameter(Coin first, Coin second) {
        double result = first.getDiameter() - second.getDiameter();
        if (result>0){
            System.out.println("First coin bigger than second in " + result + "cm");
        } else if (result==0){
            System.out.println("Both coin have same diameter");
        } else {
            System.out.println("Second coin bigger than first in " + result + "cm");
        }
    }
}
