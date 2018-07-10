package lesson21;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        moUserInput mValidator = new moUserInput();
        int ssn = mValidator.askInputInt("Please type your ID number: ");
        double age =  mValidator.askInputDouble("Please type your age: ");
        System.out.println("Accepted Results:");
        System.out.println("ID: " + ssn);
        System.out.println("Age: " + age);
    }
}
