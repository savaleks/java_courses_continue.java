package polymorphism;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine(){
        return "start engine method";
    }

    public String accelerate(){
        return "accelerate method";
    }

    public String brake(){
        return "brake method";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Audi extends Car {

    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "audi > engine";
    }

    @Override
    public String accelerate() {
        return "audi > accelerate";
    }

    @Override
    public String brake() {
        return "audi > brake";
    }
}

class Volvo extends Car {

    public Volvo(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "volvo > engine";
    }

    @Override
    public String accelerate() {
        return "volvo > accelerate";
    }

    @Override
    public String brake() {
        return "volvo > brake";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8,"Base");
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());
        System.out.println("------------------");
        Audi audi = new Audi(6,"Quattro");
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
        System.out.println(audi.startEngine());
        System.out.println("-----------------");
        Volvo volvo = new Volvo(8,"s60");
        System.out.println(volvo.accelerate());
        System.out.println(volvo.brake());
        System.out.println(volvo.startEngine());
    }
}
