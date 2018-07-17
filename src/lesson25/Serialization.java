package lesson25;

import java.io.*;

class Person implements Serializable {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Serialization {

    public static void main(String[] args) {

        Person alex = new Person("Aelx Smith");

        try {
            readFile();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile(Person per) throws IOException {
        ObjectOutputStream objectOutput = new ObjectOutputStream
                (new FileOutputStream("Person.bin"));
        objectOutput.writeObject(per);
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInput = new ObjectInputStream
                (new FileInputStream("Person.bin"));

        Person name = (Person) objectInput.readObject();
        System.out.println(name);
    }
}

/*
output
Person{name='Aelx Smith'}
 */