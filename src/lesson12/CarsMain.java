package lesson12;

import java.util.Arrays;

public class CarsMain{

    public static void main(String args[]){

        Cars[] cars = new Cars[4];

        Cars alex = new Cars("GHJ123", "Volvo","Alex", "Smith");
        Cars tom = new Cars("BNM124", "Opel","Tom", "Bekker");
        Cars john = new Cars("ASD125", "Nissan","John", "Orsby");
        Cars sam = new Cars("JKL126", "Honda","Sam", "Black");

        cars[0]=alex;
        cars[1]=tom;
        cars[2]=john;
        cars[3]=sam;

        Arrays.sort(cars, Cars.CarsNameComparator);

        System.out.println("Sorting by name: ");

        int i=0;
        for(Cars temp: cars){
            System.out.println( ++i + "." + temp.getCarOwnerName() + " " +
                    temp.getCarOwnerSurname() + " " +
                    "| Car: " + temp.getCarModel() + ", Car number: " + temp.getCarNumber() + ".");
        }

    }
}
