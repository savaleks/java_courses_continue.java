package javacourse9;
/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.
Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name eMinElementChallengef
 */

import java.util.Scanner;

public class Challenge1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt(); //prasom ivesti kiek zenklu bus ivedama;
        scanner.nextLine(); // pereiname prie skaiciaus ivedimo;

        int[] returnArr = readIntegers(count); //irasom skaicius i masyva is metodo;
        int returnMin = findMin(returnArr); //sukuriam kintamaji kuri grazina rezultata is metodo findMin;

        System.out.println("min " + returnMin);
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count]; // sukuriam masyva skaiciams laikyti;
        // paleidom for cikla kad gauti skaicius is scanner;
        for (int i=0; i<array.length; i++){
            System.out.println("enter a number:");
            int number = scanner.nextInt(); //sukuriam kintamaji kad ivesta skaiciu laikyti atminty(frame stack);
            scanner.nextLine(); //po pirmo skaiciaus ivedimo einam prie kito;
            array[i] = number; // laikom skaicius masyve;
        }
        return array; //gaunam metodo rezultata;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE; // naujas kintamasis lygus maziausiam skaiciu masyve(min->max);
        // paleidom kita cikla kad rasti maziausia skaiciu musu masyve;
        for (int i=0; i<array.length; i++){
            int value = array[i];// naujas kintamasis laikis masyva atminty;
            if (value<min){ //jeigu skaicius is masyvo mazesnis uz min
                min=value; // tai min priskiriama maziausia skaiciu is masyvo;
            }
        }
        return min;
    }
}
