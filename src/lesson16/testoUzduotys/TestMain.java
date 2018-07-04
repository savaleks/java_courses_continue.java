package lesson16.testoUzduotys;
//susumuoti pirmus penkis nelyginius skaicius is intervalo [1;100].
public class TestMain {
    public static void main(String[] args) {
        int arr[]=new int[100];
        int sum = 0;
        for (int i = 1; i < arr.length-90; i=i+2) {
            sum+=i;
            }
        System.out.println("Suma 5 pirmu nelyginiu skaiciu cikle nuo 1 iki 100 yra " + sum + ".");
    }
    }

