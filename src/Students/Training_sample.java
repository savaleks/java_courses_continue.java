package Students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Training_sample {

    private String name;
    private int age;
    private double weight;

    public Training_sample(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public static void main(String[] args) {
        List<Training_sample> sample = new ArrayList<>();
        sample.add(new Training_sample("alex", 33, 80.8));
        sample.add(new Training_sample("tom", 23, 67.7));

        Iterator iterator = sample.iterator();

        while (iterator.hasNext()){
            Object element = iterator.next();
            System.out.println("Elements: " + element);
        }
    }
}
