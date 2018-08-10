package training;

import lesson21.moUserInput;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        moUserInput mValidator = new moUserInput();
        int ssn = mValidator.askInputInt("Please type your ID number: ");
        double age =  mValidator.askInputDouble("Please type your age: ");
        System.out.println("Accepted Results:");
        System.out.println("ID #: " + ssn);
        System.out.println("Age: " + age);
    }
    public Boolean isType(String testStr, String type) {
        try {
            if (type.equalsIgnoreCase("float")) {
                Float.parseFloat(testStr);
            } else if (type.equalsIgnoreCase("int")) {
                Integer.parseInt(testStr);
            } else if (type.equalsIgnoreCase("double")) {
                Double.parseDouble(testStr);
            }
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}

