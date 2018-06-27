package lesson12;

import java.util.*;
import java.util.Collections;

public class CarsMain{

    public static void main(String args[]){

        ArrayList cars = new ArrayList();

        cars.add(new Cars("GHJ123", "Volvo","Alex", "Smith"));
        cars.add(new Cars("BNM124", "Opel","Tom", "Bekker"));
        cars.add(new Cars("ASD125", "Nissan","John", "Orsby"));
        cars.add(new Cars("JKL126", "Honda","Sam", "Black"));


        System.out.println("Sorting by name: ");

        Collections.sort(cars, new NameComparator());
        Iterator itr=cars.iterator();
        while(itr.hasNext()){
            Cars st=(Cars) itr.next();
            System.out.println(st.getCarOwnerName()+" "+st.getCarOwnerSurname()+" | "+st.getCarModel()+" "+st.getCarNumber());
        }

        System.out.println("Sorting by model: ");


    }
}
