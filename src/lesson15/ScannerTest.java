package lesson15;

import java.util.Scanner;
class ScannerTest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Iveskite savo numeri:");
        int rollno=sc.nextInt();
        System.out.println("Iveskite savo varda:");
        String name=sc.next();
        System.out.println("Jusu mokestis:");
        double fee=sc.nextDouble();
        System.out.println("Jusu numeris "+rollno+", vardas "+name+" ir jus uzmokejote "+fee+"eu.\nAciu kad naudojates musu paslaugomis.");
        sc.close();
    }
}
