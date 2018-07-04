package lesson17;

/*
Tarkime turime objektą Employee ir objektą Salary, kuriame yra
Employee tipo laukas ir Double tipo laukas reiškiantis išmokėtą
atlyginimą.
Sukurkite sąrašą darbuotojų ir jų atlyginimų (gali būti keli to pačio
darbuotojo įrašai) ir aprašykite tokius veiksmus naudojant duomenų
srautus/vamzdynus:
1. Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite
mažėjimo tvarka pagal išmokėtą sumą: vardas - išmokėta suma
2. Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo
išmokėta) yra kiekvienam darbuotojui ir atspausdinkite: vardas -
kiek kartų išmokėta.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Employeemain {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Adam", "Simpson", 1223));
        list.add(new Person("Tom", "Tomlison", 1335));
        list.add(new Person("Lee", "Rudd", 1430));

        System.out.println("Sorting by Name");
        List<Person> slist = list.stream().sorted().collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Name:"+ e.getName()+", Surname: "+e.getLastName()+", Salary: "+e.getSalary() + "eu."));

        System.out.println("-------------------------------");

        System.out.println("Sorting by Salary");
        slist = list.stream().sorted(Comparator.comparing(Person::getSalary)).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Name:"+ e.getName()+", Surname: "+e.getLastName()+", Age:"+e.getSalary() + "eu."));

        System.out.println("------------------------------");

       // System.out.println("Sorting by getting Salaries number");
        //nepaskaiciuota
    }
}

class Person implements Comparable<Person>{

    private String name;
    private String lastName;
    private double salary;

    public Person(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
    }


    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}

