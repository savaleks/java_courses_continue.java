package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Parašykite parametrizuotą (generic) klasę, kuri realizuoja E tipo objektų
saugyklą. Taip pat padarykite kad juos galima iteruoti nurodant su lambda
išraiška, palyginančia du elementus, kokia tvarka bus iteruojame.
Pvz. jūsų klasė-konteineris vadinasi Container ir mes į jį dedame Employee
tipo objektus. Tada maždaug toks kodas turėtų veikti:
Container<Employee> box = new Container<>();
box.add(new Employee(…));
box.add(new Employee(…));
…
for (Employee emp : box.order((e1, e2) -> { … })) {
System.out.println(emp);
}
 */
public class Container {
    public static void main(String[] args) {
        Employee employee = new Employee("alex", 22);
        Employee employee1 = new Employee("tom", 35);
        Employee employee2 = new Employee("sam", 33);

        List<Employee> box = new ArrayList<>();
        box.add(employee);
        box.add(employee1);
        box.add(employee2);

        System.out.println("Printing age: ");

        box.forEach((n)-> System.out.println(n.getAge()));
        System.out.println("---------------");

        System.out.println("Sorting by name:");

        Collections.sort(box,(p1, p2)->{
            return p1.getName().compareTo(p2.getName());
        });
        for(Employee emp : box){
            System.out.println(emp.getName()+" "+emp.getAge());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
