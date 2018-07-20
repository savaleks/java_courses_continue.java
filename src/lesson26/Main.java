package lesson26;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        int d = 8;
        int b = a++;
        int c = ++d;

        System.out.println("a = 5: " + a);

        System.out.println("d = 8: " + d);

        System.out.println("b = a++: " + b);

        System.out.println("c = ++d: " + c);
    }
}
