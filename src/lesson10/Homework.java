package lesson10;

import java.util.ArrayList;

public class Homework {
    String people;
    Homework.Worker worker;

    public Homework(String people,Worker worker) {
        this.people = people;
        this.worker = worker;
    }

    static class Worker {
        String profession;
        int age;

        public Worker(String profession, int age) {
            this.profession = profession;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Homework list = new Homework("Paul", new Homework.Worker("barmen", 43));
        Homework list1 = new Homework("Alex", new Homework.Worker("manager", 34));
        Homework list2 = new Homework("Tommy", new Homework.Worker("plumber", 50));

        ArrayList<Homework> name_list = new ArrayList<Homework>();
        name_list.add(list);
        name_list.add(list1);
        name_list.add(list2);

        countProfession(name_list);
    }

        private static void countProfession(ArrayList<Homework> name_list) {
            //Set<String> unigueProfession = new HashSet<>(); // skaiciuoja unikalus elementus sarase
            System.out.println("Profession list and age: ");
            for (Homework x_list : name_list) {
                System.out.println(x_list.worker.profession);
                System.out.println(x_list.worker.age);
            }
}

        }

